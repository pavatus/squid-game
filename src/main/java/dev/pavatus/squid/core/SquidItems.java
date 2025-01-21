package dev.pavatus.squid.core;

import dev.pavatus.lib.container.impl.ItemContainer;
import dev.pavatus.lib.container.impl.ItemGroupContainer;
import dev.pavatus.lib.item.AItemSettings;
import dev.pavatus.lib.itemgroup.AItemGroup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import dev.pavatus.squid.SquidMod;
import dev.pavatus.squid.core.items.CoffinItem;
import dev.pavatus.squid.core.items.MP5GunItem;
import dev.pavatus.squid.core.items.mask.MaskItem;

public class SquidItems extends ItemContainer {
    public static final Item SQUARE_MASK = new MaskItem(new AItemSettings().group(Groups.MAIN), MaskItem.MaskType.SQUARE);
    public static final Item CIRCLE_MASK = new MaskItem(new AItemSettings().group(Groups.MAIN), MaskItem.MaskType.CIRCLE);
    public static final Item TRIANGLE_MASK = new MaskItem(new AItemSettings().group(Groups.MAIN), MaskItem.MaskType.TRIANGLE);
    public static final Item COFFIN = new CoffinItem(new AItemSettings().group(Groups.MAIN));
    public static final Item MP5 = new MP5GunItem(new AItemSettings().group(Groups.MAIN));

    public static class Groups implements ItemGroupContainer {
        public static final AItemGroup MAIN = new AItemGroup.Builder(SquidMod.id("main")).icon(() -> new ItemStack(CIRCLE_MASK)).build();
    }
}
