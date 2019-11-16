package epicsquid.emsfarming.init;

import epicsquid.emsfarming.EmsFarming;
import epicsquid.emsfarming.blocks.PaintedChestTileEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;

public class ModTileEntities {

	public static RegistryObject<TileEntityType<PaintedChestTileEntity>> WHITE_PAINTED_CHEST = EmsFarming.REGISTRY.registerTileEntity("white_painted_chest", EmsFarming.REGISTRY.tile(() -> new PaintedChestTileEntity(DyeColor.WHITE), ModBlocks.WHITE_PAINTED_CHEST));
	public static RegistryObject<TileEntityType<PaintedChestTileEntity>> ORANGE_PAINTED_CHEST = EmsFarming.REGISTRY.registerTileEntity("orange_painted_chest", EmsFarming.REGISTRY.tile(() -> new PaintedChestTileEntity(DyeColor.ORANGE), ModBlocks.ORANGE_PAINTED_CHEST));
	public static RegistryObject<TileEntityType<PaintedChestTileEntity>> MAGENTA_PAINTED_CHEST = EmsFarming.REGISTRY.registerTileEntity("magenta_painted_chest", EmsFarming.REGISTRY.tile(() -> new PaintedChestTileEntity(DyeColor.MAGENTA), ModBlocks.MAGENTA_PAINTED_CHEST));
	public static RegistryObject<TileEntityType<PaintedChestTileEntity>> LIGHT_BLUE_PAINTED_CHEST = EmsFarming.REGISTRY.registerTileEntity("light_blue_painted_chest", EmsFarming.REGISTRY.tile(() -> new PaintedChestTileEntity(DyeColor.LIGHT_BLUE), ModBlocks.LIGHT_BLUE_PAINTED_CHEST));
	public static RegistryObject<TileEntityType<PaintedChestTileEntity>> YELLOW_PAINTED_CHEST = EmsFarming.REGISTRY.registerTileEntity("yellow_painted_chest", EmsFarming.REGISTRY.tile(() -> new PaintedChestTileEntity(DyeColor.YELLOW), ModBlocks.YELLOW_PAINTED_CHEST));
	public static RegistryObject<TileEntityType<PaintedChestTileEntity>> LIME_PAINTED_CHEST = EmsFarming.REGISTRY.registerTileEntity("lime_painted_chest", EmsFarming.REGISTRY.tile(() -> new PaintedChestTileEntity(DyeColor.LIME), ModBlocks.LIME_PAINTED_CHEST));
	public static RegistryObject<TileEntityType<PaintedChestTileEntity>> PINK_PAINTED_CHEST = EmsFarming.REGISTRY.registerTileEntity("pink_painted_chest", EmsFarming.REGISTRY.tile(() -> new PaintedChestTileEntity(DyeColor.PINK), ModBlocks.PINK_PAINTED_CHEST));
	public static RegistryObject<TileEntityType<PaintedChestTileEntity>> GRAY_PAINTED_CHEST = EmsFarming.REGISTRY.registerTileEntity("gray_painted_chest", EmsFarming.REGISTRY.tile(() -> new PaintedChestTileEntity(DyeColor.GRAY), ModBlocks.GRAY_PAINTED_CHEST));
	public static RegistryObject<TileEntityType<PaintedChestTileEntity>> LIGHT_GRAY_PAINTED_CHEST = EmsFarming.REGISTRY.registerTileEntity("light_gray_painted_chest", EmsFarming.REGISTRY.tile(() -> new PaintedChestTileEntity(DyeColor.LIGHT_GRAY), ModBlocks.LIGHT_GRAY_PAINTED_CHEST));
	public static RegistryObject<TileEntityType<PaintedChestTileEntity>> CYAN_PAINTED_CHEST = EmsFarming.REGISTRY.registerTileEntity("cyan_painted_chest", EmsFarming.REGISTRY.tile(() -> new PaintedChestTileEntity(DyeColor.CYAN), ModBlocks.CYAN_PAINTED_CHEST));
	public static RegistryObject<TileEntityType<PaintedChestTileEntity>> PURPLE_PAINTED_CHEST = EmsFarming.REGISTRY.registerTileEntity("purple_painted_chest", EmsFarming.REGISTRY.tile(() -> new PaintedChestTileEntity(DyeColor.PURPLE), ModBlocks.PURPLE_PAINTED_CHEST));
	public static RegistryObject<TileEntityType<PaintedChestTileEntity>> BLUE_PAINTED_CHEST = EmsFarming.REGISTRY.registerTileEntity("blue_painted_chest", EmsFarming.REGISTRY.tile(() -> new PaintedChestTileEntity(DyeColor.BLUE), ModBlocks.BLUE_PAINTED_CHEST));
	public static RegistryObject<TileEntityType<PaintedChestTileEntity>> BROWN_PAINTED_CHEST = EmsFarming.REGISTRY.registerTileEntity("brown_painted_chest", EmsFarming.REGISTRY.tile(() -> new PaintedChestTileEntity(DyeColor.BROWN), ModBlocks.BROWN_PAINTED_CHEST));
	public static RegistryObject<TileEntityType<PaintedChestTileEntity>> GREEN_PAINTED_CHEST = EmsFarming.REGISTRY.registerTileEntity("green_painted_chest", EmsFarming.REGISTRY.tile(() -> new PaintedChestTileEntity(DyeColor.GREEN), ModBlocks.GREEN_PAINTED_CHEST));
	public static RegistryObject<TileEntityType<PaintedChestTileEntity>> RED_PAINTED_CHEST = EmsFarming.REGISTRY.registerTileEntity("red_painted_chest", EmsFarming.REGISTRY.tile(() -> new PaintedChestTileEntity(DyeColor.RED), ModBlocks.RED_PAINTED_CHEST));
	public static RegistryObject<TileEntityType<PaintedChestTileEntity>> BLACK_PAINTED_CHEST = EmsFarming.REGISTRY.registerTileEntity("black_painted_chest", EmsFarming.REGISTRY.tile(() -> new PaintedChestTileEntity(DyeColor.BLACK), ModBlocks.BLACK_PAINTED_CHEST));

	public static void load() {

	}
}
