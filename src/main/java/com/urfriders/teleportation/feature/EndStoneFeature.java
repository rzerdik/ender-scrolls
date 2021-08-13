package com.urfriders.teleportation.feature;

import com.mojang.serialization.Codec;
import com.urfriders.teleportation.EnderScrolls;
import net.minecraft.util.Identifier;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class EndStoneFeature extends Feature<EndStoneFeatureConfig> {
    public static final Identifier ID = new Identifier(EnderScrolls.MOD_ID, "end_stone");

    public EndStoneFeature(Codec<EndStoneFeatureConfig> configCodec) {
        super(configCodec);
    }

    @Override
    public boolean generate(FeatureContext<EndStoneFeatureConfig> context) {
        var pos = context.getWorld().getTopPosition(Heightmap.Type.OCEAN_FLOOR_WG, context.getOrigin());
        var config = context.getConfig();
        var block = config.block().getBlockState(context.getRandom(), pos);

        context.getWorld().setBlockState(pos, block, 3);

        return true;
    }
}