package com.mcwwindows.kikoz.init;

import com.mcwwindows.kikoz.MacawsWindows;
import com.mcwwindows.kikoz.objects.ArrowSill;
import com.mcwwindows.kikoz.objects.Blinds;
import com.mcwwindows.kikoz.objects.ConnectedWindow;
import com.mcwwindows.kikoz.objects.Curtain;
import com.mcwwindows.kikoz.objects.CurtainRod;
import com.mcwwindows.kikoz.objects.GothicWindow;
import com.mcwwindows.kikoz.objects.MosaicBlock;
import com.mcwwindows.kikoz.objects.OneWayGlass;
import com.mcwwindows.kikoz.objects.OneWayPane;
import com.mcwwindows.kikoz.objects.Parapet;
import com.mcwwindows.kikoz.objects.Shutter;
import com.mcwwindows.kikoz.objects.Window;
import com.mcwwindows.kikoz.objects.WindowBarred;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StainedGlassPaneBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsWindows.MOD_ID);

	public static final RegistryObject<Block> OAK_WINDOW = BLOCKS.register("oak_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> OAK_WINDOW2 = BLOCKS.register("oak_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> OAK_FOUR_WINDOW = BLOCKS.register("oak_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_OAK_LOG_WINDOW = BLOCKS.register("stripped_oak_log_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_OAK_LOG_WINDOW2 = BLOCKS.register("stripped_oak_log_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_OAK_LOG_FOUR_WINDOW = BLOCKS.register("stripped_oak_log_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> OAK_PLANK_WINDOW = BLOCKS.register("oak_plank_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> OAK_PLANK_WINDOW2 = BLOCKS.register("oak_plank_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> OAK_PLANK_FOUR_WINDOW = BLOCKS.register("oak_plank_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));

	public static final RegistryObject<Block> SPRUCE_WINDOW = BLOCKS.register("spruce_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> SPRUCE_WINDOW2 = BLOCKS.register("spruce_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> SPRUCE_FOUR_WINDOW = BLOCKS.register("spruce_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_WINDOW = BLOCKS.register("stripped_spruce_log_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_WINDOW2 = BLOCKS.register("stripped_spruce_log_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_FOUR_WINDOW = BLOCKS.register("stripped_spruce_log_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> SPRUCE_PLANK_WINDOW = BLOCKS.register("spruce_plank_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> SPRUCE_PLANK_WINDOW2 = BLOCKS.register("spruce_plank_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> SPRUCE_PLANK_FOUR_WINDOW = BLOCKS.register("spruce_plank_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));

	public static final RegistryObject<Block> BIRCH_WINDOW = BLOCKS.register("birch_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> BIRCH_WINDOW2 = BLOCKS.register("birch_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> BIRCH_FOUR_WINDOW = BLOCKS.register("birch_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_WINDOW = BLOCKS.register("stripped_birch_log_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_WINDOW2 = BLOCKS.register("stripped_birch_log_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_FOUR_WINDOW = BLOCKS.register("stripped_birch_log_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> BIRCH_PLANK_WINDOW = BLOCKS.register("birch_plank_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> BIRCH_PLANK_WINDOW2 = BLOCKS.register("birch_plank_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> BIRCH_PLANK_FOUR_WINDOW = BLOCKS.register("birch_plank_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));

	public static final RegistryObject<Block> JUNGLE_WINDOW = BLOCKS.register("jungle_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> JUNGLE_WINDOW2 = BLOCKS.register("jungle_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> JUNGLE_FOUR_WINDOW = BLOCKS.register("jungle_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_WINDOW = BLOCKS.register("stripped_jungle_log_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_WINDOW2 = BLOCKS.register("stripped_jungle_log_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_FOUR_WINDOW = BLOCKS.register("stripped_jungle_log_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> JUNGLE_PLANK_WINDOW = BLOCKS.register("jungle_plank_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> JUNGLE_PLANK_WINDOW2 = BLOCKS.register("jungle_plank_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> JUNGLE_PLANK_FOUR_WINDOW = BLOCKS.register("jungle_plank_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));

	public static final RegistryObject<Block> ACACIA_WINDOW = BLOCKS.register("acacia_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> ACACIA_WINDOW2 = BLOCKS.register("acacia_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> ACACIA_FOUR_WINDOW = BLOCKS.register("acacia_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_WINDOW = BLOCKS.register("stripped_acacia_log_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_WINDOW2 = BLOCKS.register("stripped_acacia_log_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_FOUR_WINDOW = BLOCKS.register("stripped_acacia_log_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> ACACIA_PLANK_WINDOW = BLOCKS.register("acacia_plank_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> ACACIA_PLANK_WINDOW2 = BLOCKS.register("acacia_plank_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> ACACIA_PLANK_FOUR_WINDOW = BLOCKS.register("acacia_plank_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));

	public static final RegistryObject<Block> DARK_OAK_WINDOW = BLOCKS.register("dark_oak_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> DARK_OAK_WINDOW2 = BLOCKS.register("dark_oak_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> DARK_OAK_FOUR_WINDOW = BLOCKS.register("dark_oak_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_WINDOW = BLOCKS.register("stripped_dark_oak_log_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_WINDOW2 = BLOCKS.register("stripped_dark_oak_log_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_FOUR_WINDOW = BLOCKS.register("stripped_dark_oak_log_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> DARK_OAK_PLANK_WINDOW = BLOCKS.register("dark_oak_plank_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> DARK_OAK_PLANK_WINDOW2 = BLOCKS.register("dark_oak_plank_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> DARK_OAK_PLANK_FOUR_WINDOW = BLOCKS.register("dark_oak_plank_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));

	public static final RegistryObject<Block> MANGROVE_WINDOW = BLOCKS.register("mangrove_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> MANGROVE_WINDOW2 = BLOCKS.register("mangrove_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> MANGROVE_FOUR_WINDOW = BLOCKS.register("mangrove_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_WINDOW = BLOCKS.register("stripped_mangrove_log_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_WINDOW2 = BLOCKS.register("stripped_mangrove_log_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_FOUR_WINDOW = BLOCKS.register("stripped_mangrove_log_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> MANGROVE_PLANK_WINDOW = BLOCKS.register("mangrove_plank_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> MANGROVE_PLANK_WINDOW2 = BLOCKS.register("mangrove_plank_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> MANGROVE_PLANK_FOUR_WINDOW = BLOCKS.register("mangrove_plank_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));

	public static final RegistryObject<Block> CRIMSON_STEM_WINDOW = BLOCKS.register("crimson_stem_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> CRIMSON_STEM_WINDOW2 = BLOCKS.register("crimson_stem_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> CRIMSON_STEM_FOUR_WINDOW = BLOCKS.register("crimson_stem_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_CRIMSON_STEM_WINDOW = BLOCKS.register("stripped_crimson_stem_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_CRIMSON_STEM_WINDOW2 = BLOCKS.register("stripped_crimson_stem_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_CRIMSON_STEM_FOUR_WINDOW = BLOCKS.register("stripped_crimson_stem_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> CRIMSON_PLANKS_WINDOW = BLOCKS.register("crimson_planks_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> CRIMSON_PLANKS_WINDOW2 = BLOCKS.register("crimson_planks_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> CRIMSON_PLANKS_FOUR_WINDOW = BLOCKS.register("crimson_planks_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));

	public static final RegistryObject<Block> WARPED_STEM_WINDOW = BLOCKS.register("warped_stem_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> WARPED_STEM_WINDOW2 = BLOCKS.register("warped_stem_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> WARPED_STEM_FOUR_WINDOW = BLOCKS.register("warped_stem_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_WARPED_STEM_WINDOW = BLOCKS.register("stripped_warped_stem_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_WARPED_STEM_WINDOW2 = BLOCKS.register("stripped_warped_stem_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_WARPED_STEM_FOUR_WINDOW = BLOCKS.register("stripped_warped_stem_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> WARPED_PLANKS_WINDOW = BLOCKS.register("warped_planks_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> WARPED_PLANKS_WINDOW2 = BLOCKS.register("warped_planks_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> WARPED_PLANKS_FOUR_WINDOW = BLOCKS.register("warped_planks_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	
	public static final RegistryObject<Block> ANDESITE_WINDOW = BLOCKS.register("andesite_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> ANDESITE_WINDOW2 = BLOCKS.register("andesite_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> ANDESITE_FOUR_WINDOW = BLOCKS.register("andesite_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> DIORITE_WINDOW = BLOCKS.register("diorite_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DIORITE_WINDOW2 = BLOCKS.register("diorite_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DIORITE_FOUR_WINDOW = BLOCKS.register("diorite_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> GRANITE_WINDOW = BLOCKS.register("granite_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> GRANITE_WINDOW2 = BLOCKS.register("granite_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> GRANITE_FOUR_WINDOW = BLOCKS.register("granite_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));

	public static final RegistryObject<Block> STONE_WINDOW = BLOCKS.register("stone_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> STONE_WINDOW2 = BLOCKS.register("stone_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> STONE_FOUR_WINDOW = BLOCKS.register("stone_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> BLACKSTONE_WINDOW = BLOCKS.register("blackstone_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BLACKSTONE_WINDOW2 = BLOCKS.register("blackstone_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BLACKSTONE_FOUR_WINDOW = BLOCKS.register("blackstone_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));

	public static final RegistryObject<Block> PRISMARINE_WINDOW = BLOCKS.register("prismarine_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> PRISMARINE_WINDOW2 = BLOCKS.register("prismarine_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> PRISMARINE_FOUR_WINDOW = BLOCKS.register("prismarine_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> DARK_PRISMARINE_WINDOW = BLOCKS.register("dark_prismarine_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DARK_PRISMARINE_WINDOW2 = BLOCKS.register("dark_prismarine_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DARK_PRISMARINE_FOUR_WINDOW = BLOCKS.register("dark_prismarine_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));

	public static final RegistryObject<Block> OAK_LOG_PARAPET = BLOCKS.register("oak_log_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> SPRUCE_LOG_PARAPET = BLOCKS.register("spruce_log_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> BIRCH_LOG_PARAPET = BLOCKS.register("birch_log_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> JUNGLE_LOG_PARAPET = BLOCKS.register("jungle_log_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> ACACIA_LOG_PARAPET = BLOCKS.register("acacia_log_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));;
	public static final RegistryObject<Block> DARK_OAK_LOG_PARAPET = BLOCKS.register("dark_oak_log_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> CRIMSON_STEM_PARAPET = BLOCKS.register("crimson_stem_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> WARPED_STEM_PARAPET = BLOCKS.register("warped_stem_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> MANGROVE_LOG_PARAPET = BLOCKS.register("mangrove_log_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> OAK_PLANK_PARAPET = BLOCKS.register("oak_plank_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> SPRUCE_PLANK_PARAPET = BLOCKS.register("spruce_plank_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> BIRCH_PLANK_PARAPET = BLOCKS.register("birch_plank_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> JUNGLE_PLANK_PARAPET = BLOCKS.register("jungle_plank_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> ACACIA_PLANK_PARAPET = BLOCKS.register("acacia_plank_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> DARK_OAK_PLANK_PARAPET = BLOCKS.register("dark_oak_plank_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> CRIMSON_PLANK_PARAPET = BLOCKS.register("crimson_plank_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> WARPED_PLANK_PARAPET = BLOCKS.register("warped_plank_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> MANGROVE_PLANK_PARAPET = BLOCKS.register("mangrove_plank_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> ANDESITE_PARAPET = BLOCKS.register("andesite_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> DIORITE_PARAPET = BLOCKS.register("diorite_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> GRANITE_PARAPET = BLOCKS.register("granite_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> BLACKSTONE_PARAPET = BLOCKS.register("blackstone_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> PRISMARINE_PARAPET = BLOCKS.register("prismarine_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> DARK_PRISMARINE_PARAPET = BLOCKS.register("dark_prismarine_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.2f, 1.0f)));		
	
	public static final RegistryObject<Block> STONE_BRICK_GOTHIC = BLOCKS.register("stone_brick_gothic", () -> new GothicWindow(Block.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> END_BRICK_GOTHIC = BLOCKS.register("end_brick_gothic", () -> new GothicWindow(Block.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> NETHER_BRICK_GOTHIC = BLOCKS.register("nether_brick_gothic", () -> new GothicWindow(Block.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> PRISMARINE_BRICK_GOTHIC = BLOCKS.register("prismarine_brick_gothic", () -> new GothicWindow(Block.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> MUD_BRICK_GOTHIC = BLOCKS.register("mud_brick_gothic", () -> new GothicWindow(Block.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> DARK_PRISMARINE_BRICK_GOTHIC = BLOCKS.register("dark_prismarine_brick_gothic", () -> new GothicWindow(Block.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> BLACKSTONE_BRICK_GOTHIC = BLOCKS.register("blackstone_brick_gothic", () -> new GothicWindow(Block.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.5f, 2.0f)));
	
	public static final RegistryObject<Block> STONE_BRICK_ARROW_SLIT = BLOCKS.register("stone_brick_arrow_slit", () -> new ArrowSill(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.5f, 2.0f)));	
	public static final RegistryObject<Block> COBBLESTONE_ARROW_SLIT = BLOCKS.register("cobblestone_arrow_slit", () -> new ArrowSill(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.5f, 2.0f)));	
	public static final RegistryObject<Block> NETHER_BRICK_ARROW_SLIT = BLOCKS.register("nether_brick_arrow_slit", () -> new ArrowSill(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.5f, 2.0f)));	
	public static final RegistryObject<Block> ENDER_BRICK_ARROW_SLIT = BLOCKS.register("ender_brick_arrow_slit", () -> new ArrowSill(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.5f, 2.0f)));	
	public static final RegistryObject<Block> MUD_BRICK_ARROW_SLIT = BLOCKS.register("mud_brick_arrow_slit", () -> new ArrowSill(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.5f, 2.0f)));	
	public static final RegistryObject<Block> BLACKSTONE_BRICK_ARROW_SLIT = BLOCKS.register("blackstone_brick_arrow_slit", () -> new ArrowSill(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.5f, 2.0f)));	
	public static final RegistryObject<Block> PRISMARINE_BRICK_ARROW_SLIT = BLOCKS.register("prismarine_brick_arrow_slit", () -> new ArrowSill(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.5f, 2.0f)));	
	public static final RegistryObject<Block> DARK_PRISMARINE_BRICK_ARROW_SLIT = BLOCKS.register("dark_prismarine_brick_arrow_slit", () -> new ArrowSill(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.5f, 2.0f)));	

	public static final RegistryObject<Block> OAK_BLINDS = BLOCKS.register("oak_blinds", () -> new Blinds(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.3f, 1.0f)));	
	public static final RegistryObject<Block> SPRUCE_BLINDS = BLOCKS.register("spruce_blinds", () -> new Blinds(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.3f, 1.0f)));	
	public static final RegistryObject<Block> BIRCH_BLINDS = BLOCKS.register("birch_blinds", () -> new Blinds(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.3f, 1.0f)));	
	public static final RegistryObject<Block> JUNGLE_BLINDS = BLOCKS.register("jungle_blinds", () -> new Blinds(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.3f, 1.0f)));	
	public static final RegistryObject<Block> ACACIA_BLINDS = BLOCKS.register("acacia_blinds", () -> new Blinds(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.3f, 1.0f)));	
	public static final RegistryObject<Block> DARK_OAK_BLINDS = BLOCKS.register("dark_oak_blinds", () -> new Blinds(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.3f, 1.0f)));	
	public static final RegistryObject<Block> CRIMSON_BLINDS = BLOCKS.register("crimson_blinds", () -> new Blinds(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD).strength(0.3f, 1.0f)));	
	public static final RegistryObject<Block> WARPED_BLINDS = BLOCKS.register("warped_blinds", () -> new Blinds(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD).strength(0.3f, 1.0f)));	
	public static final RegistryObject<Block> MANGROVE_BLINDS = BLOCKS.register("mangrove_blinds", () -> new Blinds(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.3f, 1.0f)));	
	
	public static final RegistryObject<Block> WHITE_MOSAIC_GLASS = BLOCKS.register("white_mosaic_glass", () -> new MosaicBlock(DyeColor.WHITE, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).sound(SoundType.GLASS).strength(0.3f,0.3f).noOcclusion()));
	public static final RegistryObject<Block> ORANGE_MOSAIC_GLASS = BLOCKS.register("orange_mosaic_glass", () -> new MosaicBlock(DyeColor.ORANGE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.GLASS).strength(0.3f,0.3f).noOcclusion()));
	public static final RegistryObject<Block> MAGENTA_MOSAIC_GLASS = BLOCKS.register("magenta_mosaic_glass", () -> new MosaicBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).sound(SoundType.GLASS).strength(0.3f,0.3f).noOcclusion()));
	public static final RegistryObject<Block> LIGHT_BLUE_MOSAIC_GLASS = BLOCKS.register("light_blue_mosaic_glass", () -> new MosaicBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).sound(SoundType.GLASS).strength(0.3f,0.3f).noOcclusion()));
	public static final RegistryObject<Block> YELLOW_MOSAIC_GLASS = BLOCKS.register("yellow_mosaic_glass", () -> new MosaicBlock(DyeColor.YELLOW, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).sound(SoundType.GLASS).strength(0.3f,0.3f).noOcclusion()));
	public static final RegistryObject<Block> LIME_MOSAIC_GLASS = BLOCKS.register("lime_mosaic_glass", () -> new MosaicBlock(DyeColor.LIME, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.GLASS).strength(0.3f,0.3f).noOcclusion()));
	public static final RegistryObject<Block> PINK_MOSAIC_GLASS = BLOCKS.register("pink_mosaic_glass", () -> new MosaicBlock(DyeColor.PINK, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.CHERRY_WOOD).sound(SoundType.GLASS).strength(0.3f,0.3f).noOcclusion()));
	public static final RegistryObject<Block> GRAY_MOSAIC_GLASS = BLOCKS.register("gray_mosaic_glass", () -> new MosaicBlock(DyeColor.GRAY, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.GLASS).strength(0.3f,0.3f).noOcclusion()));
	public static final RegistryObject<Block> LIGHT_GRAY_MOSAIC_GLASS = BLOCKS.register("light_gray_mosaic_glass", () -> new MosaicBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.GLASS).strength(0.3f,0.3f).noOcclusion()));
	public static final RegistryObject<Block> CYAN_MOSAIC_GLASS = BLOCKS.register("cyan_mosaic_glass", () -> new MosaicBlock(DyeColor.CYAN, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).sound(SoundType.GLASS).strength(0.3f,0.3f).noOcclusion()));
	public static final RegistryObject<Block> PURPLE_MOSAIC_GLASS = BLOCKS.register("purple_mosaic_glass", () -> new MosaicBlock(DyeColor.PURPLE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).sound(SoundType.GLASS).strength(0.3f,0.3f).noOcclusion()));
	public static final RegistryObject<Block> BLUE_MOSAIC_GLASS = BLOCKS.register("blue_mosaic_glass", () -> new MosaicBlock(DyeColor.BLUE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).sound(SoundType.GLASS).strength(0.3f,0.3f).noOcclusion()));
	public static final RegistryObject<Block> BROWN_MOSAIC_GLASS = BLOCKS.register("brown_mosaic_glass", () -> new MosaicBlock(DyeColor.BROWN, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).sound(SoundType.GLASS).strength(0.3f,0.3f).noOcclusion()));
	public static final RegistryObject<Block> GREEN_MOSAIC_GLASS = BLOCKS.register("green_mosaic_glass", () -> new MosaicBlock(DyeColor.GREEN, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).sound(SoundType.GLASS).strength(0.3f,0.3f).noOcclusion()));
	public static final RegistryObject<Block> RED_MOSAIC_GLASS = BLOCKS.register("red_mosaic_glass", () -> new MosaicBlock(DyeColor.RED, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).sound(SoundType.GLASS).strength(0.3f,0.3f).noOcclusion()));
	public static final RegistryObject<Block> BLACK_MOSAIC_GLASS = BLOCKS.register("black_mosaic_glass", () -> new MosaicBlock(DyeColor.BLACK, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).sound(SoundType.GLASS).strength(0.3f,0.3f).noOcclusion()));

	public static final RegistryObject<Block> WHITE_MOSAIC_GLASS_PANE = BLOCKS.register("white_mosaic_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.WHITE, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).strength(0.3F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> ORANGE_MOSAIC_GLASS_PANE = BLOCKS.register("orange_mosaic_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.ORANGE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(0.3F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> MAGENTA_MOSAIC_GLASS_PANE = BLOCKS.register("magenta_mosaic_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).strength(0.3F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> LIGHT_BLUE_MOSAIC_GLASS_PANE = BLOCKS.register("light_blue_mosaic_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).strength(0.3F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> YELLOW_MOSAIC_GLASS_PANE = BLOCKS.register("yellow_mosaic_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.YELLOW, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(0.3F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> LIME_MOSAIC_GLASS_PANE = BLOCKS.register("lime_mosaic_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.LIME, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).strength(0.3F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> PINK_MOSAIC_GLASS_PANE = BLOCKS.register("pink_mosaic_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.PINK, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.CHERRY_WOOD).strength(0.3F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> GRAY_MOSAIC_GLASS_PANE = BLOCKS.register("gray_mosaic_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.GRAY, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).strength(0.3F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> LIGHT_GRAY_MOSAIC_GLASS_PANE = BLOCKS.register("light_gray_mosaic_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(0.3F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> CYAN_MOSAIC_GLASS_PANE = BLOCKS.register("cyan_mosaic_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.CYAN, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(0.3F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> PURPLE_MOSAIC_GLASS_PANE = BLOCKS.register("purple_mosaic_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.PURPLE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(0.3F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> BLUE_MOSAIC_GLASS_PANE = BLOCKS.register("blue_mosaic_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.BLUE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(0.3F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> BROWN_MOSAIC_GLASS_PANE = BLOCKS.register("brown_mosaic_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.BROWN, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(0.3F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> GREEN_MOSAIC_GLASS_PANE = BLOCKS.register("green_mosaic_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.GREEN, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(0.3F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> RED_MOSAIC_GLASS_PANE = BLOCKS.register("red_mosaic_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.RED, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(0.3F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> BLACK_MOSAIC_GLASS_PANE = BLOCKS.register("black_mosaic_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.BLACK, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(0.3F).sound(SoundType.GLASS)));

	public static final RegistryObject<Block> OAK_SHUTTER = BLOCKS.register("oak_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> SPRUCE_SHUTTER = BLOCKS.register("spruce_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> BIRCH_SHUTTER = BLOCKS.register("birch_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> JUNGLE_SHUTTER = BLOCKS.register("jungle_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> ACACIA_SHUTTER = BLOCKS.register("acacia_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> DARK_OAK_SHUTTER = BLOCKS.register("dark_oak_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> CRIMSON_SHUTTER = BLOCKS.register("crimson_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD).strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> WARPED_SHUTTER = BLOCKS.register("warped_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD).strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> MANGROVE_SHUTTER = BLOCKS.register("mangrove_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> BAMBOO_SHUTTER = BLOCKS.register("bamboo_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> IRON_SHUTTER = BLOCKS.register("iron_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.METAL).strength(1.5f, 2.0f).requiresCorrectToolForDrops()));

	public static final RegistryObject<Block> OAK_LOUVERED_SHUTTER = BLOCKS.register("oak_louvered_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> SPRUCE_LOUVERED_SHUTTER = BLOCKS.register("spruce_louvered_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> BIRCH_LOUVERED_SHUTTER = BLOCKS.register("birch_louvered_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> JUNGLE_LOUVERED_SHUTTER = BLOCKS.register("jungle_louvered_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> ACACIA_LOUVERED_SHUTTER = BLOCKS.register("acacia_louvered_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> DARK_OAK_LOUVERED_SHUTTER = BLOCKS.register("dark_oak_louvered_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> CRIMSON_LOUVERED_SHUTTER = BLOCKS.register("crimson_louvered_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD).strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> WARPED_LOUVERED_SHUTTER = BLOCKS.register("warped_louvered_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD).strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> MANGROVE_LOUVERED_SHUTTER = BLOCKS.register("mangrove_louvered_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.5f, 2.0f)));

	public static final RegistryObject<Block> DIORITE_LOUVERED_SHUTTER = BLOCKS.register("diorite_louvered_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> ANDESITE_LOUVERED_SHUTTER = BLOCKS.register("andesite_louvered_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> GRANITE_LOUVERED_SHUTTER = BLOCKS.register("granite_louvered_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.5f, 2.0f)));

	public static final RegistryObject<Block> WHITE_CURTAIN = BLOCKS.register("white_curtain", () -> new Curtain(Block.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY).noOcclusion().instabreak()));
	public static final RegistryObject<Block> ORANGE_CURTAIN = BLOCKS.register("orange_curtain", () -> new Curtain(Block.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY).noOcclusion().instabreak()));
	public static final RegistryObject<Block> MAGENTA_CURTAIN = BLOCKS.register("magenta_curtain", () -> new Curtain(Block.Properties.of().mapColor(MapColor.COLOR_MAGENTA).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY).noOcclusion().instabreak()));
	public static final RegistryObject<Block> LIGHT_BLUE_CURTAIN = BLOCKS.register("light_blue_curtain", () -> new Curtain(Block.Properties.of().mapColor(MapColor.COLOR_BLUE).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY).noOcclusion().instabreak()));
	public static final RegistryObject<Block> YELLOW_CURTAIN = BLOCKS.register("yellow_curtain", () -> new Curtain(Block.Properties.of().mapColor(MapColor.COLOR_YELLOW).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY).noOcclusion().instabreak()));
	public static final RegistryObject<Block> LIME_CURTAIN = BLOCKS.register("lime_curtain", () -> new Curtain(Block.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY).noOcclusion().instabreak()));
	public static final RegistryObject<Block> PINK_CURTAIN = BLOCKS.register("pink_curtain", () -> new Curtain(Block.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY).noOcclusion().instabreak()));
	public static final RegistryObject<Block> GRAY_CURTAIN = BLOCKS.register("gray_curtain", () -> new Curtain(Block.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY).noOcclusion().instabreak()));
	public static final RegistryObject<Block> LIGHT_GRAY_CURTAIN = BLOCKS.register("light_gray_curtain", () -> new Curtain(Block.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY).noOcclusion().instabreak()));
	public static final RegistryObject<Block> CYAN_CURTAIN = BLOCKS.register("cyan_curtain", () -> new Curtain(Block.Properties.of().mapColor(MapColor.COLOR_CYAN).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY).noOcclusion().instabreak()));
	public static final RegistryObject<Block> PURPLE_CURTAIN = BLOCKS.register("purple_curtain", () -> new Curtain(Block.Properties.of().mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY).noOcclusion().instabreak()));
	public static final RegistryObject<Block> BLUE_CURTAIN = BLOCKS.register("blue_curtain", () -> new Curtain(Block.Properties.of().mapColor(MapColor.COLOR_BLUE).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY).noOcclusion().instabreak()));
	public static final RegistryObject<Block> BROWN_CURTAIN = BLOCKS.register("brown_curtain", () -> new Curtain(Block.Properties.of().mapColor(MapColor.COLOR_BROWN).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY).noOcclusion().instabreak()));
	public static final RegistryObject<Block> GREEN_CURTAIN = BLOCKS.register("green_curtain", () -> new Curtain(Block.Properties.of().mapColor(MapColor.COLOR_GREEN).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY).noOcclusion().instabreak()));
	public static final RegistryObject<Block> RED_CURTAIN = BLOCKS.register("red_curtain", () -> new Curtain(Block.Properties.of().mapColor(MapColor.COLOR_RED).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY).noOcclusion().instabreak()));
	public static final RegistryObject<Block> BLACK_CURTAIN = BLOCKS.register("black_curtain", () -> new Curtain(Block.Properties.of().mapColor(MapColor.COLOR_BLACK).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY).noOcclusion().instabreak()));

	//2.2.0 Update
	
	public static final RegistryObject<Block> OAK_PANE_WINDOW = BLOCKS.register("oak_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_OAK_PANE_WINDOW = BLOCKS.register("stripped_oak_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> OAK_PLANK_PANE_WINDOW = BLOCKS.register("oak_plank_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));

	public static final RegistryObject<Block> BIRCH_PANE_WINDOW = BLOCKS.register("birch_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_BIRCH_PANE_WINDOW = BLOCKS.register("stripped_birch_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> BIRCH_PLANK_PANE_WINDOW = BLOCKS.register("birch_plank_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));

	public static final RegistryObject<Block> SPRUCE_PANE_WINDOW = BLOCKS.register("spruce_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_SPRUCE_PANE_WINDOW = BLOCKS.register("stripped_spruce_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> SPRUCE_PLANK_PANE_WINDOW = BLOCKS.register("spruce_plank_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));

	public static final RegistryObject<Block> JUNGLE_PANE_WINDOW = BLOCKS.register("jungle_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_JUNGLE_PANE_WINDOW = BLOCKS.register("stripped_jungle_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> JUNGLE_PLANK_PANE_WINDOW = BLOCKS.register("jungle_plank_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));

	public static final RegistryObject<Block> ACACIA_PANE_WINDOW = BLOCKS.register("acacia_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_ACACIA_PANE_WINDOW = BLOCKS.register("stripped_acacia_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> ACACIA_PLANK_PANE_WINDOW = BLOCKS.register("acacia_plank_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));

	public static final RegistryObject<Block> DARK_OAK_PANE_WINDOW = BLOCKS.register("dark_oak_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_PANE_WINDOW = BLOCKS.register("stripped_dark_oak_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> DARK_OAK_PLANK_PANE_WINDOW = BLOCKS.register("dark_oak_plank_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));

	public static final RegistryObject<Block> CRIMSON_PANE_WINDOW = BLOCKS.register("crimson_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_CRIMSON_PANE_WINDOW = BLOCKS.register("stripped_crimson_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> CRIMSON_PLANK_PANE_WINDOW = BLOCKS.register("crimson_plank_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));

	public static final RegistryObject<Block> WARPED_PANE_WINDOW = BLOCKS.register("warped_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_WARPED_PANE_WINDOW = BLOCKS.register("stripped_warped_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> WARPED_PLANK_PANE_WINDOW = BLOCKS.register("warped_plank_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD).strength(0.6f, 1.2f)));

	public static final RegistryObject<Block> MANGROVE_PANE_WINDOW = BLOCKS.register("mangrove_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_MANGROVE_PANE_WINDOW = BLOCKS.register("stripped_mangrove_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> MANGROVE_PLANK_PANE_WINDOW = BLOCKS.register("mangrove_plank_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.6f, 1.2f)));

	public static final RegistryObject<Block> ANDESITE_PANE_WINDOW = BLOCKS.register("andesite_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIORITE_PANE_WINDOW = BLOCKS.register("diorite_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRANITE_PANE_WINDOW = BLOCKS.register("granite_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STONE_PANE_WINDOW = BLOCKS.register("stone_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACKSTONE_PANE_WINDOW = BLOCKS.register("blackstone_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PRISMARINE_PANE_WINDOW = BLOCKS.register("prismarine_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DARK_PRISMARINE_PANE_WINDOW = BLOCKS.register("dark_prismarine_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));

    // 1.20 cherry
    
	public static final RegistryObject<Block> CHERRY_WINDOW = BLOCKS.register("cherry_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.CHERRY_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> CHERRY_WINDOW2 = BLOCKS.register("cherry_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.CHERRY_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> CHERRY_FOUR_WINDOW = BLOCKS.register("cherry_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.CHERRY_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_WINDOW = BLOCKS.register("stripped_cherry_log_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.CHERRY_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_WINDOW2 = BLOCKS.register("stripped_cherry_log_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.CHERRY_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_FOUR_WINDOW = BLOCKS.register("stripped_cherry_log_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.CHERRY_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> CHERRY_PLANK_WINDOW = BLOCKS.register("cherry_plank_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.CHERRY_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> CHERRY_PLANK_WINDOW2 = BLOCKS.register("cherry_plank_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.CHERRY_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> CHERRY_PLANK_FOUR_WINDOW = BLOCKS.register("cherry_plank_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.CHERRY_WOOD).strength(0.6f, 1.2f)));

	public static final RegistryObject<Block> CHERRY_LOG_PARAPET = BLOCKS.register("cherry_log_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.CHERRY_WOOD).strength(0.2f, 1.0f)));
	public static final RegistryObject<Block> CHERRY_PLANK_PARAPET = BLOCKS.register("cherry_plank_parapet", () -> new Parapet(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.CHERRY_WOOD).strength(0.2f, 1.0f)));

	public static final RegistryObject<Block> CHERRY_BLINDS = BLOCKS.register("cherry_blinds", () -> new Blinds(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.CHERRY_WOOD).strength(0.3f, 1.0f)));	

	public static final RegistryObject<Block> CHERRY_SHUTTER = BLOCKS.register("cherry_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.CHERRY_WOOD).strength(0.5f, 2.0f)));
	public static final RegistryObject<Block> CHERRY_LOUVERED_SHUTTER = BLOCKS.register("cherry_louvered_shutter", () -> new Shutter(Block.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.CHERRY_WOOD).strength(0.5f, 2.0f)));

	public static final RegistryObject<Block> CHERRY_PANE_WINDOW = BLOCKS.register("cherry_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.CHERRY_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> STRIPPED_CHERRY_PANE_WINDOW = BLOCKS.register("stripped_cherry_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.CHERRY_WOOD).strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> CHERRY_PLANK_PANE_WINDOW = BLOCKS.register("cherry_plank_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.CHERRY_WOOD).strength(0.6f, 1.2f)));

	// 2.2.1 Update
	
	public static final RegistryObject<Block> ONE_WAY_GLASS = BLOCKS.register("one_way_glass", () -> new OneWayGlass(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).sound(SoundType.GLASS).noOcclusion().strength(0.6f, 1.2f)));
	public static final RegistryObject<Block> ONE_WAY_GLASS_PANE = BLOCKS.register("one_way_glass_pane", () -> new OneWayPane(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).sound(SoundType.GLASS).noOcclusion().strength(0.6f, 1.2f)));

	// 2.3.0 Update
	
	public static final RegistryObject<Block> DEEPSLATE_WINDOW = BLOCKS.register("deepslate_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).sound(SoundType.DEEPSLATE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DEEPSLATE_WINDOW2 = BLOCKS.register("deepslate_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).sound(SoundType.DEEPSLATE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DEEPSLATE_FOUR_WINDOW = BLOCKS.register("deepslate_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).sound(SoundType.DEEPSLATE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DEEPSLATE_PANE_WINDOW = BLOCKS.register("deepslate_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).sound(SoundType.DEEPSLATE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));

	public static final RegistryObject<Block> SANDSTONE_WINDOW = BLOCKS.register("sandstone_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> SANDSTONE_WINDOW2 = BLOCKS.register("sandstone_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> SANDSTONE_FOUR_WINDOW = BLOCKS.register("sandstone_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> SANDSTONE_PANE_WINDOW = BLOCKS.register("sandstone_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));

	public static final RegistryObject<Block> RED_SANDSTONE_WINDOW = BLOCKS.register("red_sandstone_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RED_SANDSTONE_WINDOW2 = BLOCKS.register("red_sandstone_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RED_SANDSTONE_FOUR_WINDOW = BLOCKS.register("red_sandstone_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RED_SANDSTONE_PANE_WINDOW = BLOCKS.register("red_sandstone_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));

	public static final RegistryObject<Block> BRICKS_WINDOW = BLOCKS.register("bricks_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BRICKS_WINDOW2 = BLOCKS.register("bricks_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BRICKS_FOUR_WINDOW = BLOCKS.register("bricks_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BRICKS_PANE_WINDOW = BLOCKS.register("bricks_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> QUARTZ_WINDOW = BLOCKS.register("quartz_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> QUARTZ_WINDOW2 = BLOCKS.register("quartz_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> QUARTZ_FOUR_WINDOW = BLOCKS.register("quartz_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> QUARTZ_PANE_WINDOW = BLOCKS.register("quartz_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).sound(SoundType.STONE).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));

	public static final RegistryObject<Block> METAL_WINDOW = BLOCKS.register("metal_window", () -> new ConnectedWindow(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).sound(SoundType.METAL).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> METAL_WINDOW2 = BLOCKS.register("metal_window2", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).sound(SoundType.METAL).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> METAL_FOUR_WINDOW = BLOCKS.register("metal_four_window", () -> new WindowBarred(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).sound(SoundType.METAL).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> METAL_PANE_WINDOW = BLOCKS.register("metal_pane_window", () -> new Window(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).sound(SoundType.METAL).strength(0.6f, 1.2f).requiresCorrectToolForDrops()));

	public static final RegistryObject<Block> OAK_CURTAIN_ROD = BLOCKS.register("oak_curtain_rod", () -> new CurtainRod(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.3f, 0.7f)));
	public static final RegistryObject<Block> SPRUCE_CURTAIN_ROD = BLOCKS.register("spruce_curtain_rod", () -> new CurtainRod(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.3f, 0.7f)));
	public static final RegistryObject<Block> BIRCH_CURTAIN_ROD = BLOCKS.register("birch_curtain_rod", () -> new CurtainRod(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.3f, 0.7f)));
	public static final RegistryObject<Block> JUNGLE_CURTAIN_ROD = BLOCKS.register("jungle_curtain_rod", () -> new CurtainRod(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.3f, 0.7f)));
	public static final RegistryObject<Block> ACACIA_CURTAIN_ROD = BLOCKS.register("acacia_curtain_rod", () -> new CurtainRod(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.3f, 0.7f)));
	public static final RegistryObject<Block> DARK_OAK_CURTAIN_ROD = BLOCKS.register("dark_oak_curtain_rod", () -> new CurtainRod(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.3f, 0.7f)));
	public static final RegistryObject<Block> CRIMSON_CURTAIN_ROD = BLOCKS.register("crimson_curtain_rod", () -> new CurtainRod(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.3f, 0.7f)));
	public static final RegistryObject<Block> WARPED_CURTAIN_ROD = BLOCKS.register("warped_curtain_rod", () -> new CurtainRod(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.3f, 0.7f)));
	public static final RegistryObject<Block> MANGROVE_CURTAIN_ROD = BLOCKS.register("mangrove_curtain_rod", () -> new CurtainRod(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.3f, 0.7f)));
	public static final RegistryObject<Block> CHERRY_CURTAIN_ROD = BLOCKS.register("cherry_curtain_rod", () -> new CurtainRod(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.3f, 0.7f)));
	public static final RegistryObject<Block> METAL_CURTAIN_ROD = BLOCKS.register("metal_curtain_rod", () -> new CurtainRod(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.3f, 0.7f)));
	public static final RegistryObject<Block> GOLDEN_CURTAIN_ROD = BLOCKS.register("golden_curtain_rod", () -> new CurtainRod(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(0.3f, 0.7f)));

	
}
