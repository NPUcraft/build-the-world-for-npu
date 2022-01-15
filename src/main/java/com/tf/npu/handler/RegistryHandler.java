package com.tf.npu.handler;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.Init.SUPER2FH.ModBlocks.ChairBlocks;
import com.tf.npu.Init.SUPER2FH.ModBlocks.CubeBlocks;
import com.tf.npu.Init.SUPER2FH.ModBlocks.RailingBlocks;
import com.tf.npu.Init.SUPER2FH.ModBlocks.StairBlocks;
import com.tf.npu.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;

@EventBusSubscriber
public class RegistryHandler {
    public static final List<Block> BLOCKS = ModBlocks.getAllBlocks();
    public static final List<Item> ITEMS = ModItems.getAllItems();

    @SubscribeEvent
    public static void onItenRegistery(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlcokRegistery(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegistery(ModelRegistryEvent event) {
        modelRegisteryHelper(ITEMS);
        modelRegisteryHelper(BLOCKS);
    }

    private static <T> void modelRegisteryHelper(List<T> list) {
        for (T element : list) {
            if (element instanceof IHasModel) {
                ((IHasModel) element).registryItemRender();
            }
        }
    }
}
