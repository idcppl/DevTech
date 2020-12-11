package com.zook.devtech.gregtech.recipes;

import crafttweaker.annotations.ZenRegister;
import gregtech.api.recipes.machines.FuelRecipeMap;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.devtech.IRecipeMap")
@ZenRegister
public class IFuelRecipeMap {
    @ZenMethod
    public static FuelRecipeMap build(String name) {
        return new FuelRecipeMap(name);
    }
}
