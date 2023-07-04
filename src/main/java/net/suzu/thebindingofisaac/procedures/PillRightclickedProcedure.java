package net.suzu.thebindingofisaac.procedures;

import net.suzu.thebindingofisaac.network.TboiSuzuModVariables;
import net.suzu.thebindingofisaac.init.TboiSuzuModItems;
import net.suzu.thebindingofisaac.TboiSuzuMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
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
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;

import java.util.concurrent.atomic.AtomicReference;

public class PillRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double loopNum = 0;
		double itemNum = 0;
		double itemNum2 = 0;
		double C_x = 0;
		double C_y = 0;
		double C_z = 0;
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
			if ((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).pill == 0) {
				{
					double _setval = Mth.nextInt(RandomSource.create(), 1, 16);
					entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.pill = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if ((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).pill == 1) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"/summon area_effect_cloud ~ ~.50 ~ {Particle:\"snowflake 0 50 0 1\",Radius:8f,Duration:20,Effects:[{Id:19b,Amplifier:0b,Duration:100}]}");
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 30, 200, false, false));
					TboiSuzuMod.queueServerWork(20, () -> {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.POISON);
					});
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:bad_gas")), SoundSource.VOICE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:bad_gas")), SoundSource.VOICE, 1, 1, false);
						}
					}
				}
				if ((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).pill == 2) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 6) {
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
					} else {
						{
							Entity _entToDamage = entity;
							_entToDamage.hurt(new DamageSource(_entToDamage.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 6);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:bad_trip")), SoundSource.VOICE, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:bad_trip")), SoundSource.VOICE, 1, 1, false);
							}
						}
					}
				}
				if ((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).pill == 3) {
					for (int index0 = 0; index0 < 2; index0++) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextInt(RandomSource.create(), -4, 4)), (y + 1), (z + Mth.nextInt(RandomSource.create(), -4, 4)), new ItemStack(TboiSuzuModItems.SOUL_HEART.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:balls_of_steel")), SoundSource.VOICE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:balls_of_steel")), SoundSource.VOICE, 1, 1, false);
						}
					}
				}
				if ((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).pill == 4) {
					loopNum = 0;
					itemNum = 0;
					for (int index1 = 0; index1 < 36; index1++) {
						if (Items.IRON_INGOT == (new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack((int) loopNum, entity)).getItem()) {
							itemNum = itemNum + (new Object() {
								public ItemStack getItemStack(int sltid, Entity entity) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
									return _retval.get();
								}
							}.getItemStack((int) loopNum, entity)).getCount();
						}
						loopNum = loopNum + 1;
					}
					loopNum = 0;
					itemNum2 = 0;
					for (int index2 = 0; index2 < 36; index2++) {
						if (Items.GOLD_INGOT == (new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack((int) loopNum, entity)).getItem()) {
							itemNum2 = itemNum2 + (new Object() {
								public ItemStack getItemStack(int sltid, Entity entity) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
									return _retval.get();
								}
							}.getItemStack((int) loopNum, entity)).getCount();
						}
						loopNum = loopNum + 1;
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal((itemNum + ", " + itemNum2)), true);
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Items.GOLD_INGOT);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (int) itemNum2, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Items.IRON_INGOT);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (int) itemNum, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
						_setstack.setCount((int) itemNum2);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.GOLD_INGOT);
						_setstack.setCount((int) itemNum);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:bombs_are_key")), SoundSource.VOICE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:bombs_are_key")), SoundSource.VOICE, 1, 1, false);
						}
					}
				}
				if ((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).pill == 5) {
					ExplosiveDiahrreaProcedure.execute(world, entity);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:explosive_diarrhea")), SoundSource.VOICE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:explosive_diarrhea")), SoundSource.VOICE, 1, 1, false);
						}
					}
				}
				if ((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).pill == 6) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:full_health")), SoundSource.VOICE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:full_health")), SoundSource.VOICE, 1, 1, false);
						}
					}
				}
				if ((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).pill == 7) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("attribute @p generic.max_health base set placeholder".replace("placeholder", "" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) - 2))));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:health_down")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:health_down")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if ((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).pill == 8) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("attribute @p generic.max_health base set placeholder".replace("placeholder", "" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + 2))));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:health_up")), SoundSource.VOICE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:health_up")), SoundSource.VOICE, 1, 1, false);
						}
					}
				}
				if ((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).pill == 9) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200, 1, false, false));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:i_found_pills")), SoundSource.VOICE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:i_found_pills")), SoundSource.VOICE, 1, 1, false);
						}
					}
				}
				if ((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).pill == 10) {
					entity.getPersistentData().putDouble("puberty", (entity.getPersistentData().getDouble("puberty") + 1));
					if (entity.getPersistentData().getDouble("puberty") == 3) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("attribute @p generic.max_health base set placeholder".replace("placeholder", "" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + 2))));
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:puberty")), SoundSource.VOICE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:puberty")), SoundSource.VOICE, 1, 1, false);
						}
					}
				}
				if ((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).pill == 11) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (Mth.nextInt(RandomSource.create(), -4, 4) + x), (1 + y), (Mth.nextInt(RandomSource.create(), -4, 4) + z), new ItemStack(Items.LEATHER_HELMET));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (Mth.nextInt(RandomSource.create(), -4, 4) + x), (1 + y), (Mth.nextInt(RandomSource.create(), -4, 4) + z), new ItemStack(Items.LEATHER_CHESTPLATE));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (Mth.nextInt(RandomSource.create(), -4, 4) + x), (1 + y), (Mth.nextInt(RandomSource.create(), -4, 4) + z), new ItemStack(Items.LEATHER_LEGGINGS));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (Mth.nextInt(RandomSource.create(), -4, 4) + x), (1 + y), (Mth.nextInt(RandomSource.create(), -4, 4) + z), new ItemStack(Items.LEATHER_BOOTS));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:pretty_fly")), SoundSource.VOICE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:pretty_fly")), SoundSource.VOICE, 1, 1, false);
						}
					}
				}
				if ((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).pill == 12) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:telepills")), SoundSource.VOICE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:telepills")), SoundSource.VOICE, 1, 1, false);
						}
					}
					TboiSuzuMod.queueServerWork(20, () -> {
						TboiSuzuMod.LOGGER.info("sound");
					});
					C_x = Mth.nextInt(RandomSource.create(), -1000, 1000);
					C_y = Mth.nextInt(RandomSource.create(), 100, 64);
					C_z = Mth.nextInt(RandomSource.create(), -1000, 1000);
					while (!world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
						C_x = Mth.nextInt(RandomSource.create(), -1000, 1000);
						C_y = Mth.nextInt(RandomSource.create(), 100, 64);
						C_z = Mth.nextInt(RandomSource.create(), -1000, 1000);
					}
					{
						Entity _ent = entity;
						_ent.teleportTo(C_x, C_y, C_z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(C_x, C_y, C_z, _ent.getYRot(), _ent.getXRot());
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(C_x, C_y, C_y), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:telepills")), SoundSource.VOICE, 1, 1);
						} else {
							_level.playLocalSound(C_x, C_y, C_y, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:telepills")), SoundSource.VOICE, 1, 1, false);
						}
					}
				}
				if ((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).pill == 13) {
					for (int index4 = 0; index4 < 24; index4++) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (Mth.nextInt(RandomSource.create(), -4, 4) + x), (1 + y), (Mth.nextInt(RandomSource.create(), -4, 4) + z), new ItemStack(Items.APPLE));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:energy48")), SoundSource.VOICE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:energy48")), SoundSource.VOICE, 1, 1, false);
						}
					}
				}
				if ((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).pill == 14) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(2);
					for (int index5 = 0; index5 < Mth.nextInt(RandomSource.create(), 1, 7); index5++) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (Mth.nextInt(RandomSource.create(), -4, 4) + x), (1 + y), (Mth.nextInt(RandomSource.create(), -4, 4) + z), new ItemStack(TboiSuzuModItems.RED_HEART.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:hematemesis")), SoundSource.VOICE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:hematemesis")), SoundSource.VOICE, 1, 1, false);
						}
					}
				}
				if ((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).pill == 15) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 40, 9, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 9, false, false));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:paralysis")), SoundSource.VOICE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:paralysis")), SoundSource.VOICE, 1, 1, false);
						}
					}
				}
				if ((entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TboiSuzuModVariables.PlayerVariables())).pill == 16) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 300, 9, false, false));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:amnesia")), SoundSource.VOICE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:amnesia")), SoundSource.VOICE, 1, 1, false);
						}
					}
				}
				{
					double _setval = Mth.nextInt(RandomSource.create(), 1, 16);
					entity.getCapability(TboiSuzuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.pill = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
