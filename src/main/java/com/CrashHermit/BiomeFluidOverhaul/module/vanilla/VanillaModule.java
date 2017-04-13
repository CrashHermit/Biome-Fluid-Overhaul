package com.CrashHermit.BiomeFluidOverhaul.module.vanilla;

import com.CrashHermit.BiomeFluidOverhaul.Config.BiomeWaterConfig;
import com.CrashHermit.BiomeFluidOverhaul.module.growth.modification.PlantGrowthModification;
import com.CrashHermit.BiomeFluidOverhaul.module.growth.PlantGrowthModule;
import net.minecraft.block.*;
import net.minecraft.world.biome.Biome;

/**
 * Created by joshua on 4/13/17.
 */
public class VanillaModule {
    public static void init()
    {
        //Wheat
        PlantGrowthModification cropGrowthModification = new PlantGrowthModification().setNeedsSunlight(BiomeWaterConfig.cropWheatSunlightBoolean).setGrowthTickProbability(BiomeWaterConfig.cropWheatGrowthTickMultiplier).setSunlightGrowthModifier(BiomeWaterConfig.cropWheatGrowthSunlightMultiplier).setTemperatureGrowthModifier(BiomeWaterConfig.cropWheatGrowthTemperatureMultiplier).setHumidityGrowthModifier(BiomeWaterConfig.cropWheatGrowthHumidityMultiplier);
        PlantGrowthModule.registerPlantGrowthModifier(BlockCrops.class, cropGrowthModification);
        
        //Carrot
        //PlantGrowthModification carrotGrowthModification = new PlantGrowthModification().setNeedsSunlight().setGrowthTickProbability().setSunlightGrowthModifier().setTemperatureGrowthModifier().setHumidityGrowthModifier();
       // PlantGrowthModule.registerPlantGrowthModifier(BlockCarrot.class, carrotGrowthModification);

        //Potato
       // PlantGrowthModification potatoGrowthModification = new PlantGrowthModification().setNeedsSunlight().setGrowthTickProbability().setSunlightGrowthModifier().setTemperatureGrowthModifier().setHumidityGrowthModifier();
       // PlantGrowthModule.registerPlantGrowthModifier(BlockPotato.class, potatoGrowthModification);

        //Beetroot
       // PlantGrowthModification beetrootGrowthModification = new PlantGrowthModification().setNeedsSunlight().setGrowthTickProbability().setSunlightGrowthModifier().setTemperatureGrowthModifier().setHumidityGrowthModifier();
        //PlantGrowthModule.registerPlantGrowthModifier(BlockBeetroot.class, beetrootGrowthModification);

        //Reed "Sugarcane"
        PlantGrowthModification reedGrowthModification = new PlantGrowthModification().setNeedsSunlight(BiomeWaterConfig.cropReedSunlightBoolean).setGrowthTickProbability(BiomeWaterConfig.cropReedGrowthTickMultiplier).setSunlightGrowthModifier(BiomeWaterConfig.cropReedGrowthSunlightMultiplier).setTemperatureGrowthModifier(BiomeWaterConfig.cropReedGrowthTemperatureMultiplier).setHumidityGrowthModifier(BiomeWaterConfig.cropReedGrowthHumidityMultiplier);
        PlantGrowthModule.registerPlantGrowthModifier(BlockReed.class, reedGrowthModification);

        //Stem "Melon"
        //PlantGrowthModification stemGrowthModification = new PlantGrowthModification().setNeedsSunlight().setGrowthTickProbability().setSunlightGrowthModifier().setTemperatureGrowthModifier().setHumidityGrowthModifier();
        //PlantGrowthModule.registerPlantGrowthModifier(BlockStem.class, stemGrowthModification);

        //Cocoa
        //PlantGrowthModification cocoaGrowthModification = new PlantGrowthModification().setNeedsSunlight().setGrowthTickProbability().setSunlightGrowthModifier().setTemperatureGrowthModifier().setHumidityGrowthModifier();
        //PlantGrowthModule.registerPlantGrowthModifier(BlockCocoa.class, cocoaGrowthModification);

        //Cactus
        //PlantGrowthModification cactusGrowthModification = new PlantGrowthModification().setNeedsSunlight().setGrowthTickProbability().setSunlightGrowthModifier().setTemperatureGrowthModifier().setHumidityGrowthModifier();
        //PlantGrowthModule.registerPlantGrowthModifier(BlockCactus.class, cactusGrowthModification);

        //Sapling
        //PlantGrowthModification saplingGrowthModification = new PlantGrowthModification().setNeedsSunlight().setGrowthTickProbability().setSunlightGrowthModifier().setTemperatureGrowthModifier().setHumidityGrowthModifier();
        //PlantGrowthModule.registerPlantGrowthModifier(BlockSapling.class, saplingGrowthModification);

        //Netherwart
        //PlantGrowthModification netherWartGrowthModification = new PlantGrowthModification().setNeedsSunlight().setGrowthTickProbability().setSunlightGrowthModifier().setTemperatureGrowthModifier().setHumidityGrowthModifier();
        //PlantGrowthModule.registerPlantGrowthModifier(BlockNetherWart.class, netherWartGrowthModification);

    }
}
