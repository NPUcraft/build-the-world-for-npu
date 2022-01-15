package com.tf.npu.Blocks.FlowerDid.Day221;


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

public class FLight11 extends Block implements IHasModel {

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

    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(Item.getItemFromBlock(this));
    }

    public static final AxisAlignedBB FLight11_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 1.0D);

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return FLight11_AABB;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    public FLight11() {
        super(Material.ROCK);

        this.setUnlocalizedName("flight11");

        this.setRegistryName("npu:flight11");

        this.setHardness(2.5F);

        this.setCreativeTab(NPU.MY_TAB3);


        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

        ModBlocks.BLOCKS.add(this);

        this.setLightLevel(5);

    }

}
