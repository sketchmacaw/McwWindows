package com.mcwwindows.kikoz.objects;

import com.mcwwindows.kikoz.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class ConnectedWindow extends Block {
	public static final DirectionProperty FACING = DirectionProperty.create("facing", Direction.NORTH, Direction.EAST);
	public static final EnumProperty<ConnectionStatus> PART = EnumProperty.create("part", ConnectionStatus.class);

	protected static final VoxelShape EE = box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D);
	protected static final VoxelShape NN = box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D);

	public ConnectedWindow(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(PART, ConnectionStatus.BASE));
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
		return state.getValue(FACING).getAxis() == Direction.Axis.X ? NN : EE;
	}

	public enum ConnectionStatus implements StringRepresentable {

		BASE("base"), TOP("top"), MIDDLE("middle"), BOTTOM("bottom"),

		TOP_L("top_l"), TOP_M("top_m"), TOP_R("top_r"),

		MID_L("mid_l"), MID_M("mid_m"), MID_R("mid_r"),

		BOT_L("bot_l"), BOT_M("bot_m"), BOT_R("bot_r"),

		SINGLE_L("single_l"), SINGLE_M("single_m"), SINGLE_R("single_r");

		private final String name;

		private ConnectionStatus(String name) {
			this.name = name;
		}

		@Override
		public String getSerializedName() {
			return name;
		}
	}

	protected BlockState WindowState(BlockState state, LevelAccessor level, BlockPos pos) {
		boolean above = level.getBlockState(pos.above()).getBlock() == this;
		boolean below = level.getBlockState(pos.below()).getBlock() == this;

		boolean north = level.getBlockState(pos.north()).getBlock() == this;
		boolean east = level.getBlockState(pos.east()).getBlock() == this;
		boolean south = level.getBlockState(pos.south()).getBlock() == this;
		boolean west = level.getBlockState(pos.west()).getBlock() == this;

		switch (state.getValue(FACING)) {
			case NORTH:
				if (above != true && below == true) {
					if (east == true && west == true) {
						return state.setValue(PART, ConnectionStatus.TOP_M);
					} else if (east != true && west == true) {
						return state.setValue(PART, ConnectionStatus.TOP_L);
					} else if (east == true && west != true) {
						return state.setValue(PART, ConnectionStatus.TOP_R);
					} else {
						return state.setValue(PART, ConnectionStatus.TOP);
					}
				} else if (above == true && below == true) {
					if (east == true && west == true) {
						return state.setValue(PART, ConnectionStatus.MID_M);
					} else if (east != true && west == true) {
						return state.setValue(PART, ConnectionStatus.MID_L);
					} else if (east == true && west != true) {
						return state.setValue(PART, ConnectionStatus.MID_R);
					} else {
						return state.setValue(PART, ConnectionStatus.MIDDLE);
					}
				} else if (above == true && below != true) {
					if (east == true && west == true) {
						return state.setValue(PART, ConnectionStatus.BOT_M);
					} else if (east != true && west == true) {
						return state.setValue(PART, ConnectionStatus.BOT_L);
					} else if (east == true && west != true) {
						return state.setValue(PART, ConnectionStatus.BOT_R);
					} else {
						return state.setValue(PART, ConnectionStatus.BOTTOM);
					}
				} else if (above != true && below != true) {
					if (east == true && west == true) {
						return state.setValue(PART, ConnectionStatus.SINGLE_M);
					} else if (east != true && west == true) {
						return state.setValue(PART, ConnectionStatus.SINGLE_L);
					} else if (east == true && west != true) {
						return state.setValue(PART, ConnectionStatus.SINGLE_R);
					} else {
						return state.setValue(PART, ConnectionStatus.BASE);
					}
				}

			case EAST:
				if (above != true && below == true) {
					if (north == true && south == true) {
						return state.setValue(PART, ConnectionStatus.TOP_M);
					} else if (north != true && south == true) {
						return state.setValue(PART, ConnectionStatus.TOP_R);
					} else if (north == true && south != true) {
						return state.setValue(PART, ConnectionStatus.TOP_L);
					} else {
						return state.setValue(PART, ConnectionStatus.TOP);
					}
				} else if (above == true && below == true) {
					if (north == true && south == true) {
						return state.setValue(PART, ConnectionStatus.MID_M);
					} else if (north != true && south == true) {
						return state.setValue(PART, ConnectionStatus.MID_R);
					} else if (north == true && south != true) {
						return state.setValue(PART, ConnectionStatus.MID_L);
					} else {
						return state.setValue(PART, ConnectionStatus.MIDDLE);
					}
				} else if (above == true && below != true) {
					if (north == true && south == true) {
						return state.setValue(PART, ConnectionStatus.BOT_M);
					} else if (north != true && south == true) {
						return state.setValue(PART, ConnectionStatus.BOT_R);
					} else if (north == true && south != true) {
						return state.setValue(PART, ConnectionStatus.BOT_L);
					} else {
						return state.setValue(PART, ConnectionStatus.BOTTOM);
					}
				} else if (above != true && below != true) {
					if (north == true && south == true) {
						return state.setValue(PART, ConnectionStatus.SINGLE_M);
					} else if (north != true && south == true) {
						return state.setValue(PART, ConnectionStatus.SINGLE_R);
					} else if (north == true && south != true) {
						return state.setValue(PART, ConnectionStatus.SINGLE_L);
					} else {
						return state.setValue(PART, ConnectionStatus.BASE);
					}
				}
			default:
				break;
		}

		return state.setValue(PART, ConnectionStatus.BASE);

	}


	private boolean wasInteractedWith = false;

	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn,
								 BlockHitResult hit) {
		ItemStack itemstack = player.getItemInHand(handIn);
		Item item = itemstack.getItem();

		if (item == ItemInit.HAMMER.get() || item == Items.SHEARS) {
			BlockState newState = state.cycle(PART);
			level.setBlockAndUpdate(pos, newState);
			setWasInteractedWith(true, level, pos);

			return InteractionResult.SUCCESS;
		}
		return InteractionResult.PASS;
	}

	public void setWasInteractedWith(boolean interacted, Level level, BlockPos pos) {
		this.wasInteractedWith = interacted;
	}

	@Override
	public void onPlace(BlockState state, Level level, BlockPos pos, BlockState statetwo, boolean bool) {
		if (!statetwo.is(state.getBlock())) {
			level.setBlock(pos, this.WindowState(state, level, pos), 2);
			wasInteractedWith = false;
		}
	}

	@Override
	public BlockState updateShape(BlockState state, Direction dir, BlockState statetwo, LevelAccessor access,
								  BlockPos pos, BlockPos postwo) {
		if (wasInteractedWith) {
			return state;
		}
		return this.WindowState(state, access, pos);
	}


	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(PART, FACING);
	}

	@Override
	@Nullable
	public BlockState getStateForPlacement(BlockPlaceContext contx) {
		Direction facingDirection = contx.getHorizontalDirection();
		LevelAccessor world = contx.getLevel();

		if (facingDirection == Direction.WEST) {
			facingDirection = Direction.EAST;
		} else if (facingDirection == Direction.SOUTH) {
			facingDirection = Direction.NORTH;
		}

		return this.WindowState(super.getStateForPlacement(contx), world, contx.getClickedPos())
				.setValue(FACING, facingDirection);
	}

}