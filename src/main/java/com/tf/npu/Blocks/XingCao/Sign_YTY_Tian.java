package com.tf.npu.Blocks.XingCao;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;

public class Sign_YTY_Tian extends BlockFourSideFacingTemplate {
    public Sign_YTY_Tian() {
        super();
        this.setUnlocalizedName("sign_yty_tian");
        this.setRegistryName("npu:sign_yty_tian");
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }
}
