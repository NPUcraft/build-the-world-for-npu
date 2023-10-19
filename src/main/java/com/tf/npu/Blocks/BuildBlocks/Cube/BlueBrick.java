package com.tf.npu.Blocks.BuildBlocks.Cube;

import com.tf.npu.Init.SUPER2FH.ModBlocks.CubeBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlueBrick extends BlockTemplate {
    public BlueBrick() {
        super();
        this.setTranslationKey("blue_brick");
        this.setRegistryName("npu:blue_brick");
        this.setCreativeTab(NPU.CUBE);
        CubeBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        CubeBlocks.BLOCKS.add(this);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        return FULL_SHAPE;
    }
}
