package ybilta.deepfreeze.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabDeepFreeze extends CreativeTabs{

	public CreativeTabDeepFreeze(int id, String name) {
		super(id, name);
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {

        return Block.blockSnow.blockID;
    }

}
