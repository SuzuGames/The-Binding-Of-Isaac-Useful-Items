
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.suzu.thebindingofisaac.init;

import net.suzu.thebindingofisaac.potion.TranscendenceMobEffect;
import net.suzu.thebindingofisaac.potion.HolyMantleEffectMobEffect;
import net.suzu.thebindingofisaac.potion.EternalMobEffect;
import net.suzu.thebindingofisaac.potion.DevilsPactMobEffect;
import net.suzu.thebindingofisaac.potion.AngelsBlessingMobEffect;
import net.suzu.thebindingofisaac.TboiSuzuMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class TboiSuzuModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TboiSuzuMod.MODID);
	public static final RegistryObject<MobEffect> TRANSCENDENCE = REGISTRY.register("transcendence", () -> new TranscendenceMobEffect());
	public static final RegistryObject<MobEffect> ETERNAL = REGISTRY.register("eternal", () -> new EternalMobEffect());
	public static final RegistryObject<MobEffect> ANGELS_BLESSING = REGISTRY.register("angels_blessing", () -> new AngelsBlessingMobEffect());
	public static final RegistryObject<MobEffect> DEVILS_PACT = REGISTRY.register("devils_pact", () -> new DevilsPactMobEffect());
	public static final RegistryObject<MobEffect> HOLY_MANTLE_EFFECT = REGISTRY.register("holy_mantle_effect", () -> new HolyMantleEffectMobEffect());
}
