package com.zook.devtech.gregtech.machines;

import com.zook.devtech.gregtech.machines.constants.ConstantOverlayFace;
import com.zook.devtech.gregtech.machines.impl.MCOverlayRenderer;
import crafttweaker.annotations.ZenRegister;
import gregtech.api.render.OrientedOverlayRenderer;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.devtech.OverlayRenderer")
@ZenRegister
public interface IOverlayRenderer {
    OrientedOverlayRenderer getInternal();

    @ZenMethod
    static IOverlayRenderer newOverlay(String path, ConstantOverlayFace... faces) {
        OrientedOverlayRenderer.OverlayFace[] arr = new OrientedOverlayRenderer.OverlayFace[faces.length];
        for (int i = 0; i < faces.length; i++) {
            arr[i] = faces[i].getInternal();
        }
        return new MCOverlayRenderer(path, arr);
    }
}
