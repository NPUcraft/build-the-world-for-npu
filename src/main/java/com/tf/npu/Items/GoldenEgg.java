package com.tf.npu.Items;

import com.tf.npu.NPU;
import com.tf.npu.entity.EntityGoldenChicken;
import com.tf.npu.inventory.GuiElementLoader;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GoldenEgg extends Item {
    public GoldenEgg() {
        setUnlocalizedName("goldenegg");
    }


    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if (!playerIn.capabilities.isCreativeMode) {
        }
        if (!worldIn.isRemote) {
            if (playerIn.isSneaking()) {
                BlockPos pos = playerIn.getPosition();
                int id = GuiElementLoader.GUI_DEMO;
                playerIn.openGui(NPU.instance, id, worldIn, pos.getX(), pos.getY(), pos.getZ());
            }
            worldIn.spawnEntity(new EntityGoldenChicken(worldIn));
        }
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, ItemStack.EMPTY);
    }

}
