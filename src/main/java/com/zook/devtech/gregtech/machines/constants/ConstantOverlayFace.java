package com.zook.devtech.gregtech.machines.constants;

import crafttweaker.annotations.ZenRegister;
import gregtech.api.render.OrientedOverlayRenderer;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;
import stanhebben.zenscript.annotations.ZenProperty;


@ZenClass("mods.devtech.OverlayFace")
@ZenRegister
public enum ConstantOverlayFace {
    @ZenProperty FRONT(OrientedOverlayRenderer.OverlayFace.FRONT),
    @ZenProperty BACK(OrientedOverlayRenderer.OverlayFace.BACK),
    @ZenProperty TOP(OrientedOverlayRenderer.OverlayFace.TOP),
    @ZenProperty BOTTOM(OrientedOverlayRenderer.OverlayFace.BOTTOM),
    @ZenProperty SIDE(OrientedOverlayRenderer.OverlayFace.SIDE);

    public OrientedOverlayRenderer.OverlayFace val;
    ConstantOverlayFace(OrientedOverlayRenderer.OverlayFace face) {
        val = face;
    }
    public OrientedOverlayRenderer.OverlayFace getInternal() {
        return val;
    }

    @ZenMethod
    public static ConstantOverlayFace get(String name) {
        return ConstantOverlayFace.valueOf(name);
    }
}
