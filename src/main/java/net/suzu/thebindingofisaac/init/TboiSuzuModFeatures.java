
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.suzu.thebindingofisaac.init;

import net.suzu.thebindingofisaac.world.features.ores.MarkStoneFeature;
import net.suzu.thebindingofisaac.world.features.RedChestStructureFeature;
import net.suzu.thebindingofisaac.world.features.NormalChestStructureFeature;
import net.suzu.thebindingofisaac.world.features.GoldenChestStructureFeature;
import net.suzu.thebindingofisaac.world.features.BasementGeneratorFeature;
import net.suzu.thebindingofisaac.world.features.Basement9Feature;
import net.suzu.thebindingofisaac.world.features.Basement8Feature;
import net.suzu.thebindingofisaac.world.features.Basement7Feature;
import net.suzu.thebindingofisaac.world.features.Basement6Feature;
import net.suzu.thebindingofisaac.world.features.Basement5Feature;
import net.suzu.thebindingofisaac.world.features.Basement4Feature;
import net.suzu.thebindingofisaac.world.features.Basement3Feature;
import net.suzu.thebindingofisaac.world.features.Basement2Feature;
import net.suzu.thebindingofisaac.world.features.Basement1Feature;
import net.suzu.thebindingofisaac.world.features.Basement10Feature;
import net.suzu.thebindingofisaac.world.features.Basement0Feature;
import net.suzu.thebindingofisaac.world.features.AngelChestStructureFeature;
import net.suzu.thebindingofisaac.TboiSuzuMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class TboiSuzuModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TboiSuzuMod.MODID);
	public static final RegistryObject<Feature<?>> MARK_STONE = REGISTRY.register("mark_stone", MarkStoneFeature::new);
	public static final RegistryObject<Feature<?>> NORMAL_CHEST_STRUCTURE = REGISTRY.register("normal_chest_structure", NormalChestStructureFeature::new);
	public static final RegistryObject<Feature<?>> GOLDEN_CHEST_STRUCTURE = REGISTRY.register("golden_chest_structure", GoldenChestStructureFeature::new);
	public static final RegistryObject<Feature<?>> RED_CHEST_STRUCTURE = REGISTRY.register("red_chest_structure", RedChestStructureFeature::new);
	public static final RegistryObject<Feature<?>> ANGEL_CHEST_STRUCTURE = REGISTRY.register("angel_chest_structure", AngelChestStructureFeature::new);
	public static final RegistryObject<Feature<?>> BASEMENT_0 = REGISTRY.register("basement_0", Basement0Feature::new);
	public static final RegistryObject<Feature<?>> BASEMENT_1 = REGISTRY.register("basement_1", Basement1Feature::new);
	public static final RegistryObject<Feature<?>> BASEMENT_2 = REGISTRY.register("basement_2", Basement2Feature::new);
	public static final RegistryObject<Feature<?>> BASEMENT_3 = REGISTRY.register("basement_3", Basement3Feature::new);
	public static final RegistryObject<Feature<?>> BASEMENT_4 = REGISTRY.register("basement_4", Basement4Feature::new);
	public static final RegistryObject<Feature<?>> BASEMENT_5 = REGISTRY.register("basement_5", Basement5Feature::new);
	public static final RegistryObject<Feature<?>> BASEMENT_6 = REGISTRY.register("basement_6", Basement6Feature::new);
	public static final RegistryObject<Feature<?>> BASEMENT_7 = REGISTRY.register("basement_7", Basement7Feature::new);
	public static final RegistryObject<Feature<?>> BASEMENT_8 = REGISTRY.register("basement_8", Basement8Feature::new);
	public static final RegistryObject<Feature<?>> BASEMENT_9 = REGISTRY.register("basement_9", Basement9Feature::new);
	public static final RegistryObject<Feature<?>> BASEMENT_10 = REGISTRY.register("basement_10", Basement10Feature::new);
	public static final RegistryObject<Feature<?>> BASEMENT_GENERATOR = REGISTRY.register("basement_generator", BasementGeneratorFeature::new);
}
