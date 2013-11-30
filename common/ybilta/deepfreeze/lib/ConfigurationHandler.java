package ybilta.deepfreeze.lib;

import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {

	public static void init(Configuration config) {
		config.load();
		
		//load block ids
		BlockIds.PACKED_ICE = config.getBlock(BlockNames.PACKED_ICE, BlockIds.PACKED_ICE_DEFAULT).getInt();
		
		//load item ids
		ItemIds.ICE_PICK = config.getItem(ItemNames.ICE_PICK, ItemIds.ICE_PICK_DEFAULT).getInt();
		
		config.save();
	}
}
