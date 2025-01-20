package dev.pavatus.squid.datagen;

import dev.pavatus.lib.datagen.lang.LanguageType;
import dev.pavatus.lib.datagen.lang.SakitusLanguageProvider;
import dev.pavatus.lib.datagen.sound.SakitusSoundProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import dev.pavatus.squid.core.SquidBlocks;
import dev.pavatus.squid.core.SquidItems;

public class SquidDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator gen) {
        FabricDataGenerator.Pack pack = gen.createPack();

        genLang(pack);
        genSounds(pack);
    }

    private void genLang(FabricDataGenerator.Pack pack) {
        genEnglish(pack);
    }

    private void genEnglish(FabricDataGenerator.Pack pack) {
        pack.addProvider((((output, registriesFuture) -> {
            SakitusLanguageProvider provider = new SakitusLanguageProvider(output, LanguageType.EN_US);

            provider.translateBlocks(SquidBlocks.class);
            provider.translateItems(SquidItems.class);

            return provider;
        })));
    }

    private void genSounds(FabricDataGenerator.Pack pack) {
        pack.addProvider((((output, registriesFuture) -> {
            SakitusSoundProvider provider = new SakitusSoundProvider(output);

            return provider;
        })));
    }
}