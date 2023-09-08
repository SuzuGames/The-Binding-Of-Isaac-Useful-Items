package net.suzu.thebindingofisaac.procedures;

import net.suzu.thebindingofisaac.TboiSuzuMod;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
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
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

public class WheelOfFortuneRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
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
			random = Mth.nextInt(RandomSource.create(), 1, 30);
			if (random == 1) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.WOODEN_SWORD));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 2) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.WOODEN_SHOVEL));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 3) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.WOODEN_PICKAXE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 4) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.WOODEN_AXE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 5) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.WOODEN_HOE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 6) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.STONE_SWORD));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 7) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.STONE_SHOVEL));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 8) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.STONE_PICKAXE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 9) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.STONE_AXE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 10) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.STONE_HOE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 11) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.IRON_SWORD));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 12) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.IRON_SHOVEL));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 13) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.IRON_PICKAXE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 14) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.IRON_AXE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 15) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.IRON_HOE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 16) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.GOLDEN_SWORD));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 17) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.GOLDEN_SHOVEL));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 18) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.GOLDEN_PICKAXE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 19) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.GOLDEN_AXE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 20) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.GOLDEN_HOE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 21) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.DIAMOND_SWORD));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 22) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.DIAMOND_SHOVEL));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 23) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.DIAMOND_PICKAXE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 24) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.DIAMOND_AXE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 25) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.DIAMOND_HOE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 26) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.BOW));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 27) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.CROSSBOW));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 28) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.SHIELD));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 29) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.FLINT_AND_STEEL));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (random == 30) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(Items.SHEARS));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			TboiSuzuMod.queueServerWork(10, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:wheel_of_fortune")), SoundSource.VOICE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:wheel_of_fortune")), SoundSource.VOICE, 1, 1, false);
					}
				}
			});
		}
	}
}
