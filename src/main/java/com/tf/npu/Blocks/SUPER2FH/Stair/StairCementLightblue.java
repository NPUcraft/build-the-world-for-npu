package com.tf.npu.Blocks.SUPER2FH.Stair;

import com.tf.npu.Init.SUPER2FH.ModBlocks.StairBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;

public class StairCementLightblue extends BlockFourSideFacingTemplate {
    public StairCementLightblue() {
        super();
        this.setTranslationKey("stair_coment_lightblue");
        this.setRegistryName("npu:stair_coment_lightblue");
        this.setCreativeTab(NPU.STAIR);
        StairBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        StairBlocks.BLOCKS.add(this);
    }
}