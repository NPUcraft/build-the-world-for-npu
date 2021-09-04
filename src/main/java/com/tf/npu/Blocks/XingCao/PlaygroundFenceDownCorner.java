package com.tf.npu.Blocks.XingCao;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;


public class PlaygroundFenceDownCorner extends BlockFourSideFacingTemplate {
    public PlaygroundFenceDownCorner() {
        super();
        this.setUnlocalizedName("playground_fence_down_corner");
        this.setRegistryName("npu:playground_fence_down_corner");
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }
}
