package com.tf.npu.Blocks.Sundries;

import com.tf.npu.Init.SUPER2FH.ModBlocks.SundriesBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;

public class AdmissionLetter2021 extends BlockFourSideFacingTemplate {
    public AdmissionLetter2021() {
        super();
        this.setTranslationKey("admission_letter_2021");
        this.setRegistryName("npu:admission_letter_2021");
        this.setCreativeTab(NPU.SUNDRIES);
        SundriesBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        SundriesBlocks.BLOCKS.add(this);
    }
}
