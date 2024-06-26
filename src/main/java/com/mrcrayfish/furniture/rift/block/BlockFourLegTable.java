package com.mrcrayfish.furniture.rift.block;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mrcrayfish.furniture.rift.utils.VoxelShapeHelper;
import net.minecraft.block.Block;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: MrCrayfish
 */
public class BlockFourLegTable extends BlockWaterlogged
{
    public static final BooleanProperty FORWARD = BooleanProperty.create("forward");
    public static final BooleanProperty BACK = BooleanProperty.create("back");
    public static final BooleanProperty LEFT = BooleanProperty.create("left");
    public static final BooleanProperty RIGHT = BooleanProperty.create("right");

    public final ImmutableMap<IBlockState, VoxelShape> SHAPES;

    public BlockFourLegTable(Properties builder)
    {
        super(builder);
        SHAPES = this.generateShapes(this.getStateContainer().getValidStates());
    }

    private ImmutableMap<IBlockState, VoxelShape> generateShapes(ImmutableList<IBlockState> states)
    {
        final VoxelShape TABLE_TOP_SHAPE = Block.makeCuboidShape(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
        final VoxelShape LEG_BACK_RIGHT_SHAPE = Block.makeCuboidShape(1.0, 0.0, 13.5, 2.5, 14.0, 15.0);
        final VoxelShape LEG_FRONT_RIGHT_SHAPE = Block.makeCuboidShape(1.0, 0.0, 1.0, 2.5, 14.0, 2.5);
        final VoxelShape LEG_BACK_LEFT_SHAPE = Block.makeCuboidShape(13.5, 0.0, 13.5, 15.0, 14.0, 15.0);
        final VoxelShape LEG_FRONT_LEFT_SHAPE = Block.makeCuboidShape(13.5, 0.0, 1.0, 15.0, 14.0, 2.5);

        ImmutableMap.Builder<IBlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
        for(IBlockState state : states)
        {
            boolean forward = state.get(FORWARD);
            boolean back = state.get(BACK);
            boolean left = state.get(LEFT);
            boolean right = state.get(RIGHT);

            List<VoxelShape> shapes = new ArrayList<>();
            shapes.add(TABLE_TOP_SHAPE);
            if(!forward)
            {
                if(!right) shapes.add(LEG_FRONT_LEFT_SHAPE);
                if(!left) shapes.add(LEG_FRONT_RIGHT_SHAPE);
            }
            if(!back)
            {
                if(!right) shapes.add(LEG_BACK_LEFT_SHAPE);
                if(!left) shapes.add(LEG_BACK_RIGHT_SHAPE);
            }

            builder.put(state, VoxelShapeHelper.combineAll(shapes));
        }
        return builder.build();
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isTopSolid(IBlockState state)
    {
        return true;
    }

    @Override
    public VoxelShape getShape(IBlockState state, IBlockReader reader, BlockPos pos)
    {
        return SHAPES.get(state);
    }

    @Override
    public VoxelShape getCollisionShape(IBlockState state, IBlockReader reader, BlockPos pos)
    {
        return SHAPES.get(state);
    }

    @Override
    public IBlockState updatePostPlacement(IBlockState state, EnumFacing facing, IBlockState neighbourState, IWorld world, BlockPos pos, BlockPos neighbourPos)
    {
        boolean forward = world.getBlockState(pos.north()).getBlock() == this;
        boolean back = world.getBlockState(pos.south()).getBlock() == this;
        boolean left = world.getBlockState(pos.west()).getBlock() == this;
        boolean right = world.getBlockState(pos.east()).getBlock() == this;
        return state.with(FORWARD, forward).with(BACK, back).with(LEFT, left).with(RIGHT, right);
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, IBlockState> builder)
    {
        super.fillStateContainer(builder);
        builder.add(FORWARD);
        builder.add(BACK);
        builder.add(LEFT);
        builder.add(RIGHT);
    }

    @Override
    public BlockFaceShape getBlockFaceShape(IBlockReader p_getBlockFaceShape_1_, IBlockState p_getBlockFaceShape_2_, BlockPos p_getBlockFaceShape_3_, EnumFacing p_getBlockFaceShape_4_)
    {
        return BlockFaceShape.UNDEFINED;
    }
}
