package com.tf.npu.Blocks.SUPER2FH.Light;

import com.tf.npu.Init.SUPER2FH.ModBlocks.LightBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class LightCeilingLong extends BlockFourSideFacingTemplate {
    public LightCeilingLong() {
        super();
        this.setTranslationKey("light_ceiling_long");
        this.setRegistryName("npu:light_ceiling_long");
        this.setLightLevel(1);
        this.setCreativeTab(NPU.LIGHT);
        LightBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        LightBlocks.BLOCKS.add(this);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState p_getCollisionBoundingBox_1_, IBlockAccess p_getCollisionBoundingBox_2_, BlockPos p_getCollisionBoundingBox_3_) {
        return FULL_SHAPE;
    }
}
