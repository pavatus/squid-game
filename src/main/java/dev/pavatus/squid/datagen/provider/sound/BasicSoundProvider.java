package dev.pavatus.squid.datagen.provider.sound;

import java.util.HashMap;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

import net.minecraft.sound.SoundEvent;

public class BasicSoundProvider extends SoundProvider {
    private final FabricDataOutput dataGenerator;

    private final HashMap<String, SoundEvent[]> soundEventList = new HashMap<>();

    public BasicSoundProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
        this.dataGenerator = dataOutput;
    }

    @Override
    public void generateSoundsData(SoundBuilder builder) {
        soundEventList.forEach(builder::add);
    }

    public void addSound(String soundName, SoundEvent sound) {
        soundEventList.put(soundName, new SoundEvent[]{sound});
    }

    public void addSound(String soundName, SoundEvent[] soundEvents) {
        soundEventList.put(soundName, soundEvents);
    }
}