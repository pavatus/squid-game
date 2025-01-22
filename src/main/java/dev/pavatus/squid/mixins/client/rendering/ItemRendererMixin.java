package dev.pavatus.squid.mixins.client.rendering;

import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import dev.pavatus.squid.client.models.MP5GunModel;
import dev.pavatus.squid.core.SquidItems;
import dev.pavatus.squid.core.items.MP5GunItem;
import dev.pavatus.squid.core.items.dummies.DummyGunItem;

@Mixin(ItemRenderer.class)
public class ItemRendererMixin {
    @Unique private final MP5GunModel mp5Model = new MP5GunModel(MP5GunModel.getTexturedModelData().createModel());

    @Inject(method = "renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/render/model/json/ModelTransformationMode;ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/world/World;III)V", at = @At("HEAD"), cancellable = true)
    public void renderItem(LivingEntity entity, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, @Nullable World world, int light, int overlay, int seed, CallbackInfo ci) {
        if (stack.isEmpty()) return;

        if (stack.isOf(SquidItems.MP5)) {
            this.squid$handleMP5GunRendering(entity, stack, renderMode, leftHanded, matrices, vertexConsumers, world, light, overlay, seed, ci);
        }
    }

    @Inject(method = "renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/render/model/json/ModelTransformationMode;ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;IILnet/minecraft/client/render/model/BakedModel;)V", at = @At("HEAD"), cancellable = true)
    private void renderItem(ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, BakedModel model, CallbackInfo ci) {
        if (stack.isEmpty()) return;

        if (stack.isOf(SquidItems.MP5)) {
            this.squid$handleMP5GunRendering(null, stack, renderMode, leftHanded, matrices, vertexConsumers, null, light, overlay, 0, ci);
        }
    }

    @Unique private void squid$handleMP5GunRendering(LivingEntity entity, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, @Nullable World world, int light, int overlay, int seed, CallbackInfo ci) {
        if (!stack.isOf(SquidItems.MP5) || entity == null)
            return;

        MP5GunItem mp5 = (MP5GunItem) stack.getItem();

        matrices.push();

        matrices.translate(-0.5f, -0.5f, -0.5f);
        matrices.scale(1.0f, -1.0f, -1.0f);

        // render model here
        mp5Model.setAngling(matrices, renderMode, leftHanded);
        mp5Model.animateGunModel(mp5, entity.isSprinting() ? DummyGunItem.GunState.SPRINTING : DummyGunItem.GunState.RELOADING, mp5.age);
        ClientWorld clientWorld = world instanceof ClientWorld ? (ClientWorld) world : null;
        mp5Model.render(clientWorld, entity, stack, matrices, vertexConsumers, light, overlay, seed);

        matrices.pop();
        ci.cancel();
    }
}
