package ybilta.deepfreeze.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import ybilta.deepfreeze.lib.BlockIds;
import ybilta.deepfreeze.lib.BlockNames;
import net.minecraft.block.Block;

public class ModBlocks {

	public static Block packedIce;
	public static void init() {
		//initialize blocks
		packedIce = new PackedIce(BlockIds.PACKED_ICE);
		
		//register to the game
		GameRegistry.registerBlock(packedIce, BlockNames.PACKED_ICE);
	}
}
