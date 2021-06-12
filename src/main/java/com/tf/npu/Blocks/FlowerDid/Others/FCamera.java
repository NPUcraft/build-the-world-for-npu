package com.tf.npu.Blocks.FlowerDid.Others;


import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.NPU;
import com.tf.npu.interfaces.IHasModel;
import com.tf.npu.util.InitHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.IStringSerializable;

public class FCamera extends Block implements IHasModel{
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





    public FCamera(){
        super(Material.ROCK);
    //*******************改*********************
        this.setUnlocalizedName("fcamera");
    //*******************改*********************
        this.setRegistryName("npu:fcamera");
    //*******************2.5F是黑曜石硬度*********************
        this.setHardness(2.5F);
    //*******************改*********************
        this.setCreativeTab(NPU.MY_TAB3);



        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

        ModBlocks.BLOCKS.add(this);


    }

}
