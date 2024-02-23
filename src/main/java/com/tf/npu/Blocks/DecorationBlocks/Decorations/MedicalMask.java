package com.tf.npu.Blocks.DecorationBlocks.Decorations;

import com.tf.npu.Init.SUPER2FH.ModBlocks.TemporaryBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class MedicalMask extends BlockFourSideFacingTemplate {
    public MedicalMask() {
        super();
        this.setTranslationKey("medical_mask");
        this.setRegistryName("npu:medical_mask");
        this.setCreativeTab(NPU.NPUARMOR);
        TemporaryBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        TemporaryBlocks.BLOCKS.add(this);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState p_getCollisionBoundingBox_1_, IBlockAccess p_getCollisionBoundingBox_2_, BlockPos p_getCollisionBoundingBox_3_) {
        return NULL_SHPAE;
    }


}