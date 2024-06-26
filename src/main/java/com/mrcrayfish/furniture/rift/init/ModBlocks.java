package com.mrcrayfish.furniture.rift.init;

import com.mrcrayfish.furniture.rift.Constants;
import com.mrcrayfish.furniture.rift.block.*;
import com.mrcrayfish.furniture.rift.mixin.BlockInvoker;
import com.mrcrayfish.furniture.rift.mixin.ItemInvoker;
import net.minecraft.block.Block;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import org.dimdev.rift.listener.BlockAdder;
import org.dimdev.rift.listener.ItemAdder;

/**
 * Author: MrCrayfish
 */
public class ModBlocks implements BlockAdder, ItemAdder
{
    public static final Block MODERN_TV = new BlockModernTV();
    public static final Block MODERN_TABLE = new BlockModernTable();
    public static final Block MODERN_CHAIR = new BlockModernChair();
    public static final Block WHITE_MODERN_COUCH = new BlockModernCouch(EnumDyeColor.WHITE);
    public static final Block ORANGE_MODERN_COUCH = new BlockModernCouch(EnumDyeColor.ORANGE);
    public static final Block MAGENTA_MODERN_COUCH = new BlockModernCouch(EnumDyeColor.MAGENTA);
    public static final Block LIGHT_BLUE_MODERN_COUCH = new BlockModernCouch(EnumDyeColor.LIGHT_BLUE);
    public static final Block YELLOW_MODERN_COUCH = new BlockModernCouch(EnumDyeColor.YELLOW);
    public static final Block LIME_MODERN_COUCH = new BlockModernCouch(EnumDyeColor.LIME);
    public static final Block PINK_MODERN_COUCH = new BlockModernCouch(EnumDyeColor.PINK);
    public static final Block GRAY_MODERN_COUCH = new BlockModernCouch(EnumDyeColor.GRAY);
    public static final Block LIGHT_GRAY_MODERN_COUCH = new BlockModernCouch(EnumDyeColor.LIGHT_GRAY);
    public static final Block CYAN_MODERN_COUCH = new BlockModernCouch(EnumDyeColor.CYAN);
    public static final Block PURPLE_MODERN_COUCH = new BlockModernCouch(EnumDyeColor.PURPLE);
    public static final Block BLUE_MODERN_COUCH = new BlockModernCouch(EnumDyeColor.BLUE);
    public static final Block BROWN_MODERN_COUCH = new BlockModernCouch(EnumDyeColor.BROWN);
    public static final Block GREEN_MODERN_COUCH = new BlockModernCouch(EnumDyeColor.GREEN);
    public static final Block RED_MODERN_COUCH = new BlockModernCouch(EnumDyeColor.RED);
    public static final Block BLACK_MODERN_COUCH = new BlockModernCouch(EnumDyeColor.BLACK);
    public static final Block DESK_OAK = new BlockDesk(EnumDyeColor.BROWN);
    public static final Block DESK_SPRUCE = new BlockDesk(EnumDyeColor.BROWN);
    public static final Block DESK_BIRCH = new BlockDesk(EnumDyeColor.BROWN);
    public static final Block DESK_JUNGLE = new BlockDesk(EnumDyeColor.BROWN);
    public static final Block DESK_ACACIA = new BlockDesk(EnumDyeColor.BROWN);
    public static final Block DESK_DARK_OAK = new BlockDesk(EnumDyeColor.BROWN);
    public static final Block DESK_STONE = new BlockDesk(EnumDyeColor.LIGHT_GRAY);
    public static final Block DESK_GRANITE = new BlockDesk(EnumDyeColor.LIGHT_GRAY);
    public static final Block DESK_DIORITE = new BlockDesk(EnumDyeColor.LIGHT_GRAY);
    public static final Block DESK_ANDESITE = new BlockDesk(EnumDyeColor.LIGHT_GRAY);
    /*public static final Block DESK_CABINET_OAK = new BlockDesk(EnumDyeColor.BROWN);
    public static final Block DESK_CABINET_SPRUCE = new BlockDesk(EnumDyeColor.BROWN);
    public static final Block DESK_CABINET_BIRCH = new BlockDesk(EnumDyeColor.BROWN);
    public static final Block DESK_CABINET_JUNGLE = new BlockDesk(EnumDyeColor.BROWN);
    public static final Block DESK_CABINET_ACACIA = new BlockDesk(EnumDyeColor.BROWN);
    public static final Block DESK_CABINET_DARK_OAK = new BlockDesk(EnumDyeColor.BROWN);
    public static final Block DESK_CABINET_STONE = new BlockDesk(EnumDyeColor.LIGHT_GRAY);
    public static final Block DESK_CABINET_GRANITE = new BlockDesk(EnumDyeColor.LIGHT_GRAY);
    public static final Block DESK_CABINET_DIORITE = new BlockDesk(EnumDyeColor.LIGHT_GRAY);
    public static final Block DESK_CABINET_ANDESITE = new BlockDesk(EnumDyeColor.LIGHT_GRAY);*/

