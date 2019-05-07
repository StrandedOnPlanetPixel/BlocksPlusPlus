package com.example.blocksplusplus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StickyTrapBlock extends Block {

    public StickyTrapBlock(Material blockMaterialIn, MaterialColor blockMapColorIn) {
        super(Block.Properties.create( blockMaterialIn, blockMapColorIn));
    }

    //I am aware this is depreciated, but I didn't want to lose this train of thought
    //I'm borrowing the web code temporarily to goof with
    public void onEntityCollision(IBlockState state, World worldIn, BlockPos pos, Entity entityIn) {

    }

    public boolean isFullCube(IBlockState state) {

        return false;
    }

}
