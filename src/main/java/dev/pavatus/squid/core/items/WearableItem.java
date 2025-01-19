package dev.pavatus.squid.core.items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Equipment;
import net.minecraft.item.Item;

public class WearableItem extends ArmorItem implements Equipment {
    private final boolean hasRenderer;

    public WearableItem(Settings settings, ArmorItem.Type type, boolean hasRenderer) {
        super(ArmorMaterials.IRON, type, settings);
        this.hasRenderer = hasRenderer;
    }
    public WearableItem(Settings settings, ArmorItem.Type type, EquipmentSlot slot) {
        this(settings, type, false);
    }

    @Override
    public EquipmentSlot getSlotType() {
        return this.getType().getEquipmentSlot();
    }

    public boolean hasRenderer() {
        return hasRenderer;
    }
}
