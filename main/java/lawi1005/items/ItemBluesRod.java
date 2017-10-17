package lawi1005.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemBluesRod extends ItemSword {
	public ItemBluesRod(ToolMaterial material) {
		super(material);
	}

	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker){
		if(attacker.isSneaking()){ //スニークしながら敵に攻撃すると、
			stack.damageItem(2, attacker); //耐久力を2減少させて、

			//敵に毒、弱体化、速度低下のいずれかのステータス効果を付与
			if(!target.worldObj.isRemote){
				int r =  new java.util.Random().nextInt(3);
				int lv = new java.util.Random().nextInt(6);
                if(r == 0){
                	target.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 20 * 20, lv));
                } else if(r == 1){
                	target.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 20 * 20, lv));
                } else if(r == 2){
                	if(target.getCreatureAttribute() == EnumCreatureAttribute.UNDEAD){
                		target.setFire(lv * 4 + 4); //毒が効かないアンデットmobは炎上
                	} else {
                		target.addPotionEffect(new PotionEffect(MobEffects.POISON, 20 * 20, lv));
                	}
                }
			}
			return true;
		} else {
			stack.damageItem(1, attacker);
	        return true;
		}
    }

	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand){
		if(player.isSneaking()){ //スニーク＋右クリックで
			if(!world.isRemote){
				//良ステータス効果をランダムで1つ、40秒間得る
	        	int r = new java.util.Random().nextInt(8);
	            int lv = new java.util.Random().nextInt(3);
	            if(r == 0){
	            	player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 40 * 20, lv));
	            } else if(r == 1){
	            	player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 40 * 20, lv));
	            } else if(r == 2){
	            	player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 40 * 20, lv));
	            } else if(r == 3){
	            	player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 40 * 20, lv));
	            } else if(r == 4){
	            	player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 40 * 20, lv));
	            } else if(r == 5){
	            	player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 40 * 20, lv));
	            } else if(r == 6){
	            	player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 40 * 20, lv));
	            } else if(r == 7){
	            	player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 40 * 20, 0));
	            }

	            //その代わりに、毒ステータス20秒間、加えて炎上4秒間
	            if(player.isPotionActive(MobEffects.POISON)){ //既に毒にかかっている場合はさらに悪い効果に。
	            	int r2 =  new java.util.Random().nextInt(3);
					int lv2 = 1 + new java.util.Random().nextInt(4);
	                if(r2 == 0){
	                	player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 20 * 20, lv2));
	                } else if(r2 == 1){
	                	player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 20 * 20, lv2));
	                } else if(r2 == 2){
	                	player.addPotionEffect(new PotionEffect(MobEffects.POISON, 20 * 20, lv2));
	                }
	            } else {
	            	player.addPotionEffect(new PotionEffect(MobEffects.POISON, 20 * 20, 0));
	            }
	            player.setFire(4); //プレイヤーを4秒間炎上させる
	            stack.damageItem(2, player); //耐久値を2減らす
	        }
			return new ActionResult(EnumActionResult.SUCCESS, stack);
		}
		return new ActionResult(EnumActionResult.PASS, stack);
    }
}
