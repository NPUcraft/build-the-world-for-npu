package com.tf.npu.Items;

import com.tf.npu.NPU;
import net.minecraft.item.Item;

public class Blks extends Item{
    public Blks(){
        setCreativeTab(NPU.MY_TAB1);
        this.setUnlocalizedName("blks");
        this.setRegistryName("npu:blks");
    }

}