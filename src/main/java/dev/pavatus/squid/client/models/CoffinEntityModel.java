package dev.pavatus.squid.client.models;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

@SuppressWarnings({"rawtypes", "unused"})
public class CoffinEntityModel extends SinglePartEntityModel {
    public final ModelPart coffin;
    public final ModelPart lid;
    public final ModelPart casing;
    public final ModelPart organ_marker;
    public CoffinEntityModel(ModelPart root) {
        this.coffin = root.getChild("coffin");
        this.lid = this.coffin.getChild("lid");
        this.casing = this.coffin.getChild("casing");
        this.organ_marker = this.coffin.getChild("organ_marker");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData coffin = modelPartData.addChild("coffin", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 18.0F, 0.0F));

        ModelPartData lid = coffin.addChild("lid", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -0.5F, -16.0F, 16.0F, 1.0F, 32.0F, new Dilation(0.0F))
        .uv(0, 34).cuboid(-8.0F, -0.5F, -16.0F, 16.0F, 1.0F, 32.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, -4.5F, 0.0F));

        ModelPartData casing = coffin.addChild("casing", ModelPartBuilder.create().uv(97, 0).cuboid(7.0F, -10.0F, -16.0F, 1.0F, 9.0F, 32.0F, new Dilation(0.0F))
        .uv(97, 84).cuboid(-7.0F, -10.0F, -16.0F, 14.0F, 9.0F, 1.0F, new Dilation(0.0F))
        .uv(97, 95).cuboid(-7.0F, -10.0F, 15.0F, 14.0F, 9.0F, 1.0F, new Dilation(0.0F))
        .uv(97, 42).cuboid(-8.0F, -10.0F, -16.0F, 1.0F, 9.0F, 32.0F, new Dilation(0.0F))
        .uv(0, 68).cuboid(-8.0F, -1.0F, -16.0F, 16.0F, 1.0F, 32.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, 0.0F));

        ModelPartData organ_marker = coffin.addChild("organ_marker", ModelPartBuilder.create().uv(0, -3).cuboid(-1.0F, -2.0F, -2.0F, 0.0F, 4.0F, 3.0F, new Dilation(0.002F)), ModelTransform.pivot(9.1F, -2.0F, 14.0F));
        return TexturedModelData.of(modelData, 256, 256);
    }
    @Override
    public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        coffin.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return coffin;
    }
}