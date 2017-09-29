package lawi1002.recipes;

import lawi1002.api.LM02ItemsAPI;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesMiningPickaxe {
	public RecipesMiningPickaxe(){
		//鉄のピッケル⇒採掘ピッケル
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.IRON_PICKAXE,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.IRON_PICKAXE,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.IRON_PICKAXE,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.IRON_PICKAXE,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.IRON_PICKAXE,
                'B',new ItemStack(Items.DYE, 1, 4) );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.IRON_PICKAXE,
                'B',new ItemStack(Items.DYE, 1, 4) );

		//エンダーパール⇒採掘ピッケル
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.ENDER_PEARL,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.ENDER_PEARL,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.ENDER_PEARL,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.ENDER_PEARL,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.ENDER_PEARL,
                'B',new ItemStack(Items.DYE, 1, 4) );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.ENDER_PEARL,
                'B',new ItemStack(Items.DYE, 1, 4) );

		//ファイヤーチャージ⇒採掘ピッケル
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.FIRE_CHARGE,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.FIRE_CHARGE,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.FIRE_CHARGE,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.FIRE_CHARGE,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.FIRE_CHARGE,
                'B',new ItemStack(Items.DYE, 1, 4) );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.FIRE_CHARGE,
                'B',new ItemStack(Items.DYE, 1, 4) );

		//黒曜石⇒採掘ピッケル
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Blocks.OBSIDIAN,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Blocks.OBSIDIAN,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Blocks.OBSIDIAN,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Blocks.OBSIDIAN,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Blocks.OBSIDIAN,
                'B',new ItemStack(Items.DYE, 1, 4) );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.miningDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Blocks.OBSIDIAN,
                'B',new ItemStack(Items.DYE, 1, 4) );
	}
}
