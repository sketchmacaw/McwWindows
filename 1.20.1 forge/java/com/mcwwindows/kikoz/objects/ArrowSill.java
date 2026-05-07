package com.mcwwindows.kikoz.objects;

import com.mcwwindows.kikoz.util.WindowPart;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ArrowSill extends WindowBase
{
    public static final EnumProperty<WindowPart> PART = EnumProperty.create("part", WindowPart.class);

    //16

    String infoname;
    boolean hasTextInfo = true;
 
    //BASE
    protected static final VoxelShape NORTH = Shapes.or(
    		Block.box(1, 3, 0, 5, 13, 6),
    		Block.box(0, 13, 0, 6, 16, 16),
    		Block.box(1, 3, 10, 5, 13, 16),
    		Block.box(0, 0, 0, 6, 3, 16)
    		);

    protected static final VoxelShape EAST = Shapes.or(
    		Block.box(10, 3, 11, 16, 13, 15),
    		Block.box(0, 13, 10, 16, 16, 16),
    		Block.box(0, 3, 11, 6, 13, 15),
    		Block.box(0, 0, 10, 16, 3, 16)
    		);

    protected static final VoxelShape SOUTH = Shapes.or(
    		Block.box(11, 3, 10, 15, 13, 16),
    		Block.box(10, 13, 0, 16, 16, 16),
    		Block.box(11, 3, 0, 15, 13, 6),
    		Block.box(10, 0, 0, 16, 3, 16)
    		);

    protected static final VoxelShape WEST = Shapes.or(
    		Block.box(0, 3, 1, 6, 13, 5),
    		Block.box(0, 13, 0, 16, 16, 6),
    		Block.box(10, 3, 1, 16, 13, 5),
    		Block.box(0, 0, 0, 16, 3, 6)
    		);

    //TOP
    protected static final VoxelShape NORTH_TOP = Shapes.or(
    		Block.box(1, 1, 10, 5, 10, 16),
    		Block.box(1, 1, 0, 5, 10, 6),
    		Block.box(1, 0, 0, 5, 1, 3),
    		Block.box(1, 0, 13, 5, 1, 16),
    		Block.box(0, 10, 0, 6, 16, 16)
    		);

    protected static final VoxelShape EAST_TOP = Shapes.or(
    		Block.box(0, 1, 11, 6, 10, 15),
    		Block.box(10, 1, 11, 16, 10, 15),
    		Block.box(13, 0, 11, 16, 1, 15),
    		Block.box(0, 0, 11, 3, 1, 15),
    		Block.box(0, 10, 10, 16, 16, 16)
    		);

    protected static final VoxelShape SOUTH_TOP = Shapes.or(
    		Block.box(11, 1, 0, 15, 10, 6),
    		Block.box(11, 1, 10, 15, 10, 16),
    		Block.box(11, 0, 13, 15, 1, 16),
    		Block.box(11, 0, 0, 15, 1, 3),
    		Block.box(10, 10, 0, 16, 16, 16)
    		);

    protected static final VoxelShape WEST_TOP = Shapes.or(
    		Block.box(10, 1, 1, 16, 10, 5),
    		Block.box(0, 1, 1, 6, 10, 5),
    		Block.box(0, 0, 1, 3, 1, 5),
    		Block.box(13, 0, 1, 16, 1, 5),
    		Block.box(0, 10, 0, 16, 16, 6)
    		);
    
    //MIDDLE
    protected static final VoxelShape NORTH_MIDDLE = Shapes.or(
    		Block.box(1, 1, 10, 5, 15, 16),
    		Block.box(1, 1, 0, 5, 15, 6),
    		Block.box(1, 0, 0, 5, 1, 3),
    		Block.box(1, 0, 13, 5, 1, 16),
    		Block.box(1, 15, 0, 5, 16, 3),
    		Block.box(1, 15, 13, 5, 16, 16)
    		);

    protected static final VoxelShape EAST_MIDDLE = Shapes.or(
    		Block.box(0, 1, 11, 6, 15, 15),
    		Block.box(10, 1, 11, 16, 15, 15),
    		Block.box(13, 0, 11, 16, 1, 15),
    		Block.box(0, 0, 11, 3, 1, 15),
    		Block.box(13, 15, 11, 16, 16, 15),
    		Block.box(0, 15, 11, 3, 16, 15)
    		);

    protected static final VoxelShape SOUTH_MIDDLE = Shapes.or(
    		Block.box(11, 1, 0, 15, 15, 6),
    		Block.box(11, 1, 10, 15, 15, 16),
    		Block.box(11, 0, 13, 15, 1, 16),
    		Block.box(11, 0, 0, 15, 1, 3),
    		Block.box(11, 15, 13, 15, 16, 16),
    		Block.box(11, 15, 0, 15, 16, 3)
    		);

    protected static final VoxelShape WEST_MIDDLE = Shapes.or(
    		Block.box(10, 1, 1, 16, 15, 5),
    		Block.box(0, 1, 1, 6, 15, 5),
    		Block.box(0, 0, 1, 3, 1, 5),
    		Block.box(13, 0, 1, 16, 1, 5),
    		Block.box(0, 15, 1, 3, 16, 5),
    		Block.box(13, 15, 1, 16, 16, 5)
    		);
    
    //BOTTOM

    protected static final VoxelShape NORTH_BOT = Shapes.or(
    		Block.box(1, 6, 0, 5, 15, 6),
    		Block.box(1, 6, 10, 5, 15, 16),
    		Block.box(1, 15, 13, 5, 16, 16),
    		Block.box(1, 15, 0, 5, 16, 3),
    		Block.box(0, 0, 0, 6, 6, 16)
    		);

    protected static final VoxelShape EAST_BOT = Shapes.or(
    		Block.box(10, 6, 11, 16, 15, 15),
    		Block.box(0, 6, 11, 6, 15, 15),
    		Block.box(0, 15, 11, 3, 16, 15),
    		Block.box(13, 15, 11, 16, 16, 15),
    		Block.box(0, 0, 10, 16, 6, 16)
    		);

    protected static final VoxelShape SOUTH_BOT = Shapes.or(
    		Block.box(11, 6, 10, 15, 15, 16),
    		Block.box(11, 6, 0, 15, 15, 6),
    		Block.box(11, 15, 0, 15, 16, 3),
    		Block.box(11, 15, 13, 15, 16, 16),
    		Block.box(10, 0, 0, 16, 6, 16)
    		);

    protected static final VoxelShape WEST_BOT = Shapes.or(
    		Block.box(0, 6, 1, 6, 15, 5),
    		Block.box(10, 6, 1, 16, 15, 5),
    		Block.box(13, 15, 1, 16, 16, 5),
    		Block.box(0, 15, 1, 3, 16, 5),
    		Block.box(0, 0, 0, 16, 6, 6)
    		);





    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos, CollisionContext selectionContext)
    {
        switch (state.getValue(FACING))
        {
       
            case EAST:
                switch (state.getValue(PART))
                { 
                case BASE:
                	return WEST;
                case TOP:
                	return WEST_TOP;
                case MIDDLE:
                	return WEST_MIDDLE;
                case BOTTOM:
                	return WEST_BOT;
                }
            case WEST:
                switch (state.getValue(PART))
                { 
                case BASE:
                	return EAST;
                case TOP:
                	return EAST_TOP;
                case MIDDLE:
                	return EAST_MIDDLE;
                case BOTTOM:
                	return EAST_BOT;
                }
            case SOUTH:
                switch (state.getValue(PART))
                { 
                case BASE:
                	return SOUTH;
                case TOP:
                	return SOUTH_TOP;
                case MIDDLE:
                	return SOUTH_MIDDLE;
                case BOTTOM:
                	return SOUTH_BOT;
                }
            default: case NORTH:
                switch (state.getValue(PART))
                { 
                case BASE:
                	return NORTH;
                case TOP:
                	return NORTH_TOP;
                case MIDDLE:
                	return NORTH_MIDDLE;
                case BOTTOM:
                	return NORTH_BOT;
                }

        }
		return null;
    }
    
    public ArrowSill(Block.Properties properties) {
		super(properties);
        this.registerDefaultState(this.stateDefinition.any()
          .setValue(FACING, Direction.NORTH)
          .setValue(PART, WindowPart.BASE));
    }
    
    @Override
    protected void createBlockStateDefinition(final StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(PART, FACING);
    }  
}


