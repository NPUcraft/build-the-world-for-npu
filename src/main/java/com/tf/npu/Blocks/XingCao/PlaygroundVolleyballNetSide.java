package com.tf.npu.Blocks.XingCao;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;


public class PlaygroundVolleyballNetSide extends BlockFourSideFacingTemplate {
    public PlaygroundVolleyballNetSide() {
        super();
        this.setUnlocalizedName("playground_volleyball_net_side");
        this.setRegistryName("npu:playground_volleyball_net_side");
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }
}
