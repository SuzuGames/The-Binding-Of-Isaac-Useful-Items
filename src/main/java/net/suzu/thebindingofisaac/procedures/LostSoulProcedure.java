package net.suzu.thebindingofisaac.procedures;

import net.suzu.thebindingofisaac.network.TboiSuzuModVariables;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LostSoulProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player && (entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).absortion_level != 0) {
			{
				double _setval = 0;
				entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.absortion_level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
