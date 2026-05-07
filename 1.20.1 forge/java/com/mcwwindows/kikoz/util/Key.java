package com.mcwwindows.kikoz.util;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class Key extends Hammer {
	
	public Key(Properties properties) {
		super(properties);
	}
	@Override
		   @OnlyIn(Dist.CLIENT)
		   public MutableComponent getDisplayName() {
			   return Component.translatable("mcwwindows.key.desc");
		   }

}