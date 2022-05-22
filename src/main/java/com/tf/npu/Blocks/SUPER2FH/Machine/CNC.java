package com.tf.npu.Blocks.SUPER2FH.Machine;

import com.tf.npu.Init.SUPER2FH.ModBlocks.ChairBlocks;
import com.tf.npu.Init.SUPER2FH.ModBlocks.MachineBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class CNC extends BlockFourSideFacingTemplate {
    public CNC() {
        super();
        this.setUnlocalizedName("cnc");
        this.setRegistryName("npu:cnc");
        this.setCreativeTab(NPU.MACHINE);
        MachineBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        MachineBlocks.BLOCKS.add(this);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState p_getCollisionBoundingBox_1_, IBlockAccess p_getCollisionBoundingBox_2_, BlockPos p_getCollisionBoundingBox_3_) {
        return NULL_SHPAE;
    }
}