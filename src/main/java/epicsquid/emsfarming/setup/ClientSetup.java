package epicsquid.emsfarming.setup;

import epicsquid.emsfarming.blocks.PaintedChestTileEntity;
import epicsquid.emsfarming.blocks.PaintedChestTileEntityRenderer;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {

	public void init(FMLClientSetupEvent event) {
		ClientRegistry.bindTileEntitySpecialRenderer(PaintedChestTileEntity.class, new PaintedChestTileEntityRenderer());
	}
}
