package com.tf.npu.Blocks.Decorations;

import com.tf.npu.Init.SUPER2FH.ModBlocks.TemporaryBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class EmblemCY extends BlockFourSideFacingTemplate {
    public EmblemCY() {
        super();
        this.setTranslationKey("emblem_cy");
        this.setRegistryName("npu:emblem_cy");
        this.setCreativeTab(NPU.NPUARMOR);

        TemporaryBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        TemporaryBlocks.BLOCKS.add(this);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState p_getCollisionBoundingBox_1_, IBlockAccess p_getCollisionBoundingBox_2_, BlockPos p_getCollisionBoundingBox_3_) {
        return NULL_SHPAE;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}
