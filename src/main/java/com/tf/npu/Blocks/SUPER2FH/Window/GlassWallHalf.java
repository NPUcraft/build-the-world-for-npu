package com.tf.npu.Blocks.SUPER2FH.Window;

import com.tf.npu.Init.SUPER2FH.ModBlocks.WindowBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockEightSideFacingTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class GlassWallHalf extends BlockEightSideFacingTemplate {
    public GlassWallHalf() {
        this.setCreativeTab(NPU.WINDOW);
        this.setTranslationKey("glass_wall_half");
        this.setRegistryName("npu:glass_wall_half");
        WindowBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        WindowBlocks.BLOCKS.add(this);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        if (iBlockState.getValue(HALF) == EnumHalf.TOP) {
            return HALF_SHPAE_UP;
        } else return HALF_SHPAE_BOTTOM;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
