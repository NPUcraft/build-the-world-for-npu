package com.tf.npu.Blocks.SUPER2FH.Vehicle.Bike;

import com.tf.npu.Init.SUPER2FH.ModBlocks.VehicleBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Bike1 extends BlockFourSideFacingTemplate {

    public Bike1() {
        super();
        this.setUnlocalizedName("bike1");
        this.setRegistryName("npu:bike1");
        this.setCreativeTab(NPU.VEHICLE);
        VehicleBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        VehicleBlocks.BLOCKS.add(this);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState p_getCollisionBoundingBox_1_, IBlockAccess p_getCollisionBoundingBox_2_, BlockPos p_getCollisionBoundingBox_3_) {
        return NULL_SHPAE;
    }
}
