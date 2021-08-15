package com.tf.npu.Items;

import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.EntityLivingBase;

public class PigFood extends ItemFood {
    public PigFood() {
        super(4, 0.6F, false);
        setUnlocalizedName("pigfood");

        this.setAlwaysEdible();
    }

}
