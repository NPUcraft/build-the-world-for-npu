package com.tf.npu.Items;

import net.minecraft.item.ItemFood;

public class PigFood extends ItemFood {
    public PigFood() {
        super(4, 0.6F, false);
        setTranslationKey("pigfood");

        this.setAlwaysEdible();
    }

}
