package net.suzu.thebindingofisaac.procedures;

import net.suzu.thebindingofisaac.init.TboiSuzuModItems;
import net.suzu.thebindingofisaac.TboiSuzuMod;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

public class TheBookOfBelialRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TboiSuzuModItems.THE_BOOK_OF_BELIAL.get()) {
			if (itemstack.getOrCreateTag().getBoolean("Cooldown") == false) {
				if (world.isClientSide())
					Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(TboiSuzuModItems.THE_BOOK_OF_BELIAL.get()));
				if (!world.isClientSide()) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 1, true, true));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:item.the_book_of_belial.use")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:item.the_book_of_belial.use")), SoundSource.NEUTRAL, 1, 1, false);
						}
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
