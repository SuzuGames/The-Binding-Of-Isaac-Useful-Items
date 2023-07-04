
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.suzu.thebindingofisaac.init;

import net.suzu.thebindingofisaac.world.features.ores.MarkStoneFeature;
import net.suzu.thebindingofisaac.world.features.RedChestStructureFeature;
import net.suzu.thebindingofisaac.world.features.NormalChestStructureFeature;
import net.suzu.thebindingofisaac.world.features.GoldenChestStructureFeature;
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
}
