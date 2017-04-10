package com.CrashHermit.BiomeFluidOverhaul.BiomeFluidOverhaulEventHandler;

import net.minecraft.block.material.Material;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.event.world.BlockEvent.CreateFluidSourceEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;

/**
 * Created by joshua on 4/10/17.
 */
public class BiomeFluidOverhaulEventHandler {


    @SubscribeEvent
    public void infiniteFluidToggle(CreateFluidSourceEvent event)
    {
        if(event.getWorld().getBlockState(event.getPos()).getMaterial() == Material.WATER && !BiomeDictionary.isBiomeOfType(event.getWorld().getBiome(event.getPos()), Type.WATER))
        {
            event.setResult(Result.DENY);
        }
    }
}
