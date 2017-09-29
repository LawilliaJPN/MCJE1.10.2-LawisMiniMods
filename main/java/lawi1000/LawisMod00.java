package lawi1000;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lawi1000.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = LawisMod00.MOD_ID,
	 name = LawisMod00.MOD_NAME,
	 version = LawisMod00.MOD_VERSION)

public class LawisMod00 {
    public static final String MOD_ID = "lawismod00";
    public static final String MOD_NAME = "Lawi's Mod 00";
    public static final String MOD_VERSION = "1.0";
    public static Logger logger = LogManager.getLogger("lawismod00");
    public static LawisMod00 INSTANCE;

    @SidedProxy(
    		clientSide = "lawi1000.proxy.ClientProxy",
			serverSide = "lawi1000.proxy.ServerProxy")
    public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
	}

	@EventHandler
	public void init(FMLInitializationEvent event){
		//クライアント側のみの処理の登録
		proxy.init();
	}
}