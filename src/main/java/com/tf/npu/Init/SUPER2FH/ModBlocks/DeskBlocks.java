package com.tf.npu.Init.SUPER2FH.ModBlocks;

import com.tf.npu.Blocks.DecorationBlocks.Desk.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class DeskBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final DeskFoldable DESK_FOLDABLE = new DeskFoldable();
    public static final DeskFoldableCovid19 DESK_FOLDABLE_COVID19 = new DeskFoldableCovid19();
    public static final DeskFoldableCovid19Laptop DESK_FOLDABLE_COVID19_PC = new DeskFoldableCovid19Laptop();

    public static final DeskWood DESK_WOOD2 = new DeskWood();

    public static final DeskWorkshopWide DESK_WORKSHOP = new DeskWorkshopWide();
    public static final DeskWorkshopNarrow DESK_WORKSHOP2 = new DeskWorkshopNarrow();
    public static final DeskWorkshopWideDoubleDrawer DESK_WORKSHOP3 = new DeskWorkshopWideDoubleDrawer();
    public static final DeskWorkshopWideSingleDrawer DESK_WORKSHOP4 = new DeskWorkshopWideSingleDrawer();
}
