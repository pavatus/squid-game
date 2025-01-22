package dev.pavatus.squid.client.models;

import java.util.function.Function;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;

import dev.pavatus.squid.core.items.dummies.DummyGunItem;

@SuppressWarnings("rawtypes")
public abstract class GunModel extends SinglePartEntityModel {

    public GunModel() {
        this(RenderLayer::getEntityCutoutNoCull);
    }

    public GunModel(Function<Identifier, RenderLayer> function) {
        super(function);
    }

    public void animateGunModel(DummyGunItem item, DummyGunItem.GunState state, int age) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);


        this.updateAnimation(item.ANIM_STATE, this.getAnimationForState(state), age);
    }

    public void renderWithAnimations(DummyGunItem item, ModelPart root, MatrixStack matrices,
                                     VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
        root.render(matrices, vertices, light, overlay, red, green, blue, pAlpha);
    }

    @Override
    public void setAngles(Entity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw,
                          float headPitch) {
    }

    public abstract Animation getAnimationForState(DummyGunItem.GunState state);
}
