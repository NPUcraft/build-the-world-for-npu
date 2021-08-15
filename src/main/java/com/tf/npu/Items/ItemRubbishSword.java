package com.tf.npu.Items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class ItemRubbishSword extends ItemPickaxe {
    public static final Item.ToolMaterial REDSTONE = EnumHelper.addToolMaterial("REDSTONE", 3, 59, 16.0F, 900.0F, 10);

    public ItemRubbishSword() {
        super(REDSTONE);
        this.setUnlocalizedName("rubbishsword");
    }
}
