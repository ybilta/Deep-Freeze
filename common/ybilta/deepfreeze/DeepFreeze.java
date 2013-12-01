package ybilta.deepfreeze;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import ybilta.deepfreeze.blocks.ModBlocks;
import ybilta.deepfreeze.creativetab.CreativeTabDeepFreeze;
import ybilta.deepfreeze.items.ModItems;
import ybilta.deepfreeze.lib.ConfigurationHandler;
import ybilta.deepfreeze.lib.Reference;
import ybilta.deepfreeze.proxy.CommonProxy;
import ybilta.deepfreeze.world.DeepFreezeWorldProvider;
import ybilta.deepfreeze.world.biome.DeepFreezeBiomeGen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class DeepFreeze {
	
	@Instance(Reference.MODID)
	public static DeepFreeze instance;

	@SidedProxy(clientSide = "ybilta.deepfreeze.proxy.ClientProxy", serverSide = "ybilta.deepfreeze.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static CreativeTabs tabDeepFreeze = new CreativeTabDeepFreeze(CreativeTabs.getNextID(), Reference.MODID);
	public static BiomeGenBase deepFreezeArctic;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(new Configuration(event.getSuggestedConfigurationFile()));
		ModBlocks.init();
		ModItems.init();
		deepFreezeArctic = new DeepFreezeBiomeGen(122);
			}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		DimensionManager.registerProviderType(Reference.DIMENSION_ID, DeepFreezeWorldProvider.class, false);
		DimensionManager.registerDimension(Reference.DIMENSION_ID, Reference.DIMENSION_ID);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
