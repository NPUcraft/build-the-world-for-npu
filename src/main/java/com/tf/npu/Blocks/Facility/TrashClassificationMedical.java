package com.tf.npu.Blocks.Facility;

import com.tf.npu.Init.SUPER2FH.ModBlocks.FacilityBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class TrashClassificationMedical extends BlockFourSideFacingTemplate {
    public TrashClassificationMedical() {
        super();
        this.setTranslationKey("trash_classification_medical");
        this.setRegistryName("npu:trash_classification_medical");
        this.setCreativeTab(NPU.FACILITY);
        FacilityBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        FacilityBlocks.BLOCKS.add(this);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState p_getCollisionBoundingBox_1_, IBlockAccess p_getCollisionBoundingBox_2_, BlockPos p_getCollisionBoundingBox_3_) {
        return HALF_SHPAE_BOTTOM;
    }
}