    @Override
    public void registerBlocks()
    {
        registerBlock("modern_tv", MODERN_TV);
        registerBlock("modern_table", MODERN_TABLE);
        registerBlock("modern_chair", MODERN_CHAIR);
        registerBlock("white_modern_couch", WHITE_MODERN_COUCH);
        registerBlock("orange_modern_couch", ORANGE_MODERN_COUCH);
        registerBlock("magenta_modern_couch", MAGENTA_MODERN_COUCH);
        registerBlock("light_blue_modern_couch", LIGHT_BLUE_MODERN_COUCH);
        registerBlock("yellow_modern_couch", YELLOW_MODERN_COUCH);
        registerBlock("lime_modern_couch", LIME_MODERN_COUCH);
        registerBlock("pink_modern_couch", PINK_MODERN_COUCH);
        registerBlock("gray_modern_couch", GRAY_MODERN_COUCH);
        registerBlock("light_gray_modern_couch", LIGHT_GRAY_MODERN_COUCH);
        registerBlock("cyan_modern_couch", CYAN_MODERN_COUCH);
        registerBlock("purple_modern_couch", PURPLE_MODERN_COUCH);
        registerBlock("blue_modern_couch", BLUE_MODERN_COUCH);
        registerBlock("brown_modern_couch", BROWN_MODERN_COUCH);
        registerBlock("green_modern_couch", GREEN_MODERN_COUCH);
        registerBlock("red_modern_couch", RED_MODERN_COUCH);
        registerBlock("black_modern_couch", BLACK_MODERN_COUCH);
        registerBlock("oak_desk", DESK_OAK);
        registerBlock("spruce_desk", DESK_SPRUCE);
        registerBlock("birch_desk", DESK_BIRCH);
        registerBlock("jungle_desk", DESK_JUNGLE);
        registerBlock("acacia_desk", DESK_ACACIA);
        registerBlock("dark_oak_desk", DESK_DARK_OAK);
        registerBlock("stone_desk", DESK_STONE);
        registerBlock("granite_desk", DESK_GRANITE);
        registerBlock("diorite_desk", DESK_DIORITE);
        registerBlock("andesite_desk", DESK_ANDESITE);
        /*registerBlock("oak_desk_cabinet", DESK_CABINET_OAK);
        registerBlock("spruce_desk_cabinet", DESK_CABINET_SPRUCE);
        registerBlock("birch_desk_cabinet", DESK_CABINET_BIRCH);
        registerBlock("jungle_desk_cabinet", DESK_CABINET_JUNGLE);
        registerBlock("acacia_desk_cabinet", DESK_CABINET_ACACIA);
        registerBlock("dark_oak_desk_cabinet", DESK_CABINET_DARK_OAK);
        registerBlock("stone_desk_cabinet", DESK_CABINET_STONE);
        registerBlock("granite_desk_cabinet", DESK_CABINET_GRANITE);
        registerBlock("diorite_desk_cabinet", DESK_CABINET_DIORITE);
        registerBlock("andesite_desk_cabinet", DESK_CABINET_ANDESITE);*/
    }

