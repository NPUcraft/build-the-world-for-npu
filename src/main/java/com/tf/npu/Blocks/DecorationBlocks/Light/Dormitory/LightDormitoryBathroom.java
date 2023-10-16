package com.tf.npu.Blocks.DecorationBlocks.Light.Dormitory;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.NPU;
import com.tf.npu.Interfaces.IHasModel;
import com.tf.npu.Util.InitHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class LightDormitoryBathroom extends Block implements IHasModel {
    public LightDormitoryBathroom() {
        super(Material.ROCK);
        setTranslationKey("light_dormitory_bathroom");
        setRegistryName("npu:light_dormitory_bathroom");
        setCreativeTab(NPU.MY_TAB);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
        setLightLevel(1);
    }

    public static final AxisAlignedBB Light_AABB = new AxisAlignedBB(0.0D, 1.0D, 0.0D, 1.0D, 0.0D, 1.0D);

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return Light_AABB;
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
    public void registryItemRender() {
        InitHelper.itemModelRegistry(Item.getItemFromBlock(this));
    }


}
