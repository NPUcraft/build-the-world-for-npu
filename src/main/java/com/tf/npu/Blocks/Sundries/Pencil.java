package com.tf.npu.Blocks.Sundries;

import com.tf.npu.Init.SUPER2FH.ModBlocks.SundriesBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;

public class Pencil extends BlockFourSideFacingTemplate {
    public Pencil() {
        super();
        this.setTranslationKey("pencil");
        this.setRegistryName("npu:pencil");
        this.setCreativeTab(NPU.SUNDRIES);
        SundriesBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        SundriesBlocks.BLOCKS.add(this);
    }
}
