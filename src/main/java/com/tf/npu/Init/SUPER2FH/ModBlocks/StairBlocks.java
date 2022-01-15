package com.tf.npu.Init.SUPER2FH.ModBlocks;

import com.tf.npu.Blocks.SUPER2FH.Stair.StairCementDownLightblue;
import com.tf.npu.Blocks.SUPER2FH.Stair.StairCementLightblue;
import com.tf.npu.Blocks.SUPER2FH.Stair.StairCementUpLightblue;
import com.tf.npu.Init.ModBlocks;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class StairBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final StairCementDownLightblue STAIR_CEMENT_DOWN_LIGHTBLUE = new StairCementDownLightblue();
    public static final StairCementLightblue STAIR_CEMENT_LIGHTBLUE = new StairCementLightblue();
    public static final StairCementUpLightblue STAIR_CEMENT_UP_LIGHTBLUE = new StairCementUpLightblue();

    public static void merge() {
        ModBlocks.BLOCKS.addAll(BLOCKS);
    }
}
