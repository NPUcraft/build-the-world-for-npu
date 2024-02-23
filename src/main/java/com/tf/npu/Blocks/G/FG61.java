package com.tf.npu.Blocks.G;


import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.NPU;
import com.tf.npu.Interfaces.IHasModel;
import com.tf.npu.Util.InitHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class FG61 extends Block implements IHasModel {


    

    






    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(Item.getItemFromBlock(this));
    }



    public FG61() {
        super(Material.ROCK);
        
        this.setTranslationKey("fg61");
        
        this.setRegistryName("npu:fg61");
        
        this.setHardness(2.5F);
        
        this.setCreativeTab(NPU.MY_TAB1);


        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

        ModBlocks.BLOCKS.add(this);




    }

}
