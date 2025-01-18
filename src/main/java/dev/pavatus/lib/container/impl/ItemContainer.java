package dev.pavatus.lib.container.impl;

import dev.pavatus.lib.container.RegistryContainer;
import dev.pavatus.lib.container.item.SquidItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public abstract class ItemContainer implements RegistryContainer<Item> {

    private List<Item> items;

    @Override
    public void start(int fields) {
        this.items = new ArrayList<>(fields);
    }

    @Override
    public Class<Item> getTargetClass() {
        return Item.class;
    }

    @Override
    public Registry<Item> getRegistry() {
        return Registries.ITEM;
    }

    @Override
    public void postProcessField(Identifier identifier, Item value, Field field) {
        this.items.add(value);
    }

    @Override
    public void finish() {
        ItemGroupEvents.MODIFY_ENTRIES_ALL.register((group, entries) -> {
            for (Item item : items) {
                ItemGroup target = ((SquidItem) item).a$group();

                if (target == null)
                    target = this.getDefaultGroup();

                if (target == group)
                    entries.add(item);
            }
        });
    }

    @Nullable
    public ItemGroup getDefaultGroup() {
        return null;
    }
}
