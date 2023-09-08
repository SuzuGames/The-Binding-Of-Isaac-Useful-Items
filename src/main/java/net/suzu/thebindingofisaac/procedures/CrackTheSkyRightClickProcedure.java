package net.suzu.thebindingofisaac.procedures;

import net.suzu.thebindingofisaac.network.TboiSuzuModVariables;
import net.suzu.thebindingofisaac.init.TboiSuzuModItems;
import net.suzu.thebindingofisaac.TboiSuzuMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

public class CrackTheSkyRightClickProcedure {
	public static void execute(LevelAccessor world, double x, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double xCoord = 0;
		double yCoord = 0;
		double zCoord = 0;
		if (!world.isClientSide()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TboiSuzuModItems.CRACK_THE_SKY.get()) {
				if (itemstack.getOrCreateTag().getBoolean("Cooldown") == false) {
					for (int index0 = 0; index0 < 5; index0++) {
						TboiSuzuMod.queueServerWork(20, () -> {
							{
								double _setval = x + Mth.nextInt(RandomSource.create(), -15, 15);
								entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.xCoord_Crack = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = z + Mth.nextInt(RandomSource.create(), -15, 15);
								entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.zCoord_Crack = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
										(int) (entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).xCoord_Crack,
										(int) (entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).zCoord_Crack);
								entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.yCoord_Crack = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).xCoord_Crack,
										(entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).yCoord_Crack,
										(entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).zCoord_Crack)));;
								_level.addFreshEntity(entityToSpawn);
							}
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
						});
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
