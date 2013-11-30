package ybilta.deepfreeze.items;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ybilta.deepfreeze.DeepFreeze;
import ybilta.deepfreeze.blocks.ModBlocks;

public class IcePick extends ToolDeepFreeze {

	static final Block[] effectiveAgainst = { Block.ice, ModBlocks.packedIce };

	public IcePick(int par1) {
		super(par1, 2.0F, EnumToolMaterial.IRON, effectiveAgainst);
		this.setCreativeTab(DeepFreeze.tabDeepFreeze);
	}

	@Override
	public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World,
			int par3, int par4, int par5, int par6,
			EntityLivingBase par7EntityLivingBase) {
		if ((double) Block.blocksList[par3].getBlockHardness(par2World, par4,
				par5, par6) != 0.0D) {
			par1ItemStack.damageItem(1, par7EntityLivingBase);
		}

		return true;
	}
}
