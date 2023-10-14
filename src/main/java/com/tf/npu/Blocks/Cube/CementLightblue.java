package com.tf.npu.Blocks.Cube;

import com.tf.npu.Init.SUPER2FH.ModBlocks.CubeBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockTemplate;
import net.minecraft.item.ItemBlock;

public class CementLightblue extends BlockTemplate {
    public CementLightblue() {
        super();
        this.setTranslationKey("cement_lightblue");
        this.setRegistryName("npu:cement_lightblue");
        this.setCreativeTab(NPU.CUBE);
        CubeBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        CubeBlocks.BLOCKS.add(this);
    }
}