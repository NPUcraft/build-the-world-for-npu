package com.tf.npu.Blocks.Stair;

import com.tf.npu.Init.SUPER2FH.ModBlocks.StairBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;

public class StairCementUpLightblue extends BlockFourSideFacingTemplate {
    public StairCementUpLightblue() {
        super();
        this.setTranslationKey("stair_cement_up_lightblue");
        this.setRegistryName("npu:stair_cement_up_lightblue");
        this.setCreativeTab(NPU.STAIR);
        StairBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        StairBlocks.BLOCKS.add(this);
    }
}