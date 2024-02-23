package com.tf.npu.Blocks.DecorationBlocks.Sundries;

import com.tf.npu.Init.SUPER2FH.ModBlocks.SundriesBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class NotebookHero extends BlockFourSideFacingTemplate {
    public NotebookHero() {
        super();
        this.setTranslationKey("notebook_hero");
        this.setRegistryName("npu:notebook_hero");
        this.setCreativeTab(NPU.SUNDRIES);
        SundriesBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        SundriesBlocks.BLOCKS.add(this);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}
