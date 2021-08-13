package com.urfriders.teleportation.block;

import com.urfriders.teleportation.EnderScrolls;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class EndTotemBlock extends Block {
    public static final Identifier ID = new Identifier(EnderScrolls.MOD_ID, "end_totem");

    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;

    public EndTotemBlock() {
        super(FabricBlockSettings.of(Material.STONE)
                .sounds(BlockSoundGroup.STONE)
                .strength(2.5f)
                .breakByHand(false)
                .breakByTool(FabricToolTags.PICKAXES, 1)
                .requiresTool());

        setDefaultState(getStateManager().getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return getDefaultState().with(FACING, ctx.getPlayerFacing());
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }
}
