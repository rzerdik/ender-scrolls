package com.urfriders.teleportation.loot;

import com.urfriders.teleportation.item.ModItems;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTables {
    public static final Identifier END_CITY_CHEST = new Identifier("minecraft", "chests/end_city_treasure");

    public static void registerLootTables() {
        LootTableLoadingCallback.EVENT.register((((resourceManager, manager, id, supplier, setter) -> {
            if (END_CITY_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.EMPTY_ENDER_SCROLL/* INSERT ENDER COIN HERE */))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(0, 5)).build());
                supplier.withPool(poolBuilder.build());
            }
        })));
    }
}
