package dev.pavatus.squid.item.mask;

import dev.pavatus.squid.item.WearableItem;
import net.minecraft.block.WearableCarvedPumpkinBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Equipment;
import net.minecraft.item.Item;

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
