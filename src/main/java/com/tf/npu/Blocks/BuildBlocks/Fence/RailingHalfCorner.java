package com.tf.npu.Blocks.BuildBlocks.Fence;

import com.tf.npu.Init.SUPER2FH.ModBlocks.RailingBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class RailingHalfCorner extends BlockFourSideFacingTemplate {
    public RailingHalfCorner() {
        super();
        this.setTranslationKey("railing_half_corner");
        this.setRegistryName("npu:railing_half_corner");
        this.setCreativeTab(NPU.RAILING);
        RailingBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        RailingBlocks.BLOCKS.add(this);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState p_getCollisionBoundingBox_1_, IBlockAccess p_getCollisionBoundingBox_2_, BlockPos p_getCollisionBoundingBox_3_) {
        return HALF_SHPAE_BOTTOM;
    }
}