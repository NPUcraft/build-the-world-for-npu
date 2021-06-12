package com.tf.npu.Proxy;

import com.tf.npu.Items.ItemLoader;
import com.tf.npu.crafting.CraftingLoader;
import com.tf.npu.entity.EntityLoader;

import com.tf.npu.inventory.GuiElementLoader;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

/**
 * 服务端代理类，在这个类注册物品，方块，实体等与服务端逻辑有联系的相关类，具体参考4z的教程
 * 拒绝当在主类注册的禽兽！
 */
public class CommonProxy {
	//****************************************************************************
	//******************************请在这个类里注册！*****************************
	//******************************请在这个类里注册！*****************************
	//******************************请在这个类里注册！*****************************
	//******************************请在这个类里注册！*****************************
	//******************************请在这个类里注册！*****************************
	//******************************请在这个类里注册！*****************************
	//******************************请在这个类里注册！*****************************
	//******************************请在这个类里注册！*****************************
	//******************************请在这个类里注册！*****************************
	//******************************请在这个类里注册！*****************************
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
