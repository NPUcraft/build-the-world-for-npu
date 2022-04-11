package com.tf.npu.Blocks.SUPER2FH.Stair;

import com.tf.npu.Init.SUPER2FH.ModBlocks.StairBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class StairGentlyWhiteDown_g43 extends BlockFourSideFacingTemplate {

    // g43
    public StairGentlyWhiteDown_g43() {
        super();
        this.setUnlocalizedName("g43");
        this.setRegistryName("npu:g43");
        this.setCreativeTab(NPU.STAIR);
        StairBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        StairBlocks.BLOCKS.add(this);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState p_getCollisionBoundingBox_1_, IBlockAccess p_getCollisionBoundingBox_2_, BlockPos p_getCollisionBoundingBox_3_) {
        return HALF_SHPAE;
    }
}
