package com.tf.npu;

import com.tf.npu.Items.ItemLoader;
import com.tf.npu.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabsLoader {

    public static final CreativeTabs MY_TAB = new CreativeTabs(Reference.MODID) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemLoader.Homework);
        }
    };

    public static final CreativeTabs MY_TAB1 = new CreativeTabs("constructions") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemLoader.Plane);
        }
    };
    public static final CreativeTabs MY_TAB2 = new CreativeTabs("titles") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemLoader.GoldenEgg);
        }
    };
    public static final CreativeTabs MY_TAB3 = new CreativeTabs("blocksonroad") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemLoader.SchoolBus);
        }
    };
    public static final CreativeTabs MY_TAB4 = new CreativeTabs("windoor") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemLoader.SchoolBus);
        }
    };
}
