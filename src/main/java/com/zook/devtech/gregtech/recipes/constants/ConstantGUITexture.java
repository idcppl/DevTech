package com.zook.devtech.gregtech.recipes.constants;

import com.zook.devtech.gregtech.recipes.IDTTextureArea;
import com.zook.devtech.gregtech.recipes.impl.MCTextureArea;
import crafttweaker.annotations.ZenRegister;
import gregtech.api.gui.GuiTextures;
import net.minecraftforge.common.util.EnumHelper;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

import java.util.Objects;

@ZenClass("mods.devtech.GUITextures")
@ZenRegister
public enum ConstantGUITexture {
    tool_overlay(new MCTextureArea(GuiTextures.TOOL_SLOT_OVERLAY)),
    arrow_input_overlay(new MCTextureArea(GuiTextures.ARROW_INPUT_OVERLAY)),
    arrow_output_overlay(new MCTextureArea(GuiTextures.ARROW_OUTPUT_OVERLAY)),
    charger_overlay(new MCTextureArea(GuiTextures.CHARGER_OVERLAY)),
    int_circuit_overlay(new MCTextureArea(GuiTextures.INT_CIRCUIT_OVERLAY)),
    turbine_overlay(new MCTextureArea(GuiTextures.TURBINE_OVERLAY)),
    furnace_overlay(new MCTextureArea(GuiTextures.FURNACE_OVERLAY)),
    compressor_overlay(new MCTextureArea(GuiTextures.COMPRESSOR_OVERLAY)),
    extractor_overlay(new MCTextureArea(GuiTextures.EXTRACTOR_OVERLAY)),
    crushed_ore_overlay(new MCTextureArea(GuiTextures.CRUSHED_ORE_OVERLAY)),
    dust_overlay(new MCTextureArea(GuiTextures.DUST_OVERLAY)),
    ingot_overlay(new MCTextureArea(GuiTextures.INGOT_OVERLAY)),
    circuit_overlay(new MCTextureArea(GuiTextures.CIRCUIT_OVERLAY)),
    battery_overlay(new MCTextureArea(GuiTextures.BATTERY_OVERLAY)),
    press_overlay_1(new MCTextureArea(GuiTextures.PRESS_OVERLAY_1)),
    press_overlay_2(new MCTextureArea(GuiTextures.PRESS_OVERLAY_2)),
    press_overlay_3(new MCTextureArea(GuiTextures.PRESS_OVERLAY_3)),
    dark_canister_overlay(new MCTextureArea(GuiTextures.DARK_CANISTER_OVERLAY)),
    canister_overlay(new MCTextureArea(GuiTextures.CANISTER_OVERLAY)),
    lens_overlay(new MCTextureArea(GuiTextures.LENS_OVERLAY)),
    crystal_overlay(new MCTextureArea(GuiTextures.CRYSTAL_OVERLAY)),
    brewer_overlay(new MCTextureArea(GuiTextures.BREWER_OVERLAY)),
    solidifier_overlay(new MCTextureArea(GuiTextures.SOLIDIFIER_OVERLAY)),
    molecular_overlay_1(new MCTextureArea(GuiTextures.MOLECULAR_OVERLAY_1)),
    molecular_overlay_2(new MCTextureArea(GuiTextures.MOLECULAR_OVERLAY_2)),
    molecular_overlay_3(new MCTextureArea(GuiTextures.MOLECULAR_OVERLAY_3)),
    vial_overlay_1(new MCTextureArea(GuiTextures.VIAL_OVERLAY_1)),
    vial_overlay_2(new MCTextureArea(GuiTextures.VIAL_OVERLAY_2)),
    wiremill_overlay(new MCTextureArea(GuiTextures.WIREMILL_OVERLAY)),
    bender_overlay(new MCTextureArea(GuiTextures.BENDER_OVERLAY)),
    canner_overlay(new MCTextureArea(GuiTextures.CANNER_OVERLAY)),
    pipe_overlay_1(new MCTextureArea(GuiTextures.PIPE_OVERLAY_1)),
    pipe_overlay_2(new MCTextureArea(GuiTextures.PIPE_OVERLAY_2)),
    box_overlay(new MCTextureArea(GuiTextures.BOX_OVERLAY)),
    boxed_overlay(new MCTextureArea(GuiTextures.BOXED_OVERLAY)),
    cutter_overlay(new MCTextureArea(GuiTextures.CUTTER_OVERLAY)),
    mold_overlay(new MCTextureArea(GuiTextures.MOLD_OVERLAY)),
    hammer_overlay(new MCTextureArea(GuiTextures.HAMMER_OVERLAY)),
    paper_overlay(new MCTextureArea(GuiTextures.PAPER_OVERLAY)),
    printed_paper_overlay(new MCTextureArea(GuiTextures.PRINTED_PAPER_OVERLAY)),
    in_slot_overlay(new MCTextureArea(GuiTextures.IN_SLOT_OVERLAY)),
    out_slot_overlay(new MCTextureArea(GuiTextures.OUT_SLOT_OVERLAY)),
    filter_slot_overlay(new MCTextureArea(GuiTextures.FILTER_SLOT_OVERLAY)),
    string_slot_overlay(new MCTextureArea(GuiTextures.STRING_SLOT_OVERLAY)),
    progress_bar_unlock(new MCTextureArea(GuiTextures.PROGRESS_BAR_UNLOCK)),
    progress_bar_arrow(new MCTextureArea(GuiTextures.PROGRESS_BAR_ARROW)),
    progress_bar_arrow_multiple(new MCTextureArea(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE)),
    progress_bar_bath(new MCTextureArea(GuiTextures.PROGRESS_BAR_BATH)),
    progress_bar_bending(new MCTextureArea(GuiTextures.PROGRESS_BAR_BENDING)),
    progress_bar_canner(new MCTextureArea(GuiTextures.PROGRESS_BAR_CANNER)),
    progress_bar_circuit(new MCTextureArea(GuiTextures.PROGRESS_BAR_CIRCUIT)),
    progress_bar_compress(new MCTextureArea(GuiTextures.PROGRESS_BAR_COMPRESS)),
    progress_bar_extract(new MCTextureArea(GuiTextures.PROGRESS_BAR_EXTRACT)),
    progress_bar_extruder(new MCTextureArea(GuiTextures.PROGRESS_BAR_EXTRUDER)),
    progress_bar_hammer(new MCTextureArea(GuiTextures.PROGRESS_BAR_HAMMER)),
    progress_bar_lathe(new MCTextureArea(GuiTextures.PROGRESS_BAR_LATHE)),
    progress_bar_macerate(new MCTextureArea(GuiTextures.PROGRESS_BAR_MACERATE)),
    progress_bar_magnet(new MCTextureArea(GuiTextures.PROGRESS_BAR_MAGNET)),
    progress_bar_recycler(new MCTextureArea(GuiTextures.PROGRESS_BAR_RECYCLER)),
    progress_bar_sift(new MCTextureArea(GuiTextures.PROGRESS_BAR_SIFT)),
    progress_bar_slice(new MCTextureArea(GuiTextures.PROGRESS_BAR_SLICE)),
    progress_bar_wiremill(new MCTextureArea(GuiTextures.PROGRESS_BAR_WIREMILL));

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
