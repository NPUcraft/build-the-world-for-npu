package com.tf.npu.Blocks.SUPER2FH.Rack;

import com.tf.npu.Init.SUPER2FH.ModBlocks.DeskBlocks;
import com.tf.npu.Init.SUPER2FH.ModBlocks.RackBlocks;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlackboardAntiJapaneseHero extends BlockFourSideFacingTemplate {
    public BlackboardAntiJapaneseHero() {
        super();
        this.setTranslationKey("blackboard_anti_japanese_hero");
        this.setRegistryName("npu:blackboard_anti_japanese_hero");
        this.setCreativeTab(NPU.RACK);
        RackBlocks.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        RackBlocks.BLOCKS.add(this);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}
