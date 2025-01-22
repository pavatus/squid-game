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
import dev.pavatus.squid.client.models.GuardMaskModel;
import dev.pavatus.squid.core.items.wearables.MaskItem;

@Environment(value = EnvType.CLIENT)
public class GuardMaskFeatureRenderer<T extends LivingEntity, M extends PlayerEntityModel<T>>
        extends
        FeatureRenderer<T, M> {
    private final GuardMaskModel mask;

    public GuardMaskFeatureRenderer(FeatureRendererContext<T, M> context, EntityModelLoader loader) {
        super(context);
        this.mask = new GuardMaskModel(GuardMaskModel.getTexturedModelData().createModel());
    }

    @Override
    public void render(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, T livingEntity,
                       float f, float g, float h, float j, float k, float l) {
        ItemStack stack = livingEntity.getEquippedStack(EquipmentSlot.HEAD);

        if (!(stack.getItem() instanceof MaskItem maskItem))
            return;

        if (!(livingEntity instanceof AbstractClientPlayerEntity))
            return;

        matrixStack.push();

        this.mask.getPart().copyTransform(this.getContextModel().head);
        this.mask.setAngles(livingEntity, f, g, j, k, l);

        Identifier MASK_TEXTURE = new Identifier(SquidMod.MOD_ID,
                "textures/wearables/" + maskItem.getMaskType().asString() + "_mask.png");

        VertexConsumer vertexConsumer = vertexConsumerProvider.getBuffer(RenderLayer.getEntitySmoothCutout(MASK_TEXTURE));
        this.mask.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV, 1, 1, 1, 1f);

        matrixStack.pop();
    }
}
