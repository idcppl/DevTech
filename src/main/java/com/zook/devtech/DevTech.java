package com.zook.devtech;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DevTech.MODID, name = DevTech.NAME, version = DevTech.VERSION)
public class DevTech
{
    public static final String MODID = "devtech";
    public static final String NAME = "DevTech";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
    }
}
