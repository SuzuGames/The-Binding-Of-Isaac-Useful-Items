
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.suzu.thebindingofisaac.init;

import net.suzu.thebindingofisaac.block.SlotMachineBlock;
import net.suzu.thebindingofisaac.block.RedChestBlock;
import net.suzu.thebindingofisaac.block.NormalChestBlock;
import net.suzu.thebindingofisaac.block.MarkStoneBlock;
import net.suzu.thebindingofisaac.block.GoldenChestBlock;
import net.suzu.thebindingofisaac.block.DevilsCobblestoneBlock;
import net.suzu.thebindingofisaac.block.BloodMachineBlock;
import net.suzu.thebindingofisaac.block.BasementWallBlock;
import net.suzu.thebindingofisaac.block.BasementFloorBlock;
import net.suzu.thebindingofisaac.block.AngelChestBlock;
import net.suzu.thebindingofisaac.TboiSuzuMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class TboiSuzuModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TboiSuzuMod.MODID);
	public static final RegistryObject<Block> MARK_STONE = REGISTRY.register("mark_stone", () -> new MarkStoneBlock());
	public static final RegistryObject<Block> NORMAL_CHEST = REGISTRY.register("normal_chest", () -> new NormalChestBlock());
	public static final RegistryObject<Block> RED_CHEST = REGISTRY.register("red_chest", () -> new RedChestBlock());
	public static final RegistryObject<Block> GOLDEN_CHEST = REGISTRY.register("golden_chest", () -> new GoldenChestBlock());
	public static final RegistryObject<Block> ANGEL_CHEST = REGISTRY.register("angel_chest", () -> new AngelChestBlock());
	public static final RegistryObject<Block> SLOT_MACHINE = REGISTRY.register("slot_machine", () -> new SlotMachineBlock());
	public static final RegistryObject<Block> BLOOD_MACHINE = REGISTRY.register("blood_machine", () -> new BloodMachineBlock());
	public static final RegistryObject<Block> DEVILS_COBBLESTONE = REGISTRY.register("devils_cobblestone", () -> new DevilsCobblestoneBlock());
	public static final RegistryObject<Block> BASEMENT_WALL = REGISTRY.register("basement_wall", () -> new BasementWallBlock());
	public static final RegistryObject<Block> BASEMENT_FLOOR = REGISTRY.register("basement_floor", () -> new BasementFloorBlock());
}
