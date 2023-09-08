package net.suzu.thebindingofisaac.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class IsaacRightClickedOnEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
			if (entity.getPersistentData().getBoolean("sit") == false) {
				entity.getPersistentData().putBoolean("sit", true);
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Isaac is sitting now."), false);
			} else {
				entity.getPersistentData().putBoolean("sit", false);
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Isaac isn't sitting now."), false);
			}
		}
	}
}
