package com.mcwwindows.kikoz.objects;

import javax.annotation.Nullable;

import com.mcwwindows.kikoz.init.SoundsInit;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.StringRepresentable;
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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Blinds extends WindowBase {
	private static final EnumProperty<GaragePart> PART = EnumProperty.create("part", GaragePart.class);
	private static final EnumProperty<BlindsState> BLINDSSTATE = EnumProperty.create("blindsstate", BlindsState.class);

	String infoname;
	boolean hasTextInfo = true;

	protected static final VoxelShape WEST = Shapes.or(box(12, 0, 0, 15.9, 16, 16));

	protected static final VoxelShape SOUTH = Shapes.or(box(0, 0, 0.1, 16, 16, 4));

	protected static final VoxelShape EAST = Shapes.or(box(0.1, 0, 0, 4, 16, 16));

	protected static final VoxelShape NORTH = Shapes.or(box(0, 0, 12, 16, 16, 15.9));


	@Override
	public VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos,
			CollisionContext selectionContext) {

		switch (state.getValue(FACING)) {

		case NORTH:
			return NORTH;

		case SOUTH:
			return SOUTH;

		case EAST:
			return EAST;

		case WEST:
			return WEST;
		default:
			return null;

		}
	}

	public Blinds(Block.Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH)
				.setValue(BLINDSSTATE, BlindsState.OPEN).setValue(PART, GaragePart.BOTTOM));
	}
	
	@Override
	protected BlockState WindowState(BlockState state, LevelAccessor level, BlockPos pos) {
		boolean above = level.getBlockState(pos.above()).getBlock() == this;
		boolean below = level.getBlockState(pos.below()).getBlock() == this;

		if (above && below) {
			return state.setValue(PART, GaragePart.BOTTOM);
		} else if (!above && below) {
			return state.setValue(PART, GaragePart.TOP);
		} else if (above && !below) {
			return state.setValue(PART, GaragePart.BOTTOM);
		} else {
			return state.setValue(PART, GaragePart.TOP);
		}
	}

	@Override
	@Nullable
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.WindowState(super.getStateForPlacement(context), context.getLevel(), context.getClickedPos())
				.setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	@Override
	protected void createBlockStateDefinition(final StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(PART, FACING, BLINDSSTATE);
	}

	@Override
	public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn,
			BlockHitResult hit) {
		ItemStack itemstack = player.getItemInHand(handIn);
		Item item = itemstack.getItem();
		if (item != this.asItem()) {
			BlindsState currentState = state.getValue(BLINDSSTATE);
			BlindsState nextState = cycleBlindsState(currentState);

			worldIn.playSound(null, pos, SoundsInit.BLINDS_CLOSE.get(), SoundSource.BLOCKS, 0.5F,
					worldIn.random.nextFloat() * 0.1F + 0.8F);
			toggleBlinds(worldIn, pos, nextState, state.getValue(FACING), 1000);

			return InteractionResult.SUCCESS;
		}
		return InteractionResult.PASS;
	}

	public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, Level worldIn,
			BlockPos currentPos, BlockPos facingPos) {

		return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	}

	public enum BlindsState implements StringRepresentable {
		CLOSED("closed"), OPEN("open"), RAISED("raised");

		private final String name;

		BlindsState(final String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public String getString() {
			return this.name;
		}

		@Override
		public String getSerializedName() {
			return this.name;
		}

	}

	public enum GaragePart implements StringRepresentable {
		TOP("top"), BOTTOM("bottom");

		private final String name;

		GaragePart(final String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public String getString() {
			return this.name;
		}

		@Override
		public String getSerializedName() {
			return this.name;
		}

	}


	@Override
     public int getLightBlock(BlockState state, BlockGetter reader, BlockPos pos) {
		BlindsState currentState = state.getValue(BLINDSSTATE);
		
		if (currentState == BlindsState.CLOSED) {
			return reader.getMaxLightLevel();
		}
	     return 0;
     }
    
	private void toggleBlinds(Level world, BlockPos pos, BlindsState targetState, Direction targetDirection,
			int depth) {
		if (depth <= 0)
			return;

		BlockState state = world.getBlockState(pos);
		if (state.getBlock() != this)
			return;

		BlindsState currentState = state.getValue(BLINDSSTATE);
		if (currentState != targetState) {
			world.setBlockAndUpdate(pos, state.setValue(BLINDSSTATE, targetState));

			BlockPos[] positions = { pos.south(), pos.north(), pos.east(), pos.west(), pos.below(), pos.above() };

			for (BlockPos newPos : positions) {
				toggleBlinds(world, newPos, targetState, targetDirection, depth - 1);
			}
		}
	}

	private BlindsState cycleBlindsState(BlindsState currentState) {
		switch (currentState) {
		case CLOSED:
			return BlindsState.OPEN;
		case OPEN:
			return BlindsState.RAISED;
		case RAISED:
		default:
			return BlindsState.CLOSED;
		}
	}

	@Override
	protected void spawnDestroyParticles(Level level, Player player, BlockPos pos, BlockState state) {
		final BlindsState raised = state.getValue(BLINDSSTATE);
		final GaragePart part = state.getValue(PART);

		if (raised == BlindsState.RAISED && part == GaragePart.BOTTOM) {
			return;
		}

		level.levelEvent(player, 2001, pos, getId(state));
	}

}