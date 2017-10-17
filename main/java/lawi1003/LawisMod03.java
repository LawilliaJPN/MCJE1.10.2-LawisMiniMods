package lawi1003;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemClock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = LawisMod03.MOD_ID,
	 name = LawisMod03.MOD_NAME,
	 version = LawisMod03.MOD_VERSION)

public class LawisMod03 {
    public static final String MOD_ID = "lawismod03";
    public static final String MOD_NAME = "Lawi's Mod 03 Time Signal Mod";
    public static final String MOD_VERSION = "1.0";
    public static Logger logger = LogManager.getLogger("lawismod03");

    public boolean signal = true;
    public boolean morning = false;
    public boolean night = true;
    public int interval = 1;
    public String messageM = "It's time to wake up!!";
    public String messageN = "It's night. You should sleep.";
    public Configuration config;

    @EventHandler
	public void preInit(FMLPreInitializationEvent event){
    	this.LM03config();
    }

	@EventHandler
	public void init(FMLInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(this);
	}


	public void LM03config(){
		config = new Configuration(new File(Minecraft.getMinecraft().mcDataDir, "config/LawisMod03_TimeSignalMod.cfg"));
		try{
			config.load();
			signal = config.getBoolean("Time Signal ON/OFF", "Time Signal", true, "true:on or false:off");
			interval = config.getInt("Interval of Time Signal", "Time Signal", 1, 1, 4, "interval:1h~4h");
			morning = config.getBoolean("Morning Alerm ON/OFF", "Morning Alerm", false, "true:on or false:off");
			messageM = config.getString("Message of Morning Alerm", "Morning Alerm", "It's time to wake up!!", "Message at 06:00");
			night = config.getBoolean("Night Alert ON/OFF", "Night Alert", true, "true:on or false:off");
			messageN = config.getString("Message of Night Alert", "Night Alert", "It's night. You should sleep.", "Message at 18:30");
		} catch (Throwable t){
			LawisMod03.logger.warn("Failed to get this config file. this:LawisMod03_TimeSignalMod.cfg");
        } finally {
        	config.save();
        }
	}

	@SubscribeEvent
	public void WorldTimeEvent(LivingUpdateEvent event){
		EntityLivingBase entity = event.getEntityLiving();
		if(entity instanceof EntityPlayer){
			World world = entity.worldObj;
			if(!world.isRemote){
				long wt = world.getWorldTime() % 24000;

				if(signal && wt % (1000 * interval) == 0){
					String sdon = " (DAY)";
					if(!world.isDaytime()){
						sdon = " (NIGHT)";
					}

					String swt = "";
					int wt2 = (int)wt / 1000;

					if(wt2 <= 17){
						wt2 = wt2 + 6;
						if(wt2 <= 9){
							swt = "0" + wt2 + ":00";
						} else {
							swt = wt2 + ":00";
						}
					} else {
						wt2 = wt2 - 18;
						swt = "0" + wt2 + ":00";
					}
					entity.addChatMessage(new TextComponentString("[Time Signal] World Time is " + swt + sdon));
				}

				if(morning && wt == 0){
					entity.addChatMessage(new TextComponentString("[Morning Alerm] " + messageM));
				}

				if(night && wt == 12550){
					entity.addChatMessage(new TextComponentString("[Night Alert] " + messageN));
				}
			}
		}
	}

	@SubscribeEvent
	public void ClockConfigEvent(RightClickBlock event){
		ItemStack stack = event.getItemStack();

		if (stack == null) {
            return;
        }

		if(stack.getItem() instanceof ItemClock){
			EntityPlayer entity = event.getEntityPlayer();
			EnumFacing facing = event.getFace();
			if(!entity.worldObj.isRemote){
				if(facing == EnumFacing.DOWN){
					if(entity.isSneaking()){
						morning = false;
						entity.addChatMessage(new TextComponentString("[Morning Alerm] OFF"));
					} else {
						morning = true;
						entity.addChatMessage(new TextComponentString("[Morning Alerm] ON"));
					}
				} else if(facing == EnumFacing.UP){
					if(entity.isSneaking()){
						night = false;
						entity.addChatMessage(new TextComponentString("[Night Alert] OFF"));
					} else {
						night = true;
						entity.addChatMessage(new TextComponentString("[Night Alert] ON"));
					}
				} else {
					if(entity.isSneaking()){
						signal = false;
						entity.addChatMessage(new TextComponentString("[Time Signal] OFF"));
					} else {
						signal = true;
						entity.addChatMessage(new TextComponentString("[Time Signal] ON"));
					}
				}
			}

		}
	}
}