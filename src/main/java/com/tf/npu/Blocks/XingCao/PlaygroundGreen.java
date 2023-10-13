package com.tf.npu.Blocks.XingCao;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.Template.BlockTemplate;
import net.minecraft.item.ItemBlock;


public class PlaygroundGreen extends BlockTemplate {
    public PlaygroundGreen() {
        super();
        this.setTranslationKey("playground_green");
        this.setRegistryName("npu:playground_green");
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }
}
