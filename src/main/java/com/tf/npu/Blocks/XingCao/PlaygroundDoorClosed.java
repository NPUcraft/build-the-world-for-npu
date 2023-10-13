package com.tf.npu.Blocks.XingCao;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;


public class PlaygroundDoorClosed extends BlockFourSideFacingTemplate {
    public PlaygroundDoorClosed() {
        super();
        this.setTranslationKey("playground_door_closed");
        this.setRegistryName("npu:playground_door_closed");
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }
}
