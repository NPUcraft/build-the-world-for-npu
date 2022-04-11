package com.tf.npu.Init.SUPER2FH.ModBlocks;

import com.tf.npu.Blocks.SUPER2FH.Sundries.AdmissionLetter2021;
import com.tf.npu.Blocks.SUPER2FH.Sundries.NotebookHero;
import com.tf.npu.Blocks.SUPER2FH.Sundries.PartyMembershipApplication;
import com.tf.npu.Blocks.SUPER2FH.Sundries.Pencil;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class SundriesBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final AdmissionLetter2021 ADMISSION_LETTER_2021 = new AdmissionLetter2021();
    public static final NotebookHero NOTEBOOK_HERO = new NotebookHero();
    public static final PartyMembershipApplication PARTY_MEMBERSHIP_APPLICATION = new PartyMembershipApplication();
    public static final Pencil PENCIL = new Pencil();
}
