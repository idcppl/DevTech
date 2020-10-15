package com.zook.devtech.gregtech.machines.constants;


import gregtech.api.render.OrientedOverlayRenderer;


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
}
