package com.CrashHermit.BiomeFluidOverhaul.module.climate.modification;

import net.minecraft.world.biome.Biome;

/**
 * Created by joshua on 4/13/17.
 */
public class ClimateModification
{
    private float biomeBaseTemperature = 0;

    private float biomeModifiedTemperature = 0;

    public float getBiomeBaseTemperature(Biome biome)
    {
        biomeBaseTemperature = biome.getTemperature();
        return biomeBaseTemperature;
    }

    public void setBiomeModifiedTemperature(float biomeModifiedTemperature)
    {
        this.biomeModifiedTemperature = biomeModifiedTemperature;
    }

    public float getBiomeModifiedTemperature()
    {
        return biomeModifiedTemperature;
    }
}
