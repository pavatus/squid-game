package dev.pavatus.squid.core;

import dev.pavatus.lib.container.impl.ItemContainer;

import net.minecraft.item.Item;

import dev.pavatus.squid.core.items.mask.MaskItem;

public class SquidItems extends ItemContainer {
    public static final Item MASK_SQUARE = new MaskItem(new Item.Settings(), MaskItem.Type.SQUARE);
    public static final Item MASK_CIRCLE = new MaskItem(new Item.Settings(), MaskItem.Type.CIRCLE);
    public static final Item MASK_TRIANGLE = new MaskItem(new Item.Settings(), MaskItem.Type.TRIANGLE);
}
