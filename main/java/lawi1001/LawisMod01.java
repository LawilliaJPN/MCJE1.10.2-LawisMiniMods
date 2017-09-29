package lawi1001;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lawi1001.recipes.LawisModRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = LawisMod01.MOD_ID,
	 name = LawisMod01.MOD_NAME,
	 version = LawisMod01.MOD_VERSION)

public class LawisMod01 {
    public static final String MOD_ID = "lawismod01";
    public static final String MOD_NAME = "LM01 Recycle Recipes";
    public static final String MOD_VERSION = "1.0";
    public static Logger logger = LogManager.getLogger("lawismod01");

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){

	}

	@EventHandler
	public void init(FMLInitializationEvent event){
		//レシピの追加
		new LawisModRecipes();
	}

	@EventHandler
	public void postInit (FMLPostInitializationEvent event){

	}
}