package com.zook.devtech.gregtech.unification;

import crafttweaker.api.block.IBlockState;
import crafttweaker.api.minecraft.CraftTweakerMC;

public interface IBlockStateSupplier {
    net.minecraft.block.state.IBlockState get();

    static IBlockStateSupplier make(IBlockState blockState) {
        return () -> CraftTweakerMC.getBlockState(blockState);
    }
}