    @Override
    public void registerItems()
    {
        ItemInvoker.register(MODERN_TV, ItemGroup.DECORATIONS);
        ItemInvoker.register(MODERN_TABLE, ItemGroup.DECORATIONS);
        ItemInvoker.register(MODERN_CHAIR, ItemGroup.DECORATIONS);
        ItemInvoker.register(WHITE_MODERN_COUCH, ItemGroup.DECORATIONS);
        ItemInvoker.register(ORANGE_MODERN_COUCH, ItemGroup.DECORATIONS);
        ItemInvoker.register(MAGENTA_MODERN_COUCH, ItemGroup.DECORATIONS);
        ItemInvoker.register(LIGHT_BLUE_MODERN_COUCH, ItemGroup.DECORATIONS);
        ItemInvoker.register(YELLOW_MODERN_COUCH, ItemGroup.DECORATIONS);
        ItemInvoker.register(LIME_MODERN_COUCH, ItemGroup.DECORATIONS);
        ItemInvoker.register(PINK_MODERN_COUCH, ItemGroup.DECORATIONS);
        ItemInvoker.register(GRAY_MODERN_COUCH, ItemGroup.DECORATIONS);
        ItemInvoker.register(LIGHT_GRAY_MODERN_COUCH, ItemGroup.DECORATIONS);
        ItemInvoker.register(CYAN_MODERN_COUCH, ItemGroup.DECORATIONS);
        ItemInvoker.register(PURPLE_MODERN_COUCH, ItemGroup.DECORATIONS);
        ItemInvoker.register(BLUE_MODERN_COUCH, ItemGroup.DECORATIONS);
        ItemInvoker.register(BROWN_MODERN_COUCH, ItemGroup.DECORATIONS);
        ItemInvoker.register(GREEN_MODERN_COUCH, ItemGroup.DECORATIONS);
        ItemInvoker.register(RED_MODERN_COUCH, ItemGroup.DECORATIONS);
        ItemInvoker.register(BLACK_MODERN_COUCH, ItemGroup.DECORATIONS);
        ItemInvoker.register(DESK_OAK, ItemGroup.DECORATIONS);
        ItemInvoker.register(DESK_SPRUCE, ItemGroup.DECORATIONS);
        ItemInvoker.register(DESK_BIRCH, ItemGroup.DECORATIONS);
        ItemInvoker.register(DESK_JUNGLE, ItemGroup.DECORATIONS);
        ItemInvoker.register(DESK_ACACIA, ItemGroup.DECORATIONS);
        ItemInvoker.register(DESK_DARK_OAK, ItemGroup.DECORATIONS);
        ItemInvoker.register(DESK_STONE, ItemGroup.DECORATIONS);
        ItemInvoker.register(DESK_GRANITE, ItemGroup.DECORATIONS);
        ItemInvoker.register(DESK_DIORITE, ItemGroup.DECORATIONS);
        ItemInvoker.register(DESK_ANDESITE, ItemGroup.DECORATIONS);
        /*ItemAccessor.register(DESK_CABINET_OAK, ItemGroup.DECORATIONS);
        ItemAccessor.register(DESK_CABINET_SPRUCE, ItemGroup.DECORATIONS);
        ItemAccessor.register(DESK_CABINET_BIRCH, ItemGroup.DECORATIONS);
        ItemAccessor.register(DESK_CABINET_JUNGLE, ItemGroup.DECORATIONS);
        ItemAccessor.register(DESK_CABINET_ACACIA, ItemGroup.DECORATIONS);
        ItemAccessor.register(DESK_CABINET_DARK_OAK, ItemGroup.DECORATIONS);
        ItemAccessor.register(DESK_CABINET_STONE, ItemGroup.DECORATIONS);
        ItemAccessor.register(DESK_CABINET_GRANITE, ItemGroup.DECORATIONS);
        ItemAccessor.register(DESK_CABINET_DIORITE, ItemGroup.DECORATIONS);
        ItemAccessor.register(DESK_CABINET_ANDESITE, ItemGroup.DECORATIONS);*/
    }

    private void registerBlock(String id, Block block)
    {
        BlockInvoker.register(new ResourceLocation(Constants.MOD_ID, id), block);
    }
}
