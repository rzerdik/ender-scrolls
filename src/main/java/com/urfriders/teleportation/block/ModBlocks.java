package com.urfriders.teleportation.block;

import net.minecraft.block.Block;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block END_TOTEM = new EndTotemBlock();

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, EndTotemBlock.ID, END_TOTEM);
    }

    public static void registerBlockItems() {
        Registry.register(Registry.ITEM, EndTotemBlock.ID, new BaseBlockItem(END_TOTEM));
    }
}
