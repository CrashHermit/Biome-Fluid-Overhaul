package com.CrashHermit.BiomeFluidOverhaul.module.growth.modification;



/**
 * Created by joshua on 4/13/17.
 */
public class PlantGrowthModification {
    private boolean needsSunlight = true;

    private float growthTickProbability = 0;

    private float sunlightGrowthModifier = 0;

    private float temperatureGrowthModifier = 0;

    private float humidityGrowthModifier = 0;

    public PlantGrowthModification setNeedsSunlight(boolean needsSunlight)
    {
        this.needsSunlight = needsSunlight;
        return this;
    }

    public boolean getNeedsSunlight()
    {
        return needsSunlight;
    }

    public PlantGrowthModification setGrowthTickProbability(float growthTickProbability)
    {
        this.growthTickProbability = growthTickProbability;
        return this;
    }

    public float getGrowthTickProbability()
    {
        return growthTickProbability;
    }

    public PlantGrowthModification setSunlightGrowthModifier(float sunlightGrowthModifier)
    {
        this.sunlightGrowthModifier = sunlightGrowthModifier;
        return this;
    }

    public float getSunlightGrowthModifier()
    {
        return sunlightGrowthModifier;
    }

    public PlantGrowthModification setTemperatureGrowthModifier(float temperatureGrowthModifier)
    {
        this.temperatureGrowthModifier = temperatureGrowthModifier;
        return this;
    }

    public float getTemperatureGrowthModifier()
    {
        return temperatureGrowthModifier;
    }

    public PlantGrowthModification setHumidityGrowthModifier(float humidityGrowthModifier)
    {
        this.humidityGrowthModifier = humidityGrowthModifier;
        return this;
    }

    public float getHumidityGrowthModifier()
    {
        return humidityGrowthModifier;
    }
}
