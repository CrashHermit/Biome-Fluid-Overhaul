package com.CrashHermit.BiomeFluidOverhaul;

import com.CrashHermit.BiomeFluidOverhaul.config.BiomeWaterConfig;
import com.CrashHermit.BiomeFluidOverhaul.events.AnvilRepairCostEvent;
import com.CrashHermit.BiomeFluidOverhaul.events.InfiniteFluidInBiomesEvent;
import com.CrashHermit.BiomeFluidOverhaul.module.growth.PlantGrowthModule;
import com.CrashHermit.BiomeFluidOverhaul.module.vanilla.VanillaModule;
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

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) throws Exception
    {
        BiomeWaterConfig.loadConfig();
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

        VanillaModule.init();
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new PlantGrowthModule());
        MinecraftForge.EVENT_BUS.register(new InfiniteFluidInBiomesEvent());
        MinecraftForge.EVENT_BUS.register(new AnvilRepairCostEvent());
        proxy.postInit(event);
    }
}
