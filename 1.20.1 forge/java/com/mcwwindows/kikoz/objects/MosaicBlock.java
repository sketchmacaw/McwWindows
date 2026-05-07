package com.mcwwindows.kikoz.objects;

import javax.annotation.Nullable;

import com.mcwwindows.kikoz.util.WindowPart;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.BeaconBeamBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StainedGlassBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public class MosaicBlock extends StainedGlassBlock implements BeaconBeamBlock {
	
    public static final EnumProperty<WindowPart> PART = EnumProperty.create("part", WindowPart.class);
	
	private DyeColor color;
    
    public DyeColor getColor() {
        return this.color;
     }
    
    public MosaicBlock(DyeColor color, Block.Properties properties) {
		super(color, properties);
        this.color = color;
        this.registerDefaultState(this.stateDefinition.any()
          .setValue(PART, WindowPart.BASE));
    }
    
    private BlockState WindowState(BlockState state, LevelAccessor level, BlockPos pos) {
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
		return this.WindowState(super.getStateForPlacement(context), context.getLevel(), context.getClickedPos());
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
       builder.add(PART);
   }


}
