package com.tf.npu.Inventory;

import com.tf.npu.NPU;
import com.tf.npu.Client.Gui.GuiContainerDemo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class GuiElementLoader implements IGuiHandler {
    public static final int GUI_DEMO = 1;

    public GuiElementLoader() {
        NetworkRegistry.INSTANCE.registerGuiHandler(NPU.instance, this);
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case GUI_DEMO:
                return new ContainerDemo();
            default:
                return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case GUI_DEMO:
                return new GuiContainerDemo(new ContainerDemo());
            default:
                return null;
        }
    }
}
