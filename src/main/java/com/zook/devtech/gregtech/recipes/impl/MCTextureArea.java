package com.zook.devtech.gregtech.recipes.impl;

import com.zook.devtech.gregtech.recipes.IDTTextureArea;
import gregtech.api.gui.resources.TextureArea;

public class MCTextureArea implements IDTTextureArea {
    private TextureArea inner;
    public MCTextureArea(TextureArea inner) {
        this.inner = inner;
    }

    @Override
    public TextureArea getInternal() {
        return this.inner;
    }

    @Override
    public IDTTextureArea getSubArea(double offsetX, double offsetY, double width, double height) {
        return new MCTextureArea(inner.getSubArea(offsetX, offsetY, width, height));
    }
}
