package com.zook.devtech.gregtech.machines;

import com.zook.devtech.gregtech.machines.constants.ConstantOverlayFace;
import com.zook.devtech.gregtech.machines.impl.MCOverlayRenderer;
import gregtech.api.render.OrientedOverlayRenderer;

public interface IOverlayRenderer {
    OrientedOverlayRenderer getInternal();

    /* broken af, crashes at function OrientedOverlayRenderer.registerIcons getting the OverlayFace.name().
    static IOverlayRenderer oldOverlay(String path, ConstantOverlayFace firstFace, ConstantOverlayFace secondFace) {
        return new MCOverlayRenderer(new OrientedOverlayRenderer(path, firstFace.val, secondFace.val));
    }
     */
}
