package com.tf.npu;

import com.tf.npu.Items.ItemLoader;
import com.tf.npu.Proxy.CommonProxy;
import com.tf.npu.util.Reference;
import com.tf.npu.util.Util;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class NPU {
    //****************************************************************************
    //***************************请在CommonProxy里注册！***************************
    //***************************请在CommonProxy里注册！***************************
    //***************************请在CommonProxy里注册！***************************
    //***************************请在CommonProxy里注册！***************************
    //***************************请在CommonProxy里注册！***************************
    //***************************请在CommonProxy里注册！***************************
    //***************************请在CommonProxy里注册！***************************
    //***************************请在CommonProxy里注册！***************************
    //***************************请在CommonProxy里注册！***************************
    //***************************请在CommonProxy里注册！***************************
    //****************************************************************************
    public static final CreativeTabs MY_TAB = new CreativeTabs(Reference.MODID) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemLoader.InnerPng);
        }
    };

    public static final CreativeTabs MY_TAB1 = new CreativeTabs("constructions") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemLoader.ConsPng);
        }
    };
    public static final CreativeTabs MY_TAB2 = new CreativeTabs("titles") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemLoader.TitlePng);
        }
    };
    public static final CreativeTabs MY_TAB3 = new CreativeTabs("blocksonroad") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemLoader.OutPng);
        }
    };
    public static final CreativeTabs MY_TAB4 = new CreativeTabs("windoor") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemLoader.WinDoorPng);
        }
    };
    public static final CreativeTabs MY_TAB5 = new CreativeTabs("sign") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemLoader.Homework);
        }
    };
    @Instance
    public static NPU instance;
    @SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        Util.logger = event.getModLog();
        Util.logger.warn("Project Npu Reconstruction!");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        Util.logger.warn("Project Npu Reconstruction.");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        Util.logger.warn("Project Npu Reconstruction.");
    }


}
