package com.tf.npu.Blocks.Chair;

import com.tf.npu.Init.SUPER2FH.ModBlocks.ChairBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;

public class ChairAuditoriumHalfBlue extends BlockFourSideFacingTemplate {
    public ChairAuditoriumHalfBlue() {
        super();
        this.setTranslationKey("chair_auditorium_half_blue");
        this.setRegistryName("npu:chair_auditorium_half_blue");
        this.setCreativeTab(NPU.CHAIR);
        ChairBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ChairBlocks.BLOCKS.add(this);
    }
}