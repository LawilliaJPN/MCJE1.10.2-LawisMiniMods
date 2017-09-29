package lawi1002.recipes;

public class LM02Recipes {
	public LM02Recipes(){
		//追加したツールの制作レシピ
		new RecipesCombatPickaxe(); //戦闘ピッケル：鉄の剣、ブレイズパウダー、火薬、マグマクリーム
		new RecipesMiningPickaxe(); //採掘ピッケル：鉄のピッケル、エンダーパール、ファイヤーチャージ、黒曜石
		new RecipesMovementPickaxe(); //移動ピッケル：鉄のブーツ、スライムボール、ウサギの足、クモの目
		new RecipesUnderwaterPickaxe(); //水中ピッケル：鉄のヘルメット、生鮭、プリズマリンの欠片、金のニンジン

		//自作mod "Lawi's Mod 01 Recycle Recipes" との連携用
		new RecycleIronPickaxe();
	}
}
