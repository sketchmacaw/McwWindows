package com.mcwwindows.kikoz;

import com.mcwwindows.kikoz.init.BlockInit;
import com.mcwwindows.kikoz.init.ItemInit;
import com.mcwwindows.kikoz.init.SoundsInit;
import com.mcwwindows.kikoz.init.TabInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("mcwwindows")
@Mod.EventBusSubscriber(modid = MacawsWindows.MOD_ID, bus = Bus.MOD)
public class MacawsWindows 
{
	public static final String MOD_ID = "mcwwindows";
	public static MacawsWindows instance;
	
	public MacawsWindows() 
	{
			final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
			modEventBus.addListener(this::setup);
			modEventBus.addListener(this::doClientStuff);

			ItemInit.ITEMS.register(modEventBus);
			BlockInit.BLOCKS.register(modEventBus);
			SoundsInit.SOUNDS.register(modEventBus);
			TabInit.CREATIVE_TABS.register(modEventBus);

			instance = this;
			MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event)
	{
	
	}

	private void doClientStuff(final FMLClientSetupEvent event)
	{
 
	}
	
	@SubscribeEvent
	public void onServerStarting(ServerStartingEvent event)
	{
		
	}
  
    
}	

