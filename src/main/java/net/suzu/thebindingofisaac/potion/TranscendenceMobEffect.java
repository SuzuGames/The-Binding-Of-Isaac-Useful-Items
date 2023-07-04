
package net.suzu.thebindingofisaac.potion;

import net.suzu.thebindingofisaac.procedures.TranscendenceEffectStartedappliedProcedure;
import net.suzu.thebindingofisaac.procedures.TranscendenceEffectExpiresProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TranscendenceMobEffect extends MobEffect {
	public TranscendenceMobEffect() {
		super(MobEffectCategory.NEUTRAL, -65536);
	}

	@Override
	public String getDescriptionId() {
		return "effect.tboi_suzu.transcendence";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		TranscendenceEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		TranscendenceEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
