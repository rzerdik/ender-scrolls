package com.urfriders.teleportation.feature;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public record EndTotemFeatureConfig(BlockStateProvider block) implements FeatureConfig {
    public static final Codec<EndTotemFeatureConfig> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            BlockStateProvider.TYPE_CODEC.fieldOf("block").forGetter(EndTotemFeatureConfig::block)
    ).apply(instance, instance.stable(EndTotemFeatureConfig::new)));
}