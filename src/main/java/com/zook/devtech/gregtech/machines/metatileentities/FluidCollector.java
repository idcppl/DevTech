package com.zook.devtech.gregtech.machines.metatileentities;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gregtech.api.GTValues;
import gregtech.api.capability.impl.FluidTankList;
import gregtech.api.gui.ModularUI;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.MetaTileEntityHolder;
import gregtech.api.metatileentity.TieredMetaTileEntity;
import gregtech.api.render.Textures;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;

import javax.annotation.Nullable;
import java.util.List;


public class FluidCollector extends TieredMetaTileEntity {
    private final int production_cycle_length;
    private final FluidStack fluid;
    private final int fluidAmount;
    private FluidTank fluidTank;
    private final int tankSize;
    public FluidCollector(ResourceLocation metaTileEntityId, int tier, FluidStack fluid, int production_cycle_length, int tankSize) {
        super(metaTileEntityId, tier);
        this.fluid = fluid;
        this.fluidAmount =  fluid.amount;
        this.production_cycle_length = production_cycle_length;
        this.tankSize = tankSize;
        initializeInventory();
    }

    @Override
    public MetaTileEntity createMetaTileEntity(MetaTileEntityHolder holder) {
        return new FluidCollector(metaTileEntityId, getTier(), fluid, production_cycle_length, tankSize);
    }

    @Override
    protected void initializeInventory() {
        super.initializeInventory();
        this.fluidTank = new FluidTank(tankSize);
        this.fluidInventory = fluidTank;
        this.exportFluids = new FluidTankList(false, fluidTank);
    }

    @Override
    protected FluidTankList createExportFluidHandler() {
        return new FluidTankList(false, fluidTank);
    }

    @Override
    public void update() {
        super.update();

        if (!getWorld().isRemote) {
            long energyToConsume = GTValues.V[getTier()];
            if (getTimer() % production_cycle_length == 0L && energyContainer.getEnergyStored() >= energyToConsume) {
                FluidStack newFluid = new FluidStack(fluid, fluidAmount);
                if (exportFluids.fill(newFluid, false) == fluidAmount) {
                    exportFluids.fill(newFluid, true);
                    energyContainer.removeEnergy(energyToConsume);
                }
            }
            if (getTimer() % 5 == 0) {
                pushFluidsIntoNearbyHandlers(getFrontFacing());
            }
        }
    }

    @Override
    public void renderMetaTileEntity(CCRenderState renderState, Matrix4 translation, IVertexOperation[] pipeline) {
        super.renderMetaTileEntity(renderState, translation, pipeline);
        EnumFacing frontFacing = getFrontFacing();
        for (EnumFacing side : EnumFacing.VALUES) {
            if (side.getAxis().isHorizontal()) {
                Textures.AIR_VENT_OVERLAY.renderSided(side, renderState, translation, pipeline);
            } else {
                Textures.FILTER_OVERLAY.renderSided(side, renderState, translation, pipeline);
            }
        }
        Textures.PIPE_OUT_OVERLAY.renderSided(frontFacing, renderState, translation, pipeline);
    }

    @Override
    protected ModularUI createUI(EntityPlayer entityPlayer) {
        return null;
    }

    @Override
    protected boolean openGUIOnRightClick() {
        return false;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, boolean advanced) {
        tooltip.add(I18n.format("gregtech.machine.air_collector.collection_speed", fluidAmount, production_cycle_length));
        tooltip.add(I18n.format("gregtech.universal.tooltip.voltage_in", energyContainer.getInputVoltage(), GTValues.VN[getTier()]));
        tooltip.add(I18n.format("gregtech.universal.tooltip.energy_storage_capacity", energyContainer.getEnergyCapacity()));
        tooltip.add(I18n.format("gregtech.universal.tooltip.fluid_storage_capacity", exportFluids.getTankAt(0).getCapacity()));
    }
}