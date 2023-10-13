package com.tf.npu.Blocks.XingCao.Tents;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.Template.TentTemplate;
import net.minecraft.item.ItemBlock;

public class TentRed extends TentTemplate {

    public TentRed() {
        super();
        this.setTranslationKey("tent_red");
        this.setRegistryName("npu:tent_red");
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }

}
