package com.CrashHermit.BiomeFluidOverhaul.module.climate;

import com.CrashHermit.BiomeFluidOverhaul.module.climate.modification.ClimateModification;
import com.CrashHermit.BiomeFluidOverhaul.module.growth.modification.PlantGrowthModification;
import com.CrashHermit.BiomeFluidOverhaul.utilities.MathUtilities;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;


/**
 * Created by joshua on 4/13/17.
 */
public class ClimateModule
{

    public float biomeTemperatureBaseCase = new ClimateModification().getBiomeBaseTemperature(Biome.getBiome(1));

    public float normalizedBiomeTemperature( float biomeTemperatureBaseCase )
    {
        Math.abs(biomeTemperatureBaseCase);
        float temperatureNormalized = MathHelper.clamp_float(biomeTemperatureBaseCase, 0.0F, 2.0F) - 1.0f;
        return temperatureNormalized;
    }

    public float normalizedBiomeHumidity( float biomeHumidityBaseCase )
    {
        float humidityNormalized = MathHelper.clamp_float(biomeHumidityBaseCase * 2.0F, 0.0F, 2.0F) - 1.0F;
        return humidityNormalized;
    }

    public void seasonTracker()
    {
        MathUtilities temperatureSeasons = new MathUtilities();
        PlantGrowthModification cropGrowthFactors = new PlantGrowthModification();

        float temperatureFactor = temperatureSeasons.sinFunctionTime(33, 24000, 0.0F, normalizedBiomeTemperature(biomeTemperatureBaseCase), 1.0F);
        cropGrowthFactors.setTemperatureGrowthModifier(temperatureFactor);

    }

    public void cropGrowthFactors()
    {

    }



}
