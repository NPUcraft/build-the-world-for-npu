package com.tf.npu.Init.SUPER2FH.ModBlocks;

import com.tf.npu.Blocks.SUPER2FH.Stair.*;
import com.tf.npu.Init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class StairBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final List<Item> ITEMS = new ArrayList<>();


    public static final StairCementDownLightblue STAIR_CEMENT_DOWN_LIGHTBLUE = new StairCementDownLightblue();
    public static final StairCementLightblue STAIR_CEMENT_LIGHTBLUE = new StairCementLightblue();
    public static final StairCementUpLightblue STAIR_CEMENT_UP_LIGHTBLUE = new StairCementUpLightblue();


    // old
    public static final StairIndoor_stair STAIR_INDOOR = new StairIndoor_stair();
    public static final StairIndoorAddition_stair1 STAIR_INDOOR_ADDITION = new StairIndoorAddition_stair1();
    public static final StairIndoorInner_stair2 STAIR_INDOOR_INNER = new StairIndoorInner_stair2();
    public static final StairIndoorOuter_stair3 STAIR_INDOOR_OUTER = new StairIndoorOuter_stair3();
    public static final StairOutdoor_stair4 STAIR_OUTDOOR = new StairOutdoor_stair4();
    public static final StairOutdoorInner_stair5 STAIR_OUTDOOR_INNER = new StairOutdoorInner_stair5();
    public static final StairOutdoorOuter_stair6 STAIR_OUTDOOR_OUTER = new StairOutdoorOuter_stair6();
    public static final Block G40 = new StairGentlyDown_g40();
    public static final Block G41 = new StairGentlyUp_g41();
    public static final Block G43 = new StairGentlyWhiteDown_g43();
    public static final Block G44 = new StairGentlyWhiteUp_g44();
    public static final Block G45 = new StairWhite_g45();
    public static final Block FG63 = new StairGentlyDownInner_fg63();
    public static final Block FG64 = new StairGentlyDownOuter_fg64();
    public static final Block FG65 = new StairGentlyUpInner_fg65();
    public static final Block FG66 = new StairGentlyUpOuter_fg66();
//        public static final Block STAIR = new StairIndoor();
//    public static final Block STAIR1 = new StairIndoorAddition();
//    public static final Block STAIR2 = new StairIndoorInner();
//    public static final Block STAIR3 = new StairIndoorOuter();
//    public static final Block STAIR4 = new StairOutdoor();
//    public static final Block STAIR5 = new StairOutdoorInner();
//    public static final Block STAIR6 = new StairOutdoorOuter();


    public static void merge() {
        ModBlocks.BLOCKS.addAll(BLOCKS);
    }
}
