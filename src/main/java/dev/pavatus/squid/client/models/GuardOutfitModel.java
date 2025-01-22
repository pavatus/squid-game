package dev.pavatus.squid.client.models;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

@SuppressWarnings("rawtypes")
public class GuardOutfitModel extends SinglePartEntityModel {
    public final ModelPart bone;
    public final ModelPart RightLeg;
    public final ModelPart RightFoot;
    public final ModelPart LeftLeg;
    public final ModelPart LeftFoot;
    public final ModelPart RightArm;
    public final ModelPart LeftArm;
    public final ModelPart Body;
    public final ModelPart Head;
    public GuardOutfitModel(ModelPart root) {
        this.bone = root.getChild("bone");
        this.RightLeg = this.bone.getChild("RightLeg");
        this.RightFoot = this.RightLeg.getChild("RightFoot");
        this.LeftLeg = this.bone.getChild("LeftLeg");
        this.LeftFoot = this.LeftLeg.getChild("LeftFoot");
        this.RightArm = this.bone.getChild("RightArm");
        this.LeftArm = this.bone.getChild("LeftArm");
        this.Body = this.bone.getChild("Body");
        this.Head = this.bone.getChild("Head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData RightLeg = bone.addChild("RightLeg", ModelPartBuilder.create().uv(0, 48).cuboid(-2.0F, -0.25F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
                .uv(32, 34).mirrored().cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.25F)).mirrored(false), ModelTransform.pivot(-1.9F, 12.0F, 0.0F));

        ModelPartData RightFoot = RightLeg.addChild("RightFoot", ModelPartBuilder.create().uv(48, 24).cuboid(-3.9F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.25F))
                .uv(48, 40).cuboid(-3.9F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.5F)), ModelTransform.pivot(1.9F, 11.75F, 0.0F));

        ModelPartData LeftLeg = bone.addChild("LeftLeg", ModelPartBuilder.create().uv(0, 48).mirrored().cuboid(-2.0F, -0.125F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false)
                .uv(32, 34).cuboid(-2.0F, 0.125F, -2.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(1.9F, 11.875F, 0.0F));

        ModelPartData LeftFoot = LeftLeg.addChild("LeftFoot", ModelPartBuilder.create().uv(32, 48).cuboid(-0.1F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.25F))
                .uv(48, 40).cuboid(-0.1F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.5F)), ModelTransform.pivot(-1.9F, 11.875F, 0.0F));

        ModelPartData RightArm = bone.addChild("RightArm", ModelPartBuilder.create().uv(0, 32).cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
                .uv(32, 0).cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

        ModelPartData LeftArm = bone.addChild("LeftArm", ModelPartBuilder.create().uv(0, 32).mirrored().cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false)
                .uv(32, 0).mirrored().cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F)).mirrored(false), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

        ModelPartData Body = bone.addChild("Body", ModelPartBuilder.create().uv(24, 16).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.275F))
                .uv(0, 16).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Head = bone.addChild("Head", ModelPartBuilder.create().uv(48, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.001F))
                .uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.25F))
                .uv(48, 48).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 128, 128);
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        bone.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return bone;
    }

    @Override
    public void setAngles(Entity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }
}