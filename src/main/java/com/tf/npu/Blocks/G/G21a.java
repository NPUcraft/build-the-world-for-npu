package com.tf.npu.Blocks.G;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.NPU;
import com.tf.npu.interfaces.IHasModel;
import com.tf.npu.util.InitHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class G21a extends Block implements IHasModel{
public G21a(){
    super(Material.ROCK);
    setUnlocalizedName("g21a");
    setRegistryName("npu:g21a");
    setCreativeTab(NPU.MY_TAB1);
    ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    ModBlocks.BLOCKS.add(this);

}
@Override
    public void registryItemRender(){
    InitHelper.itemModelRegistry(Item.getItemFromBlock(this));
}

}
