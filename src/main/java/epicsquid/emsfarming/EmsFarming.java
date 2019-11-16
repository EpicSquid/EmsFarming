package epicsquid.emsfarming;

import epicsquid.emsfarming.init.ModBlocks;
import epicsquid.emsfarming.init.ModItems;
import epicsquid.emsfarming.init.ModTileEntities;
import epicsquid.emsfarming.setup.ClientSetup;
import epicsquid.emsfarming.setup.ModSetup;
import epicsquid.mysticallib.registry.ModRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("emsfarming")
public class EmsFarming {
	public static final Logger LOG = LogManager.getLogger();

	public static final String MODID = "emsfarming";

	public static final ItemGroup ITEM_GROUP = new ItemGroup("emsfarming") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(ModItems.SWEET_ROLL.get());
		}
	};

	public static final ModRegistry REGISTRY = new ModRegistry(MODID);

	public static ModSetup setup = new ModSetup();
	public static ClientSetup clientSetup = new ClientSetup();

	public EmsFarming() {
		IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

		ModItems.load();
		ModBlocks.load();
		ModTileEntities.load();

		DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> {
			modBus.addListener(clientSetup::init);
		});

		modBus.addListener(setup::init);

		REGISTRY.registerEventBus(modBus);
	}
}
