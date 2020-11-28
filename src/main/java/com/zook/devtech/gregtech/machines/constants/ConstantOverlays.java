package com.zook.devtech.gregtech.machines.constants;

import com.zook.devtech.gregtech.machines.IOverlayRenderer;
import com.zook.devtech.gregtech.machines.impl.MCOverlayRenderer;
import crafttweaker.annotations.ZenRegister;
import gregtech.api.render.Textures;
import net.minecraftforge.common.util.EnumHelper;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

import java.util.Objects;

@ZenClass("mods.devtech.machines.Overlays")
@ZenRegister
public enum ConstantOverlays {
    coal_boiler(new MCOverlayRenderer(Textures.COAL_BOILER_OVERLAY)),
    lava_boiler(new MCOverlayRenderer(Textures.LAVA_BOILER_OVERLAY)),
    solar_boiler(new MCOverlayRenderer(Textures.SOLAR_BOILER_OVERLAY)),
    primitive_blast_furnace(new MCOverlayRenderer(Textures.PRIMITIVE_BLAST_FURNACE_OVERLAY)),
    coke_oven(new MCOverlayRenderer(Textures.COKE_OVEN_OVERLAY)),
    alloy_smelter(new MCOverlayRenderer(Textures.ALLOY_SMELTER_OVERLAY)),
    furnace(new MCOverlayRenderer(Textures.FURNACE_OVERLAY)),
    electric_furnace(new MCOverlayRenderer(Textures.ELECTRIC_FURNACE_OVERLAY)),
    extractor(new MCOverlayRenderer(Textures.EXTRACTOR_OVERLAY)),
    compressor(new MCOverlayRenderer(Textures.COMPRESSOR_OVERLAY)),
    hammer(new MCOverlayRenderer(Textures.HAMMER_OVERLAY)),
    macerator(new MCOverlayRenderer(Textures.MACERATOR_OVERLAY)),
    amplifab(new MCOverlayRenderer(Textures.AMPLIFAB_OVERLAY)),
    arc_furnace(new MCOverlayRenderer(Textures.ARC_FURNACE_OVERLAY)),
    assembler(new MCOverlayRenderer(Textures.ASSEMBLER_OVERLAY)),
    autoclave(new MCOverlayRenderer(Textures.AUTOCLAVE_OVERLAY)),
    bender(new MCOverlayRenderer(Textures.BENDER_OVERLAY)),
    brewery(new MCOverlayRenderer(Textures.BREWERY_OVERLAY)),
    canner(new MCOverlayRenderer(Textures.CANNER_OVERLAY)),
    centrifuge(new MCOverlayRenderer(Textures.CENTRIFUGE_OVERLAY)),
    chemical_bath(new MCOverlayRenderer(Textures.CHEMICAL_BATH_OVERLAY)),
    chemical_reactor(new MCOverlayRenderer(Textures.CHEMICAL_REACTOR_OVERLAY)),
    cutter(new MCOverlayRenderer(Textures.CUTTER_OVERLAY)),
    distillery(new MCOverlayRenderer(Textures.DISTILLERY_OVERLAY)),
    electrolyzer(new MCOverlayRenderer(Textures.ELECTROLYZER_OVERLAY)),
    electromagnetic_separator(new MCOverlayRenderer(Textures.ELECTROMAGNETIC_SEPARATOR_OVERLAY)),
    extruder(new MCOverlayRenderer(Textures.EXTRUDER_OVERLAY)),
    fermenter(new MCOverlayRenderer(Textures.FERMENTER_OVERLAY)),
    fluid_canner(new MCOverlayRenderer(Textures.FLUID_CANNER_OVERLAY)),
    fluid_extractor(new MCOverlayRenderer(Textures.FLUID_EXTRACTOR_OVERLAY)),
    fluid_heater(new MCOverlayRenderer(Textures.FLUID_HEATER_OVERLAY)),
    fluid_solidifier(new MCOverlayRenderer(Textures.FLUID_SOLIDIFIER_OVERLAY)),
    forge_hammer(new MCOverlayRenderer(Textures.FORGE_HAMMER_OVERLAY)),
    forming_press(new MCOverlayRenderer(Textures.FORMING_PRESS_OVERLAY)),
    lathe(new MCOverlayRenderer(Textures.LATHE_OVERLAY)),
    microwave(new MCOverlayRenderer(Textures.MICROWAVE_OVERLAY)),
    mixer(new MCOverlayRenderer(Textures.MIXER_OVERLAY)),
    ore_washer(new MCOverlayRenderer(Textures.ORE_WASHER_OVERLAY)),
    packer(new MCOverlayRenderer(Textures.PACKER_OVERLAY)),
    unpacker(new MCOverlayRenderer(Textures.UNPACKER_OVERLAY)),
    plasma_arc_furnace(new MCOverlayRenderer(Textures.PLASMA_ARC_FURNACE_OVERLAY)),
    polarizer(new MCOverlayRenderer(Textures.POLARIZER_OVERLAY)),
    laser_engraver(new MCOverlayRenderer(Textures.LASER_ENGRAVER_OVERLAY)),
    sifter(new MCOverlayRenderer(Textures.SIFTER_OVERLAY)),
    thermal_centrifuge(new MCOverlayRenderer(Textures.THERMAL_CENTRIFUGE_OVERLAY)),
    wiremill(new MCOverlayRenderer(Textures.WIREMILL_OVERLAY)),
    diesel_generator(new MCOverlayRenderer(Textures.DIESEL_GENERATOR_OVERLAY)),
    gas_turbine(new MCOverlayRenderer(Textures.GAS_TURBINE_OVERLAY)),
    steam_turbine(new MCOverlayRenderer(Textures.STEAM_TURBINE_OVERLAY));
    private IOverlayRenderer inner;
    ConstantOverlays(IOverlayRenderer renderer) {
        inner = renderer;
    }
    public IOverlayRenderer getInternal() {
        return inner;
    }
    @ZenMethod
    public static IOverlayRenderer get(String name) {
        return ConstantOverlays.valueOf(name).getInternal();
    }
}
