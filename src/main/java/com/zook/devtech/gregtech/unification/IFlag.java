package com.zook.devtech.gregtech.unification;

import crafttweaker.annotations.ZenRegister;
import gregtech.api.unification.material.type.Material;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.devtech.unification.IFlag")
@ZenRegister
public class IFlag {
    @ZenMethod
    public static void registerFlag(String name, long value) {
        Material.MatFlags.registerMaterialFlag(name, value, Material.class);
    }
}
