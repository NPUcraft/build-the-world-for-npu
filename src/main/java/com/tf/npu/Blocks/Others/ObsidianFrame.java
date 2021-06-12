package com.tf.npu.Blocks.Others;

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

public class ObsidianFrame extends Block implements IHasModel{
    public ObsidianFrame(){
        super(Material.ROCK);
        setUnlocalizedName("obsidianframe");
        setRegistryName("npu:obsidianframe");
        setCreativeTab(NPU.MY_TAB1);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
    }
    //x1,y1,z1,x2,y2,z2均为double类型
    public static final AxisAlignedBB OBSIDIAN_BLOCK_AABB = new AxisAlignedBB(0.2D, 0.2D, 0.2D, 0.8D, 0.8D, 0.8D);

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return OBSIDIAN_BLOCK_AABB;
    }
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }
    @Override
    public void registryItemRender(){
        InitHelper.itemModelRegistry(Item.getItemFromBlock(this));
    }

}