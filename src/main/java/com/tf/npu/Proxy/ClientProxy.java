package com.tf.npu.Proxy;


import com.tf.npu.Items.ItemRenderLoader;
import com.tf.npu.entity.EntityRenderLoader;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author AoXiang_Soar
 * <p>
 * �ͻ��˴���������ע��ģ�͵�
 */
public class ClientProxy extends CommonProxy {
    public void registryModel(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        //ע��EntityRenderLoader()
        new EntityRenderLoader();
        new ItemRenderLoader();

    }
}
