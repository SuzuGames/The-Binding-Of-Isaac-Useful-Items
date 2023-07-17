package net.suzu.thebindingofisaac.procedures;

import net.suzu.thebindingofisaac.TboiSuzuMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

public class BookOfShadowsRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (itemstack.getOrCreateTag().getBoolean("Cooldown") == false) {
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 999999, true, true));
				if (!(new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
						} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
						}
						return false;
					}
				}.checkGamemode(entity))) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (3 * 30 * 20));
					itemstack.getOrCreateTag().putBoolean("Cooldown", true);
					TboiSuzuMod.queueServerWork((int) (3 * 30 * 20), () -> {
						itemstack.getOrCreateTag().putBoolean("Cooldown", false);
					});
				}
			}
		}
	}
}
