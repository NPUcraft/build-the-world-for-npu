package com.tf.npu.entity;

import com.tf.npu.NPU;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

/**
 * @author AoXiang_Soar
 * 
 * 在这个类注册你的实体
 */
public class EntityLoader {
	//无需改动
	private static int id = 0;
	/**
	 * 在这个方法注册实体，引号内的Plane是实体名称，Plane.class改为[实体类名].class
	 */
	public EntityLoader() {
		EntityRegistry.registerModEntity(new ResourceLocation("npu", "Plane"), Plane.class, "Plane", id++, NPU.instance, 256, 1, true);

		EntityRegistry.registerModEntity(new ResourceLocation("npu", "SchoolBus"), SchoolBus.class, "Schoolbus", id++, NPU.instance, 256, 1, true);

	}
}
