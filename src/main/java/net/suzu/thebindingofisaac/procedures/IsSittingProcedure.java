package net.suzu.thebindingofisaac.procedures;

import net.minecraft.world.entity.Entity;

public class IsSittingProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("sit") == false) {
			return true;
		}
		return false;
	}
}
