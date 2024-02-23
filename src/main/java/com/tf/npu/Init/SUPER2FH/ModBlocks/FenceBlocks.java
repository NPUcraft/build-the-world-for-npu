package com.tf.npu.Init.SUPER2FH.ModBlocks;

import com.tf.npu.Blocks.BuildBlocks.Fence.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class FenceBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final FenceWarningline FENCE_WARNINGLINE = new FenceWarningline();
    public static final FenceWarninglineColumn FENCE_WARNINGLINE_COLUMN = new FenceWarninglineColumn();
    public static final FenceWarninglineColumnDouble90 FENCE_WARNINGLINE_COLUMN_DOUBLE_90 = new  FenceWarninglineColumnDouble90();
    public static final FenceWarninglineColumnDouble180 FENCE_WARNINGLINE_COLUMN_DOUBLE_180 = new FenceWarninglineColumnDouble180();
    public static final FenceWarninglineColumnSingle FENCE_WARNINGLINE_COLUMN_SINGLE = new FenceWarninglineColumnSingle();
    public static final FenceWarninglineColumnTriple FENCE_WARNINGLINE_COLUMN_TRIPLE = new FenceWarninglineColumnTriple();
    public static final RoadblockDouble ROADBLOCK_DOUBLE = new RoadblockDouble();
}
