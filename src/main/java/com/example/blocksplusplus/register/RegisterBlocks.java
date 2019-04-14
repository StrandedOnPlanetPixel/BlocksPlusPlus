package com.example.blocksplusplus.register;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;

import java.util.ArrayList;
import java.util.List;

public class RegisterBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static void registerBlock(Block block, RegistryEvent.Register<Block> blockRegistryEvent) {
        blockRegistryEvent.getRegistry().register(block);
    }

    public static void registerBlockItem(Block block, RegistryEvent.Register<Item> itemRegistryEvent) {
        ItemBlock item = new ItemBlock(block, new Item.Properties());
        item.setRegistryName(block.getRegistryName());
        itemRegistryEvent.getRegistry().register(item);
    }
}
