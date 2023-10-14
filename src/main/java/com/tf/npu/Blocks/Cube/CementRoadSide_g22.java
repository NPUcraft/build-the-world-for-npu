package com.tf.npu.Blocks.Cube;

import com.tf.npu.Init.SUPER2FH.ModBlocks.CubeBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class CementRoadSide_g22 extends BlockFourSideFacingTemplate {
    public CementRoadSide_g22() {
        super();
        this.setTranslationKey("g22");
        this.setRegistryName("npu:g22");
        this.setCreativeTab(NPU.CUBE);
        this.setLightLevel(0.1f);
        CubeBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        CubeBlocks.BLOCKS.add(this);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState p_getCollisionBoundingBox_1_, IBlockAccess p_getCollisionBoundingBox_2_, BlockPos p_getCollisionBoundingBox_3_) {
        return HALF_SHPAE_BOTTOM;
    }
}
