package com.zook.devtech.gregtech.unification;

import crafttweaker.annotations.ZenRegister;
import gregtech.api.unification.Element;
import net.minecraftforge.common.util.EnumHelper;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.devtech.unification.IElement")
@ZenRegister
public class IElement {
    private static Element MakeElement(String value, long protons, long neutrons, long halfLifeSeconds, String decayTo, String name, boolean isIsotope) {
        return EnumHelper.addEnum(Element.class, value,
                new Class[]{long.class, long.class, long.class, String.class, String.class, boolean.class},
                protons, neutrons, halfLifeSeconds, decayTo, name, isIsotope);
    }
    @ZenMethod
    public static Element createElement(String value, long protons, long neutrons, long halfLifeSeconds, String decayTo, String name, boolean isIsotope) {
        return MakeElement(value, protons, neutrons, halfLifeSeconds, decayTo, name, isIsotope);
    }
}
