package com.tf.npu.entity;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author AoXiang_Soar
 */
@SideOnly(Side.CLIENT)
public class EntityRenderLoader {
    @SuppressWarnings({"unchecked", "rawtypes"})

    public EntityRenderLoader() {
        RenderingRegistry.registerEntityRenderingHandler(Plane.class, new EntityRenderFactory(Plane.Renderer.class));
        RenderingRegistry.registerEntityRenderingHandler(SchoolBus.class, new EntityRenderFactory(SchoolBus.Renderer.class));
    }
}
