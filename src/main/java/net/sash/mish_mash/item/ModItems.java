package net.sash.mish_mash.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sash.mish_mash.MishMash;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MishMash.MOD_ID);

    public static final RegistryObject<Item> RICE_PUDDING = ITEMS.register("rice_pudding",
            () -> new Item(new Item.Properties().food(ModFoods.RICE_PUDDING)));

    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CINNAMON = ITEMS.register("cinnamon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CINNAMON_POWDER = ITEMS.register("cinnamon_powder",
            () -> new Item(new Item.Properties().food(ModFoods.CINNAMON_POWDER)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
