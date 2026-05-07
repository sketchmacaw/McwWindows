package com.mcwwindows.kikoz.util;

import net.minecraft.util.StringRepresentable;

public enum WindowPart implements StringRepresentable
{
    //@formatter:off	
	BASE("base"),
	TOP("top"),
    MIDDLE("middle"),
	BOTTOM("bottom");
    //@formatter:on

    private final String name;

    WindowPart(final String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

	public String getString() {
	      return this.name;
	}

	public String getSerializedName() {
	      return this.name;
	}
} 