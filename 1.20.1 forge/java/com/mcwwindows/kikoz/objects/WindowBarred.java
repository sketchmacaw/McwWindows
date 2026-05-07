package com.mcwwindows.kikoz.objects;

import javax.annotation.Nullable;

import com.mcwwindows.kikoz.init.ItemInit;
import com.mcwwindows.kikoz.init.SoundsInit;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
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
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WindowBarred extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final EnumProperty<WindowState> WINDOWSTATE = EnumProperty.create("windowstate", WindowState.class);

    protected static final VoxelShape EE = box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D);
    protected static final VoxelShape NN = box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D);

    protected static final VoxelShape FIX = box(0.0D, 0.0D, 0.0D, 0.0D, 0.1D, 0.0D);

    public WindowBarred(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(HorizontalDirectionalBlock.FACING, Direction.NORTH)
                .setValue(WINDOWSTATE, WindowState.CLOSED));
    }

    public enum WindowState implements StringRepresentable {
        CLOSED("closed"),
        OPEN_LEFT("open_left"),
        OPEN_RIGHT("open_right"),
        LOCKED("locked");

        private final String name;

        WindowState(final String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String getSerializedName() {
            return this.name;
        }
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
        final WindowState windowState = state.getValue(WINDOWSTATE);
        Direction direction = state.getValue(FACING);

        if (windowState == WindowState.OPEN_LEFT || windowState == WindowState.OPEN_RIGHT) {
            return FIX;
        } else {
            if (direction == Direction.NORTH || direction == Direction.SOUTH) {
                return EE;
            } else {
                return NN;
            }
        }
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection());
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        ItemStack itemstack = player.getItemInHand(handIn);
        Item item = itemstack.getItem();
        WindowState windowState = state.getValue(WINDOWSTATE);

        if (item == ItemInit.KEY.get()) {
            this.lockWindow(level, pos, windowState != WindowState.LOCKED, state.getValue(FACING), 1000);
            level.playSound(null, pos, SoundEvents.IRON_TRAPDOOR_CLOSE, SoundSource.BLOCKS, 0.5F,
                    level.random.nextFloat() * 0.1F + 0.8F);
            state = state.setValue(WINDOWSTATE, windowState == WindowState.LOCKED ? WindowState.CLOSED : WindowState.LOCKED);
            level.setBlock(pos, state, 10);
            return InteractionResult.SUCCESS;
        }

        if (windowState == WindowState.LOCKED || item == this.asItem()) {
            return InteractionResult.PASS;
        } else {
            WindowState newState;
            if (windowState == WindowState.CLOSED) {
                newState = getHingeDirectionFromContext(pos, state.getValue(FACING), hit.getLocation());
                toggleWindowState(level, pos, newState);
                level.playSound(null, pos, SoundsInit.WINDOW_OPEN.get(), SoundSource.BLOCKS, 0.5F, level.random.nextFloat() * 0.1F + 0.8F);
            } else {
                newState = WindowState.CLOSED;
                toggleWindowState(level, pos, newState);
                level.playSound(null, pos, SoundsInit.WINDOW_CLOSE.get(), SoundSource.BLOCKS, 0.5F, level.random.nextFloat() * 0.1F + 0.8F);
            }

            state = state.setValue(WINDOWSTATE, newState);
            level.setBlock(pos, state, 10);
            return InteractionResult.SUCCESS;
        }
    }

    private WindowState getHingeDirectionFromContext(BlockPos blockpos, Direction direction, Vec3 clickLocation) {
        int j = direction.getStepX();
        int k = direction.getStepZ();
        double d0 = clickLocation.x - (double) blockpos.getX();
        double d1 = clickLocation.z - (double) blockpos.getZ();

        boolean left = (j >= 0 || !(d1 < 0.5D)) &&
                (j <= 0 || !(d1 > 0.5D)) &&
                (k >= 0 || !(d0 > 0.5D)) &&
                (k <= 0 || !(d0 < 0.5D));

        return left ? WindowState.OPEN_RIGHT : WindowState.OPEN_LEFT;
    }

    @Override
    public PushReaction getPistonPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }

    @Override
    @SuppressWarnings("deprecation")
    public BlockState mirror(BlockState state, Mirror mirror) {
        return mirror == Mirror.NONE ? state : state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
        return state.getValue(FACING).getAxis() == Direction.Axis.X ? NN : EE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WINDOWSTATE);
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    @SuppressWarnings("deprecation")
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, Level worldIn,
                                          BlockPos currentPos, BlockPos facingPos) {

        return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    private void toggleWindowState(Level world, BlockPos pos, WindowState newState) {
        BlockState state = world.getBlockState(pos);
        Direction facing = state.getValue(FACING);

        if (state.getValue(WINDOWSTATE) == newState) {
            return;
        }

        world.setBlockAndUpdate(pos, state.setValue(WINDOWSTATE, newState));

        toggleAdjacentWindows(world, pos.above(), facing, newState, 0, 100);
        toggleAdjacentWindows(world, pos.below(), facing, newState, 0, 100);
    }


    private void toggleAdjacentWindows(Level world, BlockPos pos, Direction facing, WindowState newState, int depth, int maxDepth) {
        BlockState state = world.getBlockState(pos);

        if (depth > maxDepth || state.getBlock() != this || state.getValue(FACING) != facing) {
            return;
        }

        if (state.getValue(WINDOWSTATE) != newState) {
            world.setBlockAndUpdate(pos, state.setValue(WINDOWSTATE, newState));

            toggleAdjacentWindows(world, pos.above(), facing, newState, depth + 1, maxDepth);
            toggleAdjacentWindows(world, pos.below(), facing, newState, depth + 1, maxDepth);
        }
    }

    private void lockWindow(Level world, BlockPos pos, boolean targetOpen, Direction targetDirection, int depth) {
        if (depth <= 0) return;

        BlockState state = world.getBlockState(pos);
        if (state.getBlock() == this) {
            boolean isLocked = state.getValue(WINDOWSTATE) == WindowState.LOCKED;
            Direction direction = state.getValue(FACING);
            if (isLocked != targetOpen && direction.equals(targetDirection)) {
                world.setBlockAndUpdate(pos, state.setValue(WINDOWSTATE, targetOpen ? WindowState.LOCKED : WindowState.CLOSED));

                Direction[] directions;
                if (direction.getAxis() == Direction.Axis.X) {
                    directions = new Direction[] {Direction.SOUTH, Direction.NORTH};
                } else {
                    directions = new Direction[] {Direction.EAST, Direction.WEST};
                }

                for (Direction dir : directions) {
                    lockWindow(world, pos.relative(dir), targetOpen, targetDirection, depth - 2);
                }

                for (int y = 1; y <= 2; y++) {
                    lockWindow(world, pos.above(y), targetOpen, targetDirection, depth - 2);
                    lockWindow(world, pos.below(y), targetOpen, targetDirection, depth - 2);
                }
            }
        }
    }
}