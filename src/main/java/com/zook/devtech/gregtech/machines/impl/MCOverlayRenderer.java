package com.zook.devtech.gregtech.machines.impl;

import com.zook.devtech.gregtech.machines.IOverlayRenderer;
import gregtech.api.render.OrientedOverlayRenderer;

public class MCOverlayRenderer implements IOverlayRenderer {
    private final OrientedOverlayRenderer inner;
    public MCOverlayRenderer(String name, OrientedOverlayRenderer.OverlayFace... faces) {
        this.inner = new OrientedOverlayRenderer(name, faces);
    }

    public MCOverlayRenderer(OrientedOverlayRenderer renderer) {
        this.inner = renderer;
    }

    @Override
    public OrientedOverlayRenderer getInternal() {
        return this.inner;
    }
}
