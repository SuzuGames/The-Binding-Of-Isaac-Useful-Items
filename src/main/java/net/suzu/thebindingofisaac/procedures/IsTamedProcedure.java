package net.suzu.thebindingofisaac.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

public class IsTamedProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == true && entity.getPersistentData().getBoolean("sit") == false) {
			return true;
		}
		return false;
	}
}
