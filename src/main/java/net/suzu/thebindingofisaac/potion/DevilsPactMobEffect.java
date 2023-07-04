
package net.suzu.thebindingofisaac.potion;

import net.suzu.thebindingofisaac.procedures.SoulProtectionEffectActiveTickConditionProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class DevilsPactMobEffect extends MobEffect {
	public DevilsPactMobEffect() {
		super(MobEffectCategory.NEUTRAL, -12369085);
	}

	@Override
	public String getDescriptionId() {
		return "effect.tboi_suzu.devils_pact";
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
