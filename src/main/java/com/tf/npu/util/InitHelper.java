package com.tf.npu.util;

import com.tf.npu.Init.ModItems;
import com.tf.npu.NPU;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class InitHelper {
    public static void itemInit(Item item, String name, CreativeTabs MY_TAB) {
        item.setUnlocalizedName("homework");
        item.setRegistryName("npu:homework");
        item.setCreativeTab(MY_TAB);
        ModItems.ITEMS.add(item);
    }

    public static void itemModelRegistry(Item item) {
        NPU.proxy.registryModel(item, 0, "inventory");
    }
}
