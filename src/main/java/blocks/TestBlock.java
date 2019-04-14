package blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.*;

public class TestBlock extends Block {


    /* Types of properties
        this.material = properties.material;
        this.blockMapColor = properties.mapColor;
        this.blocksMovement = properties.blocksMovement;
        this.soundType = properties.soundType;
        this.lightValue = properties.lightValue;
        this.blockResistance = properties.resistance;
        this.blockHardness = properties.hardness;
        this.needsRandomTick = properties.needsRandomTick;
        this.slipperiness = properties.slipperiness;
        this.variableOpacity = properties.variableOpacity;
     */
    public TestBlock(Material blockMaterialIn, MaterialColor blockMapColorIn) {
        super(Block.Properties.create( blockMaterialIn, blockMapColorIn));
    }


}