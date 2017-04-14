package com.CrashHermit.BiomeFluidOverhaul.module.vanilla;

import com.CrashHermit.BiomeFluidOverhaul.config.BiomeWaterConfig;
import com.CrashHermit.BiomeFluidOverhaul.module.growth.modification.PlantGrowthModification;
import com.CrashHermit.BiomeFluidOverhaul.module.growth.PlantGrowthModule;
import net.minecraft.block.*;

/**
 * Created by joshua on 4/13/17.
 */
public class VanillaModule {
    public static void init()
    {
        //Wheat
        PlantGrowthModification wheatGrowthModification = new PlantGrowthModification();
        wheatGrowthModification.setNeedsSunlight(BiomeWaterConfig.cropWheatSunlightBoolean);
        wheatGrowthModification.setGrowthTickProbability(BiomeWaterConfig.cropWheatGrowthTickMultiplier);
        wheatGrowthModification.setSunlightGrowthModifier(BiomeWaterConfig.cropWheatGrowthSunlightMultiplier);
        wheatGrowthModification.setTemperatureGrowthModifier(BiomeWaterConfig.cropWheatGrowthTemperatureMultiplier);
        wheatGrowthModification.setHumidityGrowthModifier(BiomeWaterConfig.cropWheatGrowthHumidityMultiplier);
        PlantGrowthModule.registerPlantGrowthModifier(BlockCrops.class, wheatGrowthModification);

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
        PlantGrowthModification reedGrowthModification = new PlantGrowthModification();
        reedGrowthModification.setNeedsSunlight(BiomeWaterConfig.cropReedSunlightBoolean);
        reedGrowthModification.setGrowthTickProbability(BiomeWaterConfig.cropReedGrowthTickMultiplier);
        reedGrowthModification.setSunlightGrowthModifier(BiomeWaterConfig.cropReedGrowthSunlightMultiplier);
        reedGrowthModification.setTemperatureGrowthModifier(BiomeWaterConfig.cropReedGrowthTemperatureMultiplier);
        reedGrowthModification.setHumidityGrowthModifier(BiomeWaterConfig.cropReedGrowthHumidityMultiplier);
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
