package com.tf.npu.Blocks.SUPER2FH.Chair;

import com.tf.npu.Init.SUPER2FH.ModBlocks.ChairBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;


public class ChairLightblue extends BlockFourSideFacingTemplate {
    public ChairLightblue() {
        super();
        this.setUnlocalizedName("chair_lightblue");
        this.setRegistryName("npu:chair_lightblue");
        this.setCreativeTab(NPU.CHAIR);
        ChairBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ChairBlocks.BLOCKS.add(this);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState p_getCollisionBoundingBox_1_, IBlockAccess p_getCollisionBoundingBox_2_, BlockPos p_getCollisionBoundingBox_3_) {
        return HALF_SHPAE;
    }
}
