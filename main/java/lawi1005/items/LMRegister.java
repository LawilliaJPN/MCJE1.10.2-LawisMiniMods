package lawi1005.items;

import lawi1005.LawisMod05;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class LMRegister {
	public static void registerItem(Item item, String name){
		GameRegistry.register(item, new ResourceLocation(LawisMod05.MOD_ID, name));
	}

	public static void registerRenderItem(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
