package lawi1004;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.SkeletonType;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = LawisMod04.MOD_ID,
	 name = LawisMod04.MOD_NAME,
	 version = LawisMod04.MOD_VERSION)

public class LawisMod04 {
    public static final String MOD_ID = "lawismod04";
    public static final String MOD_NAME = "Lawi's Mod 04 Nethert Mutation";
    public static final String MOD_VERSION = "1.0";
    public static Logger logger = LogManager.getLogger("lawismod04");

    public Configuration config;
    public boolean alternativeMagmaCube;
    public int rateBlaze;
    public int rateGhast;
    public int rateMagmaCube;
    public int ratePigZombie;
    public int rateWitherSkeleton;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		this.LM04config();
	}

	@EventHandler
	public void init(FMLInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(this);
	}

	public void LM04config(){
		config = new Configuration(new File(Minecraft.getMinecraft().mcDataDir, "config/LawisMod04_NethertMutation.cfg"));
		try{
			config.load();
			alternativeMagmaCube = config.getBoolean("MagmaCube from Enderman or Witch", "ON/OFF", false, "true:on or false:off");
			rateBlaze = config.getInt("Blaze from Spider", "Mutation Rate", 2, 0, 10, "0:OFF, 1:10%, 2:20%, ...10:100%");
			rateGhast = config.getInt("Ghast from Creeper", "Mutation Rate", 1, 0, 10, "0:OFF, 1:10%, 2:20%, ...10:100%");
			rateMagmaCube = config.getInt("MagmaCube from Slime", "Mutation Rate", 8, 0, 10, "0:OFF, 1:10%, 2:20%, ...10:100%");
			ratePigZombie = config.getInt("PigZombie from Zombie", "Mutation Rate", 6, 0, 10, "0:OFF, 1:10%, 2:20%, ...10:100%");
			rateWitherSkeleton = config.getInt("WitherSkeleton from Skeleton", "Mutation Rate", 4, 0, 10, "0:OFF, 1:10%, 2:20%, ...10:100%");
		} catch (Throwable t){
			LawisMod04.logger.warn("Failed to get this config file. this:LawisMod04_NethertMutation.cfg");
        } finally {
        	config.save();
        }
	}

	@SubscribeEvent
	public void Mutation(LivingDeathEvent event){
		EntityLivingBase entity = event.getEntityLiving();
		World world = entity.worldObj;
		double x = entity.posX;
		double y = entity.posY;
		double z = entity.posZ;
		BlockPos pos = new BlockPos(x, y, z);
		Biome biome = world.getBiomeGenForCoords(pos);
		DimensionType dim = world.provider.getDimensionType();

		if(world.isRemote) {
			return;
		}

		if(biome.getRainfall() == 0.0F && !world.isDaytime() && y >= 60 && dim == DimensionType.OVERWORLD){
			int r = 1 + new java.util.Random().nextInt(10);
			int ry = new java.util.Random().nextInt(5);
			if(entity instanceof EntityZombie && !(entity instanceof EntityPigZombie) && r <= ratePigZombie){
				EntityPigZombie spawnEntity = new EntityPigZombie(world);
				spawnEntity.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.GOLDEN_SWORD));

				spawnEntity.setPosition(x, y, z);
				world.spawnEntityInWorld(spawnEntity);
				spawnEntity.spawnExplosionParticle();

			} else if(entity instanceof EntitySkeleton && r <= rateWitherSkeleton){
				if(((EntitySkeleton) entity).func_189771_df() != SkeletonType.WITHER){
					EntitySkeleton spawnEntity = new EntitySkeleton(world);
					spawnEntity.func_189768_a(SkeletonType.WITHER);
					spawnEntity.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.STONE_SWORD));

		            spawnEntity.setPosition(x, y, z);
					world.spawnEntityInWorld(spawnEntity);
					spawnEntity.spawnExplosionParticle();
				}

			} else if(entity instanceof EntitySlime && !(entity instanceof EntityMagmaCube) && r <= rateMagmaCube){
				int size = ((EntitySlime) entity).getSlimeSize();
				if(size == 2){
					EntityMagmaCube spawnEntity = new EntityMagmaCube(world);

					spawnEntity.setPosition(x, y, z);
					world.spawnEntityInWorld(spawnEntity);
					spawnEntity.spawnExplosionParticle();
				}

			} else if(entity instanceof EntityCreeper && r <= rateGhast){
				EntityGhast spawnEntity = new EntityGhast(world);

				spawnEntity.setPosition(x, y + ry + 5, z);
				world.spawnEntityInWorld(spawnEntity);
				spawnEntity.spawnExplosionParticle();

			} else if(entity instanceof EntitySpider && r <= rateBlaze){
				EntityBlaze spawnEntity = new EntityBlaze(world);

				spawnEntity.setPosition(x, y + ry + 1, z);
				world.spawnEntityInWorld(spawnEntity);
				spawnEntity.spawnExplosionParticle();

			} else if(entity instanceof EntityEnderman || entity instanceof EntityWitch){
				if(alternativeMagmaCube && r <= rateMagmaCube){
					EntityMagmaCube spawnEntity = new EntityMagmaCube(world);

					spawnEntity.setPosition(x, y, z);
					world.spawnEntityInWorld(spawnEntity);
					spawnEntity.spawnExplosionParticle();
				}
			}
		}
	}

	@SubscribeEvent
	public void DropMagmaCream(LivingDropsEvent event){
		EntityLivingBase entity = event.getEntityLiving();
        World world = entity.worldObj; //EntityItemの第1引数

		if(world.isRemote) {
			return;
		}

		if(entity instanceof EntityMagmaCube){
			DimensionType dim = world.provider.getDimensionType();
			int size = ((EntitySlime) entity).getSlimeSize();
	    	int r = new java.util.Random().nextInt(4);
	        double x = entity.posX; //EntityItemの第2引数
	        double y = entity.posY; //EntityItemの第3引数
	        double z = entity.posZ; //EntityItemの第4引数

	    	if(r == 0 && size == 1 && dim == DimensionType.OVERWORLD){
	    		event.getDrops().add(new EntityItem(world, x, y, z, new ItemStack(Items.MAGMA_CREAM, 1, 0)));
	    	}
		}
	}
}