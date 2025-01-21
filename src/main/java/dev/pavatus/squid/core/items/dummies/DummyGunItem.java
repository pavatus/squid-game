package dev.pavatus.squid.core.items.dummies;

import net.minecraft.entity.AnimationState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

public class DummyGunItem extends Item {
    public final AnimationState ANIM_STATE = new AnimationState();
    public int age;
    public GunState state = GunState.RELOADING;
    public DummyGunItem(Settings settings) {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!(world instanceof ServerWorld)) {
            this.age++;

            ANIM_STATE.startIfNotRunning(this.age);
            return;
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    public enum GunState {
        DEFAULT,
        RELOADING,
        SPRINTING,
        FIRING,
        SWITCHING_MODES
    }
}
