package lawi1002.items;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UnderwaterPickaxe extends ItemPickaxe {
	protected UnderwaterPickaxe(ToolMaterial material) {
		super(material);
	}

	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
		if(player.isSneaking()){ //スニーク＋右クリック
			IBlockState iblockstate = world.getBlockState(pos);
			boolean flag = iblockstate.getBlock().isReplaceable(world, pos);
			pos = pos.offset(facing); //posの位置を設置予定位置にズラす

			if (world.provider.doesWaterVaporize()){ //ネザーでは水を設置できない
				int l = pos.getX();
                int i = pos.getY();
                int j = pos.getZ();
				player.playSound(SoundEvents.BLOCK_FIRE_EXTINGUISH, 0.5F, 1.0F); //SE

                for (int k = 0; k < 8; ++k){
                	world.spawnParticle(EnumParticleTypes.SMOKE_LARGE,
                			(double)l + Math.random(), (double)i + Math.random(), (double)j + Math.random(), 0.0D, 0.0D, 0.0D, new int[0]);
                }
                //耐久値は減らさない
                return EnumActionResult.SUCCESS;

            } else if ((iblockstate.getMaterial().isSolid() || flag)){
		    	 if (player.canPlayerEdit(pos, facing, stack)){
		    		 player.playSound(SoundEvents.ITEM_BUCKET_FILL, 0.5F, 1.0F); //SE
		    		 if (world.isRemote){
		    			 return EnumActionResult.SUCCESS;
		    		 } else { //水を設置
		    			 pos = flag ? pos.down() : pos;
		    			 world.setBlockState(pos, Blocks.FLOWING_WATER.getDefaultState(), 11);
		    			 stack.damageItem(8, player); //耐久値を8減らす
		    			 return EnumActionResult.SUCCESS;
		    		 }
		         } else {
			    	 return EnumActionResult.FAIL;
		 	     }
			}
		} else {

		}
        return EnumActionResult.PASS;
    }

	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand){
		if(!player.isSneaking() && player.isBurning()){ //炎上中に、スニークせずに右クリック
			player.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F); //SE
			//火炎耐性のポーションを10秒間
			player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("fire_resistance"), 20 * 20, 0));
			stack.damageItem(2, player); //耐久値を2減らす
			return new ActionResult(EnumActionResult.SUCCESS, stack);
		}
        return new ActionResult(EnumActionResult.PASS, stack);
    }

	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker){
		if(attacker.isSneaking()){ //スニークしながら敵に攻撃すると
			attacker.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F); //SE
			//水中呼吸、暗視のポーションを20秒間
			attacker.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("water_breathing"), 20 * 20, 0));
			attacker.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("night_vision"), 20 * 20, 0));
			stack.damageItem(2, attacker); //耐久値を2減らす
		}
        return false;
    }
}
