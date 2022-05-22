package com.tf.npu.Blocks.SUPER2FH.Desk;

import com.tf.npu.Init.SUPER2FH.ModBlocks.DeskBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class DeskWorkshop4 extends BlockFourSideFacingTemplate {
    public DeskWorkshop4() {
        super();
        this.setUnlocalizedName("desk_workshop4");
        this.setRegistryName("npu:desk_workshop4");
        this.setCreativeTab(NPU.DESK);
        DeskBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        DeskBlocks.BLOCKS.add(this);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState p_getCollisionBoundingBox_1_, IBlockAccess p_getCollisionBoundingBox_2_, BlockPos p_getCollisionBoundingBox_3_) {
        return FULL_SHAPE;
    }
}