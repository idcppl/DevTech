package com.zook.devtech.gregtech.recipes;

import com.zook.devtech.gregtech.recipes.constants.ConstantMoveType;
import crafttweaker.annotations.ZenRegister;
import gregtech.api.gui.resources.TextureArea;
import gregtech.api.gui.widgets.ProgressWidget.MoveType;
import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.BlastRecipeBuilder;
import gregtech.api.recipes.builders.IntCircuitRecipeBuilder;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ZenClass("mods.devtech.IRecipeMap")
@ZenRegister
public class IRecipeMap {
    private final String name;
    private int minInputs = 0;
    private int maxInputs = 0;
    private int minOutputs = 0;
    private int maxOutputs = 0;
    private int minFluidInputs = 0;
    private int maxFluidInputs = 0;
    private int minFluidOutputs = 0;
    private int maxFluidOutputs = 0;
    private boolean ifso = false;
    private MoveType move;
    private TextureArea progressBar;
    private List<IOverlaySlots> overlay = new ArrayList<>();

    public IRecipeMap(String name) {
        this.name = name;
    }

    @ZenMethod
    public static IRecipeMap recipeMapBuilder(String name) {
        return new IRecipeMap(name);
    }

    @ZenMethod
    public static IRecipeMap recipeMapBuilder(String name, int minInputs, int maxInputs, int minOutputs, int maxOutputs, int minFluidInputs, int maxFluidInputs, int minFluidOutputs, int maxFluidOutputs) {
        return recipeMapBuilder(name)
                .minInputs(minInputs)
                .maxInputs(maxInputs)
                .minOutputs(minOutputs)
                .maxOutputs(maxOutputs)
                .minFluidInputs(minFluidInputs)
                .maxFluidInputs(maxFluidInputs)
                .minFluidOutputs(minFluidOutputs)
                .maxFluidOutputs(maxFluidOutputs);
    }

    @ZenMethod
    public IRecipeMap minInputs(int min) {
        minInputs = min;
        return this;
    }

    @ZenMethod
    public IRecipeMap maxInputs(int max) {
        maxInputs = max;
        return this;
    }

    @ZenMethod
    public IRecipeMap minOutputs(int min) {
        minOutputs = min;
        return this;
    }

    @ZenMethod
    public IRecipeMap maxOutputs(int max) {
        maxOutputs = max;
        return this;
    }

    @ZenMethod
    public IRecipeMap minFluidInputs(int min) {
        minFluidInputs = min;
        return this;
    }

    @ZenMethod
    public IRecipeMap maxFluidInputs(int max) {
        maxFluidInputs = max;
        return this;
    }

    @ZenMethod
    public IRecipeMap minFluidOutputs(int min) {
        minFluidOutputs = min;
        return this;
    }

    @ZenMethod
    public IRecipeMap maxFluidOutputs(int max) {
        maxFluidOutputs = max;
        return this;
    }

    @ZenMethod
    public IRecipeMap setOverlaySlots(IOverlaySlots... overlaySlots) {
        overlay.addAll(Arrays.asList(overlaySlots));
        return this;
    }

    @ZenMethod
    public IRecipeMap setProgressBar(IDTTextureArea texture, ConstantMoveType type) {
        progressBar = texture.getInternal();
        move = type.getInternal();
        ifso = true;
        return this;
    }

    @ZenMethod
    public RecipeMap<?> build() {
        RecipeMap<?> recipeMap = new RecipeMap<>(name,
                minInputs,
                maxInputs,
                minOutputs,
                maxOutputs,
                minFluidInputs,
                maxFluidInputs,
                minFluidOutputs,
                maxFluidOutputs, new SimpleRecipeBuilder());
        for (IOverlaySlots iOverlaySlots : overlay) {
            recipeMap.setSlotOverlay(iOverlaySlots.getOutput(), iOverlaySlots.getFluid(), iOverlaySlots.getLast(), iOverlaySlots.getTextureArea());
            if(iOverlaySlots.getBoth()) {
                recipeMap.setSlotOverlay(iOverlaySlots.getOutput(), iOverlaySlots.getFluid(), true, iOverlaySlots.getTextureArea());
            }
        }
        if(ifso) {
            recipeMap.setProgressBar(progressBar, move);
        }
        return recipeMap;
    }

    @ZenMethod
    public RecipeMap<?> buildCircuit() {
        RecipeMap<?> recipeMap = new RecipeMap<>(name,
                minInputs,
                maxInputs,
                minOutputs,
                maxOutputs,
                minFluidInputs,
                maxFluidInputs,
                minFluidOutputs,
                maxFluidOutputs, new IntCircuitRecipeBuilder());
        for (IOverlaySlots iOverlaySlots : overlay) {
            recipeMap.setSlotOverlay(iOverlaySlots.getOutput(), iOverlaySlots.getFluid(), iOverlaySlots.getLast(), iOverlaySlots.getTextureArea());
            if(iOverlaySlots.getBoth()) {
                recipeMap.setSlotOverlay(iOverlaySlots.getOutput(), iOverlaySlots.getFluid(), true, iOverlaySlots.getTextureArea());
            }
        }
        if(ifso) {
            recipeMap.setProgressBar(progressBar, move);
        }
        return recipeMap;
    }

    @ZenMethod
    public RecipeMap<?> buildBlast() {
        RecipeMap<?> recipeMap = new RecipeMap<>(name,
                minInputs,
                maxInputs,
                minOutputs,
                maxOutputs,
                minFluidInputs,
                maxFluidInputs,
                minFluidOutputs,
                maxFluidOutputs, new BlastRecipeBuilder());
        for (IOverlaySlots iOverlaySlots : overlay) {
            recipeMap.setSlotOverlay(iOverlaySlots.getOutput(), iOverlaySlots.getFluid(), iOverlaySlots.getLast(), iOverlaySlots.getTextureArea());
            if(iOverlaySlots.getBoth()) {
                recipeMap.setSlotOverlay(iOverlaySlots.getOutput(), iOverlaySlots.getFluid(), true, iOverlaySlots.getTextureArea());
            }
        }
        if(ifso) {
            recipeMap.setProgressBar(progressBar, move);
        }
        return recipeMap;
    }

    @ZenMethod
    public static void cloneSimple(RecipeMap<?> map1, RecipeMap<SimpleRecipeBuilder> map2) {
        for(Recipe recipe : map1.getRecipeList()) {
            new SimpleRecipeBuilder(recipe, map2).buildAndRegister();
        }
    }

    @ZenMethod
    public static void cloneCircuit(RecipeMap<?> map1, RecipeMap<IntCircuitRecipeBuilder> map2) {
        for(Recipe recipe : map1.getRecipeList()) {
            new IntCircuitRecipeBuilder(recipe, map2).buildAndRegister();
        }
    }

    @ZenMethod
    public static void cloneBlast(RecipeMap<?> map1, RecipeMap<BlastRecipeBuilder> map2) {
        for(Recipe recipe : map1.getRecipeList()) {
            new BlastRecipeBuilder(recipe, map2).buildAndRegister();
        }
    }
}
