package ybilta.deepfreeze.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import ybilta.deepfreeze.lib.BlockIds;
import ybilta.deepfreeze.lib.BlockNames;
import net.minecraft.block.Block;

public class ModBlocks {

	public static Block packedIce;
	public static Block deepFreezePortal;
	public static void init() {
		//initialize blocks
		packedIce = new PackedIce(BlockIds.PACKED_ICE);
		deepFreezePortal = new DeepFreezePortal(BlockIds.DEEP_FREEZE_PORTAL);
		//register to the game
		GameRegistry.registerBlock(packedIce, BlockNames.PACKED_ICE);
		GameRegistry.registerBlock(deepFreezePortal, BlockNames.DEEP_FREEZE_PORTAL);
	}
}
