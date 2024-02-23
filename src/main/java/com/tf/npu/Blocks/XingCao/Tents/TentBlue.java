package com.tf.npu.Blocks.XingCao.Tents;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.Template.TentTemplate;
import net.minecraft.item.ItemBlock;


public class TentBlue extends TentTemplate {

    public TentBlue() {
        super();
        this.setTranslationKey("tent_blue");
        this.setRegistryName("npu:tent_blue");
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }

}
