package com.tf.npu.Blocks.SUPER2FH.Stair;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;

public class StairCementUpLightblue extends BlockFourSideFacingTemplate {
    public StairCementUpLightblue() {
        super();
        this.setUnlocalizedName("stair_cement_up_lightblue");
        this.setRegistryName("npu:stair_cement_up_lightblue");
        this.setCreativeTab(NPU.STAIR);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }
}