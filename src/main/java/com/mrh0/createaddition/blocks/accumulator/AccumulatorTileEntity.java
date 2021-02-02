package com.mrh0.createaddition.blocks.accumulator;

import com.mrh0.createaddition.energy.BaseElectricTileEntity;
import com.mrh0.createaddition.energy.IWireNode;

import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.energy.IEnergyStorage;

public class AccumulatorTileEntity extends BaseElectricTileEntity implements IWireNode {

	public AccumulatorTileEntity(TileEntityType<?> tileEntityTypeIn) {
		super(tileEntityTypeIn);
	}

	@Override
	public Vector3f getNodePosition(int node) {
		return new Vector3f(0f, 1f/16f, 0f);
	}

	@Override
	public IEnergyStorage getNodeEnergyStorage(int node) {
		return energy;
	}

	@Override
	public boolean isEnergyInput(Direction side) {
		return false;
	}

	@Override
	public boolean isEnergyOutput(Direction side) {
		return false;
	}

	@Override
	public void setNode(int node, BlockPos pos) {
		
	}

	@Override
	public BlockPos getNode(int nodes) {
		return null;
	}
}
