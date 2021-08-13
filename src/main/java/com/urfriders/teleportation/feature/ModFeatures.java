package com.urfriders.teleportation.feature;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;

public class ModFeatures {
    public static final Feature<EndTotemFeatureConfig> END_TOTEM = new EndTotemFeature(EndTotemFeatureConfig.CODEC);

    public static void registerFeatures() {
        Registry.register(Registry.FEATURE, EndTotemFeature.ID, END_TOTEM);
    }
}
