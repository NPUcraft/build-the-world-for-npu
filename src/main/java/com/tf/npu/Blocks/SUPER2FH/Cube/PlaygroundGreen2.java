package com.tf.npu.Blocks.SUPER2FH.Cube;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.Init.SUPER2FH.ModBlocks.CubeBlocks;
import com.tf.npu.Init.SUPER2FH.ModItems.CubeItems;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import com.tf.npu.Template.BlockTemplate;
import net.minecraft.item.ItemBlock;

public class PlaygroundGreen2 extends BlockTemplate {
    public PlaygroundGreen2() {
        super();
        this.setUnlocalizedName("playground_green2");
        this.setRegistryName("npu:playground_green2");
        this.setCreativeTab(NPU.CUBE);
        CubeItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        CubeBlocks.BLOCKS.add(this);
    }
}