package com.tf.npu.Init;

import com.tf.npu.Init.SUPER2FH.ModBlocks.ChairBlocks;
import com.tf.npu.Init.SUPER2FH.ModBlocks.CubeBlocks;
import com.tf.npu.Init.SUPER2FH.ModBlocks.RailingBlocks;
import com.tf.npu.Init.SUPER2FH.ModBlocks.StairBlocks;
import com.tf.npu.Init.SUPER2FH.ModItems.ChairItems;
import com.tf.npu.Init.SUPER2FH.ModItems.CubeItems;
import com.tf.npu.Init.SUPER2FH.ModItems.RailingItems;
import com.tf.npu.Init.SUPER2FH.ModItems.StairItems;
import com.tf.npu.Items.Blks;
import com.tf.npu.Items.ConsPng;
import com.tf.npu.Items.Homework;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;


import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static List<Item> ITEMS = new ArrayList<>();

    public static List<Item> getAllItems() {
        ITEMS.addAll(ChairItems.ITEMS);
        ITEMS.addAll(CubeItems.ITEMS);
        ITEMS.addAll(RailingItems.ITEMS);
        ITEMS.addAll(StairItems.ITEMS);
        return ITEMS;
    }
}
