package com.mcwwindows.kikoz.objects;

import javax.annotation.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Curtain extends Block {
	private static final EnumProperty<TiedEnum> TIED = EnumProperty.create("tied", TiedEnum.class);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	//56 States

	String infoname;
	boolean hasTextInfo = true;

	protected static final VoxelShape WEST = Shapes.or(box(0, 0, 14, 16, 16, 16));

	protected static final VoxelShape SOUTH = Shapes.or(box(14, 0, 0, 16, 16, 16));

	protected static final VoxelShape EAST = Shapes.or(box(0, 0, 0, 16, 16, 2));

	protected static final VoxelShape NORTH = Shapes.or(box(0, 0, 0, 2, 16, 16));

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

	@Override
	public VoxelShape getCollisionShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	public Curtain(Block.Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any()
				.setValue(FACING, Direction.NORTH)
				.setValue(TIED, TiedEnum.NONE)
		);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}


	public void onBroken(Level worldIn, BlockPos pos) {
		worldIn.levelEvent(1029, pos, 0);
	}

	@Override
	public RenderShape getRenderShape(BlockState state) {
		return RenderShape.MODEL;
	}

	@Override
	@Nullable
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		BlockState state = super.getStateForPlacement(context);
		return state.setValue(FACING, context.getHorizontalDirection().getClockWise());
	}

	@Override
	public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
		boolean isCrouching = player.isCrouching();
		ItemStack itemstack = player.getItemInHand(hand);
		Item item = itemstack.getItem();

		if (item == this.asItem())
		{
			return InteractionResult.PASS;
		} else {

			int cycleDirection = isCrouching ? -1 : 1;
			TiedEnum currentTied = state.getValue(TIED);

			int nextIndex = (currentTied.ordinal() + cycleDirection + TiedEnum.values().length) % TiedEnum.values().length;

			TiedEnum nextTied = TiedEnum.values()[nextIndex];
			state = state.setValue(TIED, nextTied);

			world.setBlock(pos, state, 2);
			return InteractionResult.SUCCESS;


		}
	}

	@SuppressWarnings("deprecation")
	public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, Level worldIn, BlockPos currentPos, BlockPos facingPos) {
		return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	}

	@Override
	protected void createBlockStateDefinition(final StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(TIED, FACING);
	}

	public enum TiedEnum implements StringRepresentable
	{
		NONE("none"),
		LEFT("left"),
		RIGHT("right"),

		HALF_RIGHT_TIE("half_right_tie"),
		HALF_RIGHT("half_right"),
		HALF_RIGHT_BOTTOM("half_right_bottom"),

		HALF_LEFT_TIE("half_left_tie"),
		HALF_LEFT("half_left"),
		HALF_LEFT_BOTTOM("half_left_bottom"),

		SINGLE("single"),
		HALF_SINGLE("half_single"),

		BASE_WAVE("base_wave"),
		BASE_HALF_WAVE("base_half_wave");

		private final String name;

		TiedEnum(final String name)
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
	}}