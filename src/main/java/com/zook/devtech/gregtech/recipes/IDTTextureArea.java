package com.zook.devtech.gregtech.recipes;

import com.zook.devtech.gregtech.recipes.impl.MCTextureArea;
import crafttweaker.annotations.ZenRegister;
import gregtech.api.gui.resources.TextureArea;
import net.minecraft.util.ResourceLocation;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.devtech.TextureArea")
@ZenRegister
public interface IDTTextureArea {
    TextureArea getInternal();

    @ZenMethod
    static IDTTextureArea areaOfImage(String imageLocation, int imageSizeX, int imageSizeY, int u, int v, int width, int height) {
        return new MCTextureArea(TextureArea.areaOfImage(imageLocation, imageSizeX, imageSizeY, u, v, width, height));
    }

    @ZenMethod
    static IDTTextureArea fullImage(String imageLocation) {
        return new MCTextureArea(new TextureArea(new ResourceLocation(imageLocation), 0, 0, 1, 1));
    }

    @ZenMethod
    IDTTextureArea getSubArea(double offsetX, double offsetY, double width, double height);
}
