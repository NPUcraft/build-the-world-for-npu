package com.tf.npu.Blocks.BuildBlocks.Windows;

import com.tf.npu.Init.SUPER2FH.ModBlocks.WindowBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WindowCeiling extends BlockTemplate {
    public static final AxisAlignedBB SHAPE = new AxisAlignedBB(0.0D, 0.0D, 0.0D,
            1.9D, 0.2D, 1.9D);

    public WindowCeiling() {
        super();
        this.setTranslationKey("window_ceiling");
        this.setRegistryName("npu:window_ceiling");
        this.setCreativeTab(NPU.WINDOW);
        WindowBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        WindowBlocks.BLOCKS.add(this);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState p_getCollisionBoundingBox_1_, IBlockAccess p_getCollisionBoundingBox_2_, BlockPos p_getCollisionBoundingBox_3_) {
        return NULL_AABB;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
