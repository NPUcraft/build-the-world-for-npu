package com.tf.npu;

import com.tf.npu.Blocks.SUPER2FH.Machine.tile.CNCTileEntity;
import com.tf.npu.Init.SUPER2FH.ModBlocks.*;
import com.tf.npu.Items.ItemLoader;
import com.tf.npu.Proxy.CommonProxy;
import com.tf.npu.client.renderer.CNCRenderer;
import com.tf.npu.util.Reference;
import com.tf.npu.util.Util;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import software.bernie.example.registry.ItemRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class NPU {
    //****************************************************************************
    //***************************请在CommonProxy里注册！***************************
    //***************************请在CommonProxy里注册！***************************
    //***************************请在CommonProxy里注册！***************************
    //***************************请在CommonProxy里注册！***************************
    //***************************请在CommonProxy里注册！***************************
    //***************************请在CommonProxy里注册！***************************
    //***************************请在CommonProxy里注册！***************************
    //***************************请在CommonProxy里注册！***************************
    //***************************请在CommonProxy里注册！***************************
    //***************************请在CommonProxy里注册！***************************
    //****************************************************************************
    public static final CreativeTabs MY_TAB = new CreativeTabs(Reference.MODID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemLoader.InnerPng);
        }
    };

    public static final CreativeTabs MY_TAB1 = new CreativeTabs("constructions") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemLoader.ConsPng);
        }
    };
    public static final CreativeTabs MY_TAB2 = new CreativeTabs("titles") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemLoader.TitlePng);
        }
    };
    public static final CreativeTabs MY_TAB3 = new CreativeTabs("blocksonroad") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemLoader.OutPng);
        }
    };
    public static final CreativeTabs MY_TAB4 = new CreativeTabs("windoor") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemLoader.WinDoorPng);
        }
    };
    public static final CreativeTabs MY_TAB5 = new CreativeTabs("sign") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemLoader.Homework);
        }
    };

//    ************************************SUPER2FH*********************************************

    public static final CreativeTabs TEMPORARY = new CreativeTabs("temporary") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.BEDROCK);
        }
    };

    /**
     * 椅子
     */
    public static final CreativeTabs CHAIR = new CreativeTabs("chair") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ChairBlocks.CHAIR_AUDITORIUM_BLUE);
        }
    };

    /**
     * 方块
     */
    public static final CreativeTabs CUBE = new CreativeTabs("cube") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(CubeBlocks.CEMENT_LIGHTBLUE);
        }
    };

    /**
     * 设施
     */
    public static final CreativeTabs FACILITY = new CreativeTabs("facility") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(FacilityBlocks.TRASH_CLASSIFICATION_MEDICAL);
        }
    };

    /**
     * 桌子
     */
    public static final CreativeTabs DESK = new CreativeTabs("desk") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(DeskBlocks.DESK_FOLDABLE);
        }
    };

    /**
     * 障碍
     */
    public static final CreativeTabs FENCE = new CreativeTabs("fence") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(FenceBlocks.ROADBLOCK_DOUBLE);
        }
    };

    public static  final CreativeTabs NPUARMOR = new CreativeTabs("npu_armor") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(TemporaryBlocks.MASK_MEDICAL);
        }
    };

    /**
     * 展示相关
     */
    public static final CreativeTabs RACK = new CreativeTabs("rack") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RackBlocks.FLAG_CY);
        }
    };

    /**
     * 栏杆
     */
    public static final CreativeTabs RAILING = new CreativeTabs("railing") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RailingBlocks.RAILING_HALF);
        }
    };

    /**
     * 楼梯
     */
    public static final CreativeTabs STAIR = new CreativeTabs("stair") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(StairBlocks.STAIR_CEMENT_LIGHTBLUE);
        }
    };

    /**
     * 杂物
     */
    public static final CreativeTabs SUNDRIES = new CreativeTabs("sundries") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(SundriesBlocks.ADMISSION_LETTER_2021);
        }
    };

    /**
     * 车辆
     */
    public static final CreativeTabs VEHICLE = new CreativeTabs("vehicle") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(VehicleBlocks.BIKE1);
        }
    };

    /**
     * 机械机器
     */
    public static final CreativeTabs MACHINE = new CreativeTabs("machine") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.BEDROCK);
        }
    };

    /**
     * 家具相关
     */
    public static final CreativeTabs FURNITURE = new CreativeTabs("furniture") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(FurnitureBlocks.AIRCONDITIONER_VERTICAL);
        }
    };

    /**
     * 灯光相关
     */
    public static final CreativeTabs LIGHT = new CreativeTabs("light") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(LightBlocks.LIGHT_CEILING_LONG);
        }
    };

    /**
     * 窗户相关
     */
    public static final CreativeTabs WINDOW = new CreativeTabs("window") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(WindowBlocks.GLASS_WALL_HALF);
        }
    };



    @Instance
    public static NPU instance;
    @SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        if (event.getSide().isClient())
        {
            OBJLoader.INSTANCE.addDomain("NPU");
        }
        proxy.preInit(event);
        Util.logger = event.getModLog();
        Util.logger.warn("Project Npu Reconstruction!");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        Util.logger.warn("Project Npu Reconstruction.");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        Util.logger.warn("Project Npu Reconstruction.");
    }


    public static boolean DISABLE_IN_DEV = false;
//    private static CreativeTabs geckolibItemGroup;
    private boolean deobfuscatedEnvironment;

//    public static CreativeTabs getGeckolibItemGroup()
//    {
//        if (geckolibItemGroup == null)
//        {
//            geckolibItemGroup = new CreativeTabs(CreativeTabs.getNextID(), "geckolib_examples")
//            {
//                @Override
//                public ItemStack createIcon()
//                {
//                    return new ItemStack(ItemRegistry.JACK_IN_THE_BOX);
//                }
//            };
//        }
//
//        return geckolibItemGroup;
//    }

//    @SideOnly(Side.CLIENT)
//    @Mod.EventHandler
//    public void registerRenderers(FMLPreInitializationEvent event)
//    {
//        ClientRegistry.bindTileEntitySpecialRenderer(CNCTileEntity.class, new CNCRenderer());
//
//    }

}
