package com.tf.npu.Blocks.SUPER2FH.Desk;

import com.tf.npu.Init.SUPER2FH.ModBlocks.DeskBlocks;
import com.tf.npu.Init.SUPER2FH.ModItems.DeskItems;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;

public class DeskFoldableCovid19 extends BlockFourSideFacingTemplate {
    public DeskFoldableCovid19() {
        super();
        this.setUnlocalizedName("desk_foldable_covid19");
        this.setRegistryName("npu:desk_foldable_covid19");
        this.setCreativeTab(NPU.DESK);
        DeskItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        DeskBlocks.BLOCKS.add(this);
    }

}