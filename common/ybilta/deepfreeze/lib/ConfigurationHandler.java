package ybilta.deepfreeze.lib;

import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {

	public static void init(Configuration config) {
		config.load();
		
		//load block ids
		BlockIds.DEEP_FREEZE_PORTAL = config.getBlock(BlockNames.DEEP_FREEZE_PORTAL, BlockIds.DEEP_FREEZE_PORTAL_DEFAULT).getInt();
		config.addCustomCategoryComment("Terrain Gen", "Blocks to be used in terrain gen");
		BlockIds.PACKED_ICE = config.get("Terrain Gen", BlockNames.PACKED_ICE, BlockIds.PACKED_ICE_DEFAULT).getInt();
		//load item ids
		ItemIds.ICE_PICK = config.getItem(ItemNames.ICE_PICK, ItemIds.ICE_PICK_DEFAULT).getInt();
		
		config.save();
	}
}
