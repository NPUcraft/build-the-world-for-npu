package com.tf.npu.Blocks.BoyBed;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import net.minecraft.item.ItemBlock;

public class TestBed extends BoyBedLeftTableLadder {

    public TestBed() {
        this.setTranslationKey("testbed");
        this.setRegistryName("npu:testbed");
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }


}
