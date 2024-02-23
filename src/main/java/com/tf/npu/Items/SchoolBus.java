package com.tf.npu.Items;

import com.tf.npu.NPU;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class SchoolBus extends Item {
    public SchoolBus() {
        setCreativeTab(NPU.MY_TAB3);
        setTranslationKey("schoolbus");
    }


    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        com.tf.npu.Entity.SchoolBus entity = new com.tf.npu.Entity.SchoolBus(worldIn);
        if (!worldIn.isRemote) {
            entity.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, playerIn.rotationYaw, 0.0F);
            worldIn.spawnEntity(entity);
            if (!playerIn.capabilities.isCreativeMode) {
                itemstack.shrink(1);
            }
        }

        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
    }
}
