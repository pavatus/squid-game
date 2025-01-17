package dev.pavatus.squid.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import dev.pavatus.squid.Squid;
import dev.pavatus.squid.item.mask.MaskItem;

// TODO - when pavatus code gets moved into its own lib, use ItemContainer
public class SquidItems {
    public static final Item MASK_CIRCLE = register("mask_circle", new MaskItem(new Item.Settings(), MaskItem.Type.CIRCLE));
    public static final Item MASK_TRIANGLE = register("mask_triangle", new MaskItem(new Item.Settings(), MaskItem.Type.TRIANGLE));
    public static final Item MASK_SQUARE = register("mask_square", new MaskItem(new Item.Settings(), MaskItem.Type.SQUARE));

    public static void init() {
        // NO-OP
    }

    public static <T extends Item> T register(String name, T entry) {
        return Registry.register(Registries.ITEM, Squid.id(name), entry);
    }
}
