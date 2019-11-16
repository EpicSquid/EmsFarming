package epicsquid.emsfarming.init;

import epicsquid.emsfarming.EmsFarming;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ObjectHolder;


public class ModItems {

	public static RegistryObject<Item> SWEET_ROLL = EmsFarming.REGISTRY.registerItem("sweet_roll", EmsFarming.REGISTRY.item(Item::new, ModRegistries.SIG));
	public static RegistryObject<Item> CHEESE = EmsFarming.REGISTRY.registerItem("cheese", EmsFarming.REGISTRY.item(Item::new, ModRegistries.SIG));
	public static RegistryObject<Item> TOMATO = EmsFarming.REGISTRY.registerItem("tomato", EmsFarming.REGISTRY.item(Item::new, ModRegistries.SIG));
	public static RegistryObject<Item> FLOUR = EmsFarming.REGISTRY.registerItem("flour", EmsFarming.REGISTRY.item(Item::new, ModRegistries.SIG));
	public static RegistryObject<Item> GRAPES = EmsFarming.REGISTRY.registerItem("grapes", EmsFarming.REGISTRY.item(Item::new, ModRegistries.SIG));
	public static RegistryObject<Item> MAYONNAISE = EmsFarming.REGISTRY.registerItem("mayonnaise", EmsFarming.REGISTRY.item(Item::new, ModRegistries.SIG));

	public static void load() {

	}
}
