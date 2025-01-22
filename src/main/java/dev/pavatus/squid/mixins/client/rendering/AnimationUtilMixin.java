package dev.pavatus.squid.mixins.client.rendering;

import mc.duzo.animation.generic.AnimationInfo;
import mc.duzo.animation.util.AnimationUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.client.network.AbstractClientPlayerEntity;


@Mixin(AnimationUtil.class)
public class AnimationUtilMixin {
    @Inject(method = "getInfo", at = @At("HEAD"))
    private static void getInfo(AbstractClientPlayerEntity player, CallbackInfoReturnable<AnimationInfo> cir) {
    }
}
