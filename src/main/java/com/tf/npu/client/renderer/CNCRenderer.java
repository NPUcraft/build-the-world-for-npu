package com.tf.npu.client.renderer;

import com.tf.npu.Blocks.SUPER2FH.Machine.tile.CNCTileEntity;
import com.tf.npu.client.model.tile.CNCModel;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class CNCRenderer extends GeoBlockRenderer<CNCTileEntity>
{
    public CNCRenderer()
    {
        super(new CNCModel());
    }
}
