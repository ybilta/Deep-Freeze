package ybilta.deepfreeze.lib;

import net.minecraftforge.common.Configuration;

public class ConfiguratonHandler {

	public static void init(Configuration config) {
		config.load();
		config.save();
	}
}
