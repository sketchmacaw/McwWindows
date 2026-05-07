package com.mcwwindows.kikoz.objects;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Parapet extends Block {

    public static final EnumProperty<Flower> FLOWER = EnumProperty.create("part", Flower.class);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	//8 staets

	public Parapet(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FLOWER, Flower.EMPTY));
	}

	protected static final VoxelShape SOUTH = Shapes.or(box(9, 12, 0, 16, 16, 16));

	protected static final VoxelShape EAST = Shapes.or(box(0, 12, 0, 16, 16, 7));

	protected static final VoxelShape WEST = Shapes.or(box(0, 12, 9, 16, 16, 16));

	protected static final VoxelShape NORTH = Shapes.or(box(0, 12, 0, 7, 16, 16));

    
   
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
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FLOWER, Flower.byState(context.getLevel().getBlockState(context.getClickedPos().above()))).setValue(FACING, context.getHorizontalDirection().getClockWise());
     }

    @SuppressWarnings("deprecation")
	@Override
     public BlockState updateShape(BlockState state, Direction dir, BlockState statetwo, LevelAccessor level, BlockPos pos, BlockPos postwo) {
        return dir == Direction.UP ? state.setValue(FLOWER, Flower.byState(statetwo)) : super.updateShape(state, dir, statetwo, level, pos, postwo);
     }
 
    
	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, FLOWER);
	}



	@SuppressWarnings("deprecation")
	public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, Level worldIn,
			BlockPos currentPos, BlockPos facingPos) {

		return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	}

	public enum Flower implements StringRepresentable {
		   FLOWER("flower"),
		   EMPTY("empty");

		   private final String name;


		   private Flower(String name) {
		      this.name = name;
		   }

		   public String getSerializedName() {
		      return this.name;
		   }

		   public static Flower byState(BlockState state) {
		      if (state.is(BlockTags.FLOWER_POTS)) {
		         return FLOWER;
		      } else {
		    	 return EMPTY;
		      }
		   }
		   
		}
	
}