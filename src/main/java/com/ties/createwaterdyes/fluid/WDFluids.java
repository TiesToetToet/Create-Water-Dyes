package com.ties.createwaterdyes.fluid;

import com.simibubi.create.AllFluids;
import com.simibubi.create.foundation.utility.Color;
import com.ties.createwaterdyes.CreateWaterDyes;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.builders.FluidBuilder;
import com.tterrag.registrate.util.entry.FluidEntry;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.ForgeRegistries;
import org.joml.Vector3f;

import java.util.function.Supplier;

import static com.ties.createwaterdyes.CreateWaterDyes.REGISTRATE;


public class WDFluids {
    public static final ResourceLocation BLACK_WATER_STILL = CreateWaterDyes.genRL("block/black_water_still");
    public static final ResourceLocation BLACK_WATER_FLOWING = CreateWaterDyes.genRL("block/black_water_flow");

    public static final FluidEntry<ForgeFlowingFluid.Flowing> BLACK_WATER = REGISTRATE
            .fluid("black_water", BLACK_WATER_STILL, BLACK_WATER_FLOWING)
//            .standardFluid("black_water",
//                    SolidRenderedPlaceableFluidType.create(0x000000, () -> 0.5f))
//            .lang("Black Water")
            .properties(b -> b.viscosity(1000)
                    .density(1000))
            .fluidProperties(p -> p.levelDecreasePerBlock(1)
                    .tickRate(5)
                    .slopeFindDistance(4)
                    .explosionResistance(100f))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static final ResourceLocation BLUE_WATER_STILL = CreateWaterDyes.genRL("block/blue_water_still");
    public static final ResourceLocation BLUE_WATER_FLOWING = CreateWaterDyes.genRL("block/blue_water_flow");

    public static final FluidEntry<ForgeFlowingFluid.Flowing> BLUE_WATER = REGISTRATE
            .fluid("blue_water", BLUE_WATER_STILL, BLUE_WATER_FLOWING)
//            .standardFluid("blue_water",
//                    SolidRenderedPlaceableFluidType.create(0x0000ff, () -> 0.5f))
//            .lang("Blue Water")
            .properties(b -> b.viscosity(1000)
                    .density(1000))
            .fluidProperties(p -> p.levelDecreasePerBlock(1)
                    .tickRate(5)
                    .slopeFindDistance(4)
                    .explosionResistance(100f))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static final ResourceLocation BROWN_WATER_STILL = CreateWaterDyes.genRL("block/brown_water_still");
    public static final ResourceLocation BROWN_WATER_FLOWING = CreateWaterDyes.genRL("block/brown_water_flow");

    public static final FluidEntry<ForgeFlowingFluid.Flowing> BROWN_WATER = REGISTRATE
            .fluid("brown_water", BROWN_WATER_STILL, BROWN_WATER_FLOWING)
//            .standardFluid("brown_water",
//                    SolidRenderedPlaceableFluidType.create(0x8b4513, () -> 0.5f))
//            .lang("Brown Water")
            .properties(b -> b.viscosity(1000)
                    .density(1000))
            .fluidProperties(p -> p.levelDecreasePerBlock(1)
                    .tickRate(5)
                    .slopeFindDistance(4)
                    .explosionResistance(100f))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static final ResourceLocation CYAN_WATER_STILL = CreateWaterDyes.genRL("block/cyan_water_still");
    public static final ResourceLocation CYAN_WATER_FLOWING = CreateWaterDyes.genRL("block/cyan_water_flow");

    public static final FluidEntry<ForgeFlowingFluid.Flowing> CYAN_WATER = REGISTRATE
            .fluid("cyan_water", CYAN_WATER_STILL, CYAN_WATER_FLOWING)
//            .standardFluid("cyan_water",
//                    SolidRenderedPlaceableFluidType.create(0x00ffff, () -> 0.5f))
//            .lang("Cyan Water")
            .properties(b -> b.viscosity(1000)
                    .density(1000))
            .fluidProperties(p -> p.levelDecreasePerBlock(1)
                    .tickRate(5)
                    .slopeFindDistance(4)
                    .explosionResistance(100f))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static final ResourceLocation GRAY_WATER_STILL = CreateWaterDyes.genRL("block/gray_water_still");
    public static final ResourceLocation GRAY_WATER_FLOWING = CreateWaterDyes.genRL("block/gray_water_flow");

