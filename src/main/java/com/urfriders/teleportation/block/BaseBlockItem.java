package com.urfriders.teleportation.block;

import com.urfriders.teleportation.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class BaseBlockItem extends BlockItem {
    public BaseBlockItem(Block block) {
        super(block, new FabricItemSettings().group(ModItemGroup.BLOCKS));
    }

    public BaseBlockItem(Block block, ItemGroup itemGroup) {
        super(block, new FabricItemSettings().group(itemGroup));
    }
}
