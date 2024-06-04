package com.mrcrayfish.furniture.rift.mixin;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Item.class)
public interface ItemInvoker {
    @Invoker("register")
    public static void register(Block block, ItemGroup group) {
        throw new AssertionError();
    }
}
