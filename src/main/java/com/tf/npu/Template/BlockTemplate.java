package com.tf.npu.Template;

import com.tf.npu.NPU;
import com.tf.npu.interfaces.IHasModel;
import com.tf.npu.util.InitHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockTemplate extends Block implements IHasModel {

    public BlockTemplate() {
        super(Material.ROCK);
        this.setCreativeTab(NPU.TEMPORARY);
    }

    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(Item.getItemFromBlock(this));
    }

}
