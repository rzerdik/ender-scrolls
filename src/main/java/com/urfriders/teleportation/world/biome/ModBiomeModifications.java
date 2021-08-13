package com.urfriders.teleportation.world.biome;

import com.urfriders.teleportation.feature.ModConfiguredFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModBiomeModifications {
    public static void addFeatures() {
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.END_TOTEM_REGISTRY_KEY);
    }
}
