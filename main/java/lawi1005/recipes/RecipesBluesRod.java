package lawi1005.recipes;

import lawi1005.api.LM05ItemsAPI;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class RecipesBluesRod {
	public RecipesBluesRod(){
		//ブルーズロッド基本レシピ
		GameRegistry.addRecipe(new ItemStack(LM05ItemsAPI.itemBluesRod),
                "P",
                "P",
                "B",
                'P',LM05ItemsAPI.itemMorePoisonousPotato ,
                'B',Items.BLAZE_ROD );

		//ブルーズロッド救済レシピ
		GameRegistry.addRecipe(new ItemStack(LM05ItemsAPI.itemBluesRod),
                "MPM",
                "OPO",
                "ISI",
                'P',LM05ItemsAPI.itemMorePoisonousPotato ,
                'S',Items.STICK ,
                'I',Items.IRON_INGOT,
                'O',Blocks.OBSIDIAN,
                'M',Items.MAGMA_CREAM );
		GameRegistry.addRecipe(new ItemStack(LM05ItemsAPI.itemBluesRod),
                "MPM",
                "OPO",
                " S ",
                'P',LM05ItemsAPI.itemMorePoisonousPotato ,
                'S',Items.IRON_SWORD ,
                'O',Blocks.OBSIDIAN,
                'M',Items.MAGMA_CREAM );

		//ブルーズロッド耐久回復レシピ
		GameRegistry.addShapelessRecipe(new ItemStack(LM05ItemsAPI.itemBluesRod, 1, 0),
				new ItemStack(LM05ItemsAPI.itemBluesRod, 1, OreDictionary.WILDCARD_VALUE),
				LM05ItemsAPI.itemMorePoisonousPotato );

		//ブルーズロッドを精錬すると青くなったジャガイモ
		GameRegistry.addSmelting(new ItemStack(LM05ItemsAPI.itemBluesRod, 1, OreDictionary.WILDCARD_VALUE),new ItemStack(Items.POISONOUS_POTATO, 1, 0),0f);
	}
}
