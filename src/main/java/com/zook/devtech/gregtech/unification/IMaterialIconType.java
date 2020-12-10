package com.zook.devtech.gregtech.unification;

import crafttweaker.annotations.ZenRegister;
import gregtech.api.unification.material.MaterialIconType;
import net.minecraftforge.common.util.EnumHelper;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.devtech.unification.IMaterialIconType")
@ZenRegister
public class IMaterialIconType {
    private final MaterialIconType materialIconType;
    IMaterialIconType(String value) {
        this.materialIconType = EnumHelper.addEnum(MaterialIconType.class, value,
                new Class[]{});
    }

    IMaterialIconType(MaterialIconType value) {
        this.materialIconType = value;
    }

    @ZenMethod
    public static IMaterialIconType createMaterialIconType(String value) {
        return new IMaterialIconType(value);
    }

    @ZenMethod
    public static IMaterialIconType get(String name) {
        return new IMaterialIconType(MaterialIconType.valueOf(name));
    }

    public MaterialIconType getInternal() {
        return this.materialIconType;
    }
}
