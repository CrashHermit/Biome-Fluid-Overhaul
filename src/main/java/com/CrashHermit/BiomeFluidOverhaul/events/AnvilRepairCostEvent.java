package com.CrashHermit.BiomeFluidOverhaul.events;

import com.CrashHermit.BiomeFluidOverhaul.config.BiomeWaterConfig;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by joshua on 4/10/17.
 */
public class AnvilRepairCostEvent {
    @SubscribeEvent
    public void onAnvilRepair(AnvilUpdateEvent event)
    {
        ItemStack itemstack1 = event.getLeft();
        itemstack1.setRepairCost(BiomeWaterConfig.expControl);
    }
}
