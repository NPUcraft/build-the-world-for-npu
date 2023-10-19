package com.tf.npu.Init.SUPER2FH.ModBlocks;

import com.tf.npu.Blocks.BuildBlocks.Windows.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class WindowBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final GlassWallHalf GLASS_WALL_HALF = new GlassWallHalf();
    public static final GlassWallQuarter GLASS_WALL_QUARTER = new GlassWallQuarter();
    public static final WindowCeiling WINDOW_CEILING = new WindowCeiling();
    public static final GlassFrame1 GLASS_FRAME_1 = new GlassFrame1();
    public static final GlassFrame2 GLASS_FRAME_2 = new GlassFrame2();

}
