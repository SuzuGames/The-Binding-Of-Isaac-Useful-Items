package net.suzu.thebindingofisaac.procedures;

import net.suzu.thebindingofisaac.TboiSuzuMod;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

public class ChargedTheMagicianRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
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
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:the_magician")), SoundSource.VOICE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:the_magician")), SoundSource.VOICE, 1, 1, false);
				}
			}
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, 1, 5);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
			TboiSuzuMod.queueServerWork(10, () -> {
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level();
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 1, 5);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
				TboiSuzuMod.queueServerWork(10, () -> {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
									AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 1, 5);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					TboiSuzuMod.queueServerWork(10, () -> {
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 1, 5);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						TboiSuzuMod.queueServerWork(10, () -> {
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
											AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, 1, 5);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
							TboiSuzuMod.queueServerWork(10, () -> {
								{
									Entity _shootFrom = entity;
									Level projectileLevel = _shootFrom.level();
									if (!projectileLevel.isClientSide()) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
												AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, entity, 1, 5);
										_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
										_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
								}
								TboiSuzuMod.queueServerWork(10, () -> {
									{
										Entity _shootFrom = entity;
										Level projectileLevel = _shootFrom.level();
										if (!projectileLevel.isClientSide()) {
											Projectile _entityToSpawn = new Object() {
												public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
													AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
													entityToSpawn.setOwner(shooter);
													entityToSpawn.setBaseDamage(damage);
													entityToSpawn.setKnockback(knockback);
													return entityToSpawn;
												}
											}.getArrow(projectileLevel, entity, 1, 5);
											_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
											_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
											projectileLevel.addFreshEntity(_entityToSpawn);
										}
									}
									TboiSuzuMod.queueServerWork(10, () -> {
										{
											Entity _shootFrom = entity;
											Level projectileLevel = _shootFrom.level();
											if (!projectileLevel.isClientSide()) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
														AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, entity, 1, 5);
												_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
												_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
										}
										TboiSuzuMod.queueServerWork(10, () -> {
											{
												Entity _shootFrom = entity;
												Level projectileLevel = _shootFrom.level();
												if (!projectileLevel.isClientSide()) {
													Projectile _entityToSpawn = new Object() {
														public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
															AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
															entityToSpawn.setOwner(shooter);
															entityToSpawn.setBaseDamage(damage);
															entityToSpawn.setKnockback(knockback);
															return entityToSpawn;
														}
													}.getArrow(projectileLevel, entity, 5, 5);
													_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
													_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
													projectileLevel.addFreshEntity(_entityToSpawn);
												}
											}
											TboiSuzuMod.queueServerWork(10, () -> {
												{
													Entity _shootFrom = entity;
													Level projectileLevel = _shootFrom.level();
													if (!projectileLevel.isClientSide()) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 1, 5);
														_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
														_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
												}
												TboiSuzuMod.queueServerWork(10, () -> {
													{
														Entity _shootFrom = entity;
														Level projectileLevel = _shootFrom.level();
														if (!projectileLevel.isClientSide()) {
															Projectile _entityToSpawn = new Object() {
																public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																	AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
																	entityToSpawn.setOwner(shooter);
																	entityToSpawn.setBaseDamage(damage);
																	entityToSpawn.setKnockback(knockback);
																	return entityToSpawn;
																}
															}.getArrow(projectileLevel, entity, 1, 5);
															_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
															_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
															projectileLevel.addFreshEntity(_entityToSpawn);
														}
													}
													TboiSuzuMod.queueServerWork(10, () -> {
														{
															Entity _shootFrom = entity;
															Level projectileLevel = _shootFrom.level();
															if (!projectileLevel.isClientSide()) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																		AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, entity, 1, 5);
																_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
																_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
														}
														TboiSuzuMod.queueServerWork(10, () -> {
															{
																Entity _shootFrom = entity;
																Level projectileLevel = _shootFrom.level();
																if (!projectileLevel.isClientSide()) {
																	Projectile _entityToSpawn = new Object() {
																		public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																			AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
																			entityToSpawn.setOwner(shooter);
																			entityToSpawn.setBaseDamage(damage);
																			entityToSpawn.setKnockback(knockback);
																			return entityToSpawn;
																		}
																	}.getArrow(projectileLevel, entity, 1, 5);
																	_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
																	_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
																	projectileLevel.addFreshEntity(_entityToSpawn);
																}
															}
															TboiSuzuMod.queueServerWork(10, () -> {
																{
																	Entity _shootFrom = entity;
																	Level projectileLevel = _shootFrom.level();
																	if (!projectileLevel.isClientSide()) {
																		Projectile _entityToSpawn = new Object() {
																			public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																				AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
																				entityToSpawn.setOwner(shooter);
																				entityToSpawn.setBaseDamage(damage);
																				entityToSpawn.setKnockback(knockback);
																				return entityToSpawn;
																			}
																		}.getArrow(projectileLevel, entity, 1, 5);
																		_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
																		_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
																		projectileLevel.addFreshEntity(_entityToSpawn);
																	}
																}
																TboiSuzuMod.queueServerWork(10, () -> {
																	{
																		Entity _shootFrom = entity;
																		Level projectileLevel = _shootFrom.level();
																		if (!projectileLevel.isClientSide()) {
																			Projectile _entityToSpawn = new Object() {
																				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
																					AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
																					entityToSpawn.setOwner(shooter);
																					entityToSpawn.setBaseDamage(damage);
																					entityToSpawn.setKnockback(knockback);
																					return entityToSpawn;
																				}
																			}.getArrow(projectileLevel, entity, 1, 5);
																			_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
																			_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
																			projectileLevel.addFreshEntity(_entityToSpawn);
																		}
																	}
																});
															});
														});
													});
												});
											});
										});
									});
								});
							});
						});
					});
				});
			});
		}
	}
}
