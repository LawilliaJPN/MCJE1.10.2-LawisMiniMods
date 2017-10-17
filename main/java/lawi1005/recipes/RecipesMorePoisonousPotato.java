package lawi1005.recipes;

import lawi1005.api.LM05ItemsAPI;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipesMorePoisonousPotato {
	public RecipesMorePoisonousPotato(){
		//青くなったジャガイモ ＋ 青色染料(鉱石辞書) ⇒ 青くなりすぎたジャガイモ
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(LM05ItemsAPI.itemMorePoisonousPotato, 1, 0),
				Items.POISONOUS_POTATO , //青くなったジャガイモ
				"dyeBlue" //青色染料(鉱石辞書) バニラではラピスラズリのみ
				));

		//青くなりすぎたジャガイモ：青色染料 鉱石辞書登録
		OreDictionary.registerOre("dyeBlue", LM05ItemsAPI.itemMorePoisonousPotato);

		//青くなったジャガイモのクラフトレシピ追加
		GameRegistry.addShapelessRecipe(new ItemStack(Items.POISONOUS_POTATO, 1, 0),
				Items.POTATO , //ジャガイモ
				Items.SPIDER_EYE //クモの目
				);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.POISONOUS_POTATO, 1, 0),
				Items.POTATO , //ジャガイモ
				Items.FERMENTED_SPIDER_EYE //発酵したクモの目
				);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.POISONOUS_POTATO, 1, 0),
				Items.POTATO , //ジャガイモ
				Items.ROTTEN_FLESH //腐った肉
				);

		//青くなりすぎたジャガイモ ＋ 肉 ⇒ 腐った肉
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH, 1, 0),
				LM05ItemsAPI.itemMorePoisonousPotato , //青くなりすぎたジャガイモ
				Items.BEEF //肉
				);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH, 1, 0),
				LM05ItemsAPI.itemMorePoisonousPotato , //青くなりすぎたジャガイモ
				Items.COOKED_BEEF //肉
				);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH, 1, 0),
				LM05ItemsAPI.itemMorePoisonousPotato , //青くなりすぎたジャガイモ
				Items.CHICKEN //肉
				);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH, 1, 0),
				LM05ItemsAPI.itemMorePoisonousPotato , //青くなりすぎたジャガイモ
				Items.COOKED_CHICKEN //肉
				);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH, 1, 0),
				LM05ItemsAPI.itemMorePoisonousPotato , //青くなりすぎたジャガイモ
				Items.MUTTON //肉
				);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH, 1, 0),
				LM05ItemsAPI.itemMorePoisonousPotato , //青くなりすぎたジャガイモ
				Items.COOKED_MUTTON //肉
				);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH, 1, 0),
				LM05ItemsAPI.itemMorePoisonousPotato , //青くなりすぎたジャガイモ
				Items.PORKCHOP //肉
				);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH, 1, 0),
				LM05ItemsAPI.itemMorePoisonousPotato , //青くなりすぎたジャガイモ
				Items.COOKED_PORKCHOP //肉
				);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH, 1, 0),
				LM05ItemsAPI.itemMorePoisonousPotato , //青くなりすぎたジャガイモ
				Items.RABBIT //肉
				);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH, 1, 0),
				LM05ItemsAPI.itemMorePoisonousPotato , //青くなりすぎたジャガイモ
				Items.COOKED_RABBIT //肉
				);
	}
}
