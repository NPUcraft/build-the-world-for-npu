package com.tf.npu.Blocks.XingCao;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;


public class PlaygroundVolleyballNet extends BlockFourSideFacingTemplate {
    public PlaygroundVolleyballNet() {
        super();
        this.setTranslationKey("playground_volleyball_net");
        this.setRegistryName("npu:playground_volleyball_net");
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }
}
