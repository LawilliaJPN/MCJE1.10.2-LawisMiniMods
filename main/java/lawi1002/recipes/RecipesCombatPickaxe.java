package lawi1002.recipes;

import lawi1002.api.LM02ItemsAPI;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesCombatPickaxe {
	public RecipesCombatPickaxe(){
		//鉄の剣⇒戦闘ピッケル
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.IRON_SWORD,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.IRON_SWORD,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.IRON_SWORD,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.IRON_SWORD,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.IRON_SWORD,
                'B',new ItemStack(Items.DYE, 1, 4) );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.IRON_SWORD,
                'B',new ItemStack(Items.DYE, 1, 4) );

		//ブレイズパウダー⇒戦闘ピッケル
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.BLAZE_POWDER,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.BLAZE_POWDER,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.BLAZE_POWDER,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.BLAZE_POWDER,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.BLAZE_POWDER,
                'B',new ItemStack(Items.DYE, 1, 4) );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.BLAZE_POWDER,
                'B',new ItemStack(Items.DYE, 1, 4) );

		//火薬⇒戦闘ピッケル
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.GUNPOWDER,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.GUNPOWDER,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.GUNPOWDER,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.GUNPOWDER,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.GUNPOWDER,
                'B',new ItemStack(Items.DYE, 1, 4) );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.GUNPOWDER,
                'B',new ItemStack(Items.DYE, 1, 4) );

		//マグマクリーム⇒戦闘ピッケル
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.MAGMA_CREAM,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.MAGMA_CREAM,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.MAGMA_CREAM,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.MAGMA_CREAM,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.MAGMA_CREAM,
                'B',new ItemStack(Items.DYE, 1, 4) );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.combatDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.MAGMA_CREAM,
                'B',new ItemStack(Items.DYE, 1, 4) );
	}
}
