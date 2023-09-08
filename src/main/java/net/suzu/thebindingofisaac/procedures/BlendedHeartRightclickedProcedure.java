package net.suzu.thebindingofisaac.procedures;

import net.suzu.thebindingofisaac.network.TboiSuzuModVariables;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

public class BlendedHeartRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
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
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) == (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1))) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 2));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:red_heart")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:red_heart")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
			} else {
				if ((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).absortion_level < 10) {
					{
						double _setval = (entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).absortion_level + 2;
						entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.absortion_level = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:soul_heart")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:soul_heart")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
			}
		}
	}
}
