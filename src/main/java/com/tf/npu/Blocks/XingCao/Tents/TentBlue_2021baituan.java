package com.tf.npu.Blocks.XingCao.Tents;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.Template.TentTemplate;
import net.minecraft.item.ItemBlock;


public class TentBlue_2021baituan extends TentTemplate {

    public TentBlue_2021baituan() {
        super();
        this.setUnlocalizedName("tent_blue_2021baituan");
        this.setRegistryName("npu:tent_blue_2021baituan");
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }

}
