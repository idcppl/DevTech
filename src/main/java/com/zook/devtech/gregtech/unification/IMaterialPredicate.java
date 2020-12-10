package com.zook.devtech.gregtech.unification;

import crafttweaker.annotations.ZenRegister;
import gregtech.api.unification.material.type.*;
import stanhebben.zenscript.annotations.*;

import javax.annotation.Nonnull;

@FunctionalInterface
@ZenClass("mods.devtech.unification.IMaterialPredicate")
@ZenRegister
public interface IMaterialPredicate {
    @ZenMethod
    @ZenOperator(OperatorType.CONTAINS)
    boolean test(Material mat);

    @Nonnull
    @ZenMethod
    @ZenOperator(OperatorType.OR)
    default IMaterialPredicate or(@Nonnull IMaterialPredicate other) {
        return t -> test(t) || other.test(t);
    }

    @Nonnull
    @ZenMethod
    @ZenOperator(OperatorType.NEG)
    default IMaterialPredicate negate() {
        return t -> !test(t);
    }

    @Nonnull
    @ZenMethod
    @ZenOperator(OperatorType.AND)
    default IMaterialPredicate and(@Nonnull IMaterialPredicate other) {
        return t -> test(t) && other.test(t);
    }

    @ZenProperty IMaterialPredicate isFluid = mat -> mat instanceof FluidMaterial;
    @ZenProperty IMaterialPredicate isDust = mat -> mat instanceof DustMaterial;
    @ZenProperty IMaterialPredicate isSolid = mat -> mat instanceof SolidMaterial;
    @ZenProperty IMaterialPredicate isGem = mat -> mat instanceof GemMaterial;
    @ZenProperty IMaterialPredicate isIngot = mat -> mat instanceof IngotMaterial;

    @ZenMethod
    static IMaterialPredicate hasFlag(String flag) {
        return mat -> mat.hasFlag(flag);
    }
}
