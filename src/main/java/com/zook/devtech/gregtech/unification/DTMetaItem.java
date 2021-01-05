package com.zook.devtech.gregtech.unification;

import crafttweaker.annotations.ZenRegister;
import gregtech.api.items.materialitem.MaterialMetaItem;
import gregtech.api.items.metaitem.ElectricStats;
import gregtech.api.items.metaitem.FluidStats;
import gregtech.api.items.metaitem.FoodStats;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.unification.ore.OrePrefix;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.devtech.unification.MetaItem")
@ZenRegister
public class DTMetaItem extends MaterialMetaItem {
    private MetaItem<?>.MetaValueItem item;

    DTMetaItem(String name, OrePrefix... ores) {
        super(ores);
        this.setRegistryName(name);
    }

    @ZenMethod
    public static DTMetaItem createItems(String name, IOrePrefix... ores) {
        OrePrefix[] arr = new OrePrefix[32];
        for (int i = 0; i < ores.length; i++) {
            arr[i] = ores[i].getInternal();
        }
        return new DTMetaItem(name, arr);
    }

    @ZenMethod
    public DTMetaItem create(int id, String name) {
        this.item = addItem(id, name);
        return this;
    }

    @ZenMethod
    public DTMetaItem foodStats(int foodLevel, float saturation, boolean isDrink) {
        item.addComponents(new FoodStats(foodLevel, saturation, isDrink));
        return this;
    }

    @ZenMethod
    public DTMetaItem foodStats(int foodLevel, float saturation) {
        item.addComponents(new FoodStats(foodLevel, saturation));
        return this;
    }

    @ZenMethod
    public DTMetaItem electricItem(long maxCharge, int tier, boolean rechargeable, boolean dischrgeable) {
        item.addComponents(new ElectricStats(maxCharge, tier, rechargeable, dischrgeable));
        return this;
    }

    @ZenMethod
    public DTMetaItem electricItem(long maxCharge, int tier, boolean rechargeable) {
        item.addComponents(new ElectricStats(maxCharge, tier, rechargeable, true));
        return this;
    }

    @ZenMethod
    public DTMetaItem electricItem(long maxCharge, int tier) {
        item.addComponents(new ElectricStats(maxCharge, tier, true, true));
        return this;
    }

    @ZenMethod
    public DTMetaItem fluidItem(int maxCapacity, int minFluidTemperature, int maxFluidTemperature, boolean allowPartlyFill) {
        item.addComponents(new FluidStats(maxCapacity, minFluidTemperature, maxFluidTemperature, allowPartlyFill));
        return this;
    }

    @ZenMethod
    public DTMetaItem oreDict(String oreDictName) {
        item.addOreDict(oreDictName);
        return this;
    }

    @ZenMethod
    public DTMetaItem invisible() {
        item.setInvisible();
        return this;
    }

    @ZenMethod
    public DTMetaItem stackSize(int maxStackSize) {
        item.setMaxStackSize(maxStackSize);
        return this;
    }

    @ZenMethod
    public DTMetaItem burnTime(int burnValue) {
        item.setBurnValue(burnValue);
        return this;
    }
}
