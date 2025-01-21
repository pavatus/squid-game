package dev.pavatus.squid.client.models;

import net.minecraft.client.model.*;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;

import dev.pavatus.squid.SquidMod;
import dev.pavatus.squid.client.animations.MP5GunAnimations;
import dev.pavatus.squid.core.items.dummies.DummyGunItem;

public class MP5GunModel extends GunModel {
    public static final Identifier TEXTURE = new Identifier(SquidMod.MOD_ID, "textures/guns/mp5/mp5.png");
    public final ModelPart mp5;
    public final ModelPart gun;
    public final ModelPart pinion;
    public final ModelPart rack;
    public final ModelPart trigger;
    public final ModelPart release;
    public final ModelPart switcher;
    public final ModelPart mag;
    public final ModelPart stock;
    public final ModelPart body;
    public final ModelPart rightArm;
    public final ModelPart leftArm;
    public MP5GunModel(ModelPart root) {
        this.mp5 = root.getChild("mp5");
        this.gun = this.mp5.getChild("gun");
        this.pinion = this.gun.getChild("pinion");
        this.rack = this.pinion.getChild("rack");
        this.trigger = this.gun.getChild("trigger");
        this.release = this.gun.getChild("release");
        this.switcher = this.gun.getChild("switcher");
        this.mag = this.gun.getChild("mag");
        this.stock = this.gun.getChild("stock");
        this.body = this.gun.getChild("body");
        this.rightArm = this.gun.getChild("rightArm");
        this.leftArm = this.gun.getChild("leftArm");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData mp5 = modelPartData.addChild("mp5", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData gun = mp5.addChild("gun", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 1.1312F, 0.25F));

        ModelPartData pinion = gun.addChild("pinion", ModelPartBuilder.create().uv(0, 46).cuboid(-2.0F, -1.0F, -6.75F, 1.0F, 1.0F, 7.0F, new Dilation(0.001F))
                .uv(42, 50).cuboid(-2.0F, -1.05F, -6.75F, 1.0F, 0.0F, 7.0F, new Dilation(0.001F)), ModelTransform.pivot(1.5F, -3.75F, -0.25F));

        ModelPartData rack = pinion.addChild("rack", ModelPartBuilder.create().uv(64, 66).cuboid(-0.125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(-0.1F))
                .uv(65, 60).cuboid(-0.875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.001F)), ModelTransform.pivot(-1.125F, -0.5F, -11.5F));

