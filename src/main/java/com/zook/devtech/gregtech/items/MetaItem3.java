package com.zook.devtech.gregtech.items;

import crafttweaker.annotations.ZenRegister;
import gregtech.api.items.metaitem.*;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.devtech.MetaItems")
@ZenRegister
public class MetaItem3 extends StandardMetaItem {
    private MetaItem<?>.MetaValueItem item;

    public MetaItem3(String unlocalizedName) {
        super((short) 0);
        this.setRegistryName(unlocalizedName);
    }

    @ZenMethod
    public static MetaItem3 itemBuilder(String unlocalizedName) {
        return new MetaItem3(unlocalizedName);
    }

    @ZenMethod
    public MetaItem3 create(int id, String name) {
        this.item = addItem(id, name);
        return this;
    }

    @ZenMethod
    public MetaItem3 foodStats(int foodLevel, float saturation, boolean isDrink) {
        item.addComponents(new FoodStats(foodLevel, saturation, isDrink));
        return this;
    }

    @ZenMethod
    public MetaItem3 foodStats(int foodLevel, float saturation) {
        item.addComponents(new FoodStats(foodLevel, saturation));
        return this;
    }

    @ZenMethod
    public MetaItem3 electricItem(long maxCharge, int tier, boolean rechargeable, boolean dischrgeable) {
        item.addComponents(new ElectricStats(maxCharge, tier, rechargeable, dischrgeable));
        return this;
    }

    @ZenMethod
    public MetaItem3 electricItem(long maxCharge, int tier, boolean rechargeable) {
        item.addComponents(new ElectricStats(maxCharge, tier, rechargeable, true));
        return this;
    }

    @ZenMethod
    public MetaItem3 electricItem(long maxCharge, int tier) {
        item.addComponents(new ElectricStats(maxCharge, tier, true, true));
        return this;
    }

    @ZenMethod
    public MetaItem3 fluidItem(int maxCapacity, int minFluidTemperature, int maxFluidTemperature, boolean allowPartlyFill) {
        item.addComponents(new FluidStats(maxCapacity, minFluidTemperature, maxFluidTemperature, allowPartlyFill));
        return this;
    }

    @ZenMethod
    public MetaItem3 oreDict(String oreDictName) {
        item.addOreDict(oreDictName);
        return this;
    }

    @ZenMethod
    public MetaItem3 invisible() {
        item.setInvisible();
        return this;
    }

    @ZenMethod
    public MetaItem3 stackSize(int maxStackSize) {
        item.setMaxStackSize(maxStackSize);
        return this;
    }

    @ZenMethod
    public MetaItem3 burnTime(int burnValue) {
        item.setBurnValue(burnValue);
        return this;
    }
}
