package com.tf.npu.Blocks.XingCao;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;


public class PlaygroundFenceDownTriangle extends BlockFourSideFacingTemplate {
    public PlaygroundFenceDownTriangle() {
        super();
        this.setUnlocalizedName("playground_fence_down_triangle");
        this.setRegistryName("npu:playground_fence_down_triangle");
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }
}
