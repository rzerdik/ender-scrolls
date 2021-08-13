package com.urfriders.teleportation.feature;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;

public class ModFeatures {
    public static final Feature<EndStoneFeatureConfig> END_STONE = new EndStoneFeature(EndStoneFeatureConfig.CODEC);

    public static void registerFeatures() {
        Registry.register(Registry.FEATURE, EndStoneFeature.ID, END_STONE);
    }
}
