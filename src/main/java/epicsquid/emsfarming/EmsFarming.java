package epicsquid.emsfarming;

import epicsquid.emsfarming.blocks.ModBlocks;
import epicsquid.emsfarming.init.ModSetup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("emsfarming")
public class EmsFarming {
	public static final String MODID = "emsfarming";

	  public static final ItemGroup ITEM_GROUP = new ItemGroup("ems_farming") {
	    @Override
	    public ItemStack createIcon() {
	      return new ItemStack(ModBlocks.BLUE_PAINTED_CHEST);
	    }
	  };

	public static ModSetup setup = new ModSetup();

	public EmsFarming() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(setup::setup);
		//		ConfigManager.loadConfig(ConfigManager.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MODID + "-common.toml"));
	}
}
