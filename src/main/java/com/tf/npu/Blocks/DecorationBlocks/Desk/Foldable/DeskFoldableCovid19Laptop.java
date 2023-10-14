package com.tf.npu.Blocks.DecorationBlocks.Desk.Foldable;

import com.tf.npu.Init.SUPER2FH.ModBlocks.DeskBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;


public class DeskFoldableCovid19Laptop extends BlockFourSideFacingTemplate {
    public DeskFoldableCovid19Laptop() {
        super();
        this.setTranslationKey("desk_foldable_covid19_laptop");
        this.setRegistryName("npu:desk_foldable_covid19_laptop");
        this.setCreativeTab(NPU.DESK);
        DeskBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        DeskBlocks.BLOCKS.add(this);
    }

}