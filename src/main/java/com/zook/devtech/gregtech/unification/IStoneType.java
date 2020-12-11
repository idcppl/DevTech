package com.zook.devtech.gregtech.unification;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.block.IBlockState;
import gregtech.api.unification.crafttweaker.MaterialBracketHandler;
import gregtech.api.unification.material.type.DustMaterial;
import gregtech.api.unification.ore.StoneType;
import net.minecraft.block.SoundType;
import net.minecraft.util.ResourceLocation;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.devtech.unification.IStoneType")
@ZenRegister
public class IStoneType {
    public final StoneType stoneType;
    IStoneType(StoneType type) {
        this.stoneType = type;
    }

    @ZenMethod
    public static IStoneType createStoneType(int id, String name, String backgroundSideTexture, String backgroundTopTexture, IOrePrefix processingPrefix, String stoneMaterial, String harvestTool, int flags, IBlockState stone, IBlockStatePredicate predicate) {
        return new IStoneType(new StoneType(id, name, new ResourceLocation(backgroundSideTexture), new ResourceLocation(backgroundTopTexture), SoundType.STONE, processingPrefix.getInternal(), (DustMaterial) MaterialBracketHandler.getMaterial(stoneMaterial), harvestTool, flags, IBlockStateSupplier.make(stone)::get, IBlockStatePredicate.toInternal(predicate)));
    }

    @ZenMethod
    public static IStoneType createStoneType(int id, String name, String backgroundSideTexture, IOrePrefix processingPrefix, String stoneMaterial, String harvestTool, int flags, IBlockState stone, IBlockStatePredicate predicate) {
        return new IStoneType(new StoneType(id, name, new ResourceLocation(backgroundSideTexture), SoundType.STONE, processingPrefix.getInternal(), (DustMaterial) MaterialBracketHandler.getMaterial(stoneMaterial), harvestTool, flags, IBlockStateSupplier.make(stone)::get, IBlockStatePredicate.toInternal(predicate)));
    }
}
