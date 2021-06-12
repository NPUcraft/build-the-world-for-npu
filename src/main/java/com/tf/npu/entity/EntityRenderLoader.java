package com.tf.npu.entity;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author AoXiang_Soar
 * 
 * 注册你的实体模型
 */
@SideOnly(Side.CLIENT)
public class EntityRenderLoader {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	/**
	 * 将Plane.class改为[实体类名].class，Plane.Renderer.class改为实体类里的模型类
	 */
	public EntityRenderLoader() {
		RenderingRegistry.registerEntityRenderingHandler(Plane.class,new EntityRenderFactory(Plane.Renderer.class));
		RenderingRegistry.registerEntityRenderingHandler(SchoolBus.class,new EntityRenderFactory(SchoolBus.Renderer.class));
	}
}
