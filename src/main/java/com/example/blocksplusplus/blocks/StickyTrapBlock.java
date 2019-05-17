package com.example.blocksplusplus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReaderBase;
import net.minecraft.world.World;

import static net.minecraft.entity.MoverType.SELF;


public class StickyTrapBlock extends Block {

    protected static final VoxelShape SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.5D, 16.0D);


    public StickyTrapBlock(Material blockMaterialIn, MaterialColor blockMapColorIn) {
        super(Block.Properties.create( blockMaterialIn, blockMapColorIn));


    }

    //This method haunts my dreams
    @Override
    //public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
    public void onEntityCollision(IBlockState state, World worldIn, BlockPos pos, Entity entityIn) {

        //Good News: They stick now!
        //Bad News: They spontaneously die when block is broken
        //The Assumption: Something with fall damage?
        //Also, they are slightly offset from the middle of the block which
        //annoys the heck out of me

        //entityIn.posX = pos.getX();
        //entityIn.posY = pos.getY();
        //entityIn.posZ = pos.getZ();

        entityIn.motionX = 0;
        entityIn.motionZ = 0;
        entityIn.motionY = 0;

        entityIn.setVelocity(0,0,0);
        entityIn.collided = true;
        entityIn.setPosition(pos.getX(), pos.getY(), pos.getZ());

    }


    @Override
    public boolean isFullCube(IBlockState state) {

        return false;
    }

    public VoxelShape getShape(IBlockState state, IBlockReader worldIn, BlockPos pos) {

        return SHAPE;

    }

    public boolean isValidPosition(IBlockState state, IWorldReaderBase worldIn, BlockPos pos) {
        return !worldIn.isAirBlock(pos.down());
    }








}
