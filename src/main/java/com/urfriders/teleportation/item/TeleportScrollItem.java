package com.urfriders.teleportation.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.sound.SoundEvents;

public class TeleportScrollItem extends BaseItem {

    public TeleportScrollItem(int maxStackSize) {
        super(maxStackSize);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        var itemStack = playerEntity.getStackInHand(hand);
        if (world.isClient) {
            return TypedActionResult.success(itemStack, true);
        }

        var nbt = itemStack.getNbt();
        if (nbt != null && nbt.contains("TeleportPosition")) {
            var position = NbtHelper.toBlockPos(nbt.getCompound("TeleportPosition"));

            if (playerEntity.teleport(position.getX() + 0.5f, position.getY(), position.getZ() + 0.5f, true)) {
                itemStack.decrement(1);
                playerEntity.playSound(SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 1, 0.5f);
            } else {
                playerEntity.playSound(SoundEvents.ENTITY_ENDERMAN_SCREAM, SoundCategory.PLAYERS, 1, 1);
            }
        }

        return TypedActionResult.consume(itemStack);
    }
}
