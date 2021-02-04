package com.zook.devtech.gregtech.items;

import crafttweaker.annotations.ZenRegister;
import gregtech.api.items.toolitem.ToolMetaItem;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.devtech.MetaToolItem")
@ZenRegister
public class MetaToolItems extends ToolMetaItem<ToolMetaItem<?>.MetaToolValueItem> {
    private ToolMetaItem<?>.MetaToolValueItem tool;

    MetaToolItems(String unlocalizedName) {
        super();
        this.setRegistryName(unlocalizedName);
    }

    @ZenMethod
    public static MetaToolItems toolBuilder(String unlocalizedName) {
        return new MetaToolItems(unlocalizedName);
    }

    @ZenMethod
    public MetaToolItems create(int id, String name) {
        this.tool = addItem(id, name);
        return this;
    }

    @ZenMethod
    public MetaToolItems toolStats(ToolStats stats) {
        tool.setToolStats(stats);
        return this;
    }

    @ZenMethod
    public MetaToolItems fullRepairCost(int amount) {
        tool.setFullRepairCost(amount);
        return this;
    }
}
