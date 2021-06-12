package com.tf.npu.crafting;

import com.tf.npu.Items.ItemLoader;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingLoader
{
    public CraftingLoader()
    {
        registerRecipe();
        registerSmelting();
        registerFuel();
    }

    private static void registerRecipe()
    {

    }

    private static void registerSmelting()
    {
        GameRegistry.addSmelting(ItemLoader.Homework, new ItemStack(ItemLoader.Ash), 10.5F);
    }

    private static void registerFuel()
    {

    }
}