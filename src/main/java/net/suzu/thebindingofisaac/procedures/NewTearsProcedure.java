package net.suzu.thebindingofisaac.procedures;

import net.suzu.thebindingofisaac.network.TboiSuzuModVariables;
import net.suzu.thebindingofisaac.init.TboiSuzuModEntities;
import net.suzu.thebindingofisaac.entity.TearProjectileEntity;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class NewTearsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (TboiSuzuModVariables.MapVariables.get(world).TearsPressed == true) {
			entity.getPersistentData().putDouble("tears_cooldown", (entity.getPersistentData().getDouble("tears_cooldown") + 1));
			if (entity.getPersistentData().getDouble("tears_cooldown") == 20) {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new TearProjectileEntity(TboiSuzuModEntities.TEAR_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 2, 0);
					_entityToSpawn.setPos(x, y, z);
					_entityToSpawn.shoot(1, 1, 1, 1, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Message"), false);
			}
			entity.getPersistentData().putDouble("tears_cooldown", 0);
		}
	}
}
