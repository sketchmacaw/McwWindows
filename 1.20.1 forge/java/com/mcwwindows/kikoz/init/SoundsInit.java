package com.mcwwindows.kikoz.init;

import com.mcwwindows.kikoz.MacawsWindows;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundsInit {

	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MacawsWindows.MOD_ID);

    public static final RegistryObject<SoundEvent> BARS_CLOSE = register("block.bars_close");
    public static final RegistryObject<SoundEvent> BARS_OPEN = register("block.bars_open");
    public static final RegistryObject<SoundEvent> BLINDS_CLOSE = register("block.blinds_close");
    public static final RegistryObject<SoundEvent> BLINDS_OPEN = register("block.blinds_open");
    public static final RegistryObject<SoundEvent> WINDOW_CLOSE = register("block.window_close");
    public static final RegistryObject<SoundEvent> WINDOW_OPEN = register("block.window_open");

    private static RegistryObject<SoundEvent> register(final String name) {
        return SOUNDS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MacawsWindows.MOD_ID, name)));
    }
	
}