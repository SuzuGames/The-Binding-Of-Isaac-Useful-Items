
package net.suzu.thebindingofisaac.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class HolyMantleEffectMobEffect extends MobEffect {
	public HolyMantleEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13369345);
	}

	@Override
	public String getDescriptionId() {
		return "effect.tboi_suzu.holy_mantle_effect";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