        ModelPartData trigger = gun.addChild("trigger", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.6473F, -2.2413F));

        ModelPartData cube_r1 = trigger.addChild("cube_r1", ModelPartBuilder.create().uv(24, 65).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new Dilation(-0.1F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.1345F, 0.0F, 0.0F));

        ModelPartData release = gun.addChild("release", ModelPartBuilder.create(), ModelTransform.of(0.0F, -0.808F, -5.4328F, -0.6981F, 0.0F, 0.0F));

        ModelPartData cube_r2 = release.addChild("cube_r2", ModelPartBuilder.create().uv(61, 47).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.1345F, 0.0F, 0.0F));

        ModelPartData switcher = gun.addChild("switcher", ModelPartBuilder.create().uv(59, 65).cuboid(-0.5F, -0.5F, 0.0F, 0.0F, 1.0F, 2.0F, new Dilation(0.001F))
                .uv(59, 65).cuboid(-2.5F, -0.5F, 0.0F, 0.0F, 1.0F, 2.0F, new Dilation(0.001F)), ModelTransform.pivot(1.5F, -0.8973F, -1.4913F));

        ModelPartData mag = gun.addChild("mag", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.6837F, -6.4549F));

        ModelPartData cube_r3 = mag.addChild("cube_r3", ModelPartBuilder.create().uv(43, 58).cuboid(-1.0F, -0.225F, -1.0F, 2.0F, 8.0F, 2.0F, new Dilation(-0.2F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

        ModelPartData stock = gun.addChild("stock", ModelPartBuilder.create().uv(33, 0).cuboid(-1.5F, 1.25F, 3.0F, 2.0F, 2.0F, 11.0F, new Dilation(0.002F))
                .uv(15, 60).cuboid(-1.5F, 3.25F, 12.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.003F))
                .uv(61, 42).cuboid(-1.5F, 3.25F, 10.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(61, 37).cuboid(-1.5F, 3.25F, 7.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.5F, -4.5F, 2.75F));

        ModelPartData cube_r4 = stock.addChild("cube_r4", ModelPartBuilder.create().uv(32, 52).cuboid(-1.5F, 0.0F, 2.0F, 2.0F, 2.0F, 2.0F, new Dilation(-0.001F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.4014F, 0.0F, 0.0F));

        ModelPartData cube_r5 = stock.addChild("cube_r5", ModelPartBuilder.create().uv(33, 27).cuboid(-1.5F, 0.0F, 4.0F, 2.0F, 2.0F, 10.0F, new Dilation(0.001F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3971F, 0.0F, 0.0F));

        ModelPartData body = gun.addChild("body", ModelPartBuilder.create().uv(33, 14).cuboid(-1.0F, -3.75F, -15.25F, 2.0F, 2.0F, 10.0F, new Dilation(0.1F))
                .uv(58, 30).cuboid(-1.0F, -3.75F, 0.75F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
                .uv(23, 40).cuboid(-0.5F, -4.5F, -5.25F, 1.0F, 3.0F, 8.0F, new Dilation(0.0F))
                .uv(52, 65).cuboid(-0.5F, -5.25F, 0.2F, 1.0F, 1.0F, 2.0F, new Dilation(0.2F))
                .uv(0, 34).cuboid(-0.5F, -4.5F, -15.25F, 1.0F, 1.0F, 10.0F, new Dilation(0.0F))
                .uv(17, 46).cuboid(-1.0F, -6.5F, -15.25F, 2.0F, 3.0F, 0.0F, new Dilation(0.01F))
                .uv(65, 56).cuboid(-1.0F, -6.5F, 1.2F, 2.0F, 3.0F, 0.0F, new Dilation(0.01F))
                .uv(0, 63).cuboid(-0.5F, -3.75F, -17.25F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(65, 63).cuboid(-0.5F, -2.25F, -16.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(59, 50).cuboid(-1.0F, -2.5F, -15.5F, 2.0F, 2.0F, 3.0F, new Dilation(-0.1F))
                .uv(42, 40).cuboid(-1.0F, -2.0F, -5.25F, 2.0F, 2.0F, 7.0F, new Dilation(-0.1F))
                .uv(23, 34).cuboid(0.0F, 1.5F, -3.5F, 0.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData cube_r6 = body.addChild("cube_r6", ModelPartBuilder.create().uv(32, 58).cuboid(-1.0F, -1.3F, -1.25F, 2.0F, 7.0F, 3.0F, new Dilation(-0.2F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.5662F, -0.0135F, 0.0005F));

        ModelPartData cube_r7 = body.addChild("cube_r7", ModelPartBuilder.create().uv(24, 60).cuboid(0.0F, -0.8F, -2.825F, 0.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.2829F, -3.4266F, -1.1345F, 0.0F, 0.0F));

        ModelPartData cube_r8 = body.addChild("cube_r8", ModelPartBuilder.create().uv(60, 6).cuboid(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 3.0F, new Dilation(-0.1F)), ModelTransform.of(0.0F, 0.0409F, -5.1377F, -0.4363F, 0.0F, 0.0F));

        ModelPartData cube_r9 = body.addChild("cube_r9", ModelPartBuilder.create().uv(52, 58).cuboid(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 4.0F, new Dilation(-0.2F)), ModelTransform.of(0.0F, 0.0329F, 1.6016F, 0.4363F, 0.0F, 0.0F));

        ModelPartData cube_r10 = body.addChild("cube_r10", ModelPartBuilder.create().uv(60, 0).cuboid(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, new Dilation(-0.1F)), ModelTransform.of(0.0F, -0.4671F, -12.6484F, 0.4363F, 0.0F, 0.0F));

        ModelPartData cube_r11 = body.addChild("cube_r11", ModelPartBuilder.create().uv(58, 22).cuboid(-0.5F, 0.5F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.5F, -1.25F, 0.0F, 0.0F, -0.3927F));

        ModelPartData cube_r12 = body.addChild("cube_r12", ModelPartBuilder.create().uv(58, 14).cuboid(-0.5F, 0.5F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.5F, -1.25F, 0.0F, 0.0F, 0.3927F));

        ModelPartData cube_r13 = body.addChild("cube_r13", ModelPartBuilder.create().uv(0, 55).cuboid(-0.5F, -1.5F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.5F, -1.25F, 0.0F, 0.0F, -0.3927F));

        ModelPartData cube_r14 = body.addChild("cube_r14", ModelPartBuilder.create().uv(17, 52).cuboid(-0.5F, -1.5F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.5F, -1.25F, 0.0F, 0.0F, 0.3927F));

        ModelPartData cube_r15 = body.addChild("cube_r15", ModelPartBuilder.create().uv(7, 63).cuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -4.5F, 2.75F, -0.3491F, 0.0F, 0.0F));

        ModelPartData rightArm = gun.addChild("rightArm", ModelPartBuilder.create().uv(0, 17).cuboid(-0.75F, -2.0F, -9.0F, 4.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.9028F, 1.554F, 6.517F));

        ModelPartData leftArm = gun.addChild("leftArm", ModelPartBuilder.create().uv(0, 0).cuboid(-0.75F, -2.0F, -9.0F, 4.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(5.8893F, 2.2267F, -4.434F, -0.242F, 0.6955F, -0.044F));
        return TexturedModelData.of(modelData, 128, 128);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        mp5.render(matrices, vertices, light, overlay, red, green, blue, alpha);

    }

    @Override
    public ModelPart getPart() {
        return mp5;
    }

    public void render(ClientWorld clientWorld, LivingEntity entity, ItemStack stack, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, int seed) {
        this.render(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(TEXTURE)), light, overlay, 1.0F, 1.0F, 1.0F, 1.0F);
    }

    /*@Override
    public void renderWithAnimations(DummyGunItem item, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
        super.renderWithAnimations(item, root, matrices, vertices, light, overlay, red, green, blue, pAlpha);
    }*/

    @Override
    public Animation getAnimationForState(DummyGunItem.GunState state) {
        return switch(state) {
            case SPRINTING -> MP5GunAnimations.MP5_SPRINT;
            case RELOADING -> MP5GunAnimations.MP5_RELOAD;
            default -> Animation.Builder.create(0).build();
        };
    }

    public void setAngling(MatrixStack matrices, ModelTransformationMode renderMode, boolean leftHanded) {
        if (renderMode.isFirstPerson()) {
            this.leftArm.visible = true;
            this.rightArm.visible = true;
            if (leftHanded) {
                matrices.translate(1, 0, 0f);
                matrices.scale(1, 1, -1);
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180));
            }
            matrices.translate(0.5f, -2f, -0.45f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180));
        } else {
            this.leftArm.visible = false;
            this.rightArm.visible = false;
            matrices.translate(0.5, -1.55f, -0.6);
            matrices.scale(0.65f, 0.65f, 0.65f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180));
        }
    }

    public void renderPlayerArms(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, AbstractClientPlayerEntity player, PlayerEntityModel playerEntityModel) {
        matrices.push();
        matrices.translate(0, -1.5f, 0);
        //playerEntityModel.rightArm.resetTransform();
        //playerEntityModel.rightArm.copyTransform(this.rightArm);
        //playerEntityModel.rightArm
        //        .render(matrices,
        //                vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(player.getSkinTexture())),
        //                light, OverlayTexture.DEFAULT_UV);
        /*playerEntityModel.rightSleeve.copyTransform(playerEntityModel.rightArm);
        playerEntityModel.rightSleeve.render(matrices,
                vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(player.getSkinTexture())),
                light, OverlayTexture.DEFAULT_UV);
        playerEntityModel.leftArm.copyTransform(this.leftArm);
        playerEntityModel.leftArm.render(matrices,
                vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(player.getSkinTexture())),
                light, OverlayTexture.DEFAULT_UV);
        playerEntityModel.leftSleeve.copyTransform(playerEntityModel.leftArm);
        playerEntityModel.leftSleeve.render(matrices,
                vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(player.getSkinTexture())),
                light, OverlayTexture.DEFAULT_UV);*/
        matrices.pop();
    }
}