package dev.pavatus.squid.core.items.mask;


import net.minecraft.item.ArmorItem;
import net.minecraft.util.StringIdentifiable;

import dev.pavatus.squid.core.items.WearableItem;

public class MaskItem extends WearableItem {
    private final MaskType type;

    public MaskItem(Settings settings, MaskType type) {
        super(settings, ArmorItem.Type.HELMET, true);

        this.type = type;
    }

    public MaskType getMaskType() {
        return this.type;
    }

    public enum MaskType implements StringIdentifiable {
        CIRCLE,
        TRIANGLE,
        SQUARE;

        @Override
        public String asString() {
            return this.name().toLowerCase().replace("_", " ");
        }
    }
}
