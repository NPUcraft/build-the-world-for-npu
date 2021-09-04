package com.tf.npu.Blocks.XingCao;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;


public class PlaygroundSign2 extends BlockFourSideFacingTemplate {
    public PlaygroundSign2() {
        super();
        this.setUnlocalizedName("playground_sign2");
        this.setRegistryName("npu:playground_sign2");
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }
}
