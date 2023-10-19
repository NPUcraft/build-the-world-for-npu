package com.tf.npu.Blocks.BuildBlocks.WGWall;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.NPU;
import com.tf.npu.Interfaces.IHasModel;
import com.tf.npu.Util.InitHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class WGWall extends Block implements IHasModel {
    public WGWall() {
        super(Material.ROCK);
        setTranslationKey("wgwall");
        setRegistryName("npu:wgwall");
        setCreativeTab(NPU.MY_TAB1);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
        setLightOpacity(5);
    }

    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(Item.getItemFromBlock(this));
    }

}
