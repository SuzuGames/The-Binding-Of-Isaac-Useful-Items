package net.suzu.thebindingofisaac.procedures;

import net.suzu.thebindingofisaac.init.TboiSuzuModItems;
import net.suzu.thebindingofisaac.TboiSuzuMod;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class BeggarRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		double DropRate = 0;
		double Reward = 0;
		if (!world.isClientSide()) {
			entity.getPersistentData().putDouble("DropRate", (Mth.nextInt(RandomSource.create(), 1, 100)));
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			TboiSuzuMod.queueServerWork(20, () -> {
				if (itemstack.getItem() == TboiSuzuModItems.PENNY.get()) {
					if (entity.getPersistentData().getDouble("DropRate") <= 25) {
						entity.getPersistentData().putBoolean("Reward", true);
					} else {
						entity.getPersistentData().putBoolean("Reward", false);
					}
				}
				if (itemstack.getItem() == TboiSuzuModItems.NICKEL.get()) {
					if (entity.getPersistentData().getDouble("DropRate") <= 50) {
						entity.getPersistentData().putBoolean("Reward", true);
					} else {
						entity.getPersistentData().putBoolean("Reward", false);
					}
				}
				if (itemstack.getItem() == TboiSuzuModItems.DIME.get()) {
					if (entity.getPersistentData().getDouble("DropRate") <= 75) {
						entity.getPersistentData().putBoolean("Reward", true);
					} else {
						entity.getPersistentData().putBoolean("Reward", false);
					}
				}
				if (entity.getPersistentData().getBoolean("Reward") == true) {
					entity.getPersistentData().putDouble("ItemReward", (Mth.nextInt(RandomSource.create(), 1, 4)));
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("ItemReward: " + entity.getPersistentData().getDouble("ItemReward") + "")), false);
					if (entity.getPersistentData().getDouble("ItemReward") == 1) {
						entity.getPersistentData().putDouble("TypeReward", (Mth.nextInt(RandomSource.create(), 1, 100)));
						if (entity.getPersistentData().getDouble("TypeReward") >= 26 && entity.getPersistentData().getDouble("TypeReward") <= 100) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TboiSuzuModItems.RED_HEART.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (entity.getPersistentData().getDouble("TypeReward") >= 6 && entity.getPersistentData().getDouble("TypeReward") <= 25) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TboiSuzuModItems.SOUL_HEART.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (entity.getPersistentData().getDouble("TypeReward") >= 1 && entity.getPersistentData().getDouble("TypeReward") <= 5) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TboiSuzuModItems.BLACK_HEART.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (entity.getPersistentData().getDouble("ItemReward") == 2) {
						entity.getPersistentData().putDouble("TypeReward", (Mth.nextInt(RandomSource.create(), 1, 100)));
						if (entity.getPersistentData().getDouble("TypeReward") >= 10) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TboiSuzuModItems.BOMB.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"summon minecraft:tnt ~ ~ ~ {Fuse:60}");
						}
					} else if (entity.getPersistentData().getDouble("ItemReward") == 3) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TboiSuzuModItems.KEY.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (entity.getPersistentData().getDouble("ItemReward") == 4) {
						entity.getPersistentData().putDouble("TypeReward", (Mth.nextInt(RandomSource.create(), 1, 100)));
						if (entity.getPersistentData().getDouble("TypeReward") >= 25) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
										new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("tboi_suzu:card"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
										new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("tboi_suzu:e_card"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			});
		}
	}
}
