package com.zook.devtech.gregtech.unification.impl;

import com.zook.devtech.gregtech.unification.IBlockStatePredicate;
import crafttweaker.api.minecraft.CraftTweakerMC;
import net.minecraft.block.state.IBlockState;

import java.util.function.Predicate;

public class MCBlockStatePredicate implements IBlockStatePredicate {
    public final Predicate<IBlockState> predicate;
    MCBlockStatePredicate(Predicate<IBlockState> predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean test(crafttweaker.api.block.IBlockState blockState) {
        return predicate.test(CraftTweakerMC.getBlockState(blockState));
    }
}
