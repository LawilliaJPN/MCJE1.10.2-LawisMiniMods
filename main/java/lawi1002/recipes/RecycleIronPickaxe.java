package lawi1002.recipes;

import lawi1002.api.LM02ItemsAPI;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class RecycleIronPickaxe {
	public RecycleIronPickaxe(){
		//追加した鉄ピッケルを精錬すると鉄格子3個("Lawi's Mod 01 Recycle Recipes"を導入すると、鉄格子4個で鉄インゴット1つに。)
		GameRegistry.addSmelting(new ItemStack(LM02ItemsAPI.combatIP, 1, OreDictionary.WILDCARD_VALUE),new ItemStack(Blocks.IRON_BARS, 3, 0),0f);
		GameRegistry.addSmelting(new ItemStack(LM02ItemsAPI.miningIP, 1, OreDictionary.WILDCARD_VALUE),new ItemStack(Blocks.IRON_BARS, 3, 0),0f);
		GameRegistry.addSmelting(new ItemStack(LM02ItemsAPI.movementIP, 1, OreDictionary.WILDCARD_VALUE),new ItemStack(Blocks.IRON_BARS, 3, 0),0f);
		GameRegistry.addSmelting(new ItemStack(LM02ItemsAPI.underwaterIP, 1, OreDictionary.WILDCARD_VALUE),new ItemStack(Blocks.IRON_BARS, 3, 0),0f);

		//追加したピッケルを単体クラフトで、木の棒2つ。(再利用目的のレシピ追加)
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(LM02ItemsAPI.combatDP, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(LM02ItemsAPI.combatIP, 1, OreDictionary.WILDCARD_VALUE));

		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(LM02ItemsAPI.miningDP, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(LM02ItemsAPI.miningIP, 1, OreDictionary.WILDCARD_VALUE));

		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(LM02ItemsAPI.movementDP, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(LM02ItemsAPI.movementIP, 1, OreDictionary.WILDCARD_VALUE));

		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(LM02ItemsAPI.underwaterDP, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK, 2, 0),
				new ItemStack(LM02ItemsAPI.underwaterIP, 1, OreDictionary.WILDCARD_VALUE));
	}
}
