package com.CrashHermit.BiomeFluidOverhaul.Config;

import net.minecraftforge.common.config.Configuration;
import com.CrashHermit.BiomeFluidOverhaul.Events.InfiniteFluidInBiomesEvent;
import java.io.File;


/**
 * Created by joshua on 4/10/17.
 */
public class BiomeWaterConfig
{
    protected final static String configPath = "config/Biome-Fluid-Overhaul/";

    public static boolean waterControl;

    public static Configuration config = new Configuration(new File(configPath+"InfiniteFluidControl.cfg"));

    public static void loadConfig() throws Exception
    {
        config.load();
        waterControl = config.get("Fluid Control", "Generate infinite water in river and ocean biomes", false).getBoolean();
        config.save();
    }
}
