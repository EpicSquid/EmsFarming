package epicsquid.emsfarming.init;

import epicsquid.emsfarming.EmsFarming;
import net.minecraft.item.Item;

import java.util.function.Supplier;

public class ModRegistries {
	public static final Supplier<Item.Properties> SIG = () -> new Item.Properties().group(EmsFarming.ITEM_GROUP);
}
