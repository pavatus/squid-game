package dev.pavatus.squid.core;

import dev.pavatus.lib.container.impl.EntityContainer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;

import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;

import dev.pavatus.squid.core.entities.CoffinEntity;

public class SquidEntities implements EntityContainer {
    public static final EntityType<CoffinEntity> COFFIN_ENTITY_TYPE = FabricEntityTypeBuilder
            .create(SpawnGroup.MISC, CoffinEntity::new)
            .dimensions(EntityDimensions.fixed(1f, 1f)).build();
}
