package com.zook.devtech.gregtech.machines;

import com.zook.devtech.DevTech;
import com.zook.devtech.gregtech.machines.constants.ConstantOverlays;
import com.zook.devtech.gregtech.machines.metatileentities.FluidCollector;
import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.liquid.ILiquidStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import gregtech.api.GregTechAPI;
import gregtech.api.metatileentity.SimpleGeneratorMetaTileEntity;
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.machines.FuelRecipeMap;
import gregtech.api.unification.material.type.SolidMaterial;
import gregtech.common.metatileentities.electric.MetaTileEntityMacerator;
import gregtech.common.metatileentities.storage.MetaTileEntityChest;
import gregtech.common.metatileentities.storage.MetaTileEntityQuantumChest;
import gregtech.common.metatileentities.storage.MetaTileEntityQuantumTank;
import gregtech.common.metatileentities.storage.MetaTileEntityTank;
import net.minecraft.util.ResourceLocation;

import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.devtech.machines.RegisterMachine")
@ZenRegister
public class IRegisterMachine {
    @ZenMethod
    public static void CreateSimpleMachine(int id, String nameID, RecipeMap<?> recipeMap, IOverlayRenderer renderer, int tier) {
        GregTechAPI.registerMetaTileEntity(id, new SimpleMachineMetaTileEntity(new ResourceLocation(DevTech.MODID, nameID), recipeMap, renderer.getInternal(), tier));
    }

    @ZenMethod
    public static void CreateSimpleMachine(int id, String nameID, RecipeMap<?> recipeMap, ConstantOverlays renderer, int tier) {
        GregTechAPI.registerMetaTileEntity(id, new SimpleMachineMetaTileEntity(new ResourceLocation(DevTech.MODID, nameID), recipeMap, renderer.getInternal().getInternal(), tier));
    }

    @ZenMethod
    public static void CreateSimpleGenerator(int id, String nameID, FuelRecipeMap fuelRecipeMap, IOverlayRenderer renderer, int tier) {
        GregTechAPI.registerMetaTileEntity(id, new SimpleGeneratorMetaTileEntity(new ResourceLocation(DevTech.MODID, nameID), fuelRecipeMap, renderer.getInternal(), tier));
    }

    @ZenMethod
    public static void CreateSimpleGenerator(int id, String nameID, FuelRecipeMap fuelRecipeMap, ConstantOverlays renderer, int tier) {
        GregTechAPI.registerMetaTileEntity(id, new SimpleGeneratorMetaTileEntity(new ResourceLocation(DevTech.MODID, nameID), fuelRecipeMap, renderer.getInternal().getInternal(), tier));
    }

    @ZenMethod
    public static void CreateMacerator(int id, String nameID, RecipeMap<?> recipeMap, IOverlayRenderer renderer, int tier, int outputAmount) {
        GregTechAPI.registerMetaTileEntity(id, new MetaTileEntityMacerator(new ResourceLocation(DevTech.MODID, nameID), recipeMap, outputAmount, renderer.getInternal(), tier));
    }

    @ZenMethod
    public static void CreateMacerator(int id, String nameID, RecipeMap<?> recipeMap, ConstantOverlays renderer, int tier, int outputAmount) {
        GregTechAPI.registerMetaTileEntity(id, new MetaTileEntityMacerator(new ResourceLocation(DevTech.MODID, nameID), recipeMap, outputAmount, renderer.getInternal().getInternal(), tier));
    }

    @ZenMethod
    public static void CreateChest(int id, String nameID, SolidMaterial material, int rowSize, int amountRows) {
        GregTechAPI.registerMetaTileEntity(id, new MetaTileEntityChest(new ResourceLocation(DevTech.MODID, nameID), material, rowSize, amountRows));
    }

    @ZenMethod
    public static void CreateTank(int id, String nameID, SolidMaterial material, int tankSize, int maxSizeVertical, int maxSizeHorizontal) {
        GregTechAPI.registerMetaTileEntity(id, new MetaTileEntityTank(new ResourceLocation(DevTech.MODID, nameID), material, tankSize, maxSizeVertical, maxSizeHorizontal));
    }

    @ZenMethod
    public static void CreateQuantumChest(int id, String nameID, int tier, long storage) {
        GregTechAPI.registerMetaTileEntity(id, new MetaTileEntityQuantumChest(new ResourceLocation(DevTech.MODID, nameID), tier, storage));
    }

    @ZenMethod
    public static void CreateQuantumTank(int id, String nameID, int tier, int storage) {
        GregTechAPI.registerMetaTileEntity(id, new MetaTileEntityQuantumTank(new ResourceLocation(DevTech.MODID, nameID), tier, storage));
    }

    @ZenMethod
    public static void CreateFluidCollector(int id, String nameID, int tier, ILiquidStack fluid, int cycleLength, int tankSize) {
        GregTechAPI.registerMetaTileEntity(id, new FluidCollector(new ResourceLocation(DevTech.MODID, nameID), tier, CraftTweakerMC.getLiquidStack(fluid), cycleLength, tankSize));
    }
}
