package com.tf.npu.Blocks.SUPER2FH.Desk;

import com.tf.npu.Init.SUPER2FH.ModBlocks.DeskBlocks;
import com.tf.npu.Init.SUPER2FH.ModItems.DeskItems;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;

public class DeskFoldable extends BlockFourSideFacingTemplate {
    public DeskFoldable() {
        super();
        this.setUnlocalizedName("desk_foldable");
        this.setRegistryName("npu:desk_foldable");
        this.setCreativeTab(NPU.DESK);
        DeskItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        DeskBlocks.BLOCKS.add(this);
    }

}