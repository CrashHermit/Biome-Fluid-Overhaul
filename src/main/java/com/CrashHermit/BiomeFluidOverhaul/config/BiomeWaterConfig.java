package com.CrashHermit.BiomeFluidOverhaul.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;


/**
 * Created by joshua on 4/10/17.
 */
public class BiomeWaterConfig
{
    protected final static String configPath = "config/Biome-Fluid-Overhaul/";

    public static boolean waterControl;
    public static int expControl;


    public static boolean cropWheatSunlightBoolean;
    public static boolean cropReedSunlightBoolean;

    public static float cropWheatGrowthTickMultiplier;
    public static float cropReedGrowthTickMultiplier;

    public static float cropWheatGrowthSunlightMultiplier;
    public static float cropReedGrowthSunlightMultiplier;

    public static float cropWheatGrowthTemperatureMultiplier;
    public static float cropReedGrowthTemperatureMultiplier;

    public static float cropWheatGrowthHumidityMultiplier;
    public static float cropReedGrowthHumidityMultiplier;

    public static Configuration config = new Configuration(new File(configPath+"InfiniteFluidControl.cfg"));

    public static void loadConfig() throws Exception
    {
        config.load();
        waterControl = config.get("Fluid Control", "Generate infinite water in river and ocean biomes", false).getBoolean();
        expControl = config.get("Anvil Exp Repair Cost", "This value controls how much exp you will spend each time you repair an item", 1, "The minimum value is 0 and the max is 100", 0, 100).getInt();

        //Sunlight true/false

        cropWheatSunlightBoolean = config.get("Crop Sunlight enable/disable", "Does the wheat crop need sunlight to grow?", true).getBoolean();
        cropReedSunlightBoolean = config.get("Crop Sunlight enable/disable", "Does the sugarcane crop need sunlight to grow?", true).getBoolean();
        //cropCarrotSunlightBoolean = config.get("Crops", "Does the carrot crop need sunlight to grow?", true).getBoolean();

        //General crop multiplier factor

        cropWheatGrowthTickMultiplier = config.getFloat("Wheat Crop Growth Tick Multiplier", "Growth Tick Multipliers", 1.0F, 0.0F, 100.0F, "Comment");
        cropReedGrowthTickMultiplier = config.getFloat("Sugarcane Crop Growth Tick Multiplier", "Growth Tick Multipliers", 1.0F, 0.0F, 100.0F, "Comment");

        //Sunlight multiplier

        cropWheatGrowthSunlightMultiplier = config.getFloat("Wheat Crop Sunlight Multiplier", "Sunlight Multipliers", 1.0F, 0.0F, 100.0F, "Comment");
        cropReedGrowthSunlightMultiplier = config.getFloat("Sugarcane Crop Sunlight Multiplier", "Sunlight Multipliers", 1.0F, 0.0F, 100.0F, "Comment");

        //Temperature modifier

        cropWheatGrowthTemperatureMultiplier = config.getFloat("Wheat Crop Temperature Multiplier", "Temperature Multipliers", 1.0F, 0.0F, 100.0F, "Comment");
        cropReedGrowthTemperatureMultiplier = config.getFloat("Sugarcane Crop Temperature Multiplier", "Temperature Multipliers", 1.0F, 0.0F, 100.0F, "Comment");

        //Humidity modifier

        cropWheatGrowthHumidityMultiplier = config.getFloat("Wheat Crop Humidity Multiplier", "Humidity Multipliers", 1.0F, 0.0F, 100.0F, "Comment");
        cropReedGrowthHumidityMultiplier = config.getFloat("Sugarcane Crop Humidity Multiplier", "Humidity Multipliers", 1.0F, 0.0F, 100.0F, "Comment");

        config.save();
    }
}
