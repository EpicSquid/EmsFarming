package epicsquid.emsfarming.init;

import epicsquid.emsfarming.EmsFarming;
import epicsquid.emsfarming.blocks.PaintedChestBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks {

	private static Block.Properties chestMaterial = Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD);

	public static RegistryObject<Block> WHITE_PAINTED_CHEST = EmsFarming.REGISTRY.registerBlock("white_painted_chest", EmsFarming.REGISTRY.block(props -> new PaintedChestBlock(props, DyeColor.WHITE), () -> chestMaterial), ModRegistries.SIG);
	public static RegistryObject<Block> ORANGE_PAINTED_CHEST = EmsFarming.REGISTRY.registerBlock("orange_painted_chest", EmsFarming.REGISTRY.block(props -> new PaintedChestBlock(props, DyeColor.ORANGE), () -> chestMaterial), ModRegistries.SIG);
	public static RegistryObject<Block> MAGENTA_PAINTED_CHEST = EmsFarming.REGISTRY.registerBlock("magenta_painted_chest", EmsFarming.REGISTRY.block(props -> new PaintedChestBlock(props, DyeColor.MAGENTA), () -> chestMaterial), ModRegistries.SIG);
	public static RegistryObject<Block> LIGHT_BLUE_PAINTED_CHEST = EmsFarming.REGISTRY.registerBlock("light_blue_painted_chest", EmsFarming.REGISTRY.block(props -> new PaintedChestBlock(props, DyeColor.LIGHT_BLUE), () -> chestMaterial), ModRegistries.SIG);
	public static RegistryObject<Block> YELLOW_PAINTED_CHEST = EmsFarming.REGISTRY.registerBlock("yellow_painted_chest", EmsFarming.REGISTRY.block(props -> new PaintedChestBlock(props, DyeColor.YELLOW), () -> chestMaterial), ModRegistries.SIG);
	public static RegistryObject<Block> LIME_PAINTED_CHEST = EmsFarming.REGISTRY.registerBlock("lime_painted_chest", EmsFarming.REGISTRY.block(props -> new PaintedChestBlock(props, DyeColor.LIME), () -> chestMaterial), ModRegistries.SIG);
	public static RegistryObject<Block> PINK_PAINTED_CHEST = EmsFarming.REGISTRY.registerBlock("pink_painted_chest", EmsFarming.REGISTRY.block(props -> new PaintedChestBlock(props, DyeColor.PINK), () -> chestMaterial), ModRegistries.SIG);
	public static RegistryObject<Block> GRAY_PAINTED_CHEST = EmsFarming.REGISTRY.registerBlock("gray_painted_chest", EmsFarming.REGISTRY.block(props -> new PaintedChestBlock(props, DyeColor.GRAY), () -> chestMaterial), ModRegistries.SIG);
	public static RegistryObject<Block> LIGHT_GRAY_PAINTED_CHEST = EmsFarming.REGISTRY.registerBlock("light_gray_painted_chest", EmsFarming.REGISTRY.block(props -> new PaintedChestBlock(props, DyeColor.LIGHT_GRAY), () -> chestMaterial), ModRegistries.SIG);
	public static RegistryObject<Block> CYAN_PAINTED_CHEST = EmsFarming.REGISTRY.registerBlock("cyan_painted_chest", EmsFarming.REGISTRY.block(props -> new PaintedChestBlock(props, DyeColor.CYAN), () -> chestMaterial), ModRegistries.SIG);
	public static RegistryObject<Block> PURPLE_PAINTED_CHEST = EmsFarming.REGISTRY.registerBlock("purple_painted_chest", EmsFarming.REGISTRY.block(props -> new PaintedChestBlock(props, DyeColor.PURPLE), () -> chestMaterial), ModRegistries.SIG);
	public static RegistryObject<Block> BLUE_PAINTED_CHEST = EmsFarming.REGISTRY.registerBlock("blue_painted_chest", EmsFarming.REGISTRY.block(props -> new PaintedChestBlock(props, DyeColor.BLUE), () -> chestMaterial), ModRegistries.SIG);
	public static RegistryObject<Block> BROWN_PAINTED_CHEST = EmsFarming.REGISTRY.registerBlock("brown_painted_chest", EmsFarming.REGISTRY.block(props -> new PaintedChestBlock(props, DyeColor.BROWN), () -> chestMaterial), ModRegistries.SIG);
	public static RegistryObject<Block> GREEN_PAINTED_CHEST = EmsFarming.REGISTRY.registerBlock("green_painted_chest", EmsFarming.REGISTRY.block(props -> new PaintedChestBlock(props, DyeColor.GREEN), () -> chestMaterial), ModRegistries.SIG);
	public static RegistryObject<Block> RED_PAINTED_CHEST = EmsFarming.REGISTRY.registerBlock("red_painted_chest", EmsFarming.REGISTRY.block(props -> new PaintedChestBlock(props, DyeColor.RED), () -> chestMaterial), ModRegistries.SIG);
	public static RegistryObject<Block> BLACK_PAINTED_CHEST = EmsFarming.REGISTRY.registerBlock("black_painted_chest", EmsFarming.REGISTRY.block(props -> new PaintedChestBlock(props, DyeColor.BLACK), () -> chestMaterial), ModRegistries.SIG);

	public static void load() {

	}
}
