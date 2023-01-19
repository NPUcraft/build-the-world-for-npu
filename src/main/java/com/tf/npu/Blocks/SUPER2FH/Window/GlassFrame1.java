package com.tf.npu.Blocks.SUPER2FH.Window;

import com.tf.npu.Init.SUPER2FH.ModBlocks.WindowBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;

public class GlassFrame1 extends BlockFourSideFacingTemplate {
    public GlassFrame1() {
        super();
        this.setUnlocalizedName("glass_frame1");
        this.setRegistryName("npu:glass_frame1");
        this.setCreativeTab(NPU.WINDOW);
        WindowBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        WindowBlocks.BLOCKS.add(this);
    }
}
