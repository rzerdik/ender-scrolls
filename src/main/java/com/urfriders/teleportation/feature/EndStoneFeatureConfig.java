package com.urfriders.teleportation.feature;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public record EndStoneFeatureConfig(BlockStateProvider block) implements FeatureConfig {
    public static final Codec<EndStoneFeatureConfig> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            BlockStateProvider.TYPE_CODEC.fieldOf("block").forGetter(EndStoneFeatureConfig::block)
    ).apply(instance, instance.stable(EndStoneFeatureConfig::new)));
}