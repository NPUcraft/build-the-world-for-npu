package com.tf.npu.Template;

import com.tf.npu.NPU;
import com.tf.npu.interfaces.IHasModel;
import com.tf.npu.util.InitHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockEightSideFacingTemplate extends Block implements IHasModel {

    public static final PropertyDirection FACING;
    public static final PropertyEnum<BlockEightSideFacingTemplate.EnumHalf> HALF;
    public static final AxisAlignedBB FULL_SHAPE = new AxisAlignedBB(0.0D, 0.0D, 0.0D,
            1.0D, 1.0D, 1.0D);
    public static final AxisAlignedBB NULL_SHPAE = new AxisAlignedBB(0.0D, 0.0D, 0.0D,
            0.0D, 0.0D, 0.0D);
    public static final AxisAlignedBB HALF_SHPAE_BOTTOM = new AxisAlignedBB(0.0D, 0.0D, 0.0D,
            1.0D, 0.5D, 1.0D);
    public static final AxisAlignedBB HALF_SHPAE_UP = new AxisAlignedBB(0.0D, 0.0D, 0.5D,
            1.0D, 1.0D, 1.0D);

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING, HALF);
    }

    public BlockEightSideFacingTemplate() {
        super(Material.ROCK);
        this.setHardness(2.5F);
        this.setDefaultState(this.blockState.getBaseState()
                .withProperty(FACING, EnumFacing.NORTH)
                .withProperty(HALF, EnumHalf.BOTTOM));
        this.setCreativeTab(NPU.TEMPORARY);
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


    @Override
    public IBlockState getStateFromMeta(int p_getStateFromMeta_1_) {
        IBlockState iblockstate = this.getDefaultState().withProperty(HALF, (p_getStateFromMeta_1_ & 4) > 0 ?
                EnumHalf.TOP : EnumHalf.BOTTOM);
        iblockstate = iblockstate.withProperty(FACING, EnumFacing.byIndex(5 - (p_getStateFromMeta_1_ & 3)));
        return iblockstate;
    }

    @Override
    public int getMetaFromState(IBlockState p_getMetaFromState_1_) {
        int i = 0;
        if (p_getMetaFromState_1_.getValue(HALF) == EnumHalf.TOP) {
            i |= 4;
        }

        i |= 5 - ((EnumFacing)p_getMetaFromState_1_.getValue(FACING)).getIndex();
        return i;
    }

    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing,
                                            float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        IBlockState iblockstate = super.getStateForPlacement(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer)
                .withProperty(HALF, EnumHalf.BOTTOM)
                .withProperty(FACING, placer.getHorizontalFacing().getOpposite());

        return facing != EnumFacing.DOWN && (facing == EnumFacing.UP || (double) hitY <= 0.5D) ?
                iblockstate : iblockstate.withProperty(HALF, EnumHalf.TOP)
                .withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        return FULL_SHAPE;
    }


    static {
        FACING = BlockHorizontal.FACING;
        HALF = PropertyEnum.create("half", BlockEightSideFacingTemplate.EnumHalf.class);
    }

    public static enum EnumHalf implements IStringSerializable {
        TOP("top"),
        BOTTOM("bottom");

        private final String name;

        private EnumHalf(String p_i45683_3_) {
            this.name = p_i45683_3_;
        }

        public String toString() {
            return this.name;
        }

        public String getName() {
            return this.name;
        }
    }
}
