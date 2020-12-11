package com.zook.devtech.gregtech.unification;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.block.IBlockState;
import crafttweaker.api.minecraft.CraftTweakerMC;
import stanhebben.zenscript.annotations.OperatorType;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;
import stanhebben.zenscript.annotations.ZenOperator;

import java.util.function.Predicate;

@FunctionalInterface
@ZenClass("mods.devtech.unification.IBlockStatePredicate")
@ZenRegister
public interface IBlockStatePredicate {
    @ZenMethod
    @ZenOperator(OperatorType.CONTAINS)
    boolean test(IBlockState blockState);

    static Predicate<net.minecraft.block.state.IBlockState> toInternal(IBlockStatePredicate thing) {
        return t -> thing.test(CraftTweakerMC.getBlockState(t));
    }
}
