package epicsquid.superiorshields;

import epicsquid.superiorshields.init.ModSetup;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("emsfarming")
public class EmsFarming {
	public static final String MODID = "emsfarming";

	//  public static final ItemGroup ITEM_GROUP = new ItemGroup("ems_farming") {
	//    @Override
	//    public ItemStack createIcon() {
	//      return new ItemStack(ModItems.IRON_SHIELD);
	//    }
	//  };

	public static ModSetup setup = new ModSetup();

	public EmsFarming() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(setup::setup);
		//		ConfigManager.loadConfig(ConfigManager.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MODID + "-common.toml"));
	}
}
