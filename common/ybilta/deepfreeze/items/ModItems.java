package ybilta.deepfreeze.items;

import net.minecraft.item.Item;
import ybilta.deepfreeze.lib.ItemIds;
import ybilta.deepfreeze.lib.ItemNames;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item icePick;
	public static void init() {
		
		//initialize items
		icePick = new IcePick(ItemIds.ICE_PICK);
		
		//register items with the game
		GameRegistry.registerItem(icePick, ItemNames.ICE_PICK);
	}
}
