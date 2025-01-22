package dev.pavatus.squid.client.animations;// Save this class in your mod and generate all required imports

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class MP5GunAnimations {
    public static final Animation MP5_RELOAD = Animation.Builder.create(2.7917F).looping()
        .addBoneAnimation("gun", new Transformation(Transformation.Targets.ROTATE,
            new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 4.5217F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.125F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 7.5F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.375F, AnimationHelper.createRotationalVector(-19.665F, -34.3552F, 7.5F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.5417F, AnimationHelper.createRotationalVector(-19.665F, -34.3552F, -25.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.7917F, AnimationHelper.createRotationalVector(-19.665F, -34.3552F, -32.5F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.9583F, AnimationHelper.createRotationalVector(-19.665F, -34.3552F, -25.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.125F, AnimationHelper.createRotationalVector(-19.665F, -34.3552F, -25.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.125F, AnimationHelper.createRotationalVector(-19.665F, -34.3552F, -25.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.2917F, AnimationHelper.createRotationalVector(-49.665F, -34.3552F, -25.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.4583F, AnimationHelper.createRotationalVector(-19.665F, -34.3552F, 7.5F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.5833F, AnimationHelper.createRotationalVector(-19.665F, -34.3552F, 7.5F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.7917F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
        ))
        .addBoneAnimation("gun", new Transformation(Transformation.Targets.TRANSLATE,
            new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
        ))
        .addBoneAnimation("mag", new Transformation(Transformation.Targets.ROTATE,
            new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.875F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -35.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.7917F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -35.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
        ))
        .addBoneAnimation("mag", new Transformation(Transformation.Targets.TRANSLATE,
            new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.875F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, -1.0F, -1.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(1.25F, AnimationHelper.createTranslationalVector(9.4525F, -20.9035F, -1.0F), Transformation.Interpolations.LINEAR),
            new Keyframe(1.5417F, AnimationHelper.createTranslationalVector(9.4525F, -20.9035F, -1.0F), Transformation.Interpolations.LINEAR),
            new Keyframe(1.7917F, AnimationHelper.createTranslationalVector(0.0F, -1.0F, -1.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
        ))
        .addBoneAnimation("mag", new Transformation(Transformation.Targets.SCALE,
            new Keyframe(1.2083F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
            new Keyframe(1.25F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
            new Keyframe(1.5F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
            new Keyframe(1.5417F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
        ))
        .addBoneAnimation("release", new Transformation(Transformation.Targets.ROTATE,
            new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(0.875F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.0F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.125F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
        ))
        .addBoneAnimation("rack", new Transformation(Transformation.Targets.TRANSLATE,
            new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 4.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.2917F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 4.0F), Transformation.Interpolations.CUBIC),
            new Keyframe(2.4583F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
        ))
        .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE,
            new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
            new Keyframe(0.75F, AnimationHelper.createRotationalVector(-0.5319F, 2.5814F, -8.1826F), Transformation.Interpolations.LINEAR),
            new Keyframe(0.9583F, AnimationHelper.createRotationalVector(-8.1182F, -10.3339F, -11.4164F), Transformation.Interpolations.LINEAR),
            new Keyframe(1.125F, AnimationHelper.createRotationalVector(35.2248F, -26.3865F, -25.927F), Transformation.Interpolations.LINEAR),
            new Keyframe(1.5417F, AnimationHelper.createRotationalVector(39.9833F, -3.4241F, -14.8976F), Transformation.Interpolations.LINEAR),
            new Keyframe(1.7917F, AnimationHelper.createRotationalVector(-5.1991F, -14.7593F, 1.3833F), Transformation.Interpolations.LINEAR),
            new Keyframe(2.0F, AnimationHelper.createRotationalVector(-10.0167F, -3.4241F, -14.8976F), Transformation.Interpolations.LINEAR),
            new Keyframe(2.125F, AnimationHelper.createRotationalVector(-5.1991F, -14.7593F, 1.3833F), Transformation.Interpolations.LINEAR),
            new Keyframe(2.2917F, AnimationHelper.createRotationalVector(-10.0167F, -3.4241F, -14.8976F), Transformation.Interpolations.LINEAR)
        ))
        .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE,
            new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
            new Keyframe(0.75F, AnimationHelper.createTranslationalVector(-0.0403F, -5.8938F, 3.3552F), Transformation.Interpolations.LINEAR),
            new Keyframe(0.9583F, AnimationHelper.createTranslationalVector(-0.0403F, -5.8938F, 3.3552F), Transformation.Interpolations.LINEAR),
            new Keyframe(1.125F, AnimationHelper.createTranslationalVector(1.0579F, -7.3438F, 4.1869F), Transformation.Interpolations.LINEAR),
            new Keyframe(1.2083F, AnimationHelper.createTranslationalVector(2.6726F, -9.568F, 5.3812F), Transformation.Interpolations.LINEAR),
            new Keyframe(1.6667F, AnimationHelper.createTranslationalVector(2.1564F, -8.7898F, 5.0234F), Transformation.Interpolations.LINEAR),
            new Keyframe(1.7917F, AnimationHelper.createTranslationalVector(-0.0403F, -5.8938F, 3.3552F), Transformation.Interpolations.LINEAR),
            new Keyframe(2.0F, AnimationHelper.createTranslationalVector(-0.0403F, -5.8938F, 3.3552F), Transformation.Interpolations.LINEAR),
            new Keyframe(2.125F, AnimationHelper.createTranslationalVector(0.6299F, 1.8851F, 5.1205F), Transformation.Interpolations.LINEAR),
            new Keyframe(2.2917F, AnimationHelper.createTranslationalVector(0.3598F, 2.7038F, 2.5509F), Transformation.Interpolations.LINEAR),
            new Keyframe(2.5833F, AnimationHelper.createTranslationalVector(-0.0403F, -5.8938F, 3.3552F), Transformation.Interpolations.LINEAR),
            new Keyframe(2.7917F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
        ))
        .build();

    public static final Animation MP5_SPRINT = Animation.Builder.create(0.0F).looping()
        .addBoneAnimation("gun", new Transformation(Transformation.Targets.ROTATE,
            new Keyframe(0.0F, AnimationHelper.createRotationalVector(22.5F, -60.0F, 0.0F), Transformation.Interpolations.LINEAR)
        ))
        .build();
}