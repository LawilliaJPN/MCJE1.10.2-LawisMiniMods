package lawi1002.items;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
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

public class CombatPickaxe extends ItemPickaxe {
	protected CombatPickaxe(ToolMaterial material) {
		super(material);
	}

	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
		if(player.isSneaking() && facing == EnumFacing.UP){ //スニークしながらブロック上面を右クリック
			//周囲のEntityを取得
			List list = world.getEntitiesWithinAABBExcludingEntity(player, player.getEntityBoundingBox().addCoord(hitX, hitY, hitZ).expand(20.0D, 5.0D, 20.0D));
			if (list != null && !list.isEmpty()){
	        	for (int i = 0 ; i < list.size() ; i++){
	        		Entity entity = (Entity)list.get(i);
	        		if (entity != null){
	        			if(entity instanceof EntityLivingBase){ //周囲のEntityを10秒間発光
	        				EntityLivingBase target = (EntityLivingBase)entity;
	        				target.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("glowing"), 20 * 10, 0));
	        			}

	            	}
	        	}
	        	stack.damageItem(2, player); //耐久値を2減らす
    			return EnumActionResult.SUCCESS;
			}
		} else if(player.isSneaking() && facing == EnumFacing.DOWN){ //スニークしながらブロック下面を右クリック
			//周囲のEntityを取得
			List list = world.getEntitiesWithinAABBExcludingEntity(player, player.getEntityBoundingBox().addCoord(hitX, hitY, hitZ).expand(20.0D, 5.0D, 20.0D));
			if (list != null && !list.isEmpty()){
	        	for (int i = 0 ; i < list.size() ; i++){
	        		Entity entity = (Entity)list.get(i);
	        		if (entity != null){
	        			if(entity instanceof EntityMob){ //周囲の敵対mobを5秒間浮遊
	        				EntityMob target = (EntityMob)entity;
	        				target.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("levitation"), 20 * 5, 1));
	        			}

	            	}
	        	}
	        	stack.damageItem(2, player); //耐久値を2減らす
    			return EnumActionResult.SUCCESS;
			}
		}
        return EnumActionResult.PASS;
    }

	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand){
		if(!player.isSneaking() && player.onGround){ //スニークせずに地上で右クリック
			//耐性Ⅲ、火炎耐性Ⅲ、跳躍力上昇Ⅲを3秒間
			player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("jump_boost"), 20 * 3, 2));
			player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("resistance"), 20 * 3, 2));
			player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("fire_resistance"), 20 * 3, 2));
			stack.damageItem(2, player); //耐久値を2減らす
		}
        return new ActionResult(EnumActionResult.PASS, stack);
    }

	public EnumAction getItemUseAction(ItemStack stack){
        return EnumAction.BLOCK;
    }

	public int getMaxItemUseDuration(ItemStack stack){
        return 72000;
    }

	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker){
		if(attacker.isSneaking()){ //スニークしながら敵に攻撃すると
			attacker.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F); //SE
			//攻撃力上昇のポーションを10秒間
			attacker.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("strength"), 20 * 10, 0));

			stack.damageItem(2, attacker); //耐久値を2減らす
		}
        return false;
    }
}