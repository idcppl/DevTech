package com.zook.devtech.gregtech.unification.impl;

import com.zook.devtech.gregtech.unification.IMaterialPredicate;
import gregtech.api.unification.material.type.Material;

import java.util.function.Predicate;

public class MCMaterialPredicate implements IMaterialPredicate {
    public final Predicate<Material> predicate;
    public MCMaterialPredicate(Predicate<Material> predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean test(Material mat) {
        return predicate.test(mat);
    }
}
