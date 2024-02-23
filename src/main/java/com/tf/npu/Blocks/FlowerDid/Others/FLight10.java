package com.tf.npu.Blocks.FlowerDid.Others;


import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.NPU;
import com.tf.npu.Interfaces.IHasModel;
import com.tf.npu.Util.InitHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.IStringSerializable;

public class FLight10 extends Block implements IHasModel {

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



    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }



    public FLight10() {
        super(Material.ROCK);

        this.setTranslationKey("flight10");

        this.setRegistryName("npu:flight10");

        this.setHardness(2.5F);

        this.setCreativeTab(NPU.MY_TAB);


        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

        ModBlocks.BLOCKS.add(this);
        //*******************发光就加上这行，不发光就删掉*********************
        this.setLightLevel(1);
        //*******************发光就加上这行，不发光就删掉*********************

    }

}
