package ybilta.deepfreeze.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import ybilta.deepfreeze.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDF extends Block {

	public BlockDF(int par1, Material par2Material) {
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {

		blockIcon = iconRegister.registerIcon(String.format("%s:%s",
				Reference.MODID.toLowerCase(),
				getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {

		return unlocalizedName.substring(unlocalizedName.indexOf(":") + 1);
	}

}
