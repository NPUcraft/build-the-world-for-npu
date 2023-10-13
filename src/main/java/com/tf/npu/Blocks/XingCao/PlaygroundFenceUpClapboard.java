package com.tf.npu.Blocks.XingCao;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;


public class PlaygroundFenceUpClapboard extends BlockFourSideFacingTemplate {
    public PlaygroundFenceUpClapboard() {
        super();
        this.setTranslationKey("playground_fence_up_clapboard");
        this.setRegistryName("npu:playground_fence_up_clapboard");
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }
}
