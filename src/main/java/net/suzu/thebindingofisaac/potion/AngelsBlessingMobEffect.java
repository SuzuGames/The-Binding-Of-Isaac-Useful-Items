
package net.suzu.thebindingofisaac.potion;

import net.suzu.thebindingofisaac.procedures.SoulProtectionEffectActiveTickConditionProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class AngelsBlessingMobEffect extends MobEffect {
	public AngelsBlessingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -9596750);
	}

	@Override
	public String getDescriptionId() {
		return "effect.tboi_suzu.angels_blessing";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SoulProtectionEffectActiveTickConditionProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
