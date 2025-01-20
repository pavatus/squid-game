package dev.pavatus.squid.client;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;

import dev.pavatus.squid.SquidMod;
import dev.pavatus.squid.core.items.mask.MaskItem;

public class SquidOverlay implements HudRenderCallback {

    private static final Identifier OVERLAY = new Identifier(SquidMod.MOD_ID, "textures/gui/overlays/mask_moire.png");

    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player == null) return;

        boolean hasMaskOn = client.player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof MaskItem;
        if (hasMaskOn && client.options.getPerspective().isFirstPerson()) {
            RenderSystem.depthMask(false);
            drawContext.setShaderColor(1.0F, 1.0F, 1.0F, 1.0f);
            drawContext.drawTexture(OVERLAY, 0, 0, -200, 0, 0, drawContext.getScaledWindowWidth(), drawContext.getScaledWindowHeight(), drawContext.getScaledWindowWidth(), drawContext.getScaledWindowHeight());
            RenderSystem.depthMask(true);
            drawContext.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        }
    }
}
