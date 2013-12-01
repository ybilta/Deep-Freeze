package ybilta.deepfreeze.world.biome;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import ybilta.deepfreeze.lib.Strings;

public class DeepFreezeBiomeGen extends BiomeGenBase{

	public DeepFreezeBiomeGen(int par1) {
		super(par1);
		this.setBiomeName(Strings.DEEP_FREEZE_BIOME_NAME);
		this.minHeight = 0.1F;
		this.maxHeight = 0.3F;
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.topBlock = (byte)Block.blockSnow.blockID;
		this.fillerBlock = (byte)Block.ice.blockID;
		this.temperature = 0.1F;
		
		this.waterColorMultiplier = 0x0404B4;
	}

}
