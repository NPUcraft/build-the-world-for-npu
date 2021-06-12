package com.tf.npu.Blocks.FlowerDid.Day222;


import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.NPU;
import com.tf.npu.interfaces.IHasModel;
import com.tf.npu.util.InitHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class FLine21 extends Block implements IHasModel{
    //*******************不用管*********************
    public static enum EnumMaterial implements IStringSerializable
    {
        IRON("iron");

        private String name;

        private EnumMaterial(String material)
        {
            this.name = material;
        }

        @Override
        public String getName()
        {
            return this.name;
        }

    }
    @Override
    public void registryItemRender(){
        InitHelper.itemModelRegistry(Item.getItemFromBlock(this));
    }
    //*******************不用管*********************




    //*******************碰撞箱，如果是1x1x1就删掉*********************
    public static final AxisAlignedBB FLine21_AABB = new AxisAlignedBB(0.0D, -0.5D, 0.0D, 1.0D, -0.5D, 1.0D);

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return FLine21_AABB;
    }
    //*******************碰撞箱，如果是1x1x1就删掉*********************

    //*******************没有方向就删掉*********************
    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, FACING);
    }
    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        EnumFacing facing = EnumFacing.getHorizontal(meta & 3);
        return this.getDefaultState().withProperty(FACING, facing);
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        int facing = state.getValue(FACING).getHorizontalIndex();

        return facing;
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer,
                                ItemStack stack) {
        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);
        //*******************没有方向就删掉*********************
    }




    //*******************完整方块就删掉*********************
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }
    //*******************完整方块就删掉*********************





    public FLine21(){
        super(Material.ROCK);
    //*******************改*********************
        this.setUnlocalizedName("fline21");
    //*******************改*********************
        this.setRegistryName("npu:fline21");
    //*******************2.5F是黑曜石硬度*********************
        this.setHardness(2.5F);
    //*******************改*********************
        this.setCreativeTab(NPU.MY_TAB3);


        //*******************没有方向就删掉*********************
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        //*******************没有方向就删掉*********************


        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

        ModBlocks.BLOCKS.add(this);


    }

}
