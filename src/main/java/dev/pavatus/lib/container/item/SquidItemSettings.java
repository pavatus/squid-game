package dev.pavatus.lib.container.item;

import net.fabricmc.fabric.api.item.v1.CustomDamageHandler;
import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.resource.featuretoggle.FeatureFlag;
import net.minecraft.util.Rarity;

public class SquidItemSettings extends FabricItemSettings {

    private ItemGroup group;

    public SquidItemSettings group(ItemGroup group) {
        this.group = group;
        return this;
    }

    @Override
    public SquidItemSettings equipmentSlot(EquipmentSlotProvider equipmentSlotProvider) {
        return (SquidItemSettings) super.equipmentSlot(equipmentSlotProvider);
    }

    @Override
    public SquidItemSettings customDamage(CustomDamageHandler handler) {
        return (SquidItemSettings) super.customDamage(handler);
    }

    @Override
    public SquidItemSettings food(FoodComponent foodComponent) {
        return (SquidItemSettings) super.food(foodComponent);
    }

    @Override
    public SquidItemSettings maxCount(int maxCount) {
        return (SquidItemSettings) super.maxCount(maxCount);
    }

    @Override
    public SquidItemSettings maxDamageIfAbsent(int maxDamage) {
        return (SquidItemSettings) super.maxDamageIfAbsent(maxDamage);
    }

    @Override
    public SquidItemSettings maxDamage(int maxDamage) {
        return (SquidItemSettings) super.maxDamage(maxDamage);
    }

    @Override
    public SquidItemSettings recipeRemainder(Item recipeRemainder) {
        return (SquidItemSettings) super.recipeRemainder(recipeRemainder);
    }

    @Override
    public SquidItemSettings rarity(Rarity rarity) {
        return (SquidItemSettings) super.rarity(rarity);
    }

    @Override
    public SquidItemSettings fireproof() {
        return (SquidItemSettings) super.fireproof();
    }

    @Override
    public SquidItemSettings requires(FeatureFlag... features) {
        return (SquidItemSettings) super.requires(features);
    }

    public ItemGroup group() {
        return group;
    }
}
