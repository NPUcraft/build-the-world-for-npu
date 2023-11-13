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
 * 表示名为 "Winn12" 的方块的类。
 */
public class Winn12 extends Block implements IHasModel {

    /**
     * 表示方块的材质枚举。
     */
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

    /**
     * 表示方块朝向的属性。
     */
    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    /**
     * 创建方块状态容器，包含朝向属性。
     *
     * @return 方块状态容器
     */
    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING);
    }

    /**
     * 表示方块在不同朝向下的包围盒。
     */
    public static final AxisAlignedBB WEST_AABB = new AxisAlignedBB(0.0D, -1.0D, -1.0D, 2.0D, 2.0D, 1.0D);
    public static final AxisAlignedBB EAST_AABB = new AxisAlignedBB(0.0D, -1.0D, -1.0D, 2.0D, 2.0D, 1.0D);
    public static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(-1.0D, -1.0D, 0.0D, 1.0D, 2.0D, 2.0D);
    public static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(-1.0D, -1.0D, 0.0D, 1.0D, 2.0D, 2.0D);

    /**
     * 获取指定方块状态在世界中的包围盒。
     *
     * @param state  方块状态
     * @param source 世界
     * @param pos    方块位置
     * @return 指定方块状态的包围盒
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
     * 获取碰撞箱，返回null表示没有碰撞箱。
     *
     * @param blockState 方块状态
     * @param worldIn    世界
     * @param pos        方块位置
     * @return 碰撞箱
     */
    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return null;
    }

    /**
     * 判断方块是否是不透明的。
     *
     * @param state 方块状态
     * @return 是否不透明
     */
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    /**
     * 判断方块是否是实心的。
     *
     * @param state 方块状态
     * @return 是否实心
     */
    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    /**
     * 注册物品渲染。
     */
    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(Item.getItemFromBlock(this));
    }

    /**
     * 创建名为 "Winn12" 的方块对象。
     */
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

    /**
     * 获取方块的映射颜色。
     *
     * @param state  方块状态
     * @param worldIn 世界
     * @param pos    方块位置
     * @return 方块的映射颜色
     */
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        return MapColor.getBlockColor((EnumDyeColor) state.getValue(COLOR));
    }

    /**
     * 判断方块是否是实心的。
     *
     * @param state 方块状态
     * @return 是否实心
     */
    @Override
    public boolean isFullBlock(IBlockState state) {
        return super.isFullBlock(state);
    }

    /**
     * 从元数据中获取方块状态。
     *
     * @param meta 元数据
     * @return 方块状态
     */
    @Override
    public IBlockState getStateFromMeta(int meta) {
        EnumFacing facing = EnumFacing.byHorizontalIndex(meta & 3);
        return this.getDefaultState().withProperty(FACING, facing);
    }

    /**
     * 将方块状态转换为元数据。
     *
     * @param state 方块状态
     * @return 元数据
     */
    @Override
    public int getMetaFromState(IBlockState state) {
        int facing = state.getValue(FACING).getHorizontalIndex();
        return facing;
    }

    /**
     * 方块被放置时的处理。
     *
     * @param worldIn  世界
     * @param pos      方块位置
     * @param state    方块状态
     * @param placer   放置方块的实体
     * @param stack    手持的物品栈
     */
    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer,
                                ItemStack stack) {
        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);
    }

    /**
     * 获取方块渲染的图层，用于透明方块的渲染。
     *
     * @return 方块渲染的图层
     */
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    /**
     * 判断是否可以用丝线采集该方块。
     *
     * @return 是否可以用丝线采集
     */
    protected boolean canSilkHarvest() {
        return true;
    }

    /**
     * 方块被激活时的处理。
     *
     * @param worldIn   世界
     * @param pos       方块位置
     * @param state     方块状态
     * @param playerIn  激活方块的玩家
     * @param hand      手
     * @param facing    方向
     * @param hitX      点击的X坐标
     * @param hitY      点击的Y坐标
     * @param hitZ      点击的Z坐标
     * @return 是否成功处理
     */
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        // 获取原朝向
        IBlockState newState = Block.getBlockFromName("npu:winn11").getDefaultState();
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
