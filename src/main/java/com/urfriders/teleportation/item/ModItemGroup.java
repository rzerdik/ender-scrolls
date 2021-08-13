package com.urfriders.teleportation.item;

import com.urfriders.teleportation.EnderScrolls;
import com.urfriders.teleportation.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BLOCKS = FabricItemGroupBuilder
            .create(new Identifier(EnderScrolls.MOD_ID, "blocks"))
            .icon(() -> new ItemStack(ModBlocks.END_TOTEM))
            .build();

    public static final ItemGroup ITEMS = FabricItemGroupBuilder
            .create(new Identifier(EnderScrolls.MOD_ID, "items"))
            .icon(() -> new ItemStack(ModItems.ENDER_SCROLL))
            .build();
}
