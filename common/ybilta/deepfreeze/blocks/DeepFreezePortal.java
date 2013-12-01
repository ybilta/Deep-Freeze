package ybilta.deepfreeze.blocks;

import net.minecraft.block.BlockPortal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import ybilta.deepfreeze.DeepFreeze;
import ybilta.deepfreeze.lib.BlockNames;
import ybilta.deepfreeze.lib.Reference;
import ybilta.deepfreeze.teleporter.DeepFreezeTeleporter;

public class DeepFreezePortal extends BlockPortal {

	public DeepFreezePortal(int par1) {
		super(par1);
		this.setUnlocalizedName(BlockNames.DEEP_FREEZE_PORTAL);
		this.setCreativeTab(DeepFreeze.tabDeepFreeze);
	}

	@Override
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3,
			int par4, Entity par5Entity) {
		if ((par5Entity.ridingEntity == null)
				&& (par5Entity.riddenByEntity == null)
				&& ((par5Entity instanceof EntityPlayerMP))) {
			EntityPlayerMP player = (EntityPlayerMP) par5Entity;
			//ModLoader.getMinecraftServerInstance();
			MinecraftServer mServer = MinecraftServer.getServer();
			if (player.timeUntilPortal > 0) {
				player.timeUntilPortal = 10;
			} else if (player.dimension != Reference.DIMENSION_ID) {
				player.timeUntilPortal = 10;
				player.mcServer
						.getConfigurationManager()
						.transferPlayerToDimension(
								player,
								Reference.DIMENSION_ID,
								new DeepFreezeTeleporter(
										mServer.worldServerForDimension(Reference.DIMENSION_ID)));
			} else {
				player.timeUntilPortal = 10;
				player.mcServer.getConfigurationManager()
						.transferPlayerToDimension(
								player,
								0,
								new DeepFreezeTeleporter(mServer
										.worldServerForDimension(1)));
			}
		}
	}
}
