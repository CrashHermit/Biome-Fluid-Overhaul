package com.CrashHermit.BiomeFluidOverhaul;

import com.CrashHermit.BiomeFluidOverhaul.BiomeFluidOverhaulEventHandler.BiomeFluidOverhaulEventHandler;
import com.CrashHermit.BiomeFluidOverhaul.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

@Mod(modid = BiomeFluidOverhaul.MODID, version = BiomeFluidOverhaul.VERSION, name = BiomeFluidOverhaul.NAME)
public class BiomeFluidOverhaul
{
    public static final String MODID = "biomefluidoverhaul";
    public static final String VERSION = "1.0";
    public static final String NAME = "Biome Fluid Overhaul";

    @SidedProxy(clientSide = "com.CrashHermit.BiomeFluidOverhaul.proxy.ClientProxy", serverSide = "com.CrashHermit.BiomeFluidOverhaul.proxy.CommonProxy")
    public static CommonProxy proxy;


    //Will need this for GUIS and entities
    @Mod.Instance
    public static BiomeFluidOverhaul instance;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new BiomeFluidOverhaulEventHandler());
        proxy.postInit(event);
    }
}
