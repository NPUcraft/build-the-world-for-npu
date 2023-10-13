package com.tf.npu.Blocks.XingCao;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;

public class Sign_YTY_Yuan extends BlockFourSideFacingTemplate {
    public Sign_YTY_Yuan() {
        super();
        this.setTranslationKey("sign_yty_yuan");
        this.setRegistryName("npu:sign_yty_yuan");
        this.setCreativeTab(NPU.MY_TAB2);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }
}
