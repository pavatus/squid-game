package dev.pavatus.squid.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import dev.pavatus.squid.datagen.provider.lang.LanguageProvider;
import dev.pavatus.squid.datagen.provider.lang.LanguageType;
import dev.pavatus.squid.datagen.provider.sound.BasicSoundProvider;

// TODO - use AIT datagen features when Theo moves it into its own library
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
            LanguageProvider provider = new LanguageProvider(output, LanguageType.EN_US);

            return provider;
        })));
    }

    private void genSounds(FabricDataGenerator.Pack pack) {
        pack.addProvider((((output, registriesFuture) -> {
            BasicSoundProvider provider = new BasicSoundProvider(output);

            return provider;
        })));
    }

    private static String convertToName(String str) {
        String[] split = str.split("_");

        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].substring(0, 1).toUpperCase() + split[i].substring(1).toLowerCase();
        }

        return String.join(" ", split);
    }
}