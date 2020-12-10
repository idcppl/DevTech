package com.zook.devtech.gregtech.recipes.constants;

import com.zook.devtech.gregtech.recipes.IDTTextureArea;
import com.zook.devtech.gregtech.recipes.impl.MCTextureArea;
import crafttweaker.annotations.ZenRegister;
import gregtech.api.gui.GuiTextures;
import net.minecraftforge.common.util.EnumHelper;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;
import stanhebben.zenscript.annotations.ZenProperty;

import java.util.Objects;

@ZenClass("mods.devtech.GUITextures")
@ZenRegister
public enum ConstantGUITexture {
    @ZenProperty tool_overlay(new MCTextureArea(GuiTextures.TOOL_SLOT_OVERLAY)),
    @ZenProperty arrow_input_overlay(new MCTextureArea(GuiTextures.ARROW_INPUT_OVERLAY)),
    @ZenProperty arrow_output_overlay(new MCTextureArea(GuiTextures.ARROW_OUTPUT_OVERLAY)),
    @ZenProperty charger_overlay(new MCTextureArea(GuiTextures.CHARGER_OVERLAY)),
    @ZenProperty int_circuit_overlay(new MCTextureArea(GuiTextures.INT_CIRCUIT_OVERLAY)),
    @ZenProperty turbine_overlay(new MCTextureArea(GuiTextures.TURBINE_OVERLAY)),
    @ZenProperty furnace_overlay(new MCTextureArea(GuiTextures.FURNACE_OVERLAY)),
    @ZenProperty compressor_overlay(new MCTextureArea(GuiTextures.COMPRESSOR_OVERLAY)),
    @ZenProperty extractor_overlay(new MCTextureArea(GuiTextures.EXTRACTOR_OVERLAY)),
    @ZenProperty crushed_ore_overlay(new MCTextureArea(GuiTextures.CRUSHED_ORE_OVERLAY)),
    @ZenProperty dust_overlay(new MCTextureArea(GuiTextures.DUST_OVERLAY)),
    @ZenProperty ingot_overlay(new MCTextureArea(GuiTextures.INGOT_OVERLAY)),
    @ZenProperty circuit_overlay(new MCTextureArea(GuiTextures.CIRCUIT_OVERLAY)),
    @ZenProperty battery_overlay(new MCTextureArea(GuiTextures.BATTERY_OVERLAY)),
    @ZenProperty press_overlay_1(new MCTextureArea(GuiTextures.PRESS_OVERLAY_1)),
    @ZenProperty press_overlay_2(new MCTextureArea(GuiTextures.PRESS_OVERLAY_2)),
    @ZenProperty press_overlay_3(new MCTextureArea(GuiTextures.PRESS_OVERLAY_3)),
    @ZenProperty dark_canister_overlay(new MCTextureArea(GuiTextures.DARK_CANISTER_OVERLAY)),
    @ZenProperty canister_overlay(new MCTextureArea(GuiTextures.CANISTER_OVERLAY)),
    @ZenProperty lens_overlay(new MCTextureArea(GuiTextures.LENS_OVERLAY)),
    @ZenProperty crystal_overlay(new MCTextureArea(GuiTextures.CRYSTAL_OVERLAY)),
    @ZenProperty brewer_overlay(new MCTextureArea(GuiTextures.BREWER_OVERLAY)),
    @ZenProperty solidifier_overlay(new MCTextureArea(GuiTextures.SOLIDIFIER_OVERLAY)),
    @ZenProperty molecular_overlay_1(new MCTextureArea(GuiTextures.MOLECULAR_OVERLAY_1)),
    @ZenProperty molecular_overlay_2(new MCTextureArea(GuiTextures.MOLECULAR_OVERLAY_2)),
    @ZenProperty molecular_overlay_3(new MCTextureArea(GuiTextures.MOLECULAR_OVERLAY_3)),
    @ZenProperty vial_overlay_1(new MCTextureArea(GuiTextures.VIAL_OVERLAY_1)),
    @ZenProperty vial_overlay_2(new MCTextureArea(GuiTextures.VIAL_OVERLAY_2)),
    @ZenProperty wiremill_overlay(new MCTextureArea(GuiTextures.WIREMILL_OVERLAY)),
    @ZenProperty bender_overlay(new MCTextureArea(GuiTextures.BENDER_OVERLAY)),
    @ZenProperty canner_overlay(new MCTextureArea(GuiTextures.CANNER_OVERLAY)),
    @ZenProperty pipe_overlay_1(new MCTextureArea(GuiTextures.PIPE_OVERLAY_1)),
    @ZenProperty pipe_overlay_2(new MCTextureArea(GuiTextures.PIPE_OVERLAY_2)),
    @ZenProperty box_overlay(new MCTextureArea(GuiTextures.BOX_OVERLAY)),
    @ZenProperty boxed_overlay(new MCTextureArea(GuiTextures.BOXED_OVERLAY)),
    @ZenProperty cutter_overlay(new MCTextureArea(GuiTextures.CUTTER_OVERLAY)),
    @ZenProperty mold_overlay(new MCTextureArea(GuiTextures.MOLD_OVERLAY)),
    @ZenProperty hammer_overlay(new MCTextureArea(GuiTextures.HAMMER_OVERLAY)),
    @ZenProperty paper_overlay(new MCTextureArea(GuiTextures.PAPER_OVERLAY)),
    @ZenProperty printed_paper_overlay(new MCTextureArea(GuiTextures.PRINTED_PAPER_OVERLAY)),
    @ZenProperty in_slot_overlay(new MCTextureArea(GuiTextures.IN_SLOT_OVERLAY)),
    @ZenProperty out_slot_overlay(new MCTextureArea(GuiTextures.OUT_SLOT_OVERLAY)),
    @ZenProperty filter_slot_overlay(new MCTextureArea(GuiTextures.FILTER_SLOT_OVERLAY)),
    @ZenProperty string_slot_overlay(new MCTextureArea(GuiTextures.STRING_SLOT_OVERLAY)),
    @ZenProperty progress_bar_unlock(new MCTextureArea(GuiTextures.PROGRESS_BAR_UNLOCK)),
    @ZenProperty progress_bar_arrow(new MCTextureArea(GuiTextures.PROGRESS_BAR_ARROW)),
    @ZenProperty progress_bar_arrow_multiple(new MCTextureArea(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE)),
    @ZenProperty progress_bar_bath(new MCTextureArea(GuiTextures.PROGRESS_BAR_BATH)),
    @ZenProperty progress_bar_bending(new MCTextureArea(GuiTextures.PROGRESS_BAR_BENDING)),
    @ZenProperty progress_bar_canner(new MCTextureArea(GuiTextures.PROGRESS_BAR_CANNER)),
    @ZenProperty progress_bar_circuit(new MCTextureArea(GuiTextures.PROGRESS_BAR_CIRCUIT)),
    @ZenProperty progress_bar_compress(new MCTextureArea(GuiTextures.PROGRESS_BAR_COMPRESS)),
    @ZenProperty progress_bar_extract(new MCTextureArea(GuiTextures.PROGRESS_BAR_EXTRACT)),
    @ZenProperty progress_bar_extruder(new MCTextureArea(GuiTextures.PROGRESS_BAR_EXTRUDER)),
    @ZenProperty progress_bar_hammer(new MCTextureArea(GuiTextures.PROGRESS_BAR_HAMMER)),
    @ZenProperty progress_bar_lathe(new MCTextureArea(GuiTextures.PROGRESS_BAR_LATHE)),
    @ZenProperty progress_bar_macerate(new MCTextureArea(GuiTextures.PROGRESS_BAR_MACERATE)),
    @ZenProperty progress_bar_magnet(new MCTextureArea(GuiTextures.PROGRESS_BAR_MAGNET)),
    @ZenProperty progress_bar_recycler(new MCTextureArea(GuiTextures.PROGRESS_BAR_RECYCLER)),
    @ZenProperty progress_bar_sift(new MCTextureArea(GuiTextures.PROGRESS_BAR_SIFT)),
    @ZenProperty progress_bar_slice(new MCTextureArea(GuiTextures.PROGRESS_BAR_SLICE)),
    @ZenProperty progress_bar_wiremill(new MCTextureArea(GuiTextures.PROGRESS_BAR_WIREMILL));

    private IDTTextureArea inner;
    ConstantGUITexture(IDTTextureArea texture) {
        inner = texture;
    }

    @ZenMethod
    public static IDTTextureArea get(String name) {
        return ConstantGUITexture.valueOf(name).getTexture();
    }

    public IDTTextureArea getTexture() {
        return inner;
    }
}
