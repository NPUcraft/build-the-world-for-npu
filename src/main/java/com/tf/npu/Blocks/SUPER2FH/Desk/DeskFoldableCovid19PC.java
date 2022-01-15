package com.tf.npu.Blocks.SUPER2FH.Desk;

import com.tf.npu.Init.SUPER2FH.ModBlocks.DeskBlocks;
import com.tf.npu.Init.SUPER2FH.ModItems.DeskItems;
import com.tf.npu.NPU;
import com.tf.npu.Template.BlockFourSideFacingTemplate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;


public class DeskFoldableCovid19PC extends BlockFourSideFacingTemplate {
    public DeskFoldableCovid19PC() {
        super();
        this.setUnlocalizedName("desk_foldable_covid19_pc");
        this.setRegistryName("npu:desk_foldable_covid19_pc");
        this.setCreativeTab(NPU.DESK);
        DeskItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        DeskBlocks.BLOCKS.add(this);
    }

}