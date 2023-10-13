package com.tf.npu.Blocks.SUPER2FH.Window;

import com.tf.npu.Init.SUPER2FH.ModBlocks.WindowBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;

public class GlassFrame2 extends BlockFourSideFacingTemplate {
    public GlassFrame2() {
        super();
        this.setTranslationKey("glass_frame2");
        this.setRegistryName("npu:glass_frame2");
        this.setCreativeTab(NPU.WINDOW);
        WindowBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        WindowBlocks.BLOCKS.add(this);
    }
}
