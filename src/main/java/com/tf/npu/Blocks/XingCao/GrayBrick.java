package com.tf.npu.Blocks.XingCao;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;


public class GrayBrick extends BlockFourSideFacingTemplate {
    public GrayBrick() {
        super();
        this.setUnlocalizedName("gray_brick");
        this.setRegistryName("npu:gray_brick");
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return true;
    }
}
