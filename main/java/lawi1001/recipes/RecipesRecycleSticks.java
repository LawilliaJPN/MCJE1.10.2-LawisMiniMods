package lawi1001.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class RecipesRecycleSticks {
	public RecipesRecycleSticks(){
		//ツールから、木の棒をリサイクル
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.WOODEN_AXE, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.WOODEN_HOE, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.WOODEN_PICKAXE, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.WOODEN_SHOVEL, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK),
				new ItemStack(Items.WOODEN_SWORD, 1, OreDictionary.WILDCARD_VALUE));

		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.STONE_AXE, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.STONE_HOE, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.STONE_PICKAXE, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.STONE_SHOVEL, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK),
				new ItemStack(Items.STONE_SWORD, 1, OreDictionary.WILDCARD_VALUE));

		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.IRON_AXE, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.IRON_HOE, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.IRON_PICKAXE, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.IRON_SHOVEL, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK),
				new ItemStack(Items.IRON_SWORD, 1, OreDictionary.WILDCARD_VALUE));

		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.GOLDEN_AXE, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.GOLDEN_HOE, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.GOLDEN_PICKAXE, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.GOLDEN_SHOVEL, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK),
				new ItemStack(Items.GOLDEN_SWORD, 1, OreDictionary.WILDCARD_VALUE));

		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.DIAMOND_AXE, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.DIAMOND_HOE, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.DIAMOND_PICKAXE, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(Items.DIAMOND_SHOVEL, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK),
				new ItemStack(Items.DIAMOND_SWORD, 1, OreDictionary.WILDCARD_VALUE));
	}
}
