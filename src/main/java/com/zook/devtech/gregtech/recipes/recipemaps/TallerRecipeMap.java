package com.zook.devtech.gregtech.recipes.recipemaps;

import gregtech.api.capability.impl.FluidTankList;
import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.ModularUI;
import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import net.minecraftforge.items.IItemHandlerModifiable;
import gregtech.api.gui.ModularUI.Builder;

import java.util.function.DoubleSupplier;

public class TallerRecipeMap extends RecipeMap<SimpleRecipeBuilder> {
    public TallerRecipeMap(String unlocalizedName, int minInputs, int maxInputs, int minOutputs, int maxOutputs, int minFluidInputs,
                         int maxFluidInputs, int minFluidOutputs, int maxFluidOutputs, SimpleRecipeBuilder defaultRecipe) {
        super(unlocalizedName, minInputs, maxInputs, minOutputs, maxOutputs, minFluidInputs, maxFluidInputs, minFluidOutputs, maxFluidOutputs, defaultRecipe);
    }

    @Override
    public ModularUI.Builder createUITemplate(DoubleSupplier progressSupplier, IItemHandlerModifiable importItems, IItemHandlerModifiable exportItems, FluidTankList importFluids, FluidTankList exportFluids) {
        ModularUI.Builder builder = new Builder(GuiTextures.BACKGROUND, 176, 266);
        builder.widget(new ProgressWidget(progressSupplier, 77, 22, 20, 20, progressBarTexture, moveType));
        addInventorySlotGroup(builder, importItems, importFluids, false);
        addInventorySlotGroup(builder, exportItems, exportFluids, true);
        return builder;
    }
}
