package net.suzu.thebindingofisaac.procedures;

import net.suzu.thebindingofisaac.init.TboiSuzuModItems;
import net.suzu.thebindingofisaac.TboiSuzuMod;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;

public class JusticeRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		if (!world.isClientSide()) {
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
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
			for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 1); index0++) {
				random = Mth.nextInt(RandomSource.create(), 1, 100);
				if (random >= 51 && random <= 100) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(TboiSuzuModItems.RED_HEART.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (random >= 31 && random <= 50) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(TboiSuzuModItems.SOUL_HEART.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (random >= 6 && random <= 30) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(TboiSuzuModItems.BLACK_HEART.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (random >= 1 && random <= 5) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(TboiSuzuModItems.ETERNAL_HEART.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 1, 1); index1++) {
				random = Mth.nextInt(RandomSource.create(), 1, 100);
				if (random >= 11 && random <= 100) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(TboiSuzuModItems.KEY.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (random <= 10) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(TboiSuzuModItems.GOLDEN_KEY.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 1, 1); index2++) {
				if (Mth.nextInt(RandomSource.create(), 1, 10) <= 2) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 7), (z + Mth.nextInt(RandomSource.create(), -4, 4))), Vec2.ZERO,
								_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon minecraft:tnt ~ ~ ~ {Fuse:80}");
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(TboiSuzuModItems.BOMB.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			for (int index3 = 0; index3 < Mth.nextInt(RandomSource.create(), 1, 1); index3++) {
				random = Mth.nextInt(RandomSource.create(), 1, 100);
				if (random >= 36 && random <= 100) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(TboiSuzuModItems.PENNY.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (random >= 11 && random <= 35) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(TboiSuzuModItems.NICKEL.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (random >= 1 && random <= 10) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(TboiSuzuModItems.DIME.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				TboiSuzuMod.queueServerWork(10, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:justice")), SoundSource.VOICE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:justice")), SoundSource.VOICE, 1, 1, false);
						}
					}
				});
			}
		}
	}
}
