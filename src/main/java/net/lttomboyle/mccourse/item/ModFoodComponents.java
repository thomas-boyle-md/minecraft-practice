package net.lttomboyle.mccourse.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static FoodComponent TURNIP = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).
    statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200), 1f).build();
}
