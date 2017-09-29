package lawi1002.recipes;

import lawi1002.api.LM02ItemsAPI;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesMovementPickaxe {
	public RecipesMovementPickaxe(){
		//スライムボール⇒移動ピッケル
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.SLIME_BALL,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.SLIME_BALL,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.SLIME_BALL,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.SLIME_BALL,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.SLIME_BALL,
                'B',new ItemStack(Items.DYE, 1, 4) );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.SLIME_BALL,
                'B',new ItemStack(Items.DYE, 1, 4) );

		//ウサギの足⇒移動ピッケル
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.RABBIT_FOOT,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.RABBIT_FOOT,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.RABBIT_FOOT,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.RABBIT_FOOT,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.RABBIT_FOOT,
                'B',new ItemStack(Items.DYE, 1, 4) );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.RABBIT_FOOT,
                'B',new ItemStack(Items.DYE, 1, 4) );

		//鉄のブーツ⇒移動ピッケル
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.IRON_BOOTS,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.IRON_BOOTS,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.IRON_BOOTS,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.IRON_BOOTS,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.IRON_BOOTS,
                'B',new ItemStack(Items.DYE, 1, 4) );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.IRON_BOOTS,
                'B',new ItemStack(Items.DYE, 1, 4) );

		//クモの目⇒移動ピッケル
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.SPIDER_EYE,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.SPIDER_EYE,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.SPIDER_EYE,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.SPIDER_EYE,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.SPIDER_EYE,
                'B',new ItemStack(Items.DYE, 1, 4) );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.movementDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.SPIDER_EYE,
                'B',new ItemStack(Items.DYE, 1, 4) );
	}
}