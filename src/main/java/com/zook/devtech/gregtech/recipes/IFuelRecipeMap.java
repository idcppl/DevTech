package com.zook.devtech.gregtech.recipes;

import gregtech.api.recipes.machines.FuelRecipeMap;

public class IFuelRecipeMap {
    public static FuelRecipeMap build(String name) {
        return new FuelRecipeMap(name);
    }
}
