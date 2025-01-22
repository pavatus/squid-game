package dev.pavatus.squid.core.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.world.World;

public class CoffinEntity extends BoatEntity {
    public CoffinEntity(EntityType<? extends CoffinEntity> entityType, World world) {
        super(entityType, world);
    }

    public static CoffinEntity createCoffin(CoffinEntity coffin, double x, double y, double z) {
        coffin.setPosition(x, y, z);
        coffin.prevX = x;
        coffin.prevY = y;
        coffin.prevZ = z;
        return coffin;
    }

}
