package com.urfriders.teleportation.item;

import com.urfriders.teleportation.TeleportScrolls;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ALL = FabricItemGroupBuilder
            .create(new Identifier(TeleportScrolls.MOD_ID, "all"))
            .icon(() -> new ItemStack(ModItems.TELEPORT_SCROLL))
            .build();
}
