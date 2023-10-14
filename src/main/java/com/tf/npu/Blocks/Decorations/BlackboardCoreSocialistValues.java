package com.tf.npu.Blocks.Decorations;

import com.tf.npu.Init.SUPER2FH.ModBlocks.DeskBlocks;
import com.tf.npu.Init.SUPER2FH.ModBlocks.RackBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlackboardCoreSocialistValues extends BlockFourSideFacingTemplate {
    public BlackboardCoreSocialistValues() {
        super();
        this.setTranslationKey("blackboard_core_socialist_values");
        this.setRegistryName("npu:blackboard_core_socialist_values");
        this.setCreativeTab(NPU.RACK);
        RackBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        RackBlocks.BLOCKS.add(this);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}
