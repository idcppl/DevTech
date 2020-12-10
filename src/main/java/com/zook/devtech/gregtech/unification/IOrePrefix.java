package com.zook.devtech.gregtech.unification;


import crafttweaker.annotations.ZenRegister;
import gregtech.api.unification.material.MaterialIconType;
import gregtech.api.unification.material.type.Material;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraftforge.common.util.EnumHelper;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

import javax.annotation.Nullable;
import java.util.function.Predicate;

@ZenClass("mods.devtech.unification.IOrePrefix")
@ZenRegister
public class IOrePrefix {
    @Nullable
    private final OrePrefix orePrefix;

    @Nullable
    IOrePrefix(String value, String categoryName, long materialAmount, Material material, MaterialIconType materialIconType, long flags, Predicate<Material> condition) {
        this.orePrefix = EnumHelper.addEnum(OrePrefix.class, value,
                new Class[]{String.class, long.class, Material.class, MaterialIconType.class, long.class, Predicate.class},
                categoryName, materialAmount, material, materialIconType, flags, condition);
    }

    @ZenMethod
    public static IOrePrefix createOrePrefix(String value, String materialIconType, long flags, IMaterialPredicate condition) {
        return new IOrePrefix(value, "Do I Really Need a Name?", -1, null, IMaterialIconType.createMaterialIconType(materialIconType).getInternal(), flags, condition::test);
    }

    @ZenMethod
    public static IOrePrefix createOrePrefix(String value, IMaterialIconType materialIconType, long flags, IMaterialPredicate condition) {
        return new IOrePrefix(value, "Do I Really Need a Name?", -1, null, materialIconType.getInternal(), flags, condition::test);
    }

    @Nullable
    public OrePrefix getInternal() {
        return this.orePrefix;
    }
}
