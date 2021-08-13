package com.urfriders.teleportation.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.*;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class EmptyTeleportScrollItem extends BaseItem {

    public EmptyTeleportScrollItem(int maxStackSize) {
        super(maxStackSize);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        var originalStack = playerEntity.getStackInHand(hand);

        if (!world.isClient) {
            var nbt = originalStack.getOrCreateNbt().copy();

            nbt.put("TeleportPosition", NbtHelper.fromBlockPos(playerEntity.getBlockPos()));
            var nbtDisplay = new NbtCompound();
            var nbtLore = new NbtList();

            nbtLore.add(NbtString.of(Text.Serializer.toJson(new LiteralText(playerEntity.getBlockPos().toShortString()))));
            nbtDisplay.put("Lore", nbtLore);
            nbt.put("display", nbtDisplay);

            var itemStack = new ItemStack(ModItems.TELEPORT_SCROLL, 1);
            itemStack.setNbt(nbt);

            playerEntity.playSound(SoundEvents.ENTITY_ENDER_EYE_DEATH, SoundCategory.PLAYERS, 1, 1);

            if (!playerEntity.getInventory().insertStack(itemStack)) {
                playerEntity.dropItem(itemStack, false);
            }

            if (!playerEntity.getAbilities().creativeMode) {
                originalStack.decrement(1);
            }
        }

        return TypedActionResult.success(originalStack, world.isClient());
    }
}
