package net.suzu.thebindingofisaac.procedures;

import net.suzu.thebindingofisaac.TboiSuzuMod;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

public class MomsBottleOfPillsRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (itemstack.getOrCreateTag().getBoolean("Cooldown") == false) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
							new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("tboi_suzu:pill"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
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
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (6 * 30 * 20));
					itemstack.getOrCreateTag().putBoolean("Cooldown", true);
					TboiSuzuMod.queueServerWork((int) (6 * 30 * 20), () -> {
						itemstack.getOrCreateTag().putBoolean("Cooldown", false);
					});
				}
			}
		}
	}
}
