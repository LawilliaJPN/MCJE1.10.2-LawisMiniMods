package lawi1005.items;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;


public class ItemMorePoisonousPotato extends ItemFood {
	//ItemFoodクラス継承時の自動生成
	public ItemMorePoisonousPotato(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	}

	@Nullable
    public ItemStack onItemUseFinish(ItemStack stack, World world, EntityLivingBase entityLiving){
		--stack.stackSize;

        if (entityLiving instanceof EntityPlayer){
            EntityPlayer player = (EntityPlayer)entityLiving;
            player.getFoodStats().addStats(this, stack);
            world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);

            if(!world.isRemote){
            	for(int i = 0; i < 3; i++){
                	int r = new java.util.Random().nextInt(8 + i);
                    int lv = new java.util.Random().nextInt(2 + i);
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
                }
                player.addPotionEffect(new PotionEffect(MobEffects.POISON, 20 * 20, 0));
            }

            player.addStat(StatList.getObjectUseStats(this));
        }

        return stack;
    }


	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker){
		if(attacker.isSneaking()){ //スニークしながら敵に攻撃すると
			--stack.stackSize; //アイテムを食べさせ、

			//敵に毒、弱体化、速度低下のステータス効果を付与
			if(!target.worldObj.isRemote){
				for(int i = 0; i < 3; i++){
	                int lv = new java.util.Random().nextInt(6);
	                if(i == 0){
	                	target.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 20 * 20, lv));
	                } else if(i == 1){
	                	target.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 20 * 20, lv));
	                } else if(i == 2){
	                	target.addPotionEffect(new PotionEffect(MobEffects.POISON, 20 * 20, lv));
	                }
	            }
			}
			return true;
		}
        return false;
    }
}
