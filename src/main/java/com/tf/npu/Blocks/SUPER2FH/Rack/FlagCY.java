package com.tf.npu.Blocks.SUPER2FH.Rack;

import com.tf.npu.Init.SUPER2FH.ModBlocks.DeskBlocks;
import com.tf.npu.Init.SUPER2FH.ModBlocks.RackBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;

public class FlagCY extends BlockFourSideFacingTemplate {
    public FlagCY() {
        super();
        this.setUnlocalizedName("flag_cy");
        this.setRegistryName("npu:flag_cy");
        this.setCreativeTab(NPU.RACK);
        this.setLightLevel(0.1f);
        RackBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        RackBlocks.BLOCKS.add(this);
    }
}
