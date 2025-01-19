package dev.pavatus.squid.core.items.mask;

import net.minecraft.entity.EquipmentSlot;

import dev.pavatus.squid.core.items.WearableItem;

public class MaskItem extends WearableItem {
    private final Type type;

    public MaskItem(Settings settings, Type type) {
        super(settings, EquipmentSlot.HEAD);

        this.type = type;
    }

    public Type getType() {
        return this.type;
    }

    public enum Type {
        CIRCLE,
        TRIANGLE,
        SQUARE
    }
}
