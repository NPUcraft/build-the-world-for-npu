package com.tf.npu.Blocks.XingCao;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;


public class PlaygroundFenceUp extends BlockFourSideFacingTemplate {
    public PlaygroundFenceUp() {
        super();
        this.setTranslationKey("playground_fence_up");
        this.setRegistryName("npu:playground_fence_up");
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }
}
