package com.tf.npu.Client.Renderer;

import com.tf.npu.Blocks.DecorationBlocks.Machine.CNCTileEntity;
import com.tf.npu.Client.Model.Tile.CNCModel;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class CNCRenderer extends GeoBlockRenderer<CNCTileEntity>
{
    public CNCRenderer()
    {
        super(new CNCModel());
    }
}
