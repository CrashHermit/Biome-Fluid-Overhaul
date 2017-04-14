package com.CrashHermit.BiomeFluidOverhaul.module.climate;

import com.CrashHermit.BiomeFluidOverhaul.module.climate.modification.ClimateModification;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeBeach;

/**
 * Created by joshua on 4/13/17.
 */
public class ClimateModule
{

    float biomeTemperature = new ClimateModification().getBiomeBaseTemperature(Biome.getBiome(1));

    public Float normalizeBiomeTemperature()
    {

        return MathHelper.clamp_float(biomeTemperature, 0.0F, 1.35F) / 1.35F;
    }



}
