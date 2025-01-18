package dev.pavatus.squid.mixins;

import dev.pavatus.lib.container.item.SquidItem;
import dev.pavatus.lib.container.item.SquidItemSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

@Mixin(Item.class)
public class ItemMixin implements SquidItem {

    private ItemGroup a$group;

    @Inject(method = "<init>", at = @At("TAIL"))
    public void init(Item.Settings settings, CallbackInfo ci) {
        if (settings instanceof SquidItemSettings tbh)
            this.a$group = tbh.group();
    }

    @Override
    public ItemGroup a$group() {
        return this.a$group;
    }
}
