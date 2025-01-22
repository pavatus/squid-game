package dev.pavatus.squid.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

import dev.pavatus.squid.client.renderers.CoffinEntityRenderer;
import dev.pavatus.squid.core.SquidEntities;

public class SquidModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        registerEntityRenderers();
        HudRenderCallback.EVENT.register(new SquidOverlay());
    }

    public void registerEntityRenderers() {
        EntityRendererRegistry.register(SquidEntities.COFFIN_ENTITY_TYPE, CoffinEntityRenderer::new);
    }
}
