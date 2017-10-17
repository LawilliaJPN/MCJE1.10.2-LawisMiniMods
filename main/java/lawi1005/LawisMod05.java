package lawi1005;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lawi1005.api.LM05ItemsAPI;
import lawi1005.items.LM05Items;
import lawi1005.proxy.CommonProxy;
import lawi1005.recipes.LM05Recipes;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod(modid = LawisMod05.MOD_ID,
	 name = LawisMod05.MOD_NAME,
	 version = LawisMod05.MOD_VERSION)

public class LawisMod05 {
    public static final String MOD_ID = "lawismod05";
    public static final String MOD_NAME = "Lawi's Mod 05 More Poisonous Potato";
    public static final String MOD_VERSION = "1.0";
    public static Logger logger = LogManager.getLogger("lawismod05");
    public static LawisMod05 INSTANCE;

    @SidedProxy(
    		clientSide = "lawi1005.proxy.ClientProxy",
			serverSide = "lawi1005.proxy.ServerProxy")
    public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//アイテムの追加
		LM05Items.init();
		LM05Items.register();
	}

	@EventHandler
	public void init(FMLInitializationEvent event){
		//クライアント側のみの処理の登録
		proxy.init();
		//レシピの追加
		new LM05Recipes();
		//バニラmobのドロップアイテム追加
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void DropModItems(LivingDropsEvent event){
		EntityLivingBase entity = event.getEntityLiving();
		int r = new java.util.Random().nextInt(20); //ドロップ率5％

		if(r == 0){
			World world = entity.worldObj; //EntityItemの第1引数
			double x = entity.posX; //EntityItemの第2引数
		    double y = entity.posY; //EntityItemの第3引数
		    double z = entity.posZ; //EntityItemの第4引数

		    if(world.isRemote) {
		    	return;
		    }

		    if(entity instanceof EntityZombie || entity instanceof EntityVillager){
		    	//村人かゾンビから、青くなりすぎたジャガイモ
		    	event.getDrops().add(new EntityItem(world, x, y, z, new ItemStack(LM05ItemsAPI.itemMorePoisonousPotato, 1, 0)));
		    } else if(entity instanceof EntityBlaze){
		    	//ブレイズから、ブルーズロッド
				event.getDrops().add(new EntityItem(world, x, y, z, new ItemStack(LM05ItemsAPI.itemBluesRod, 1, 0)));
		    }
		}
	}
}