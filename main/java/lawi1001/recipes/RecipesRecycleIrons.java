package lawi1001.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class RecipesRecycleIrons {
	public RecipesRecycleIrons(){
		//鉄格子4つ
		GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT),
				Blocks.IRON_BARS, Blocks.IRON_BARS, Blocks.IRON_BARS, Blocks.IRON_BARS );

		//耐久値あり
		GameRegistry.addSmelting(new ItemStack(Items.IRON_AXE, 1, OreDictionary.WILDCARD_VALUE),new ItemStack(Blocks.IRON_BARS, 3, 0),0f);
		GameRegistry.addSmelting(new ItemStack(Items.IRON_HOE, 1, OreDictionary.WILDCARD_VALUE),new ItemStack(Blocks.IRON_BARS, 2, 0),0f);
		GameRegistry.addSmelting(new ItemStack(Items.IRON_HORSE_ARMOR, 1, OreDictionary.WILDCARD_VALUE),new ItemStack(Blocks.IRON_BARS, 9, 0),0f);
		GameRegistry.addSmelting(new ItemStack(Items.IRON_PICKAXE, 1, OreDictionary.WILDCARD_VALUE),new ItemStack(Blocks.IRON_BARS, 3, 0),0f);
		GameRegistry.addSmelting(new ItemStack(Items.IRON_SHOVEL, 1, OreDictionary.WILDCARD_VALUE),new ItemStack(Blocks.IRON_BARS, 1, 0),0f);
		GameRegistry.addSmelting(new ItemStack(Items.IRON_SWORD, 1, OreDictionary.WILDCARD_VALUE),new ItemStack(Blocks.IRON_BARS, 2, 0),0f);
		GameRegistry.addSmelting(new ItemStack(Items.IRON_BOOTS, 1, OreDictionary.WILDCARD_VALUE),new ItemStack(Blocks.IRON_BARS, 4, 0),0f);
		GameRegistry.addSmelting(new ItemStack(Items.IRON_CHESTPLATE, 1, OreDictionary.WILDCARD_VALUE),new ItemStack(Blocks.IRON_BARS, 8, 0),0f);
		GameRegistry.addSmelting(new ItemStack(Items.IRON_HELMET, 1, OreDictionary.WILDCARD_VALUE),new ItemStack(Blocks.IRON_BARS, 5, 0),0f);
		GameRegistry.addSmelting(new ItemStack(Items.IRON_LEGGINGS, 1, OreDictionary.WILDCARD_VALUE),new ItemStack(Blocks.IRON_BARS, 7, 0),0f);
		GameRegistry.addSmelting(new ItemStack(Items.FLINT_AND_STEEL, 1, OreDictionary.WILDCARD_VALUE),new ItemStack(Blocks.IRON_BARS, 1, 0),0f);
		GameRegistry.addSmelting(new ItemStack(Items.SHEARS, 1, OreDictionary.WILDCARD_VALUE),new ItemStack(Blocks.IRON_BARS, 2, 0),0f);
		GameRegistry.addSmelting(new ItemStack(Items.SHIELD, 1, OreDictionary.WILDCARD_VALUE),new ItemStack(Blocks.IRON_BARS, 1, 0),0f);

		//耐久値なし
		GameRegistry.addSmelting(Items.IRON_DOOR,new ItemStack(Blocks.IRON_BARS, 2, 0),0f);
		GameRegistry.addSmelting(Blocks.IRON_TRAPDOOR,new ItemStack(Blocks.IRON_BARS, 4, 0),0f);
		GameRegistry.addSmelting(Items.BUCKET,new ItemStack(Blocks.IRON_BARS, 3, 0),0f);
		GameRegistry.addSmelting(Items.CAULDRON,new ItemStack(Blocks.IRON_BARS, 7, 0),0f);
		GameRegistry.addSmelting(Items.COMPASS,new ItemStack(Blocks.IRON_BARS, 4, 0),0f);
		GameRegistry.addSmelting(Items.MINECART,new ItemStack(Blocks.IRON_BARS, 5, 0),0f);
		GameRegistry.addSmelting(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE,new ItemStack(Blocks.IRON_BARS, 2, 0),0f);
		GameRegistry.addSmelting(Blocks.HOPPER,new ItemStack(Blocks.IRON_BARS, 2, 0),0f);
	}
}