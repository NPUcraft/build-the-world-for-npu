package com.tf.npu.entity;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author AoXiang_Soar
 * <p>
 * ע�����ʵ��ģ��
 */
@SideOnly(Side.CLIENT)
public class EntityRenderLoader {
    @SuppressWarnings({"unchecked", "rawtypes"})
    /**
     * ��Plane.class��Ϊ[ʵ������].class��Plane.Renderer.class��Ϊʵ�������ģ����
     */
    public EntityRenderLoader() {
        RenderingRegistry.registerEntityRenderingHandler(Plane.class, new EntityRenderFactory(Plane.Renderer.class));
        RenderingRegistry.registerEntityRenderingHandler(SchoolBus.class, new EntityRenderFactory(SchoolBus.Renderer.class));
    }
}
