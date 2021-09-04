package com.tf.npu.Blocks.XingCao;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;


public class PlaygroundDoorOpenedRight extends BlockFourSideFacingTemplate {
    public PlaygroundDoorOpenedRight() {
        super();
        this.setUnlocalizedName("playground_door_opened_right");
        this.setRegistryName("npu:playground_door_opened_right");
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }
}
