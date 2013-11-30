package ybilta.deepfreeze;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import ybilta.deepfreeze.blocks.ModBlocks;
import ybilta.deepfreeze.creativetab.CreativeTabDeepFreeze;
import ybilta.deepfreeze.items.ModItems;
import ybilta.deepfreeze.lib.ConfigurationHandler;
import ybilta.deepfreeze.lib.Reference;
import ybilta.deepfreeze.proxy.CommonProxy;
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
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(new Configuration(event.getSuggestedConfigurationFile()));
		ModBlocks.init();
		ModItems.init();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
