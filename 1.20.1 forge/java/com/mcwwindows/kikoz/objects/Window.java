package com.mcwwindows.kikoz.objects;

import javax.annotation.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Window extends WindowBarred {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final EnumProperty<ExtendablePart> PART = EnumProperty.create("part", ExtendablePart.class);

	protected static final VoxelShape EE = box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D);
	protected static final VoxelShape NN = box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D);

	public Window(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any()
				.setValue(HorizontalDirectionalBlock.FACING, Direction.NORTH)
				.setValue(PART, ExtendablePart.BASE)
				.setValue(WINDOWSTATE, WindowState.CLOSED));
	}

	public enum ExtendablePart implements StringRepresentable
	{

		BASE("base"),

		ABOVE("above"),
		MIDDLE("middle"),
		BELOW("below");


		private final String name;

		ExtendablePart(final String name)
		{
			this.name = name;
		}

		public String getName()
		{
			return this.name;
		}

		public String getString() {
			return this.name;
		}

		public String getSerializedName() {
			return this.name;
		}
	}

	protected BlockState WindowState(BlockState state, LevelAccessor level, BlockPos pos) {
		boolean above = level.getBlockState(pos.above()).getBlock() == this;
		boolean below = level.getBlockState(pos.below()).getBlock() == this;

		if (above && below) {
			return state.setValue(PART, ExtendablePart.MIDDLE);
		} else if (!above && below) {
			return state.setValue(PART, ExtendablePart.ABOVE);
		} else if (above && !below) {
			return state.setValue(PART, ExtendablePart.BELOW);
		} else {
			return state.setValue(PART, ExtendablePart.BASE);
		}
	}


	@Override
	public void onPlace(BlockState state, Level level, BlockPos pos, BlockState statetwo, boolean bool) {
		if (!statetwo.is(state.getBlock())) {
			this.WindowState(state, level, pos);
		}
	}



	@Override
	@Nullable
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.WindowState(super.getStateForPlacement(context), context.getLevel(), context.getClickedPos())
				.setValue(FACING, context.getHorizontalDirection());
	}

	public void placeAt(Level level, BlockPos pos, int num) {
		level.setBlock(pos, this.defaultBlockState(), num);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction direction, BlockState newState, LevelAccessor level, BlockPos pos, BlockPos newPos) {
		return this.WindowState(state, level, pos);

	}


	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, PART, WINDOWSTATE);
	}

}
