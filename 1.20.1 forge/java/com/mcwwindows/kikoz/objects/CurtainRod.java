package com.mcwwindows.kikoz.objects;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CurtainRod extends HorizontalDirectionalBlock {


	public CurtainRod(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	protected static final VoxelShape NORTH = Shapes.or(box(0, 0, 13, 16, 3, 16));

	protected static final VoxelShape WEST = Shapes.or(box(13, 0, 0, 16, 3, 16));

	protected static final VoxelShape EAST = Shapes.or(box(0, 0, 0, 3, 3, 16));

	protected static final VoxelShape SOUTH = Shapes.or(box(0, 0, 0, 16, 3, 3));

   
   
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos, CollisionContext selectionContext)
    {
		switch (state.getValue(FACING)) {
		case WEST:
			return WEST;

		case EAST:
			return EAST;

		case SOUTH:
			return SOUTH;

		default:
		case NORTH:
			return NORTH;
		}
	}


	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}



	   public BlockState getStateForPlacement(BlockPlaceContext context) {
	      return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	   }
	
}