    public static final FluidEntry<ForgeFlowingFluid.Flowing> GRAY_WATER = REGISTRATE
            .fluid("gray_water", GRAY_WATER_STILL, GRAY_WATER_FLOWING)
//            .standardFluid("gray_water",
//                    SolidRenderedPlaceableFluidType.create(0x808080, () -> 0.5f))
//            .lang("Gray Water")
            .properties(b -> b.viscosity(1000)
                    .density(1000))
            .fluidProperties(p -> p.levelDecreasePerBlock(1)
                    .tickRate(5)
                    .slopeFindDistance(4)
                    .explosionResistance(100f))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static final ResourceLocation GREEN_WATER_STILL = CreateWaterDyes.genRL("block/green_water_still");
    public static final ResourceLocation GREEN_WATER_FLOWING = CreateWaterDyes.genRL("block/green_water_flow");

    public static final FluidEntry<ForgeFlowingFluid.Flowing> GREEN_WATER = REGISTRATE
            .fluid("green_water", GREEN_WATER_STILL, GREEN_WATER_FLOWING)
//            .standardFluid("green_water",
//                    SolidRenderedPlaceableFluidType.create(0x00ff00, () -> 0.5f))
//            .lang("Green Water")
            .properties(b -> b.viscosity(1000)
                    .density(1000))
            .fluidProperties(p -> p.levelDecreasePerBlock(1)
                    .tickRate(5)
                    .slopeFindDistance(4)
                    .explosionResistance(100f))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static final ResourceLocation LIGHT_BLUE_WATER_STILL = CreateWaterDyes.genRL("block/light_blue_water_still");
    public static final ResourceLocation LIGHT_BLUE_WATER_FLOWING = CreateWaterDyes.genRL("block/light_blue_water_flow");

    public static final FluidEntry<ForgeFlowingFluid.Flowing> LIGHT_BLUE_WATER = REGISTRATE
            .fluid("light_blue_water", LIGHT_BLUE_WATER_STILL, LIGHT_BLUE_WATER_FLOWING)
//            .standardFluid("light_blue_water",
//                    SolidRenderedPlaceableFluidType.create(0xadd8e6, () -> 0.5f))
//            .lang("Light Blue Water")
            .properties(b -> b.viscosity(1000)
                    .density(1000))
            .fluidProperties(p -> p.levelDecreasePerBlock(1)
                    .tickRate(5)
                    .slopeFindDistance(4)
                    .explosionResistance(100f))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static final ResourceLocation LIGHT_GRAY_WATER_STILL = CreateWaterDyes.genRL("block/light_gray_water_still");
    public static final ResourceLocation LIGHT_GRAY_WATER_FLOWING = CreateWaterDyes.genRL("block/light_gray_water_flow");

    public static final FluidEntry<ForgeFlowingFluid.Flowing> LIGHT_GRAY_WATER = REGISTRATE
            .fluid("light_gray_water", LIGHT_GRAY_WATER_STILL, LIGHT_GRAY_WATER_FLOWING)
//            .standardFluid("light_gray_water",
//                    SolidRenderedPlaceableFluidType.create(0xd3d3d3, () -> 0.5f))

//            .lang("Light Gray Water")
            .properties(b -> b.viscosity(1000)
                    .density(1000))
            .fluidProperties(p -> p.levelDecreasePerBlock(1)
                    .tickRate(5)
                    .slopeFindDistance(4)
                    .explosionResistance(100f))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static final ResourceLocation LIME_WATER_STILL = CreateWaterDyes.genRL("block/lime_water_still");
    public static final ResourceLocation LIME_WATER_FLOWING = CreateWaterDyes.genRL("block/lime_water_flow");

