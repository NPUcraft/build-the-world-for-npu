package com.tf.npu.Blocks.DecorationBlocks.Furniture;

import com.tf.npu.Init.SUPER2FH.ModBlocks.FurnitureBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class AirconditionerVertical extends BlockFourSideFacingTemplate {
    public AirconditionerVertical() {
        super();
        this.setTranslationKey("airconditioner_vertical");
        this.setRegistryName("npu:airconditioner_vertical");
        this.setCreativeTab(NPU.FURNITURE);
        FurnitureBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        FurnitureBlocks.BLOCKS.add(this);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState p_getCollisionBoundingBox_1_, IBlockAccess p_getCollisionBoundingBox_2_, BlockPos p_getCollisionBoundingBox_3_) {
        return NULL_SHPAE;
    }
}
