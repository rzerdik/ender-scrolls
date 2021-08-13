package com.urfriders.teleportation.feature;

import com.mojang.serialization.Codec;
import com.urfriders.teleportation.EnderScrolls;
import net.minecraft.util.Identifier;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class EndTotemFeature extends Feature<EndTotemFeatureConfig> {
    public static final Identifier ID = new Identifier(EnderScrolls.MOD_ID, "end_totem");

    public EndTotemFeature(Codec<EndTotemFeatureConfig> configCodec) {
        super(configCodec);
    }

    @Override
    public boolean generate(FeatureContext<EndTotemFeatureConfig> context) {
        var pos = context.getWorld().getTopPosition(Heightmap.Type.OCEAN_FLOOR_WG, context.getOrigin());
        var config = context.getConfig();
        var block = config.block().getBlockState(context.getRandom(), pos);

        context.getWorld().setBlockState(pos.down(), block, 3);

        return true;
    }
}