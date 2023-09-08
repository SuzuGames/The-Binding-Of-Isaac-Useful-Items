package net.suzu.thebindingofisaac.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class RedChestOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"setblock ~ ~ ~ minecraft:chest{LootTable:\"chests/goldenchest\"}");
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			if (Mth.nextInt(RandomSource.create(), 1, 10) <= 3) {
				for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 3); index0++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.SPIDER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			}
		}
	}
}
