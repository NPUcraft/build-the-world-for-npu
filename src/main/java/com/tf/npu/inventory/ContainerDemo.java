package com.tf.npu.inventory;

import com.tf.npu.Items.ItemLoader;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;

public class ContainerDemo extends Container {
    public ContainerDemo() {
        super();
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return new ItemStack(ItemLoader.GoldenEgg).isItemEqual(playerIn.getHeldItemMainhand());
    }
}
