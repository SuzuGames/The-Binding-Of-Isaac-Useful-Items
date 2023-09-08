package net.suzu.thebindingofisaac.procedures;

import net.suzu.thebindingofisaac.init.TboiSuzuModItems;
import net.suzu.thebindingofisaac.TboiSuzuMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;

public class GuppysPawRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (itemstack.getOrCreateTag().getBoolean("Cooldown") == false) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TboiSuzuModItems.GUPPYS_PAW.get()) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) >= 2) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("attribute @p generic.max_health base set placeholder".replace("placeholder", "" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) - 2))));
						if (entity instanceof Player _player)
							_player.getFoodData().setFoodLevel(20);
						if (entity instanceof Player _player)
							_player.getFoodData().setSaturation(Mth.nextInt(RandomSource.create(), 10, 30));
					}
					if (!(new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
							} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
								return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
										&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
							}
							return false;
						}
					}.checkGamemode(entity))) {
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (0.02 * 60 * 20));
						itemstack.getOrCreateTag().putBoolean("Cooldown", true);
						TboiSuzuMod.queueServerWork((int) (0.02 * 60 * 20), () -> {
							itemstack.getOrCreateTag().putBoolean("Cooldown", false);
						});
					}
				}
			}
		}
	}
}
