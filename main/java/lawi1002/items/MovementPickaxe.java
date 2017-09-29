package lawi1002.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MovementPickaxe extends ItemPickaxe {
	protected MovementPickaxe(ToolMaterial material) {
		super(material);
	}

	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
		if(!player.isSneaking()){ //スニークせずに右クリック
			if(facing != EnumFacing.DOWN && facing != EnumFacing.UP){
				player.playSound(SoundEvents.BLOCK_SAND_STEP, 0.5F, 1.0F); //SE
				player.motionY = 0.5D; //壁を登る
				player.fallDistance = 0.0F; //プレイヤーの落下エネルギーをリセット
				stack.damageItem(1, player); //耐久値を1減らす
				return EnumActionResult.SUCCESS;
			}
		}
        return EnumActionResult.PASS;
    }

	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand){
		if(player.isSneaking()){ //落下中スニーク＋右クリック
			double jh = Math.sqrt(player.fallDistance) / 3;
			if(jh >= 2.5D){
				player.playSound(SoundEvents.ENTITY_SLIME_JUMP, 0.7F, 0.2F); //SE
				player.motionY = 2.5D; //プレイヤーを上へ飛ばす
				stack.damageItem(1, player); //耐久値を2減らす

			} else if(jh >= 0.5D){
				player.playSound(SoundEvents.ENTITY_SLIME_JUMP, 0.7F, 0.2F); //SE
				player.motionY = jh; //プレイヤーを上へ飛ばす
				stack.damageItem(1, player); //耐久値を2減らす
			}
			player.fallDistance = 0.0F; //プレイヤーの落下エネルギーをリセット
			return new ActionResult(EnumActionResult.SUCCESS, stack);
		}
        return new ActionResult(EnumActionResult.PASS, stack);
    }

	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker){
		if(attacker.isSneaking()){ //スニークしながら敵に攻撃すると
			attacker.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F); //SE
			//移動速度上昇、跳躍力上昇Ⅱのポーションを20秒間
			attacker.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("speed"), 20 * 20, 0));
			attacker.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("jump_boost"), 20 * 20, 1));
			stack.damageItem(2, attacker); //耐久値を2減らす
		}
        return false;
    }
}
