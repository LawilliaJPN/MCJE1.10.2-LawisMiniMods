package lawi1002;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lawi1002.items.LM02Items;
import lawi1002.proxy.CommonProxy;
import lawi1002.recipes.LM02Recipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = LawisMod02.MOD_ID,
	 name = LawisMod02.MOD_NAME,
	 version = LawisMod02.MOD_VERSION)

public class LawisMod02 {
    public static final String MOD_ID = "lawismod02";
    public static final String MOD_NAME = "LM02 Specialized Pickaxes";
    public static final String MOD_VERSION = "1.0";
    public static Logger logger = LogManager.getLogger("lawismod02");
    public static LawisMod02 INSTANCE;

    @SidedProxy(
    		clientSide = "lawi1002.proxy.ClientProxy",
			serverSide = "lawi1002.proxy.ServerProxy")
    public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//アイテムの追加
		LM02Items.init();
		LM02Items.register();
	}

	@EventHandler
	public void init(FMLInitializationEvent event){
		//クライアント側のみの処理の登録
		proxy.init();
		//レシピの追加
		new LM02Recipes();
	}

	@EventHandler
	public void postInit (FMLPostInitializationEvent event){

	}
}