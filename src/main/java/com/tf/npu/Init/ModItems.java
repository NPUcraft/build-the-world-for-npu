package com.tf.npu.Init;

import com.tf.npu.Init.SUPER2FH.ModBlocks.*;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static List<Item> ITEMS = new ArrayList<>();

    public static List<Item> getAllItems() {
        ITEMS.addAll(TemporaryBlocks.ITEMS);
        ITEMS.addAll(ChairBlocks.ITEMS);
        ITEMS.addAll(CubeBlocks.ITEMS);
        ITEMS.addAll(DeskBlocks.ITEMS);
        ITEMS.addAll(FacilityBlocks.ITEMS);
        ITEMS.addAll(FenceBlocks.ITEMS);
        ITEMS.addAll(RackBlocks.ITEMS);
        ITEMS.addAll(RailingBlocks.ITEMS);
        ITEMS.addAll(StairBlocks.ITEMS);
        ITEMS.addAll(SundriesBlocks.ITEMS);
        ITEMS.addAll(VehicleBlocks.ITEMS);
        return ITEMS;
    }
}
