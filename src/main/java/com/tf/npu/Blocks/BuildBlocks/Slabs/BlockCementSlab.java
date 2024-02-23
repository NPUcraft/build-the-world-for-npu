package com.tf.npu.Blocks.BuildBlocks.Slabs;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.NPU;
import com.tf.npu.Interfaces.IHasModel;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public abstract class BlockCementSlab extends BlockSlab implements IHasModel {
    public static final PropertyBool SEAMLESS = PropertyBool.create("seamless");
    public static final PropertyEnum<BlockCementSlab.EnumType> VARIANT = PropertyEnum.<BlockCementSlab.EnumType>create("variant", BlockCementSlab.EnumType.class);

    public BlockCementSlab() {
        super(Material.ROCK);
        this.fullBlock = this.isDouble();
        this.setLightOpacity(255);
        this.setTranslationKey("cementslab");
        this.setRegistryName("npu:cementslab");

        IBlockState iblockstate = this.blockState.getBaseState();

        if (this.isDouble()) {
            iblockstate = iblockstate.withProperty(SEAMLESS, Boolean.valueOf(false));
        } else {
            iblockstate = iblockstate.withProperty(HALF, EnumBlockHalf.BOTTOM);
        }

        this.setDefaultState(iblockstate.withProperty(VARIANT, BlockCementSlab.EnumType.STONE));
        this.setCreativeTab(NPU.MY_TAB1);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        ModBlocks.BLOCKS.add(this);

    }

    /**
     * Get the Item that this Block should drop when harvested.
     */
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(Blocks.STONE_SLAB);
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
        return new ItemStack(Blocks.STONE_SLAB, 1, ((BlockCementSlab.EnumType) state.getValue(VARIANT)).getMetadata());
    }

    /**
     * Returns the slab block name with the type associated with it
     */
    public String getTranslationKey(int meta) {
        return super.getTranslationKey() + "." + BlockCementSlab.EnumType.byMetadata(meta).getTranslationKey();
    }

    public IProperty<?> getVariantProperty() {
        return VARIANT;
    }

    public Comparable<?> getTypeForItem(ItemStack stack) {
        return BlockCementSlab.EnumType.byMetadata(stack.getMetadata() & 7);
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
        for (BlockCementSlab.EnumType blockstoneslab$enumtype : BlockCementSlab.EnumType.values()) {
            if (blockstoneslab$enumtype != BlockCementSlab.EnumType.WOOD) {
                items.add(new ItemStack(this, 1, blockstoneslab$enumtype.getMetadata()));
            }
        }
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta) {
        IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, BlockCementSlab.EnumType.byMetadata(meta & 7));

        if (this.isDouble()) {
            iblockstate = iblockstate.withProperty(SEAMLESS, Boolean.valueOf((meta & 8) != 0));
        } else {
            iblockstate = iblockstate.withProperty(HALF, (meta & 8) == 0 ? EnumBlockHalf.BOTTOM : EnumBlockHalf.TOP);
        }

        return iblockstate;
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state) {
        int i = 0;
        i = i | ((BlockCementSlab.EnumType) state.getValue(VARIANT)).getMetadata();

        if (this.isDouble()) {
            if (((Boolean) state.getValue(SEAMLESS)).booleanValue()) {
                i |= 8;
            }
        } else if (state.getValue(HALF) == EnumBlockHalf.TOP) {
            i |= 8;
        }

        return i;
    }

    protected BlockStateContainer createBlockState() {
        return this.isDouble() ? new BlockStateContainer(this, new IProperty[]{SEAMLESS, VARIANT}) : new BlockStateContainer(this, new IProperty[]{HALF, VARIANT});
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    public int damageDropped(IBlockState state) {
        return ((BlockCementSlab.EnumType) state.getValue(VARIANT)).getMetadata();
    }

    /**
     * Get the MapColor for this Block and the given BlockState
     */
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        return ((BlockCementSlab.EnumType) state.getValue(VARIANT)).getMapColor();
    }

    public static enum EnumType implements IStringSerializable {
        STONE(0, MapColor.STONE, "stone"),
        SAND(1, MapColor.SAND, "sandstone", "sand"),
        WOOD(2, MapColor.WOOD, "wood_old", "wood"),
        COBBLESTONE(3, MapColor.STONE, "cobblestone", "cobble"),
        BRICK(4, MapColor.RED, "brick"),
        SMOOTHBRICK(5, MapColor.STONE, "stone_brick", "smoothStoneBrick"),
        NETHERBRICK(6, MapColor.NETHERRACK, "nether_brick", "netherBrick"),
        QUARTZ(7, MapColor.QUARTZ, "quartz");

        private static final BlockCementSlab.EnumType[] META_LOOKUP = new BlockCementSlab.EnumType[values().length];
        private final int meta;
        private final MapColor mapColor;
        private final String name;
        private final String unlocalizedName;

        private EnumType(int p_i46381_3_, MapColor p_i46381_4_, String p_i46381_5_) {
            this(p_i46381_3_, p_i46381_4_, p_i46381_5_, p_i46381_5_);
        }

        private EnumType(int p_i46382_3_, MapColor p_i46382_4_, String p_i46382_5_, String p_i46382_6_) {
            this.meta = p_i46382_3_;
            this.mapColor = p_i46382_4_;
            this.name = p_i46382_5_;
            this.unlocalizedName = p_i46382_6_;
        }

        public int getMetadata() {
            return this.meta;
        }

        public MapColor getMapColor() {
            return this.mapColor;
        }

        public String toString() {
            return this.name;
        }

        public static BlockCementSlab.EnumType byMetadata(int meta) {
            if (meta < 0 || meta >= META_LOOKUP.length) {
                meta = 0;
            }

            return META_LOOKUP[meta];
        }

        public String getName() {
            return this.name;
        }

        public String getTranslationKey() {
            return this.unlocalizedName;
        }

        static {
            for (BlockCementSlab.EnumType blockstoneslab$enumtype : values()) {
                META_LOOKUP[blockstoneslab$enumtype.getMetadata()] = blockstoneslab$enumtype;
            }
        }
    }
}
