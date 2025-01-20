package dev.pavatus.squid.client.renderers;

import org.joml.Quaternionf;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

import dev.pavatus.squid.SquidMod;
import dev.pavatus.squid.client.models.CoffinEntityModel;
import dev.pavatus.squid.core.entities.CoffinEntity;

public class CoffinEntityRenderer extends EntityRenderer<CoffinEntity> {

    public static final Identifier TEXTURE = new Identifier(SquidMod.MOD_ID, "textures/entities/coffin/coffin.png");
    private final CoffinEntityModel model;

    public CoffinEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
        this.model = new CoffinEntityModel(CoffinEntityModel.getTexturedModelData().createModel());
    }

    public void render(CoffinEntity boatEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();
        matrixStack.translate(0.0F, 1, 0.0F);
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180.0F - f));
        float h = (float)boatEntity.getDamageWobbleTicks() - g;
        float j = boatEntity.getDamageWobbleStrength() - g;
        if (j < 0.0F) {
            j = 0.0F;
        }

        matrixStack.multiply(RotationAxis.NEGATIVE_X.rotationDegrees(90f));

        model.lid.visible = false;

        if (h > 0.0F) {
            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(MathHelper.sin(h) * h * j / 10.0F * (float)boatEntity.getDamageWobbleSide()));
        }

        float k = boatEntity.interpolateBubbleWobble(g);
        if (!MathHelper.approximatelyEquals(k, 0.0F)) {
            matrixStack.multiply(new Quaternionf().setAngleAxis(boatEntity.interpolateBubbleWobble(g) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
        }

        matrixStack.translate(0, 1, 0);
        matrixStack.scale(-1.0F, -1.0F, 1.0F);
        this.model.setAngles(boatEntity, g, 0.0F, -0.1F, 0.0F, 0.0F);
        VertexConsumer vertexConsumer = vertexConsumerProvider.getBuffer(RenderLayer.getEntityCutout(TEXTURE));
        this.model.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);

        matrixStack.pop();
        super.render(boatEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Identifier getTexture(CoffinEntity entity) {
        return TEXTURE;
    }
}
