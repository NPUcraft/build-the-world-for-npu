package com.tf.npu.Blocks.Lights;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.NPU;
import com.tf.npu.interfaces.IHasModel;
import com.tf.npu.util.InitHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Light4 extends Block implements IHasModel{

    public static final AxisAlignedBB LIGHT4_AABB = new AxisAlignedBB(0.3D, 0.0D, 0.3D, 0.7D, 1.0D, 0.7D);

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return LIGHT4_AABB;
    }
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
public Light4(){
    super(Material.ROCK);
    setUnlocalizedName("light4");
    setRegistryName("npu:light4");
    setCreativeTab(NPU.MY_TAB);
    ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    ModBlocks.BLOCKS.add(this);
    setLightLevel(1);
}
@Override
    public void registryItemRender(){
    InitHelper.itemModelRegistry(Item.getItemFromBlock(this));
}

}
