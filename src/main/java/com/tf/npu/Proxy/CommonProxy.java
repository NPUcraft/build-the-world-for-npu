package com.tf.npu.Proxy;

import com.tf.npu.Items.ItemLoader;
import com.tf.npu.crafting.CraftingLoader;
import com.tf.npu.entity.EntityLoader;

import com.tf.npu.inventory.GuiElementLoader;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/**
 * ����˴����࣬�������ע����Ʒ�����飬ʵ����������߼�����ϵ������࣬����ο�4z�Ľ̳�
 * �ܾ���������ע������ޣ�
 */
public class CommonProxy {
    //****************************************************************************
    //******************************�����������ע�ᣡ*****************************
    //******************************�����������ע�ᣡ*****************************
    //******************************�����������ע�ᣡ*****************************
    //******************************�����������ע�ᣡ*****************************
    //******************************�����������ע�ᣡ*****************************
    //******************************�����������ע�ᣡ*****************************
    //******************************�����������ע�ᣡ*****************************
    //******************************�����������ע�ᣡ*****************************
    //******************************�����������ע�ᣡ*****************************
    //******************************�����������ע�ᣡ*****************************
    //****************************************************************************
    public void registryModel(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }

    public void preInit(FMLPreInitializationEvent event) {
        new EntityLoader();
        new ItemLoader();
    }

    public void init(FMLInitializationEvent event) {

        new GuiElementLoader();
        new CraftingLoader();
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

    public void onStart(FMLServerStartingEvent event) {
        //	new CommandLoader(event);
    }
}
