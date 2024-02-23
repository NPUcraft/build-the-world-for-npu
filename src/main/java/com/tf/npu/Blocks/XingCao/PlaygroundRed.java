package com.tf.npu.Blocks.XingCao;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.Template.BlockTemplate;
import net.minecraft.item.ItemBlock;


public class PlaygroundRed extends BlockTemplate {
    public PlaygroundRed() {
        super();
        this.setTranslationKey("playground_red");
        this.setRegistryName("npu:playground_red");
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }
}
