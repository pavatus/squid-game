package dev.pavatus.squid;

import dev.pavatus.squid.item.SquidItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Squid implements ModInitializer {
    public static final String MOD_ID = "squid";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        SquidItems.init();
    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}