package com.tf.npu.Blocks.SUPER2FH.Item;

import com.tf.npu.Init.SUPER2FH.ModBlocks.ChairBlocks;
import com.tf.npu.Init.SUPER2FH.ModBlocks.TemporaryBlocks;
import com.tf.npu.Init.SUPER2FH.ModItems.ChairItems;
import com.tf.npu.Init.SUPER2FH.ModItems.TemporaryItems;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class MaskMedical extends BlockFourSideFacingTemplate {
    public MaskMedical() {
        super();
        this.setUnlocalizedName("mask_medical");
        this.setRegistryName("npu:mask_medical");
        this.setCreativeTab(NPU.TEMPORARY);
        TemporaryItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        TemporaryBlocks.BLOCKS.add(this);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState p_getCollisionBoundingBox_1_, IBlockAccess p_getCollisionBoundingBox_2_, BlockPos p_getCollisionBoundingBox_3_) {
        return HALF_SHPAE;
    }

}