package com.tf.npu.Blocks.FlowerDid.Others;


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

public class FLight10 extends Block implements IHasModel {
    //*******************不用管*********************
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


    public FLight10() {
        super(Material.ROCK);
        //*******************改*********************
        this.setUnlocalizedName("flight10");
        //*******************改*********************
        this.setRegistryName("npu:flight10");
        //*******************2.5F是黑曜石硬度*********************
        this.setHardness(2.5F);
        //*******************改*********************
        this.setCreativeTab(NPU.MY_TAB);


        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

        ModBlocks.BLOCKS.add(this);
        //*******************发光就加上这行，不发光就删掉*********************
        this.setLightLevel(1);
        //*******************发光就加上这行，不发光就删掉*********************

    }

}
