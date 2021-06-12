package com.tf.npu.Blocks.G;


import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.NPU;
import com.tf.npu.interfaces.IHasModel;
import com.tf.npu.util.InitHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class FG62 extends Block implements IHasModel{






    //*******************不用管*********************
    @Override
    public void registryItemRender(){
        InitHelper.itemModelRegistry(Item.getItemFromBlock(this));
    }
    //*******************不用管*********************



    public FG62(){
        super(Material.ROCK);
    //*******************改*********************
        this.setUnlocalizedName("fg62");
    //*******************改*********************
        this.setRegistryName("npu:fg62");
    //*******************2.5F是黑曜石硬度*********************
        this.setHardness(2.5F);
    //*******************改*********************
        this.setCreativeTab(NPU.MY_TAB1);
    //*******************不用管*********************


        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

        ModBlocks.BLOCKS.add(this);

    //*******************不用管*********************
	

    }
    //*******************不用管*********************
}
