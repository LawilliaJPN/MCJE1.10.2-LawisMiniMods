package lawi1005.items;

import lawi1005.api.LM05ItemsAPI;
import net.minecraft.item.Item.ToolMaterial;

public class LM05Items {
	public static void init(){
		LM05ItemsAPI.itemMorePoisonousPotato = new ItemMorePoisonousPotato(2, 0.3F, false) //amount, saturation, isWolfFood(extends ItemFood)
				.setUnlocalizedName("more_poisonous_potato");

		LM05ItemsAPI.itemBluesRod = new ItemBluesRod(ToolMaterial.IRON) //鉄の剣と同等の基本性能
				.setUnlocalizedName("blues_rod")
				.setNoRepair();
	}

	public static void register(){
		LMRegister.registerItem(LM05ItemsAPI.itemMorePoisonousPotato, "more_poisonous_potato");
		LMRegister.registerItem(LM05ItemsAPI.itemBluesRod, "blues_rod");
	}

	public static void registerRenders(){
		LMRegister.registerRenderItem(LM05ItemsAPI.itemMorePoisonousPotato);
		LMRegister.registerRenderItem(LM05ItemsAPI.itemBluesRod);
	}
}