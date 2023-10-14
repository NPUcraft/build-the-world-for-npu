package com.tf.npu.Template;

import com.tf.npu.NPU;
import com.tf.npu.Interfaces.IHasModel;
import com.tf.npu.Util.InitHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockTemplate extends Block implements IHasModel {
    public static final AxisAlignedBB FULL_SHAPE = new AxisAlignedBB(0.0D, 0.0D, 0.0D,
            1.0D, 1.0D, 1.0D);
    public static final AxisAlignedBB NULL_SHPAE = new AxisAlignedBB(0.0D, 0.0D, 0.0D,
            0.0D, 0.0D, 0.0D);
    public static final AxisAlignedBB HALF_SHPAE_BOTTOM = new AxisAlignedBB(0.0D, 0.0D, 0.0D,
            1.0D, 0.5D, 1.0D);
    public static final AxisAlignedBB HALF_SHPAE_UP = new AxisAlignedBB(0.0D, 0.0D, 0.5D,
            1.0D, 1.0D, 1.0D);

    public BlockTemplate() {
        super(Material.ROCK);
        this.setCreativeTab(NPU.TEMPORARY);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState p_getCollisionBoundingBox_1_, IBlockAccess p_getCollisionBoundingBox_2_, BlockPos p_getCollisionBoundingBox_3_) {
        return NULL_SHPAE;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(Item.getItemFromBlock(this));
    }

}
