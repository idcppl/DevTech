package com.zook.devtech.gregtech.machines.constants;

import crafttweaker.annotations.ZenRegister;
import gregtech.api.render.OrientedOverlayRenderer;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;


@ZenClass("mods.devtech.OverlayFace")
@ZenRegister
public enum ConstantOverlayFace {
    FRONT(OrientedOverlayRenderer.OverlayFace.FRONT),
    BACK(OrientedOverlayRenderer.OverlayFace.BACK),
    TOP(OrientedOverlayRenderer.OverlayFace.TOP),
    BOTTOM(OrientedOverlayRenderer.OverlayFace.BOTTOM),
    SIDE(OrientedOverlayRenderer.OverlayFace.SIDE);

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
