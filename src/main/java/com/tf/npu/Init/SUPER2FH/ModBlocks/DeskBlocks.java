package com.tf.npu.Init.SUPER2FH.ModBlocks;

import com.tf.npu.Blocks.SUPER2FH.Desk.DeskFoldable;
import com.tf.npu.Blocks.SUPER2FH.Desk.DeskFoldableCovid19;
import com.tf.npu.Blocks.SUPER2FH.Desk.DeskFoldableCovid19PC;
import com.tf.npu.Blocks.SUPER2FH.Desk.DeskWood2;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class DeskBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final DeskFoldable DESK_FOLDABLE = new DeskFoldable();
    public static final DeskFoldableCovid19 DESK_FOLDABLE_COVID19 = new DeskFoldableCovid19();
    public static final DeskFoldableCovid19PC DESK_FOLDABLE_COVID19_PC = new DeskFoldableCovid19PC();

    public static final DeskWood2 DESK_WOOD2 = new DeskWood2();
}
