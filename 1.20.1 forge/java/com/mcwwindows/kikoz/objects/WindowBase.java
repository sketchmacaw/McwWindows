package com.mcwwindows.kikoz.objects;


import javax.annotation.Nullable;

import com.mcwwindows.kikoz.util.WindowPart;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public class WindowBase extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final EnumProperty<WindowPart> PART = EnumProperty.create("part", WindowPart.class);

//16

	public WindowBase(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}


	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}


	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, PART);
	}

	public void onBroken(Level worldIn, BlockPos pos) {
		worldIn.levelEvent(1029, pos, 0);
	}

	@Override
	public RenderShape getRenderShape(BlockState state) {
		return RenderShape.MODEL;
	}


	public boolean allowsMovement(BlockState state, LevelAccessor worldIn, BlockPos pos) {
		return false;
	}


	protected BlockState WindowState(BlockState state, LevelAccessor level, BlockPos pos) {
		boolean above = level.getBlockState(pos.above()).getBlock() == this;
		boolean below = level.getBlockState(pos.below()).getBlock() == this;

		if (above == true && below == true) {
			return state.setValue(PART, WindowPart.MIDDLE);
		} else if (above != true && below == true) {
			return state.setValue(PART, WindowPart.TOP);
		} else if (above == true && below != true) {
			return state.setValue(PART, WindowPart.BOTTOM);
		} else {
			return state.setValue(PART, WindowPart.BASE);
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
				.setValue(FACING, context.getHorizontalDirection().getCounterClockWise());
	}

	public void placeAt(Level level, BlockPos pos, int num) {
		level.setBlock(pos, this.defaultBlockState(), num);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction direction, BlockState newState, LevelAccessor level, BlockPos pos, BlockPos newPos) {
		return this.WindowState(state, level, pos);

	}



	@SuppressWarnings("deprecation")
	public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, Level worldIn, BlockPos currentPos, BlockPos facingPos) {

		return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	}}