    public static final FluidEntry<ForgeFlowingFluid.Flowing> LIME_WATER = REGISTRATE
            .fluid("lime_water", LIME_WATER_STILL, LIME_WATER_FLOWING)
//            .standardFluid("lime_water",
//                    SolidRenderedPlaceableFluidType.create(0x00ff00, () -> 0.5f))
//            .lang("Lime Water")
            .properties(b -> b.viscosity(1000)
                    .density(1000))
            .fluidProperties(p -> p.levelDecreasePerBlock(1)
                    .tickRate(5)
                    .slopeFindDistance(4)
                    .explosionResistance(100f))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static final ResourceLocation MAGENTA_WATER_STILL = CreateWaterDyes.genRL("block/magenta_water_still");
    public static final ResourceLocation MAGENTA_WATER_FLOWING = CreateWaterDyes.genRL("block/magenta_water_flow");

    public static final FluidEntry<ForgeFlowingFluid.Flowing> MAGENTA_WATER = REGISTRATE
            .fluid("magenta_water", MAGENTA_WATER_STILL, MAGENTA_WATER_FLOWING)
//            .standardFluid("magenta_water",
//                    SolidRenderedPlaceableFluidType.create(0xff00ff, () -> 0.5f))
//            .lang("Magenta Water")
            .properties(b -> b.viscosity(1000)
                    .density(1000))
            .fluidProperties(p -> p.levelDecreasePerBlock(1)
                    .tickRate(5)
                    .slopeFindDistance(4)
                    .explosionResistance(100f))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static final ResourceLocation ORANGE_WATER_STILL = CreateWaterDyes.genRL("block/orange_water_still");
    public static final ResourceLocation ORANGE_WATER_FLOWING = CreateWaterDyes.genRL("block/orange_water_flow");

    public static final FluidEntry<ForgeFlowingFluid.Flowing> ORANGE_WATER = REGISTRATE
            .fluid("orange_water", ORANGE_WATER_STILL, ORANGE_WATER_FLOWING)
//            .standardFluid("orange_water",
//                    SolidRenderedPlaceableFluidType.create(0xffa500, () -> 0.5f))
//            .lang("Orange Water")
            .properties(b -> b.viscosity(1000)
                    .density(1000))
            .fluidProperties(p -> p
                            .levelDecreasePerBlock(1)
                            .tickRate(5)
                            .slopeFindDistance(4)
                            .explosionResistance(100f))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static final ResourceLocation PINK_WATER_STILL = CreateWaterDyes.genRL("block/pink_water_still");
    public static final ResourceLocation PINK_WATER_FLOWING = CreateWaterDyes.genRL("block/pink_water_flow");

    public static final FluidEntry<ForgeFlowingFluid.Flowing> PINK_WATER = REGISTRATE
            .fluid("pink_water", PINK_WATER_STILL, PINK_WATER_FLOWING)
//            .standardFluid("pink_water",
//                    SolidRenderedPlaceableFluidType.create(0xffc0cb, () -> 0.5f))
//            .lang("Pink Water")
            .properties(b -> b.viscosity(1000)
                    .density(1000))
            .fluidProperties(p -> p
                            .levelDecreasePerBlock(1)
                            .tickRate(5)
                            .slopeFindDistance(4)
                            .explosionResistance(100f))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static final  ResourceLocation PURPLE_WATER_STILL = CreateWaterDyes.genRL("block/purple_water_still");
    public static final  ResourceLocation PURPLE_WATER_FLOWING = CreateWaterDyes.genRL("block/purple_water_flow");

    public static final FluidEntry<ForgeFlowingFluid.Flowing> PURPLE_WATER = REGISTRATE
            .fluid("purple_water", PURPLE_WATER_STILL, PURPLE_WATER_FLOWING)
//            .standardFluid("purple_water",
//                    SolidRenderedPlaceableFluidType.create(0x800080, () -> 0.5f))
//            .lang("Purple Water")
            .properties(b -> b.viscosity(1000)
                    .density(1000))
            .fluidProperties(p -> p
                            .levelDecreasePerBlock(1)
                            .tickRate(5)
                            .slopeFindDistance(4)
                            .explosionResistance(100f))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static final ResourceLocation RED_WATER_STILL = CreateWaterDyes.genRL("block/red_water_still");
    public static final ResourceLocation RED_WATER_FLOWING = CreateWaterDyes.genRL("block/red_water_flow");

