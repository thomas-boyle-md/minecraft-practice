package net.lttomboyle.mccourse.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.lttomboyle.mccourse.MCCourseMod;
import net.lttomboyle.mccourse.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs(){
        registerFuels();

    }
    private static void registerFuels(){
        System.out.println("Registering Fuels for " + MCCourseMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.COAL_SLIVER, 400);


    }
}
