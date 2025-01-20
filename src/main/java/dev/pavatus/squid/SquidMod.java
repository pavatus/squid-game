package dev.pavatus.squid;

import dev.pavatus.lib.container.RegistryContainer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.util.Identifier;

import dev.pavatus.squid.core.SquidBlockEntities;
import dev.pavatus.squid.core.SquidBlocks;
import dev.pavatus.squid.core.SquidEntities;
import dev.pavatus.squid.core.SquidItems;

public class SquidMod implements ModInitializer {
    public static final String MOD_ID = "squid";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        RegistryContainer.register(SquidItems.class, MOD_ID);
        RegistryContainer.register(SquidItems.Groups.class, MOD_ID);
        RegistryContainer.register(SquidBlocks.class, MOD_ID);
        RegistryContainer.register(SquidBlockEntities.class, MOD_ID);
        RegistryContainer.register(SquidEntities.class, MOD_ID);
    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}