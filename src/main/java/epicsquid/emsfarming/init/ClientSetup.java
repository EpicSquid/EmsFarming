package epicsquid.emsfarming.init;

import epicsquid.emsfarming.EmsFarming;
import epicsquid.emsfarming.blocks.PaintedChestTileEntity;
import epicsquid.emsfarming.blocks.PaintedChestTileEntityRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = EmsFarming.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {

	@SubscribeEvent
	public static void init(FMLClientSetupEvent event) {
		ClientRegistry.bindTileEntitySpecialRenderer(PaintedChestTileEntity.class, new PaintedChestTileEntityRenderer());
	}
}
