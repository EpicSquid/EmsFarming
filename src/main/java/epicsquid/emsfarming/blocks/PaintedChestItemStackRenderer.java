package epicsquid.emsfarming.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;

public class PaintedChestItemStackRenderer extends ItemStackTileEntityRenderer {

	@Override
	public void renderByItem(ItemStack itemStackIn) {
		if (Block.getBlockFromItem(itemStackIn.getItem()) instanceof PaintedChestBlock) {
			PaintedChestBlock block = (PaintedChestBlock) Block.getBlockFromItem(itemStackIn.getItem());
			TileEntityRendererDispatcher.instance.renderAsItem(new PaintedChestTileEntity(block.getColor()));
		} else {
			super.renderByItem(itemStackIn);
		}
	}
}
