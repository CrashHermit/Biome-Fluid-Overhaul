package com.CrashHermit.BiomeFluidOverhaul.module.growth;

import com.CrashHermit.BiomeFluidOverhaul.Common.RandomHelper;
import com.CrashHermit.BiomeFluidOverhaul.module.growth.modification.PlantGrowthModification;
import net.minecraft.block.Block;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.world.BlockEvent.CropGrowEvent.Pre;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by joshua on 4/13/17.
 */
public class PlantGrowthModule {

    private static HashMap<Class<? extends Block>, PlantGrowthModification> plantGrowthModificationsByBlockClass = new HashMap<Class<? extends Block>, PlantGrowthModification>();

    private static HashMap<Block, PlantGrowthModification> plantGrowthModificationByBlock = new HashMap<Block, PlantGrowthModification>();

    public static void registerPlantGrowthModifier(Class<? extends Block> blockClass, PlantGrowthModification growthModification)
    {
        plantGrowthModificationsByBlockClass.put(blockClass, growthModification);
    }

    public static void registerPlantGrowthModifier(Block block, PlantGrowthModification growthModification)
    {
        plantGrowthModificationByBlock.put(block, growthModification);
    }

    public static PlantGrowthModification getPlantGrowthModification(Block block)
    {
        if ( block == null )
        {
            return null;
        }

        PlantGrowthModification growthModification = plantGrowthModificationByBlock.get(block);

        if (growthModification != null)
        {
            return growthModification;
        }
        else
        {
            return getPlantGrowthModification(block.getClass());
        }
    }

    public static PlantGrowthModification getPlantGrowthModification(Class<? extends Block> blockClass)
    {
        PlantGrowthModification growthModifier = plantGrowthModificationsByBlockClass.get(blockClass);

        if ( growthModifier == null )
        {
            for ( Map.Entry<Class<? extends Block>, PlantGrowthModification> entry : plantGrowthModificationsByBlockClass.entrySet())
            {
                if ( entry.getKey().isAssignableFrom((blockClass)))
                {
                    return entry.getValue();
                }
            }
        }

        return growthModifier;
    }

    @SubscribeEvent
    public void allowGrowthTick(Pre event)
    {
        PlantGrowthModification growthModification = getPlantGrowthModification(event.getState().getBlock().getClass());
        boolean needsSunlight = growthModification.getNeedsSunlight();
        float growthTickProbability = growthModification.getGrowthTickProbability();
        float sunlightGrowthModifier = growthModification.getSunlightGrowthModifier();
        float temperatureGrowthModifier = growthModification.getTemperatureGrowthModifier();
        float humidityGrowthModifier = growthModification.getHumidityGrowthModifier();

        if ( growthModification == null )
        {
            return;
        }

        //sunlight
        float sunlightModifier = !needsSunlight || (needsSunlight && event.getWorld().canSeeSky(event.getPos())) ? 1 : sunlightGrowthModifier;
        if ( sunlightModifier == 0 )
        {
            event.setResult(Result.DENY);
        }

        //random
        if (RandomHelper.nextFloat(event.getWorld().rand, growthTickProbability * sunlightGrowthModifier * temperatureGrowthModifier * humidityGrowthModifier) >= 1)
        {
            System.out.println("This is growthTickProbability" + growthTickProbability);
            event.setResult(Result.DENY);
            return;
        }

        // still go though with the default conditionals
        event.setResult(Result.DEFAULT);
    }
}
