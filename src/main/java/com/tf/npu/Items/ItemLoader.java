package com.tf.npu.Items;


import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

/**
 * @author AoXiang_Soar
 * You can loader your items in this class.
 */
public class ItemLoader {
    //Write item objects here

    public static Item GoldenEgg = new GoldenEgg();
    public static Item Plane = new Plane();
    public static Item SchoolBus = new SchoolBus();
    public static Item TitlePng = new TitlePng();
    public static Item OutPng = new OutPng();
    public static Item InnerPng = new InnerPng();
    public static Item WinDoorPng = new WinDoorPng();
    public static Item ConsPng = new ConsPng();
    public static Item Ash = new Ash();
    public static Item PigFood = new PigFood();
    public static Item RubPaper = new RubPaper();
    public static Item ItemRubbishSword = new ItemRubbishSword();
    public static Item Homework = new Homework();
//    public static Item EmblemCY = new EmblemCY();


    public ItemLoader() {
        register(GoldenEgg);
        register(Plane);
        register(SchoolBus);
        register(TitlePng);
        register(OutPng);
        register(InnerPng);
        register(WinDoorPng);
        register(ConsPng);
        register(Ash);
        register(PigFood);
        register(RubPaper);
        register(ItemRubbishSword);
        register(Homework);
//        register(EmblemCY);
    }


    public static void registerRenders() {
        registerRender(GoldenEgg);
        registerRender(Plane);
        registerRender(SchoolBus);
        registerRender(TitlePng);
        registerRender(OutPng);
        registerRender(InnerPng);
        registerRender(WinDoorPng);
        registerRender(ConsPng);
        registerRender(Ash);
        registerRender(PigFood);
        registerRender(RubPaper);
        registerRender(ItemRubbishSword);
        registerRender(Homework);
//        registerRender(EmblemCY);
    }

    private static void register(Item item) {
        String[] arr = item.getUnlocalizedName().toString().split("\\.");
        ForgeRegistries.ITEMS.register(item.setRegistryName(arr[1]));
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
