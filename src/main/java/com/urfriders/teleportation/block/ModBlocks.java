package com.urfriders.teleportation.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block NOTARY_TABLE = new NotaryTableBlock();

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, NotaryTableBlock.ID, NOTARY_TABLE);
    }

    public static void registerBlockItems() {
        Registry.register(Registry.ITEM, NotaryTableBlock.ID, new BaseBlockItem(NOTARY_TABLE));
    }
}
