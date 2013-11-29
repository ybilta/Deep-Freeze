package ybilta.deepfreeze.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ybilta.deepfreeze.DeepFreeze;
import ybilta.deepfreeze.lib.BlockNames;
import ybilta.deepfreeze.lib.Reference;

public class PackedIce extends BlockDF{

	public PackedIce(int id) {
		super(id, Material.ice);
		this.setCreativeTab(DeepFreeze.tabDeepFreeze);
		this.setUnlocalizedName(BlockNames.PACKED_ICE);
	}
	
	@Override
    public String getUnlocalizedName() {

        StringBuilder unlocalizedName = new StringBuilder();

        unlocalizedName.append("tile.");
        unlocalizedName.append(Reference.MODID.toLowerCase() + ":");
        unlocalizedName.append(BlockNames.PACKED_ICE);

        return unlocalizedName.toString();
    }

}
