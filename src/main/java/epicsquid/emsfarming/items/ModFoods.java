package epicsquid.emsfarming.items;

import net.minecraft.item.Food;

public class ModFoods {

	public static final Food TOMATO = (new Food.Builder().hunger(3).saturation(0.3f)).build();
	public static final Food CHEESE = (new Food.Builder().hunger(5).saturation(0.8f)).build();
	public static final Food GRAPES = (new Food.Builder().hunger(2).saturation(0.3f)).build();
	public static final Food SWEET_ROLL = (new Food.Builder().hunger(9).saturation(0.3f)).build();
}
