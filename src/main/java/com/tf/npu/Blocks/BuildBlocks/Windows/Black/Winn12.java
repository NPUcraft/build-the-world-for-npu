package com.tf.npu.Blocks.BuildBlocks.Windows.Black;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.NPU;
import com.tf.npu.Interfaces.IHasModel;
import com.tf.npu.Util.InitHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static net.minecraft.block.BlockColored.COLOR;

public class Winn12 extends Block implements IHasModel {


    public static enum EnumMaterial implements IStringSerializable {
        IRON("iron");

        private String name;

        private EnumMaterial(String material) {
            this.name = material;
        }

        @Override
        public String getName() {
            return this.name;
        }

    }


    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING);
    }

    //x1,y1,z1,x2,y2,z2均为double类型
    public static final AxisAlignedBB WEST_AABB = new AxisAlignedBB(0.0D, -1.0D, 0.0D, 1.0D, 2.0D, 2.0D);
    public static final AxisAlignedBB EAST_AABB = new AxisAlignedBB(0.0D, -1.0D, -1.0D, 1.0D, 2.0D, 1.0D);
    public static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(0.0D, -1.0D, 0.0D, 2.0D, 2.0D, 1.0D);
    public static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(-1.0D, -1.0D, 0.0D, 1.0D, 2.0D, 1.0D);

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        EnumFacing currentFacing = EnumFacing.byHorizontalIndex(getMetaFromState(state) & 3);
//        System.out.println(currentFacing);
        switch (currentFacing) {
            case EAST:
                return EAST_AABB;
            case WEST:
                return WEST_AABB;
            case SOUTH:
                return SOUTH_AABB;
            case NORTH:
                return NORTH_AABB;
        }
        return WEST_AABB;
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return null;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return true;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(Item.getItemFromBlock(this));
    }

    public Winn12() {
        super(Material.ROCK);
        this.setTranslationKey("winn12");
        this.setRegistryName("npu:winn12");
        this.setHardness(2.5F);
        this.setCreativeTab(NPU.MY_TAB4);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
        this.translucent = true;


    }

    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        return MapColor.getBlockColor((EnumDyeColor) state.getValue(COLOR));
    }

    @Override
    public boolean isFullBlock(IBlockState state) {
        return super.isFullBlock(state);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        EnumFacing facing = EnumFacing.byHorizontalIndex(meta & 3);
        return this.getDefaultState().withProperty(FACING, facing);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        int facing = state.getValue(FACING).getHorizontalIndex();

        return facing;
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer,
                                ItemStack stack) {
        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    protected boolean canSilkHarvest() {
        return true;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        IBlockState newState = Block.getBlockFromName("npu:winn13").getDefaultState();

        EnumFacing currentFacing = EnumFacing.byHorizontalIndex(getMetaFromState(state) & 3);
        if (currentFacing == EnumFacing.WEST) {
            System.out.println("rotate");
            System.out.println(newState.getValue(FACING).getName());
            newState = newState.withProperty(FACING, EnumFacing.WEST);
            System.out.println(newState.getValue(FACING).getName());
        } else if (currentFacing == EnumFacing.EAST) {
            System.out.println("rotate");
            System.out.println(newState.getValue(FACING).getName());
            newState = newState.withProperty(FACING, EnumFacing.EAST);
            System.out.println(newState.getValue(FACING).getName());
        }
        worldIn.setBlockState(pos, newState);
        // Post placement event
        worldIn.notifyBlockUpdate(pos, state, newState, 3);

        // Notify neighbors
        worldIn.notifyNeighborsOfStateChange(pos, this, false);

        return true;
    }
}
