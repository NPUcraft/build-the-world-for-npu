package com.tf.npu.handler;

import com.tf.npu.Blocks.SUPER2FH.Machine.tile.CNCTileEntity;
import com.tf.npu.Init.BlockRegister;
import com.tf.npu.Init.ItemRegister;
import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;


import software.bernie.geckolib3.GeckoLib;


import java.util.List;

@EventBusSubscriber
public class RegistryHandler {
    public static final List<Block> BLOCKS = ModBlocks.getAllBlocks();
    public static final List<Item> ITEMS = ModItems.getAllItems();

    private static IForgeRegistry<Item> itemRegistry;
    private static IForgeRegistry<Block> blockRegistry;

    @SubscribeEvent
    public static void onItemRegistry(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ITEMS.toArray(new Item[0]));

//        event.getRegistry().register(ItemRegister.CNC_ITEM);

    }

    @SubscribeEvent
    public static void onBlockRegistry(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(BLOCKS.toArray(new Block[0]));


//        event.getRegistry().register(BlockRegister.CNC_BLOCK);

    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegistery(ModelRegistryEvent event) {
        modelRegisteryHelper(ITEMS);
        modelRegisteryHelper(BLOCKS);

//        ModelLoader
//                .setCustomModelResourceLocation
//                        (ItemRegister.CNC_ITEM, 0,
//                                new ModelResourceLocation("npu:cnc"));
    }

    private static <T> void modelRegisteryHelper(List<T> list) {
        for (T element : list) {
            if (element instanceof IHasModel) {
                ((IHasModel) element).registryItemRender();
            }
        }
    }


    // geckolib

//    @SubscribeEvent
//    public void onRegisterEntities(RegistryEvent.Register<EntityEntry> event)
//    {
//        GameRegistry.registerTileEntity(CNCTileEntity.class, new ResourceLocation("npu", "cnctile"));
//    }









//    public static <T extends Item> T registerItem(T item, String name)
//    {
//        registerItem(item, new ResourceLocation(GeckoLib.ModID, name));
//        return item;
//    }

    public static <T extends Item> T registerItem(T item, ResourceLocation name)
    {
        itemRegistry.register(item.setRegistryName(name).setUnlocalizedName(name.toString().replace(":", ".")));
        return item;
    }

//    public static void registerBlock(Block block, String name)
//    {
//        registerBlock(block, new ResourceLocation(GeckoLib.ModID, name));
//    }

    public static void registerBlock(Block block, ResourceLocation name)
    {
        blockRegistry.register(block.setRegistryName(name).setUnlocalizedName(name.toString().replace(":", ".")));
    }
}
