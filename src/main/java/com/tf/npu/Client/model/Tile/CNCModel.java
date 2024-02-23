package com.tf.npu.Client.Model.Tile;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class CNCModel extends AnimatedGeoModel
{
    @Override
    public ResourceLocation getAnimationFileLocation(Object entity)
    {
        return new ResourceLocation("npu", "animations/cnc.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(Object animatable)
    {
        return new ResourceLocation("npu", "geo/cnc.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Object entity)
    {
        return new ResourceLocation("npu", "textures/block/cnc/cnc.png");
    }
}