package epicsquid.emsfarming.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.state.IProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public abstract class AbstractProcessingBlock extends Block {

	// 0 = Empty, 1 = Processing, 2 = Completed
	public static final IntegerProperty PROCESSING = IntegerProperty.create("processing", 0, 2);

	private Map<Ingredient, ItemStack> recipes;

	public AbstractProcessingBlock(Properties properties, Map<Ingredient, ItemStack> recipes) {
		super(properties);
		this.setDefaultState(buildProcessingState(this.stateContainer.getBaseState()));
		this.recipes = recipes;
	}

	protected BlockState buildProcessingState(BlockState state) {
		return state.with(PROCESSING, 0);
	}

	protected List<IProperty<?>> getProcessingProperties() {
		List<IProperty<?>> result = new ArrayList<>();
		result.add(PROCESSING);
		return result;
	}

	private int getProcessing(BlockState state) {
		return state.get(PROCESSING);
	}

	private void setProcessing(BlockState state, int i, ItemStack output) {
		state.with(PROCESSING, i);
	}

	protected abstract ItemStack getRecipe();

	/**
	 * Sets the progress of the machine
	 *
	 * @return True if the processing was completed when the progress was incremented.
	 */
	protected abstract boolean setProgress(BlockState state, int progress);

	protected abstract int getProgress(BlockState state);

	@SuppressWarnings("deprecated")
	@Override
	public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
		if (getProcessing(state) == 1) {
			setProgress(state, getProgress(state) + 1);
		}
	}

	@SuppressWarnings("deprecated")
	@Override
	public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		switch (getProcessing(state)) {
		case 0: {
			for (Ingredient ingredient : recipes.keySet()) {
				if (ingredient.test(player.getHeldItem(handIn))) {
					setProcessing(state, 1, recipes.get(ingredient));
					return true;
				}
			}
			return false;
		}
		case 2: {
			new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), getRecipe());
			setProcessing(state, 0, ItemStack.EMPTY);
			return true;
		}
		default:
			return false;
		}
	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		getProcessingProperties().forEach(builder::add);
	}
}
