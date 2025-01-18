package dev.pavatus.squid;

import dev.pavatus.lib.container.RegistryContainer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.pavatus.squid.core.SquidBlockEntities;
import dev.pavatus.squid.core.SquidBlocks;
import dev.pavatus.squid.core.SquidEntities;
import dev.pavatus.squid.core.SquidItems;

public class SquidMod implements ModInitializer {
    public static final String MOD_ID = "squid_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        RegistryContainer.register(SquidItems.class, MOD_ID);
        RegistryContainer.register(SquidBlocks.class, MOD_ID);
        RegistryContainer.register(SquidBlockEntities.class, MOD_ID);
        RegistryContainer.register(SquidEntities.class, MOD_ID);
    }
}