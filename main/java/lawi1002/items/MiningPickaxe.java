package lawi1002.items;

import net.minecraft.block.BlockTorch;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.InventoryEnderChest;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MiningPickaxe extends ItemPickaxe {
	protected MiningPickaxe(ToolMaterial material) {
		super(material);
	}

	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
		IBlockState iblockstate = world.getBlockState(pos);
		if(!player.isSneaking()){ //スニークせずにブロックを右クリック
		     boolean flag = iblockstate.getBlock().isReplaceable(world, pos);

		     if (facing != EnumFacing.DOWN && (iblockstate.getMaterial().isSolid() || flag) && (!flag || facing == EnumFacing.UP)){
		    	 pos = pos.offset(facing); //posの位置を松明設置予定位置にズラす
		    	 if (player.canPlayerEdit(pos, facing, stack) && Blocks.TORCH.canPlaceBlockAt(world, pos)){
		    		 player.playSound(SoundEvents.ITEM_FLINTANDSTEEL_USE, 0.5F, 1.0F); //SE
		    		 if (world.isRemote){
		    			 return EnumActionResult.SUCCESS;
		    		 } else { //松明を設置
		    			 pos = flag ? pos.down() : pos;
		    			 world.setBlockState(pos, Blocks.TORCH.getDefaultState().withProperty(BlockTorch.FACING, facing), 11);
		    			 stack.damageItem(2, player); //耐久値を2減らす
		    			 return EnumActionResult.SUCCESS;
		    		 }
		         } else {
			    	 return EnumActionResult.FAIL;
		 	     }

		     } else if (facing == EnumFacing.DOWN && iblockstate.getMaterial().isSolid()){ //スニークせずにブロックの下面をクリック
		    	 InventoryEnderChest enderchest = player.getInventoryEnderChest();
		    	 stack.damageItem(4, player);//耐久値を4減少させる

		    	 if (world.isRemote){ //エンダーチェストにアクセス
		    		 return EnumActionResult.SUCCESS;
		    	 } else {
		    		 player.displayGUIChest(enderchest);
				     return EnumActionResult.SUCCESS;
				 }
		     } else {
		    	 return EnumActionResult.FAIL;
		     }

		} else if(iblockstate == Blocks.COBBLESTONE.getDefaultState()){ //スニーク中に丸石を右クリック
	    	 if (player.canPlayerEdit(pos, facing, stack)){
	    		 player.playSound(SoundEvents.BLOCK_STONE_PLACE, 0.5F, 1.0F); //SE
	    		 if (world.isRemote){
	    			 return EnumActionResult.SUCCESS;
	    		 } else { //丸石を石に変える
	    			 world.setBlockState(pos, Blocks.STONE.getDefaultState());
	    			 stack.damageItem(1, player); //耐久値を1減らす
	    			 return EnumActionResult.SUCCESS;
	    		 }
	    	 }
		}
		return EnumActionResult.PASS;
    }

	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker){
		if(attacker.isSneaking()){ //スニークしながら敵に攻撃すると
			attacker.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F); //SE
			//採掘のポーションを40秒間
			attacker.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("haste"), 20 * 40, 0));
			stack.damageItem(2, attacker); //耐久値を2減らす
		}
        return false;
    }
}