package com.zook.devtech.gregtech.unification;

import crafttweaker.annotations.ZenRegister;
import gregtech.api.items.materialitem.MaterialMetaItem;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.unification.ore.OrePrefix;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

import java.util.List;
@ZenClass("mods.devtech.unification.MetaItem")
@ZenRegister
public class DTMetaItem extends MaterialMetaItem {
    public static List<MetaItem<?>> ITEMS = MetaItem.getMetaItems();
    DTMetaItem(OrePrefix... ores) {
        super(ores);
    }

    @ZenMethod
    public static void createItems(String name, IOrePrefix... ores) {
        OrePrefix[] arr = new OrePrefix[32];
        for (int i = 0; i < ores.length; i++) {
            arr[i] = ores[i].getInternal();
        }
        new DTMetaItem(arr).setRegistryName(name);
    }
}
