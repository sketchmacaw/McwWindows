package com.mcwwindows.kikoz.objects;

import javax.annotation.Nullable;

import com.mcwwindows.kikoz.init.ItemInit;
import com.mcwwindows.kikoz.init.SoundsInit;
import com.mcwwindows.kikoz.util.WindowPart;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class GothicWindow extends WindowBase
{
	public static final EnumProperty<WindowPart> PART = EnumProperty.create("part", WindowPart.class);
	public static final BooleanProperty OPEN = BlockStateProperties.OPEN;

	protected static final VoxelShape EAST = Shapes.or(box(3, 0, -1, 13, 16, 17));
	protected static final VoxelShape NORTH = Shapes.or(box(-1, 0, 3, 17, 16, 13));

	public GothicWindow(Block.Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any()
				.setValue(OPEN, Boolean.valueOf(false))
				.setValue(FACING, Direction.NORTH)
				.setValue(PART, WindowPart.BASE));
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos, CollisionContext selectionContext)
	{
		switch (state.getValue(FACING))
		{

			case WEST:
				return EAST;

			case EAST:
				return EAST;

			case NORTH:
				return NORTH;

			case SOUTH:
				return NORTH;
			default:
				return NORTH;

		}
	}

	@Override
	@Nullable
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.WindowState(super.getStateForPlacement(context), context.getLevel(), context.getClickedPos())
				.setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(PART, FACING, OPEN);
	}

	public boolean isOpen(BlockState state) {
		return state.getValue(OPEN);
	}

	public void openDoor(Level worldIn, BlockState state, BlockPos pos, boolean open) {
		if (state.is(this) && state.getValue(OPEN) != open) {
			worldIn.setBlock(pos, state.setValue(OPEN, Boolean.valueOf(open)), 10);
		}
	}

	private boolean wasInteractedWith = false;

	@Override
	public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {

		ItemStack itemstack = player.getItemInHand(handIn);
		Item item = itemstack.getItem();

		if (item == this.asItem()) {
			return InteractionResult.PASS;
		}
		else if (item == ItemInit.HAMMER.get()) {
			BlockState newState = state.cycle(PART);
			worldIn.setBlockAndUpdate(pos, newState);
			setWasInteractedWith(true, worldIn, pos);
			return InteractionResult.SUCCESS;
		}
		else {
			this.openWindow(worldIn, pos, !state.getValue(OPEN), state.getValue(FACING));
			worldIn.playSound(null, pos, SoundsInit.BARS_OPEN.get(), SoundSource.BLOCKS, 0.5F, worldIn.random.nextFloat() * 0.1F + 0.8F);
			state = state.cycle(OPEN);
			worldIn.setBlock(pos, state, 10);
			return InteractionResult.SUCCESS;
		}
	}

	public void setWasInteractedWith(boolean interacted, Level level, BlockPos pos) {
		this.wasInteractedWith = interacted;
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, Level worldIn, BlockPos currentPos, BlockPos facingPos) {
		return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	}

	private void openWindow(Level world, BlockPos pos, boolean bool, Direction dir) {
		BlockState state = world.getBlockState(pos);
		if (state.getBlock() == this && state.getValue(OPEN) != bool
				&& state.getValue(FACING).equals(dir)) {
			world.setBlockAndUpdate(pos, state.setValue(OPEN, bool));
			for (int x = -1; x <= 1; x++) {
				for (int y = -1; y <= 1; y++) {
					for (int z = -1; z <= 1; z++) {
						BlockPos newPos = pos.offset(x, y, z);
						openWindow(world, newPos, bool, dir);
					}
				}
			}
		}
	}

	@Override
	public void onPlace(BlockState state, Level level, BlockPos pos, BlockState statetwo, boolean bool) {
		if (!statetwo.is(state.getBlock())) {
			this.WindowState(state, level, pos);
		}
	}


	@Override
	public BlockState updateShape(BlockState state, Direction direction, BlockState newState, LevelAccessor level, BlockPos pos, BlockPos newPos) {
		if (wasInteractedWith) {
			return state;
		}
		return this.WindowState(state, level, pos);
	}

}