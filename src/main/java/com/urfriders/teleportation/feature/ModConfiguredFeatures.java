package com.urfriders.teleportation.feature;

import com.urfriders.teleportation.EnderScrolls;
import com.urfriders.teleportation.block.ModBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.HeightmapDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_STONES_REGISTRY_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(EnderScrolls.MOD_ID, "ender_stones"));
    public static final ConfiguredFeature<?, ?> END_STONES = ModFeatures.END_STONE.configure(new EndStoneFeatureConfig(new SimpleBlockStateProvider(ModBlocks.NOTARY_TABLE.getDefaultState())))
            .decorate(Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.OCEAN_FLOOR_WG)))
            .spreadHorizontally()
            .applyChance(1);

    public static void registerConfiguredFeatures() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, END_STONES_REGISTRY_KEY.getValue(), END_STONES);
    }
}
