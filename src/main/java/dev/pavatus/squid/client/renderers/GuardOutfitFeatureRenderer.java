package dev.pavatus.squid.client.renderers;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import dev.pavatus.squid.SquidMod;
import dev.pavatus.squid.client.models.GuardOutfitModel;
import dev.pavatus.squid.core.items.wearables.GuardOutfitItem;

@Environment(value = EnvType.CLIENT)
public class GuardOutfitFeatureRenderer<T extends LivingEntity, M extends PlayerEntityModel<T>>
        extends
        FeatureRenderer<T, M> {
    public static final Identifier TEXTURE = new Identifier(SquidMod.MOD_ID,
            "textures/wearables/guard_outfit.png");

    private final GuardOutfitModel model;

    public GuardOutfitFeatureRenderer(FeatureRendererContext<T, M> context, EntityModelLoader loader) {
        super(context);
        this.model = new GuardOutfitModel(GuardOutfitModel.getTexturedModelData().createModel());
    }

    @Override
    public void render(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, T livingEntity,
                       float f, float g, float h, float j, float k, float l) {
        if (!(livingEntity instanceof AbstractClientPlayerEntity))
            return;

        for (BodyParts part : BodyParts.values()) {
            ItemStack modelForSlotStack = getModelForSlot(livingEntity, part);
            if (modelForSlotStack.getItem() instanceof GuardOutfitItem) {
                enablePart(model, part);
            } else {
                disablePart(model, part);
            }
        }

        matrixStack.push();
        this.copyTransforms(this.model, this.getContextModel());
        this.model.setAngles(livingEntity, f, g, j, k, l);

        VertexConsumer vertexConsumer = vertexConsumerProvider.getBuffer(RenderLayer.getEntitySmoothCutout(TEXTURE));
        this.model.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV, 1, 1, 1, 1f);
        matrixStack.pop();
    }

    public void copyTransforms(GuardOutfitModel model, PlayerEntityModel player) {
        model.Head.copyTransform(player.head);
        model.Body.copyTransform(player.body);
        model.RightArm.copyTransform(player.rightArm);
        model.LeftArm.copyTransform(player.leftArm);
        model.RightLeg.copyTransform(player.rightLeg);
        model.LeftLeg.copyTransform(player.leftLeg);
    }

    public static void enablePart(GuardOutfitModel model, BodyParts part) {
        switch (part) {
            case HEAD:
                model.Head.visible = true;
                break;
            case CHEST:
                model.Body.visible = true;
                model.LeftArm.visible = true;
                model.RightArm.visible = true;
                break;
            case LEGS:
                model.LeftLeg.visible = true;
                model.RightLeg.visible = true;

                break;
            case FEET:
                model.LeftFoot.visible = true;
                model.RightFoot.visible = true;
                break;
        }
    }

    public static void disablePart(GuardOutfitModel model, BodyParts part) {
        switch (part) {
            case HEAD:
                model.Head.visible = false;
                break;
            case CHEST:
                model.Body.visible = false;
                model.LeftArm.visible = false;
                model.RightArm.visible = false;
                break;
            case LEGS:
                model.LeftLeg.visible = false;
                model.RightLeg.visible = false;
                break;
            case FEET:
                model.LeftFoot.visible = false;
                model.RightFoot.visible = false;
                break;
        }
    }

    public static ItemStack getModelForSlot(LivingEntity entity, BodyParts parts) {
        return switch(parts) {
            default -> entity.getEquippedStack(EquipmentSlot.HEAD);
            case CHEST -> entity.getEquippedStack(EquipmentSlot.CHEST);
            case LEGS -> entity.getEquippedStack(EquipmentSlot.LEGS);
            case FEET -> entity.getEquippedStack(EquipmentSlot.FEET);
        };
    }


    public enum BodyParts {
        HEAD,
        CHEST,
        LEGS,
        FEET
    }
}
