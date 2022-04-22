package com.tf.npu.Blocks.SUPER2FH.Sundries;

import com.tf.npu.Init.SUPER2FH.ModBlocks.SundriesBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;

public class PhotoFrameSworn extends BlockFourSideFacingTemplate {
    public PhotoFrameSworn() {
        super();
        this.setUnlocalizedName("photo_frame_sworn");
        this.setRegistryName("npu:photo_frame_sworn");
        this.setCreativeTab(NPU.SUNDRIES);
        SundriesBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        SundriesBlocks.BLOCKS.add(this);
    }

}
