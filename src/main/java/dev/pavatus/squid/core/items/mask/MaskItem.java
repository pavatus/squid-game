package dev.pavatus.squid.core.items.mask;

import net.minecraft.entity.EquipmentSlot;

import dev.pavatus.squid.core.items.WearableItem;
import net.minecraft.item.ArmorItem;

public class MaskItem extends WearableItem {
    private final MaskType type;

    public MaskItem(Settings settings, MaskType type) {
        super(settings, ArmorItem.Type.HELMET, true);

        this.type = type;
    }

    public MaskType getMaskType() {
        return this.type;
    }

    public enum MaskType {
        CIRCLE,
        TRIANGLE,
        SQUARE
    }
}
