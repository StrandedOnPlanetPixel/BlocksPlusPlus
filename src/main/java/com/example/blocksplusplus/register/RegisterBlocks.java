package com.example.blocksplusplus.register;

import com.example.blocksplusplus.BlocksPlusPlus;
import com.example.blocksplusplus.blocks.CrossbowBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = BlocksPlusPlus.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegisterBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();
    public static Block testBlock;
    public static CrossbowBlock crossbowBlock;
    public static Block stickyTrapBlock;



    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> blockRegistry = event.getRegistry();

        testBlock = new Block(Block.Properties.create(Material.WOOD, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.SLIME));
        testBlock.setRegistryName("ziratest");
        blockRegistry.register(testBlock);

        crossbowBlock = new CrossbowBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD));
        crossbowBlock.setRegistryName(crossbowBlock.name);

        blockRegistry.register(crossbowBlock);

        stickyTrapBlock = new Block(Block.Properties.create(Material.CARPET, MaterialColor.DIRT).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.SLIME));
        stickyTrapBlock.setRegistryName("AmandasAmazingStickyTrapOfAwesomeness");
        blockRegistry.register(stickyTrapBlock);

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> itemRegistry = event.getRegistry();
        Item.Properties itemBuilder = (new Item.Properties().group(ItemGroup.COMBAT));

        itemRegistry.register((new ItemBlock(testBlock, itemBuilder)).setRegistryName("blah"));

        Item.Properties crossbowItemBuilder = (new Item.Properties().group(ItemGroup.COMBAT));
        itemRegistry.register((new ItemBlock(crossbowBlock, crossbowItemBuilder)).setRegistryName(crossbowBlock.name));

        Item.Properties stickyTrapItemBuilder = (new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
        itemRegistry.register((new ItemBlock(stickyTrapBlock, itemBuilder)).setRegistryName("ImNotSureWhatToDoHereYet"));


    }
}
