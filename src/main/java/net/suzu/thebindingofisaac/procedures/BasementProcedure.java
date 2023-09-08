package net.suzu.thebindingofisaac.procedures;

import net.suzu.thebindingofisaac.init.TboiSuzuModBlocks;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BasementProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xOff = 0;
		double yOff = 0;
		double zOff = 0;
		double Rand = 0;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		xOff = x + 5;
		yOff = y;
		zOff = z + 8;
		for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 10, 25); index0++) {
			Rand = Mth.nextInt(RandomSource.create(), 1, 100);
			if (Rand < 25) {
				xOff = xOff + 9;
			} else if (Rand < 50) {
				xOff = xOff - 9;
			} else if (Rand < 75) {
				zOff = zOff + 15;
			} else {
				zOff = zOff - 15;
			}
			if (!((world.getBlockState(BlockPos.containing(xOff, yOff, zOff))).getBlock() == TboiSuzuModBlocks.BASEMENT_FLOOR.get())) {
				Rand = Mth.nextInt(RandomSource.create(), 1, 300);
				if (Rand < 50) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("tboi_suzu", "basement_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(xOff, yOff, zOff), BlockPos.containing(xOff, yOff, zOff), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Rand < 70) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("tboi_suzu", "basement_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(xOff, yOff, zOff), BlockPos.containing(xOff, yOff, zOff), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Rand < 100) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("tboi_suzu", "basement_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(xOff, yOff, zOff), BlockPos.containing(xOff, yOff, zOff), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Rand < 130) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("tboi_suzu", "basement_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(xOff, yOff, zOff), BlockPos.containing(xOff, yOff, zOff), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Rand < 150) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("tboi_suzu", "basement_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(xOff, yOff, zOff), BlockPos.containing(xOff, yOff, zOff), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Rand < 220) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("tboi_suzu", "basement_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(xOff, yOff, zOff), BlockPos.containing(xOff, yOff, zOff), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Rand < 235) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("tboi_suzu", "basement_7"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(xOff, yOff, zOff), BlockPos.containing(xOff, yOff, zOff), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Rand < 245) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("tboi_suzu", "basement_8"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(xOff, yOff, zOff), BlockPos.containing(xOff, yOff, zOff), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Rand < 250) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("tboi_suzu", "basement_9"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(xOff, yOff, zOff), BlockPos.containing(xOff, yOff, zOff), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Rand < 270) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("tboi_suzu", "basement_10"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(xOff, yOff, zOff), BlockPos.containing(xOff, yOff, zOff), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("tboi_suzu", "basement_0"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(xOff, yOff, zOff), BlockPos.containing(xOff, yOff, zOff), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			}
		}
	}
}
