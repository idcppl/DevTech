package com.zook.devtech.gregtech.recipes.constants;

import crafttweaker.annotations.ZenRegister;
import gregtech.api.gui.widgets.ProgressWidget.MoveType;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenProperty;

@ZenClass("mods.devtech.MoveType")
@ZenRegister
public enum ConstantMoveType {
    @ZenProperty VERTICAL(MoveType.VERTICAL),
    @ZenProperty HORIZONTAL(MoveType.HORIZONTAL),
    @ZenProperty VERTICAL_INVERTED(MoveType.VERTICAL_INVERTED);
    public MoveType val;
    ConstantMoveType(MoveType type) {
        val = type;
    }
    public MoveType getInternal() {
        return val;
    }
}
