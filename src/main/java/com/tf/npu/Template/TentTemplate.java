package com.tf.npu.Template;

import com.tf.npu.NPU;
import com.tf.npu.interfaces.IHasModel;
import com.tf.npu.util.InitHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TentTemplate extends Block implements IHasModel {

    //    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    public static final PropertyInteger ANGEL = PropertyInteger.create("angel", 0, 165);


    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, ANGEL);
    }

    //x1,y1,z1,x2,y2,z2均为double类型
    public static final AxisAlignedBB SHAPE = new AxisAlignedBB(0.0D, 0.0D, 0.0D,
            0.0D, 0.0D, 0.0D);


    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState p_getCollisionBoundingBox_1_, IBlockAccess p_getCollisionBoundingBox_2_, BlockPos p_getCollisionBoundingBox_3_) {
        return SHAPE;
    }

    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(Item.getItemFromBlock(this));
    }

    public TentTemplate() {
        super(Material.ROCK);
        this.setHardness(2.5F);
        this.setCreativeTab(NPU.TEMPORARY);
        this.setDefaultState(this.blockState.getBaseState().withProperty(ANGEL, 0));
        this.setLightLevel(0.1f);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(ANGEL, meta * 15);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(ANGEL) / 15;
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer,
                                ItemStack stack) {
        int angel = 0;
        EnumFacing opposite = placer.getHorizontalFacing().getOpposite();
        if (opposite == EnumFacing.WEST || opposite == EnumFacing.EAST) {
            angel = 90;
        }
        worldIn.setBlockState(pos, state.withProperty(ANGEL, angel), 1);
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player,
                                    EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {

        int angel = state.getValue(ANGEL);
        world.setBlockState(pos, state.withProperty(ANGEL, (angel + 15) % 180));

        return true;
    }
}
