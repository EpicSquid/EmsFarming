package epicsquid.emsfarming.blocks;

import net.minecraft.item.DyeColor;
import net.minecraft.tileentity.ChestTileEntity;

public class PaintedChestTileEntity extends ChestTileEntity {

	private DyeColor color;

	public PaintedChestTileEntity(DyeColor color) {
		super(PaintedChestBlock.getTypeFromColor(color));
		this.color = color;
	}

	public DyeColor getColor() {
		return color;
	}
}
