package com.CrashHermit.BiomeFluidOverhaul.Events;

import com.CrashHermit.BiomeFluidOverhaul.Config.BiomeWaterConfig;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.event.world.BlockEvent.CreateFluidSourceEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by joshua on 4/10/17.
 */
public class InfiniteFluidInBiomesEvent
{
    @SubscribeEvent
    public void waterGenerationPerBiome(CreateFluidSourceEvent event)
    {
        if(BiomeWaterConfig.waterControl == false)
        {
            if (event.getWorld().getBlockState(event.getPos()).getMaterial() == Material.WATER && !BiomeDictionary.isBiomeOfType(event.getWorld().getBiome(event.getPos()), Type.WATER))
            {
                event.setResult(Event.Result.DENY);
            }
        }
    }
}
