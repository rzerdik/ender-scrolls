package com.urfriders.teleportation.item;

import com.urfriders.teleportation.EnderScrolls;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ENDER_SCROLL = new EnderScrollItem(1);
    public static final Item EMPTY_ENDER_SCROLL = new EmptyEnderScrollItem(8);

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(EnderScrolls.MOD_ID, "ender_scroll"), ENDER_SCROLL);
        Registry.register(Registry.ITEM, new Identifier(EnderScrolls.MOD_ID, "empty_ender_scroll"), EMPTY_ENDER_SCROLL);
    }
}
