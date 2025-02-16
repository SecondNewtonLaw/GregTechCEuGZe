package gregtech.api.unification.material.materials;

import gregtech.api.GTValues;
import gregtech.api.fluids.FluidBuilder;
import gregtech.api.fluids.attribute.FluidAttributes;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty.GasTier;
import gregtech.api.unification.material.properties.ToolProperty;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.gregtechId;

public class HigherDegreeMaterials {

    public static void register() {
        AcidicOsmiumSolution = new Material.Builder(2506, gregtechId("acidic_osmium_solution"))
                .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
                .color(0xA3AA8A)
                .components(Osmium, 1, Oxygen, 4, Water, 1, HydrochloricAcid, 1)
                .build();

        EnderEye = new Material.Builder(2508, gregtechId("ender_eye"))
                .gem(1)
                .color(0x66FF66)
                .flags(GENERATE_PLATE, NO_SMASHING, NO_SMELTING)
                .build();

        RedSteel = new Material.Builder(2510, gregtechId("red_steel"))
                .ingot(3).fluid()
                .color(0x8C6464).iconSet(METALLIC)
                .flags(EXT_METAL, GENERATE_GEAR)
                .components(SterlingSilver, 1, BismuthBronze, 1, Steel, 2, BlackSteel, 4)
                .toolStats(ToolProperty.Builder.of(7.0F, 6.0F, 2560, 3)
                        .attackSpeed(0.1F).enchantability(21).build())
                .blast(b -> b.temp(1300, GasTier.LOW).blastStats(VA[HV], 1000))
                .build();

        BlueSteel = new Material.Builder(2511, gregtechId("blue_steel"))
                .ingot(3).fluid()
                .color(0x64648C).iconSet(METALLIC)
                .flags(EXT_METAL, GENERATE_FRAME, GENERATE_GEAR)
                .components(RoseGold, 1, Brass, 1, Steel, 2, BlackSteel, 4)
                .toolStats(ToolProperty.Builder.of(15.0F, 6.0F, 1024, 3)
                        .attackSpeed(0.1F).enchantability(33).build())
                .blast(b -> b.temp(1400, GasTier.LOW).blastStats(VA[HV], 1000))
                .build();

        Basalt = new Material.Builder(2512, gregtechId("basalt"))
                .dust(1)
                .color(0x3C3232).iconSet(ROUGH)
                .flags(NO_SMASHING)
                .components(Calcite, 3, Flint, 8, DarkAsh, 4)
                .build();

        Redrock = new Material.Builder(2514, gregtechId("redrock"))
                .dust(1)
                .color(0xFF5032).iconSet(ROUGH)
                .flags(NO_SMASHING)
                .components(Calcite, 2, Flint, 1)
                .build();

        HSSG = new Material.Builder(2516, gregtechId("hssg"))
                .ingot(3).fluid()
                .color(0x999900).iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_FRAME, GENERATE_SPRING, GENERATE_FINE_WIRE,
                        GENERATE_FOIL, GENERATE_GEAR)
                .components(TungstenSteel, 5, Chrome, 1, Molybdenum, 2, Vanadium, 1)
                .rotorStats(10.0f, 5.5f, 4000)
                .cableProperties(V[LuV], 4, 2)
                .blast(b -> b
                        .temp(4200, GasTier.MID)
                        .blastStats(VA[EV], 1300)
                        .vacuumStats(VA[HV]))
                .build();

        RedAlloy = new Material.Builder(2517, gregtechId("red_alloy"))
                .ingot(0)
                .liquid(new FluidBuilder().temperature(1400))
                .color(0xC80000)
                .flags(STD_METAL, GENERATE_FINE_WIRE, GENERATE_BOLT_SCREW)
                .components(Copper, 1, Redstone, 4)
                .cableProperties(V[LV], 1, 1)
                .build();

        HSSE = new Material.Builder(2519, gregtechId("hsse"))
                .ingot(4).fluid()
                .color(0x336600).iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_FRAME, GENERATE_RING, GENERATE_GEAR)
                .components(HSSG, 6, Cobalt, 1, Manganese, 1, Silicon, 1)
                .toolStats(ToolProperty.Builder.of(5.0F, 10.0F, 3072, 4)
                        .attackSpeed(0.3F).enchantability(33).build())
                .rotorStats(10.0f, 8.0f, 5120)
                .blast(b -> b
                        .temp(5000, GasTier.HIGH)
                        .blastStats(VA[EV], 1400)
                        .vacuumStats(VA[HV]))
                .build();

        HSSS = new Material.Builder(2520, gregtechId("hsss"))
                .ingot(4).fluid()
                .color(0x660033).iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_RING, GENERATE_FRAME, GENERATE_ROTOR, GENERATE_ROUND,
                        GENERATE_FOIL, GENERATE_GEAR)
                .components(HSSG, 6, Iridium, 2, Osmium, 1)
                .rotorStats(15.0f, 7.0f, 3000)
                .blast(b -> b
                        .temp(5000, GasTier.HIGH)
                        .blastStats(VA[EV], 1500)
                        .vacuumStats(VA[EV], 200))
                .build();

        // FREE ID: 2521

        IridiumMetalResidue = new Material.Builder(2522, gregtechId("iridium_metal_residue"))
                .dust()
                .color(0x5C5D68).iconSet(METALLIC)
                .components(Iridium, 1, Chlorine, 3, PlatinumSludgeResidue, 1)
                .build();

        Granite = new Material.Builder(2523, gregtechId("granite"))
                .dust()
                .color(0xCFA18C).iconSet(ROUGH)
                .components(SiliconDioxide, 4, Redrock, 1)
                .build();

        Brick = new Material.Builder(2524, gregtechId("brick"))
                .dust()
                .color(0x9B5643).iconSet(ROUGH)
                .flags(EXCLUDE_BLOCK_CRAFTING_RECIPES, NO_SMELTING)
                .components(Clay, 1)
                .build();

        Fireclay = new Material.Builder(2525, gregtechId("fireclay"))
                .dust()
                .color(0xADA09B).iconSet(ROUGH)
                .flags(NO_SMELTING)
                .components(Clay, 1, Brick, 1)
                .build();

        Diorite = new Material.Builder(2526, gregtechId("diorite"))
                .dust()
                .iconSet(ROUGH)
                .components(Mirabilite, 2, Clay, 7)
                .build();
    }
}
