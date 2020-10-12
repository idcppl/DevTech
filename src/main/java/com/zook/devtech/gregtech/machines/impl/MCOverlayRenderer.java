package com.zook.devtech.gregtech.machines.impl;

import com.zook.devtech.gregtech.machines.IOverlayRenderer;
import gregtech.api.render.OrientedOverlayRenderer;

public class MCOverlayRenderer implements IOverlayRenderer {
    private OrientedOverlayRenderer inner;
    public MCOverlayRenderer(OrientedOverlayRenderer inner) {
        this.inner = inner;
    }

    @Override
    public OrientedOverlayRenderer getInternal() {
        return this.inner;
    }
}
