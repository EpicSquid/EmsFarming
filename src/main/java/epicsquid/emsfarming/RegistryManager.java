package epicsquid.emsfarming;

import java.util.ArrayList;
import java.util.List;

import epicsquid.emsfarming.blocks.ModBlocks;
import epicsquid.emsfarming.blocks.PaintedChestBlock;
import epicsquid.emsfarming.blocks.PaintedChestItemStackRenderer;
import epicsquid.emsfarming.blocks.PaintedChestTileEntity;
import epicsquid.emsfarming.init.ModTileEntities;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = EmsFarming.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryManager {

	private static List<Block> chestBlocks = new ArrayList<>();


	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		IForgeRegistry<Block> registry = event.getRegistry();
		for (DyeColor dye : DyeColor.values()) {
			chestBlocks.add(new PaintedChestBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD), dye).setRegistryName(EmsFarming.MODID, dye.getName() + "_painted_chest"));
		}
		chestBlocks.forEach(registry::register);
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		chestBlocks.forEach(block -> event.getRegistry().register(new BlockItem(block, new Item.Properties().group(EmsFarming.ITEM_GROUP).setTEISR(() -> PaintedChestItemStackRenderer::new)).setRegistryName(block.getRegistryName())));
	}

	@SubscribeEvent
	public static void onTileEntityRegistry(RegistryEvent.Register<TileEntityType<?>> event) {
		IForgeRegistry<TileEntityType<?>> registry = event.getRegistry();
		registry.register(TileEntityType.Builder.create(() -> new PaintedChestTileEntity(ModTileEntities.WHITE_PAINTED_CHEST, DyeColor.WHITE), ModBlocks.WHITE_PAINTED_CHEST).build(null).setRegistryName(EmsFarming.MODID, "white_painted_chest"));
		registry.register(TileEntityType.Builder.create(() -> new PaintedChestTileEntity(ModTileEntities.ORANGE_PAINTED_CHEST, DyeColor.ORANGE), ModBlocks.ORANGE_PAINTED_CHEST).build(null).setRegistryName(EmsFarming.MODID, "orange_painted_chest"));
		registry.register(TileEntityType.Builder.create(() -> new PaintedChestTileEntity(ModTileEntities.MAGENTA_PAINTED_CHEST, DyeColor.MAGENTA), ModBlocks.MAGENTA_PAINTED_CHEST).build(null).setRegistryName(EmsFarming.MODID, "magenta_painted_chest"));
		registry.register(TileEntityType.Builder.create(() -> new PaintedChestTileEntity(ModTileEntities.LIGHT_BLUE_PAINTED_CHEST, DyeColor.LIGHT_BLUE), ModBlocks.LIGHT_BLUE_PAINTED_CHEST).build(null).setRegistryName(EmsFarming.MODID, "light_blue_painted_chest"));
		registry.register(TileEntityType.Builder.create(() -> new PaintedChestTileEntity(ModTileEntities.YELLOW_PAINTED_CHEST, DyeColor.YELLOW), ModBlocks.YELLOW_PAINTED_CHEST).build(null).setRegistryName(EmsFarming.MODID, "yellow_painted_chest"));
		registry.register(TileEntityType.Builder.create(() -> new PaintedChestTileEntity(ModTileEntities.LIME_PAINTED_CHEST, DyeColor.LIME), ModBlocks.LIME_PAINTED_CHEST).build(null).setRegistryName(EmsFarming.MODID, "lime_painted_chest"));
		registry.register(TileEntityType.Builder.create(() -> new PaintedChestTileEntity(ModTileEntities.PINK_PAINTED_CHEST, DyeColor.PINK), ModBlocks.PINK_PAINTED_CHEST).build(null).setRegistryName(EmsFarming.MODID, "pink_painted_chest"));
		registry.register(TileEntityType.Builder.create(() -> new PaintedChestTileEntity(ModTileEntities.GRAY_PAINTED_CHEST, DyeColor.GRAY), ModBlocks.GRAY_PAINTED_CHEST).build(null).setRegistryName(EmsFarming.MODID, "gray_painted_chest"));
		registry.register(TileEntityType.Builder.create(() -> new PaintedChestTileEntity(ModTileEntities.LIGHT_GRAY_PAINTED_CHEST, DyeColor.LIGHT_GRAY), ModBlocks.LIGHT_GRAY_PAINTED_CHEST).build(null).setRegistryName(EmsFarming.MODID, "light_gray_painted_chest"));
		registry.register(TileEntityType.Builder.create(() -> new PaintedChestTileEntity(ModTileEntities.CYAN_PAINTED_CHEST, DyeColor.CYAN), ModBlocks.CYAN_PAINTED_CHEST).build(null).setRegistryName(EmsFarming.MODID, "cyan_painted_chest"));
		registry.register(TileEntityType.Builder.create(() -> new PaintedChestTileEntity(ModTileEntities.PURPLE_PAINTED_CHEST, DyeColor.PURPLE), ModBlocks.PURPLE_PAINTED_CHEST).build(null).setRegistryName(EmsFarming.MODID, "purple_painted_chest"));
		registry.register(TileEntityType.Builder.create(() -> new PaintedChestTileEntity(ModTileEntities.BLUE_PAINTED_CHEST, DyeColor.BLUE), ModBlocks.BLUE_PAINTED_CHEST).build(null).setRegistryName(EmsFarming.MODID, "blue_painted_chest"));
		registry.register(TileEntityType.Builder.create(() -> new PaintedChestTileEntity(ModTileEntities.BROWN_PAINTED_CHEST, DyeColor.BROWN), ModBlocks.BROWN_PAINTED_CHEST).build(null).setRegistryName(EmsFarming.MODID, "brown_painted_chest"));
		registry.register(TileEntityType.Builder.create(() -> new PaintedChestTileEntity(ModTileEntities.GREEN_PAINTED_CHEST, DyeColor.GREEN), ModBlocks.GREEN_PAINTED_CHEST).build(null).setRegistryName(EmsFarming.MODID, "green_painted_chest"));
		registry.register(TileEntityType.Builder.create(() -> new PaintedChestTileEntity(ModTileEntities.RED_PAINTED_CHEST, DyeColor.RED), ModBlocks.RED_PAINTED_CHEST).build(null).setRegistryName(EmsFarming.MODID, "red_painted_chest"));
		registry.register(TileEntityType.Builder.create(() -> new PaintedChestTileEntity(ModTileEntities.BLACK_PAINTED_CHEST, DyeColor.BLACK), ModBlocks.BLACK_PAINTED_CHEST).build(null).setRegistryName(EmsFarming.MODID, "black_painted_chest"));
	}
}
