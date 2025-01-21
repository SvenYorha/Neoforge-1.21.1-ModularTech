package net.svenyorhavich.modulartech.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.svenyorhavich.modulartech.ModularTech;

public class Moditems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModularTech.MOD_ID);

    public static final DeferredItem<Item> PLATE_IRON = ITEMS.register("iron_plate",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_COPPER = ITEMS.register("copper_plate",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
