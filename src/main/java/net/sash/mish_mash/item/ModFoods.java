package net.sash.mish_mash.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RICE_PUDDING = new FoodProperties.Builder()
            .saturationMod(0.5f).nutrition(5).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200),1f).build();

    public static final FoodProperties CINNAMON_POWDER = new FoodProperties.Builder()
            .nutrition(1).alwaysEat().fast().effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 400), 1f).build();
}
