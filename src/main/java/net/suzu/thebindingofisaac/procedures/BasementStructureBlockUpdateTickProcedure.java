package net.suzu.thebindingofisaac.procedures;

import net.minecraft.world.level.LevelAccessor;

public class BasementStructureBlockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BasementProcedure.execute(world, x, y, z);
	}
}
