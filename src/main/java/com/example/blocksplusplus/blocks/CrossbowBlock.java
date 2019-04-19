package com.example.blocksplusplus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.loading.FMLLoader;

public class CrossbowBlock extends Block {
    public final String name = "crossbow";

    public CrossbowBlock(Block.Properties properties) {
         super(properties);
    }

    // This method is depreciated but for now I am not sure how else to do "onClick" type events.
    @Override
    public boolean onBlockActivated(IBlockState state, World world, BlockPos pos, EntityPlayer player, EnumHand hand,
                                    EnumFacing side, float hitX, float hitY, float hitZ) {
        // Only execute on the server
        if (world.isRemote) {
            return true;
        }
        System.out.println("Clicked on block " + name);
        return true;
    }


}
