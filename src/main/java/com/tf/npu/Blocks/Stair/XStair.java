package com.tf.npu.Blocks.Stair;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.NPU;
import com.tf.npu.interfaces.IHasModel;
import com.tf.npu.util.InitHelper;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;

public class XStair extends BlockStairs implements IHasModel {
    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(Item.getItemFromBlock(this));
    }

    public static enum EnumMaterial implements IStringSerializable {
        IRON("iron");

        private String name;

        private EnumMaterial(String material) {
            this.name = material;
        }

        @Override
        public String getName() {
            return this.name;
        }

    }

    public XStair() {
        super((IBlockState) Material.AIR);
        this.setUnlocalizedName("xstair");
        this.setRegistryName("npu:xstair");
        this.setHardness(2.5F);
        this.setCreativeTab(NPU.MY_TAB1);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);
        setLightOpacity(5);


    }
}

