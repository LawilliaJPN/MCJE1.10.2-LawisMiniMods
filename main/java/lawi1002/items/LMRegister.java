package lawi1002.items;

import lawi1002.LawisMod02;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class LMRegister {
	public static void registerItem(Item item, String name){
		GameRegistry.register(item, new ResourceLocation(LawisMod02.MOD_ID, name));
	}

	public static void registerRenderItem(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
