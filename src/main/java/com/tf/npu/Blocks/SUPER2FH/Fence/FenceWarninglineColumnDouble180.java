package com.tf.npu.Blocks.SUPER2FH.Fence;

import com.tf.npu.Init.SUPER2FH.ModBlocks.FenceBlocks;
import com.tf.npu.Init.SUPER2FH.ModItems.FenceItems;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class FenceWarninglineColumnDouble180 extends BlockFourSideFacingTemplate {
    public FenceWarninglineColumnDouble180() {
        super();
        this.setUnlocalizedName("fence_warningline_column_double180");
        this.setRegistryName("npu:fence_warningline_column_double180");
        this.setCreativeTab(NPU.FENCE);
        FenceItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        FenceBlocks.BLOCKS.add(this);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState p_getCollisionBoundingBox_1_, IBlockAccess p_getCollisionBoundingBox_2_, BlockPos p_getCollisionBoundingBox_3_) {
        return NULL_SHPAE;
    }
}