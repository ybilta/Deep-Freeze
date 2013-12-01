package ybilta.deepfreeze.world;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import ybilta.deepfreeze.DeepFreeze;
import ybilta.deepfreeze.lib.Reference;
import ybilta.deepfreeze.world.chunk.DeepFreezeChunkProvider;

public class DeepFreezeWorldProvider extends WorldProvider{

	       public void registerWorldChunkManager()
	       {
	              this.worldChunkMgr = new WorldChunkManagerHell(DeepFreeze.deepFreezeArctic, 0.1F, 0.1F);
	              this.dimensionId = Reference.DIMENSION_ID;
	       }
	      
	       public IChunkProvider createChunkGenerator()
	       {
	              return new DeepFreezeChunkProvider(this.worldObj, worldObj.getSeed(), true);
	       }
	      
	       @Override
	       public String getDimensionName()
	       {
	              return "DeepFreeze";
	       }

}
