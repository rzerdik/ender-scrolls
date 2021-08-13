package com.urfriders.teleportation.item;

import com.urfriders.teleportation.TeleportScrolls;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item TELEPORT_SCROLL = new TeleportScrollItem(1);
    public static final Item EMPTY_TELEPORT_SCROLL = new EmptyTeleportScrollItem(8);

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(TeleportScrolls.MOD_ID, "teleport_scroll"), TELEPORT_SCROLL);
        Registry.register(Registry.ITEM, new Identifier(TeleportScrolls.MOD_ID, "empty_teleport_scroll"), EMPTY_TELEPORT_SCROLL);
    }
}
