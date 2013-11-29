package ybilta.deepfreeze.lib;

import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {

	public static void init(Configuration config) {
		config.load();
		BlockIds.PACKED_ICE = config.getBlock(BlockNames.PACKED_ICE, BlockIds.PACKED_ICE_DEFAULT).getInt();
		config.save();
	}
}
