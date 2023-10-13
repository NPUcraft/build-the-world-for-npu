package com.tf.npu.Blocks.XingCao;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;


public class PlaygroundDoorOpenedLeft extends BlockFourSideFacingTemplate {
    public PlaygroundDoorOpenedLeft() {
        super();
        this.setTranslationKey("playground_door_opened_left");
        this.setRegistryName("npu:playground_door_opened_left");
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }
}
