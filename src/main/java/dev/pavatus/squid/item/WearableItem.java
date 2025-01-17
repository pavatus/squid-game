package dev.pavatus.squid.item;

import net.minecraft.block.WearableCarvedPumpkinBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Equipment;
import net.minecraft.item.Item;

public class WearableItem extends Item implements Equipment {
	private final EquipmentSlot slot;
	private final boolean hasRenderer;

	public WearableItem(Settings settings, EquipmentSlot slot, boolean hasRenderer) {
		super(settings);
		this.slot = slot;
		this.hasRenderer = hasRenderer;
	}
	public WearableItem(Settings settings, EquipmentSlot slot) {
		this(settings, slot, false);
	}

	@Override
	public EquipmentSlot getSlotType() {
		return slot;
	}

	public boolean hasRenderer() {
		return hasRenderer;
	}
}
