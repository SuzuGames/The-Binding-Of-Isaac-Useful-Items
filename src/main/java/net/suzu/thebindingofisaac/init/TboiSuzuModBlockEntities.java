
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.suzu.thebindingofisaac.init;

import net.suzu.thebindingofisaac.block.entity.SlotMachineBlockEntity;
import net.suzu.thebindingofisaac.block.entity.BloodMachineBlockEntity;
import net.suzu.thebindingofisaac.TboiSuzuMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class TboiSuzuModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TboiSuzuMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SLOT_MACHINE = register("slot_machine", TboiSuzuModBlocks.SLOT_MACHINE, SlotMachineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BLOOD_MACHINE = register("blood_machine", TboiSuzuModBlocks.BLOOD_MACHINE, BloodMachineBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
