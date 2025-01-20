package dev.pavatus.squid.core;

import dev.pavatus.lib.container.impl.ItemContainer;

import net.minecraft.item.Item;

import dev.pavatus.squid.core.items.CoffinItem;
import dev.pavatus.squid.core.items.mask.MaskItem;

public class SquidItems extends ItemContainer {
    public static final Item SQUARE_MASK = new MaskItem(new Item.Settings(), MaskItem.MaskType.SQUARE);
    public static final Item CIRCLE_MASK = new MaskItem(new Item.Settings(), MaskItem.MaskType.CIRCLE);
    public static final Item TRIANGLE_MASK = new MaskItem(new Item.Settings(), MaskItem.MaskType.TRIANGLE);
    public static final Item COFFIN = new CoffinItem(new Item.Settings());
}
