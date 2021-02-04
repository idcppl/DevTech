package com.zook.devtech.gregtech.items;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.toolitem.IToolStats;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;
import stanhebben.zenscript.annotations.ZenProperty;

@ZenClass("mods.devtech.ToolStats")
@ZenRegister
public class ToolStats implements IToolStats {
    @ZenProperty public int toolDamagePerBlockBreak = 0;
    @ZenProperty public int damagePerDropConversion = 0;
    @ZenProperty public int damagePerContainerCraft = 0;
    @ZenProperty public int damagePerEntityAttack = 0;
    @ZenProperty public int quality = 0;
    @ZenProperty public float baseDamage = 0;
    @ZenProperty public float digSpeedMultiplier = 1.0F;
    @ZenProperty public float maxDurabilityMultiplier = 1.0F;
    @ZenProperty public String enchantments = "";
    @ZenProperty public boolean crowbar = false;
    @ZenProperty public float saplingModifier = 0.0F;
    @ZenProperty public IItemStack brokenStack = null;

    ToolStats() {}

    @ZenMethod
    public static ToolStats create() {
        return new ToolStats();
    }

    @Override
    public void onToolCrafted(ItemStack stack, EntityPlayer player) {

    }

    @Override
    public void onStatsAddedToTool(MetaItem.MetaValueItem metaValueItem) {

    }

    @Override
    public int getToolDamagePerBlockBreak(ItemStack itemStack) {
        return toolDamagePerBlockBreak;
    }

    @Override
    public int getToolDamagePerDropConversion(ItemStack stack) {
        return damagePerDropConversion;
    }

    @Override
    public int getToolDamagePerContainerCraft(ItemStack itemStack) {
        return damagePerContainerCraft;
    }

    @Override
    public int getToolDamagePerEntityAttack(ItemStack itemStack) {
        return damagePerEntityAttack;
    }

    @Override
    public int getBaseQuality(ItemStack stack) {
        return quality;
    }

    @Override
    public float getBaseDamage(ItemStack stack) {
        return baseDamage;
    }

    @Override
    public float getDigSpeedMultiplier(ItemStack stack) {
        return digSpeedMultiplier;
    }

    @Override
    public float getMaxDurabilityMultiplier(ItemStack stack) {
        return maxDurabilityMultiplier;
    }

    @Override
    public boolean canApplyEnchantment(ItemStack itemStack, Enchantment enchantment) {
        return false;
    }

    @Override
    public boolean canMineBlock(IBlockState iBlockState, ItemStack itemStack) {
        return false;
    }

    @Override
    public boolean isCrowbar(ItemStack stack) {
        return crowbar;
    }

    @Override
    public float getSaplingModifier(ItemStack stack, World world, EntityPlayer player, BlockPos pos) {
        return saplingModifier;
    }

    @Override
    public float getNormalDamageBonus(EntityLivingBase entity, ItemStack stack, EntityLivingBase attacker) {
        return 0;
    }

    @Override
    public float getMagicDamageBonus(EntityLivingBase entity, ItemStack stack, EntityLivingBase player) {
        return 0;
    }

    @Override
    public float getAttackSpeed(ItemStack stack) {
        return 0;
    }

    @Override
    public boolean canPerformSweepAttack(ItemStack stack) {
        return false;
    }

    @Override
    public boolean isUsingDurability(ItemStack stack) {
        return false;
    }

    @Override
    public ItemStack getBrokenStack(ItemStack stack) {
        return CraftTweakerMC.getItemStack(brokenStack);
    }

    @Override
    public int getColor(ItemStack stack, int tintIndex) {
        return 0;
    }
}
