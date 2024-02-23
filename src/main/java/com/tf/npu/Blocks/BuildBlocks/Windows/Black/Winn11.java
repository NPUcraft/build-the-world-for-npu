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

/**
 * 表示三维空间中的轴对齐边界框（AABB）的方块。
 * 该方块具有不同朝向的边界框，并具有一些其他特性。
 */
public class Winn11 extends Block implements IHasModel {

    // 枚举用于表示材质
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

    // 属性用于表示方块的朝向
    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    /**
     * 创建方块状态容器，包括朝向属性。
     */
    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING);
    }

    // 定义四个方向的AABB, 坐标：（minX，minY，minZ）到（maxX，maxY，maxZ）
    public static final AxisAlignedBB WEST_AABB = new AxisAlignedBB(0.0D, -1.0D, -1.0D, 1.0D, 2.0D, 1.0D);
    public static final AxisAlignedBB EAST_AABB = new AxisAlignedBB(0.0D, -1.0D, -1.0D, 1.0D, 2.0D, 1.0D);
    public static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(-1.0D, -1.0D, 0.0D, 1.0D, 2.0D, 1.0D);
    public static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(-1.0D, -1.0D, 0.0D, 1.0D, 2.0D, 1.0D);

    /**
     * 获取方块的包围盒，根据方块朝向返回相应的AABB。
     */
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        EnumFacing currentFacing = EnumFacing.byHorizontalIndex(getMetaFromState(state) & 3);
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

    /**
     * 获取用于碰撞检测的包围盒。
     * 在此方块中，该方法返回null，表示不进行碰撞检测。
     */
    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return null;
    }

    /**
     * 判断方块是否是不透明的。
     * 在此方块中，该方法返回false，表示方块是透明的。
     */
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    /**
     * 判断方块是否是一个完整的方块。
     * 在此方块中，该方法返回false，表示方块不是一个完整的方块。
     */
    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    /**
     * 注册方块的渲染模型。
     */
    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(Item.getItemFromBlock(this));
    }

    /**
     * 方块的构造函数。
     * 初始化方块的一些属性和特性。
     */
    public Winn11() {
        super(Material.ROCK);
        this.setTranslationKey("winn11");
        this.setRegistryName("npu:winn11");
        this.setHardness(2.5F);
        this.setCreativeTab(NPU.MY_TAB4);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
        this.translucent = true;
    }

    /**
     * 获取方块的地图颜色。
     * 在此方块中，根据方块颜色返回相应的地图颜色。
     */
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        return MapColor.getBlockColor((EnumDyeColor) state.getValue(COLOR));
    }

    /**
     * 判断方块是否是一个完整的方块。
     * 在此方块中，该方法返回父类的实现。
     */
    @Override
    public boolean isFullBlock(IBlockState state) {
        return super.isFullBlock(state);
    }

    /**
     * 根据元数据获取方块状态。
     * 在此方块中，该方法返回一个包含朝向属性的方块状态。
     */
    @Override
    public IBlockState getStateFromMeta(int meta) {
        EnumFacing facing = EnumFacing.byHorizontalIndex(meta & 3);
        return this.getDefaultState().withProperty(FACING, facing);
    }

    /**
     * 根据方块状态获取元数据。
     * 在此方块中，该方法返回方块的朝向元数据。
     */
    @Override
    public int getMetaFromState(IBlockState state) {
        int facing = state.getValue(FACING).getHorizontalIndex();
        return facing;
    }

    /**
     * 方块被放置时的处理。
     * 在此方块中，设置方块朝向为放置者的朝向的相反方向。
     */
    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer,
                                ItemStack stack) {
        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);
    }

    /**
     * 获取方块的渲染层级。
     * 在此方块中，该方法返回TRANSLUCENT，表示方块渲染在透明层级。
     */
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    /**
     * 判断方块是否能够使用丝绸触控进行收获。
     * 在此方块中，该方法返回true。
     */
    protected boolean canSilkHarvest() {
        return true;
    }

    /**
     * 方块被激活时的处理。
     * 在此方块中，将方块的朝向切换到下一个方向，并通知周围方块更新。
     */
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        // 获取原朝向
        IBlockState newState = Block.getBlockFromName("npu:winn12").getDefaultState();
        // 设置新朝向
        EnumFacing currentFacing = EnumFacing.byHorizontalIndex(getMetaFromState(state) & 3);
        newState = newState.withProperty(FACING, currentFacing);
        worldIn.setBlockState(pos, newState);
        // Post placement event
        worldIn.notifyBlockUpdate(pos, state, newState, 3);
        // Notify neighbors
        worldIn.notifyNeighborsOfStateChange(pos, this, false);
        return true;
    }
}
