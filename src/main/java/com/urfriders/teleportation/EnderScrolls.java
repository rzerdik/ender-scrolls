package com.urfriders.teleportation;

import com.urfriders.teleportation.block.ModBlocks;
import com.urfriders.teleportation.block.entity.ModBlockEntities;
import com.urfriders.teleportation.command.ModCommands;
import com.urfriders.teleportation.entity.ModEntities;
import com.urfriders.teleportation.feature.ModConfiguredFeatures;
import com.urfriders.teleportation.feature.ModFeatures;
import com.urfriders.teleportation.item.ModItems;
import com.urfriders.teleportation.loot.ModLootTables;
import com.urfriders.teleportation.screen.ModScreens;
import com.urfriders.teleportation.world.biome.ModBiomeModifications;
import net.fabricmc.api.ModInitializer;

public class EnderScrolls implements ModInitializer {
	public static final String MOD_ID = "teleportation";

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModBlocks.registerBlockItems();
		ModBlockEntities.registerBlockEntities();
		ModEntities.registerEntities();
		ModScreens.registerScreenHandlers();
		ModCommands.registerCommands();
		ModLootTables.registerLootTables();
		ModFeatures.registerFeatures();
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModBiomeModifications.addFeatures();
	}
}
