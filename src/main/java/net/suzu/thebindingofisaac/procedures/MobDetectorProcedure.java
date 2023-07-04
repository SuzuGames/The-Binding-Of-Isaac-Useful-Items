package net.suzu.thebindingofisaac.procedures;

import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.Entity;

public class MobDetectorProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Monster || entity instanceof Slime) {
			entity.getPersistentData().putBoolean("isMob", true);
		}
	}
}
