package vapourdrive.resourcefoundation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import vapourdrive.resourcefoundation.proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.ModID, version = ModInfo.Version)
public class ResourceFoundation
{   
	@Instance(ModInfo.ModID)
	public static ResourceFoundation instance;
	
	@SidedProxy(clientSide = "vapourdrive.resourcefoundation.proxies.ClientProxy", serverSide = "vapourdrive.resourcefoundation.proxies.CommonProxy")
	public static CommonProxy proxy;
	public static final Logger log = LogManager.getLogger(ModInfo.ModID);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.Init(event);
	}
}