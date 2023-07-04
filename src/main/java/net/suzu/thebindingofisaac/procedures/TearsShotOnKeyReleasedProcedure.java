package net.suzu.thebindingofisaac.procedures;

import net.suzu.thebindingofisaac.network.TboiSuzuModVariables;

import net.minecraft.world.level.LevelAccessor;

public class TearsShotOnKeyReleasedProcedure {
	public static void execute(LevelAccessor world) {
		TboiSuzuModVariables.MapVariables.get(world).TearsPressed = false;
		TboiSuzuModVariables.MapVariables.get(world).syncData(world);
	}
}