    public static final FluidEntry<ForgeFlowingFluid.Flowing> RED_WATER = REGISTRATE
            .fluid("red_water", RED_WATER_STILL, RED_WATER_FLOWING)
//            .standardFluid("red_water",
//                    SolidRenderedPlaceableFluidType.create(0xff0000, () -> 0.5f))
//            .lang("Red Water")
            .properties(b -> b.viscosity(1000)
                    .density(1000))
            .fluidProperties(p -> p.levelDecreasePerBlock(1)
                    .tickRate(5)
                    .slopeFindDistance(4)
                    .explosionResistance(100f))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static final ResourceLocation WHITE_WATER_STILL = CreateWaterDyes.genRL("block/white_water_still");
    public static final ResourceLocation WHITE_WATER_FLOWING = CreateWaterDyes.genRL("block/white_water_flow");

    public static final FluidEntry<ForgeFlowingFluid.Flowing> WHITE_WATER = REGISTRATE
            .fluid("white_water", WHITE_WATER_STILL, WHITE_WATER_FLOWING)
//            .standardFluid("white_water",
//                    SolidRenderedPlaceableFluidType.create(0xffffff, () -> 0.5f))
//            .lang("White Water")
            .properties(b -> b.viscosity(1000)
                    .density(1000))
            .fluidProperties(p -> p.levelDecreasePerBlock(1)
                    .tickRate(5)
                    .slopeFindDistance(4)
                    .explosionResistance(100f))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static final ResourceLocation YELLOW_WATER_STILL = CreateWaterDyes.genRL("block/yellow_water_still");
    public static final ResourceLocation YELLOW_WATER_FLOWING = CreateWaterDyes.genRL("block/yellow_water_flow");

    public static final FluidEntry<ForgeFlowingFluid.Flowing> YELLOW_WATER = REGISTRATE
            .fluid("yellow_water", YELLOW_WATER_STILL, YELLOW_WATER_FLOWING)
//            .standardFluid("yellow_water",
//                    SolidRenderedPlaceableFluidType.create(0xffff00, () -> 0.5f))
//            .lang("Yellow Water")
            .properties(b -> b.viscosity(1000)
                    .density(1000))
            .fluidProperties(p -> p.levelDecreasePerBlock(1)
                    .tickRate(5)
                    .slopeFindDistance(4)
                    .explosionResistance(100f))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();






    public static void register() {
    }

    private static class SolidRenderedPlaceableFluidType extends AllFluids.TintedFluidType {

        private Vector3f fogColor;
        private Supplier<Float> fogDistance;

        public static FluidBuilder.FluidTypeFactory create(int fogColor, Supplier<Float> fogDistance) {
            return (p, s, f) -> {
                SolidRenderedPlaceableFluidType fluidType = new SolidRenderedPlaceableFluidType(p, s, f);
                fluidType.fogColor = new Color(fogColor, false).asVectorF();
                fluidType.fogDistance = fogDistance;
                return fluidType;
            };
        }

        private SolidRenderedPlaceableFluidType(Properties properties, ResourceLocation stillTexture,
                                                ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture);
        }

        @Override
        protected int getTintColor(FluidStack stack) {
            return NO_TINT;
        }

        /*
         * Removing alpha from tint prevents optifine from forcibly applying biome
         * colors to modded fluids (this workaround only works for fluids in the solid
         * render layer)
         */
        @Override
        public int getTintColor(FluidState state, BlockAndTintGetter world, BlockPos pos) {
            return 0x00ffffff;
        }

        @Override
        protected Vector3f getCustomFogColor() {
            return fogColor;
        }

        @Override
        protected float getFogDistanceModifier() {
            return fogDistance.get();
        }

    }
}
