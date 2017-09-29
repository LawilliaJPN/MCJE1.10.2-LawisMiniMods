package lawi1002.recipes;

import lawi1002.api.LM02ItemsAPI;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesUnderwaterPickaxe {
	public RecipesUnderwaterPickaxe(){
		//鉄のヘルメット⇒水中ピッケル
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.IRON_HELMET,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.IRON_HELMET,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.IRON_HELMET,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.IRON_HELMET,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.IRON_HELMET,
                'B',new ItemStack(Items.DYE, 1, 4) );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.IRON_HELMET,
                'B',new ItemStack(Items.DYE, 1, 4) );

		//生鮭⇒水中ピッケル
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',new ItemStack(Items.FISH, 1, 1),
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',new ItemStack(Items.FISH, 1, 1),
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',new ItemStack(Items.FISH, 1, 1),
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',new ItemStack(Items.FISH, 1, 1),
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',new ItemStack(Items.FISH, 1, 1),
                'B',new ItemStack(Items.DYE, 1, 4) );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',new ItemStack(Items.FISH, 1, 1),
                'B',new ItemStack(Items.DYE, 1, 4) );

		//プリズマリンの欠片⇒水中ピッケル
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.PRISMARINE_SHARD,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.PRISMARINE_SHARD,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.PRISMARINE_SHARD,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.PRISMARINE_SHARD,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.PRISMARINE_SHARD,
                'B',new ItemStack(Items.DYE, 1, 4) );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.PRISMARINE_SHARD,
                'B',new ItemStack(Items.DYE, 1, 4) );

		//金のニンジン⇒水中ピッケル
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.GOLDEN_CARROT,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.GOLDEN_CARROT,
                'B',Items.REDSTONE );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.GOLDEN_CARROT,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.GOLDEN_CARROT,
                'B',Items.GLOWSTONE_DUST );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterIP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.IRON_PICKAXE,
                'A',Items.GOLDEN_CARROT,
                'B',new ItemStack(Items.DYE, 1, 4) );
		GameRegistry.addRecipe(new ItemStack(LM02ItemsAPI.underwaterDP),
                "BAB",
                "APA",
                "BAB",
                'P',Items.DIAMOND_PICKAXE,
                'A',Items.GOLDEN_CARROT,
                'B',new ItemStack(Items.DYE, 1, 4) );
	}
}
