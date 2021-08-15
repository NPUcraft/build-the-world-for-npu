package com.tf.npu.entity;

import com.tf.npu.NPU;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

/**
 * @author AoXiang_Soar
 * <p>
 * �������ע�����ʵ��
 */
public class EntityLoader {
    //����Ķ�
    private static int id = 0;

    /**
     * ���������ע��ʵ�壬�����ڵ�Plane��ʵ�����ƣ�Plane.class��Ϊ[ʵ������].class
     */
    public EntityLoader() {
        EntityRegistry.registerModEntity(new ResourceLocation("npu", "Plane"), Plane.class, "Plane", id++, NPU.instance, 256, 1, true);

        EntityRegistry.registerModEntity(new ResourceLocation("npu", "SchoolBus"), SchoolBus.class, "Schoolbus", id++, NPU.instance, 256, 1, true);

    }
}
