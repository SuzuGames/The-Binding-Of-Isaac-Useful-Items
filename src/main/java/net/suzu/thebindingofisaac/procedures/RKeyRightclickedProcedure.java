package net.suzu.thebindingofisaac.procedures;

import net.suzu.thebindingofisaac.network.TboiSuzuModVariables;
import net.suzu.thebindingofisaac.init.TboiSuzuModItems;
import net.suzu.thebindingofisaac.TboiSuzuMod;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

public class RKeyRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TboiSuzuModItems.R_KEY.get()) {
				if (itemstack.getOrCreateTag().getBoolean("Cooldown") == false) {
					{
						double _setval = 0;
						entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.xCoord_Crack = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.yCoord_Crack = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.zCoord_Crack = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = x + Mth.nextInt(RandomSource.create(), -5, 5);
						entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.xCoord_Crack = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = z + Mth.nextInt(RandomSource.create(), -5, 5);
						entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.zCoord_Crack = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).xCoord_Crack,
								(int) (entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).zCoord_Crack);
						entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.yCoord_Crack = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						Entity _ent = entity;
						_ent.teleportTo(((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).xCoord_Crack),
								((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).yCoord_Crack),
								((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).zCoord_Crack));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).xCoord_Crack),
									((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).yCoord_Crack),
									((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).zCoord_Crack), _ent.getYRot(), _ent.getXRot());
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
							_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (2 * 30 * 20));
						itemstack.getOrCreateTag().putBoolean("Cooldown", true);
						TboiSuzuMod.queueServerWork((int) (2 * 30 * 20), () -> {
							itemstack.getOrCreateTag().putBoolean("Cooldown", false);
						});
					}
				}
			}
		}
	}
}
