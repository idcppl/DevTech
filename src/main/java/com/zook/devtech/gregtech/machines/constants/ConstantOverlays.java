package com.zook.devtech.gregtech.machines.constants;

import com.zook.devtech.gregtech.machines.IOverlayRenderer;
import com.zook.devtech.gregtech.machines.impl.MCOverlayRenderer;
import crafttweaker.annotations.ZenRegister;
import gregtech.api.render.Textures;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenProperty;

@ZenClass("mods.devtech.machines.Overlays")
@ZenRegister
public class ConstantOverlays {
    @ZenProperty public static final IOverlayRenderer COAL_BOILER_OVERLAY = new MCOverlayRenderer(Textures.COAL_BOILER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer LAVA_BOILER_OVERLAY = new MCOverlayRenderer(Textures.LAVA_BOILER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer SOLAR_BOILER_OVERLAY = new MCOverlayRenderer(Textures.SOLAR_BOILER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer PRIMITIVE_BLAST_FURNACE_OVERLAY = new MCOverlayRenderer(Textures.PRIMITIVE_BLAST_FURNACE_OVERLAY);
    @ZenProperty public static final IOverlayRenderer COKE_OVEN_OVERLAY = new MCOverlayRenderer(Textures.COKE_OVEN_OVERLAY);
    @ZenProperty public static final IOverlayRenderer ALLOY_SMELTER_OVERLAY = new MCOverlayRenderer(Textures.ALLOY_SMELTER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer FURNACE_OVERLAY = new MCOverlayRenderer(Textures.FURNACE_OVERLAY);
    @ZenProperty public static final IOverlayRenderer ELECTRIC_FURNACE_OVERLAY = new MCOverlayRenderer(Textures.ELECTRIC_FURNACE_OVERLAY);
    @ZenProperty public static final IOverlayRenderer EXTRACTOR_OVERLAY = new MCOverlayRenderer(Textures.EXTRACTOR_OVERLAY);
    @ZenProperty public static final IOverlayRenderer COMPRESSOR_OVERLAY = new MCOverlayRenderer(Textures.COMPRESSOR_OVERLAY);
    @ZenProperty public static final IOverlayRenderer HAMMER_OVERLAY = new MCOverlayRenderer(Textures.HAMMER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer MACERATOR_OVERLAY = new MCOverlayRenderer(Textures.MACERATOR_OVERLAY);
    @ZenProperty public static final IOverlayRenderer AMPLIFAB_OVERLAY = new MCOverlayRenderer(Textures.AMPLIFAB_OVERLAY);
    @ZenProperty public static final IOverlayRenderer ARC_FURNACE_OVERLAY = new MCOverlayRenderer(Textures.ARC_FURNACE_OVERLAY);
    @ZenProperty public static final IOverlayRenderer ASSEMBLER_OVERLAY = new MCOverlayRenderer(Textures.ASSEMBLER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer AUTOCLAVE_OVERLAY = new MCOverlayRenderer(Textures.AUTOCLAVE_OVERLAY);
    @ZenProperty public static final IOverlayRenderer BENDER_OVERLAY = new MCOverlayRenderer(Textures.BENDER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer BREWERY_OVERLAY = new MCOverlayRenderer(Textures.BREWERY_OVERLAY);
    @ZenProperty public static final IOverlayRenderer CANNER_OVERLAY = new MCOverlayRenderer(Textures.CANNER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer CENTRIFUGE_OVERLAY = new MCOverlayRenderer(Textures.CENTRIFUGE_OVERLAY);
    @ZenProperty public static final IOverlayRenderer CHEMICAL_BATH_OVERLAY = new MCOverlayRenderer(Textures.CHEMICAL_BATH_OVERLAY);
    @ZenProperty public static final IOverlayRenderer CHEMICAL_REACTOR_OVERLAY = new MCOverlayRenderer(Textures.CHEMICAL_REACTOR_OVERLAY);
    @ZenProperty public static final IOverlayRenderer CUTTER_OVERLAY = new MCOverlayRenderer(Textures.CUTTER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer DISTILLERY_OVERLAY = new MCOverlayRenderer(Textures.DISTILLERY_OVERLAY);
    @ZenProperty public static final IOverlayRenderer ELECTROLYZER_OVERLAY = new MCOverlayRenderer(Textures.ELECTROLYZER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer ELECTROMAGNETIC_SEPARATOR_OVERLAY = new MCOverlayRenderer(Textures.ELECTROMAGNETIC_SEPARATOR_OVERLAY);
    @ZenProperty public static final IOverlayRenderer EXTRUDER_OVERLAY = new MCOverlayRenderer(Textures.EXTRUDER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer FERMENTER_OVERLAY = new MCOverlayRenderer(Textures.FERMENTER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer FLUID_CANNER_OVERLAY = new MCOverlayRenderer(Textures.FLUID_CANNER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer FLUID_EXTRACTOR_OVERLAY = new MCOverlayRenderer(Textures.FLUID_EXTRACTOR_OVERLAY);
    @ZenProperty public static final IOverlayRenderer FLUID_HEATER_OVERLAY = new MCOverlayRenderer(Textures.FLUID_HEATER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer FLUID_SOLIDIFIER_OVERLAY = new MCOverlayRenderer(Textures.FLUID_SOLIDIFIER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer FORGE_HAMMER_OVERLAY = new MCOverlayRenderer(Textures.FORGE_HAMMER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer FORMING_PRESS_OVERLAY = new MCOverlayRenderer(Textures.FORMING_PRESS_OVERLAY);
    @ZenProperty public static final IOverlayRenderer LATHE_OVERLAY = new MCOverlayRenderer(Textures.LATHE_OVERLAY);
    @ZenProperty public static final IOverlayRenderer MICROWAVE_OVERLAY = new MCOverlayRenderer(Textures.MICROWAVE_OVERLAY);
    @ZenProperty public static final IOverlayRenderer MIXER_OVERLAY = new MCOverlayRenderer(Textures.MIXER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer ORE_WASHER_OVERLAY = new MCOverlayRenderer(Textures.ORE_WASHER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer PACKER_OVERLAY = new MCOverlayRenderer(Textures.PACKER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer UNPACKER_OVERLAY = new MCOverlayRenderer(Textures.UNPACKER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer PLASMA_ARC_FURNACE_OVERLAY = new MCOverlayRenderer(Textures.PLASMA_ARC_FURNACE_OVERLAY);
    @ZenProperty public static final IOverlayRenderer POLARIZER_OVERLAY = new MCOverlayRenderer(Textures.POLARIZER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer LASER_ENGRAVER_OVERLAY = new MCOverlayRenderer(Textures.LASER_ENGRAVER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer SIFTER_OVERLAY = new MCOverlayRenderer(Textures.SIFTER_OVERLAY);
    @ZenProperty public static final IOverlayRenderer THERMAL_CENTRIFUGE_OVERLAY = new MCOverlayRenderer(Textures.THERMAL_CENTRIFUGE_OVERLAY);
    @ZenProperty public static final IOverlayRenderer WIREMILL_OVERLAY = new MCOverlayRenderer(Textures.WIREMILL_OVERLAY);
    @ZenProperty public static final IOverlayRenderer DIESEL_GENERATOR_OVERLAY = new MCOverlayRenderer(Textures.DIESEL_GENERATOR_OVERLAY);
    @ZenProperty public static final IOverlayRenderer GAS_TURBINE_OVERLAY = new MCOverlayRenderer(Textures.GAS_TURBINE_OVERLAY);
    @ZenProperty public static final IOverlayRenderer STEAM_TURBINE_OVERLAY = new MCOverlayRenderer(Textures.STEAM_TURBINE_OVERLAY);
}
