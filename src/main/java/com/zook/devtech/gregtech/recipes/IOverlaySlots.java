package com.zook.devtech.gregtech.recipes;

import akka.io.IO;
import com.zook.devtech.gregtech.recipes.constants.ConstantGUITexture;
import crafttweaker.annotations.ZenRegister;
import gregtech.api.gui.resources.TextureArea;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.devtech.OverlaySlot")
@ZenRegister
public class IOverlaySlots {
    private final boolean output;
    private final boolean fluid;
    private final boolean last;
    private final TextureArea textureArea;
    private final boolean both;
    public IOverlaySlots(boolean isOutput, boolean isFluid, boolean isLast, TextureArea texture, boolean isBoth) {
        output = isOutput;
        fluid = isFluid;
        last = isLast;
        textureArea = texture;
        both = isBoth;
    }

    @ZenMethod
    public static IOverlaySlots newOverlaySlot(boolean isOutput, boolean isFluid, boolean isLast, IDTTextureArea texture) {
        return new IOverlaySlots(isOutput, isFluid, isLast, texture.getInternal(), false);
    }

    @ZenMethod
    public static IOverlaySlots newOverlaySlot(boolean isOutput, boolean isFluid, IDTTextureArea texture) {
        return new IOverlaySlots(isOutput, isFluid, false, texture.getInternal(), true);
    }

    @ZenMethod
    public static IOverlaySlots newOverlaySlot(boolean isOutput, boolean isFluid, boolean isLast, ConstantGUITexture texture) {
        return new IOverlaySlots(isOutput, isFluid, isLast, texture.getTexture().getInternal(), false);
    }

    @ZenMethod
    public static IOverlaySlots newOverlaySlot(boolean isOutput, boolean isFluid, ConstantGUITexture texture) {
        return new IOverlaySlots(isOutput, isFluid, false, texture.getTexture().getInternal(), true);
    }

    public boolean getOutput() {
        return output;
    }

    public boolean getFluid() {
        return fluid;
    }

    public boolean getLast() {
        return last;
    }

    public TextureArea getTextureArea() {
        return textureArea;
    }

    public boolean getBoth() {
        return both;
    }
}