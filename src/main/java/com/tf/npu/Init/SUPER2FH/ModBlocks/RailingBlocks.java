package com.tf.npu.Init.SUPER2FH.ModBlocks;

import com.tf.npu.Blocks.SUPER2FH.Railing.RailingHalf;
import com.tf.npu.Blocks.SUPER2FH.Railing.RailingHalfCorner;
import com.tf.npu.Blocks.SUPER2FH.Railing.RailingHalfDouble;
import com.tf.npu.Init.ModBlocks;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class RailingBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final RailingHalf RAILING_HALF = new RailingHalf();
    public static final RailingHalfCorner RAILING_HALF_CORNER = new RailingHalfCorner();
    public static final RailingHalfDouble RAILING_HALF_DOUBLE = new RailingHalfDouble();

}
