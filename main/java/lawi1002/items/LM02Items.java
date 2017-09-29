package lawi1002.items;

import lawi1002.api.LM02ItemsAPI;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;

public class LM02Items {
	public static void init(){
		//鉄のピッケル(移動)
		LM02ItemsAPI.movementIP = new MovementPickaxe(ToolMaterial.IRON)
				.setCreativeTab(CreativeTabs.TOOLS)
				.setUnlocalizedName("movement_ip");
		//ダイヤのピッケル(移動)
		LM02ItemsAPI.movementDP = new MovementPickaxe(ToolMaterial.DIAMOND)
				.setCreativeTab(CreativeTabs.TOOLS)
				.setUnlocalizedName("movement_dp");

		//鉄のピッケル(採掘)
		LM02ItemsAPI.miningIP = new MiningPickaxe(ToolMaterial.IRON)
				.setCreativeTab(CreativeTabs.TOOLS)
				.setUnlocalizedName("mining_ip");
		//ダイヤのピッケル(採掘)
		LM02ItemsAPI.miningDP = new MiningPickaxe(ToolMaterial.DIAMOND)
				.setCreativeTab(CreativeTabs.TOOLS)
				.setUnlocalizedName("mining_dp");

		//鉄のピッケル(水中)
		LM02ItemsAPI.underwaterIP = new UnderwaterPickaxe(ToolMaterial.IRON)
				.setCreativeTab(CreativeTabs.TOOLS)
				.setUnlocalizedName("underwater_ip");
		//ダイヤのピッケル(水中)
		LM02ItemsAPI.underwaterDP = new UnderwaterPickaxe(ToolMaterial.DIAMOND)
				.setCreativeTab(CreativeTabs.TOOLS)
				.setUnlocalizedName("underwater_dp");

		//鉄のピッケル(戦闘)
		LM02ItemsAPI.combatIP = new CombatPickaxe(ToolMaterial.IRON)
				.setCreativeTab(CreativeTabs.TOOLS)
				.setUnlocalizedName("combat_ip");
		//ダイヤのピッケル(戦闘)
		LM02ItemsAPI.combatDP = new CombatPickaxe(ToolMaterial.DIAMOND)
				.setCreativeTab(CreativeTabs.TOOLS)
				.setUnlocalizedName("combat_dp");

	}

	public static void register(){
		LMRegister.registerItem(LM02ItemsAPI.movementIP, "movement_ip");
		LMRegister.registerItem(LM02ItemsAPI.movementDP, "movement_dp");
		LMRegister.registerItem(LM02ItemsAPI.miningIP, "mining_ip");
		LMRegister.registerItem(LM02ItemsAPI.miningDP, "mining_dp");
		LMRegister.registerItem(LM02ItemsAPI.underwaterIP, "underwater_ip");
		LMRegister.registerItem(LM02ItemsAPI.underwaterDP, "underwater_dp");
		LMRegister.registerItem(LM02ItemsAPI.combatIP, "combat_ip");
		LMRegister.registerItem(LM02ItemsAPI.combatDP, "combat_dp");
	}

	public static void registerRenders(){
		LMRegister.registerRenderItem(LM02ItemsAPI.movementIP);
		LMRegister.registerRenderItem(LM02ItemsAPI.movementDP);
		LMRegister.registerRenderItem(LM02ItemsAPI.miningIP);
		LMRegister.registerRenderItem(LM02ItemsAPI.miningDP);
		LMRegister.registerRenderItem(LM02ItemsAPI.underwaterIP);
		LMRegister.registerRenderItem(LM02ItemsAPI.underwaterDP);
		LMRegister.registerRenderItem(LM02ItemsAPI.combatIP);
		LMRegister.registerRenderItem(LM02ItemsAPI.combatDP);
	}
}
