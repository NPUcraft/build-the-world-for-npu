package com.tf.npu.Blocks.BBed;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import net.minecraft.item.ItemBlock;

public class TestBed extends BBed2L{

    public TestBed(){
        this.setUnlocalizedName("testbed");
        this.setRegistryName("npu:testbed");
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }



}
