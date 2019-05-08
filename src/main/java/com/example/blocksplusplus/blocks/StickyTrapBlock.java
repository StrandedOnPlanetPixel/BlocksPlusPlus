package com.example.blocksplusplus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class StickyTrapBlock extends Block {

    public StickyTrapBlock(Material blockMaterialIn, MaterialColor blockMapColorIn) {
        super(Block.Properties.create( blockMaterialIn, blockMapColorIn));
    }

    //I am aware this is depreciated, but I didn't want to lose this train of thought
    //I'm borrowing the web code temporarily to goof with
    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        //public void onEntityCollision(IBlockState state, World worldIn, BlockPos pos, Entity entityIn) {

        entityIn.motionX = 0.4D;
        entityIn.motionZ = 0.4D;

    }

    @Override
    public boolean isFullCube(IBlockState state) {

        return false;
    }








}
