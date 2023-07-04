
package net.suzu.thebindingofisaac.entity;

import net.suzu.thebindingofisaac.procedures.IsaacRightClickedOnEntityProcedure;
import net.suzu.thebindingofisaac.init.TboiSuzuModItems;
import net.suzu.thebindingofisaac.init.TboiSuzuModEntities;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import java.util.List;

public class IsaacEntity extends TamableAnimal implements RangedAttackMob {
	public IsaacEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(TboiSuzuModEntities.ISAAC.get(), world);
	}

	public IsaacEntity(EntityType<IsaacEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 0;
		setNoAi(false);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new FollowOwnerGoal(this, 1, (float) 10, (float) 2, false) {
			@Override
			public boolean canContinueToUse() {
				double x = IsaacEntity.this.getX();
				double y = IsaacEntity.this.getY();
				double z = IsaacEntity.this.getZ();
				Entity entity = IsaacEntity.this;
				Level world = IsaacEntity.this.level;
				return super.canContinueToUse() && true;
			}
		});
		this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this) {
			@Override
			public boolean canContinueToUse() {
				double x = IsaacEntity.this.getX();
				double y = IsaacEntity.this.getY();
				double z = IsaacEntity.this.getZ();
				Entity entity = IsaacEntity.this;
				Level world = IsaacEntity.this.level;
				return super.canContinueToUse() && true;
			}
		});
		this.goalSelector.addGoal(3, new OwnerHurtByTargetGoal(this) {
			@Override
			public boolean canContinueToUse() {
				double x = IsaacEntity.this.getX();
				double y = IsaacEntity.this.getY();
				double z = IsaacEntity.this.getZ();
				Entity entity = IsaacEntity.this;
				Level world = IsaacEntity.this.level;
				return super.canContinueToUse() && true;
			}
		});
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, GaperEntity.class, false, false) {
			@Override
			public boolean canContinueToUse() {
				double x = IsaacEntity.this.getX();
				double y = IsaacEntity.this.getY();
				double z = IsaacEntity.this.getZ();
				Entity entity = IsaacEntity.this;
				Level world = IsaacEntity.this.level;
				return super.canContinueToUse() && true;
			}
		});
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, FlyEntity.class, false, false) {
			@Override
			public boolean canContinueToUse() {
				double x = IsaacEntity.this.getX();
				double y = IsaacEntity.this.getY();
				double z = IsaacEntity.this.getZ();
				Entity entity = IsaacEntity.this;
				Level world = IsaacEntity.this.level;
				return super.canContinueToUse() && true;
			}
		});
		this.goalSelector.addGoal(6, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

			@Override
			public boolean canContinueToUse() {
				double x = IsaacEntity.this.getX();
				double y = IsaacEntity.this.getY();
				double z = IsaacEntity.this.getZ();
				Entity entity = IsaacEntity.this;
				Level world = IsaacEntity.this.level;
				return super.canContinueToUse() && true;
			}

		});
		this.goalSelector.addGoal(7, new RandomStrollGoal(this, 1) {
			@Override
			public boolean canContinueToUse() {
				double x = IsaacEntity.this.getX();
				double y = IsaacEntity.this.getY();
				double z = IsaacEntity.this.getZ();
				Entity entity = IsaacEntity.this;
				Level world = IsaacEntity.this.level;
				return super.canContinueToUse() && true;
			}
		});
		this.targetSelector.addGoal(8, new HurtByTargetGoal(this) {
			@Override
			public boolean canContinueToUse() {
				double x = IsaacEntity.this.getX();
				double y = IsaacEntity.this.getY();
				double z = IsaacEntity.this.getZ();
				Entity entity = IsaacEntity.this;
				Level world = IsaacEntity.this.level;
				return super.canContinueToUse() && true;
			}
		});
		this.goalSelector.addGoal(9, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(10, new FloatGoal(this));
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 20, 10f) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:entity.isaac.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tboi_suzu:entity.isaac.death"));
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
		Item item = itemstack.getItem();
		if (itemstack.getItem() instanceof SpawnEggItem) {
			retval = super.mobInteract(sourceentity, hand);
		} else if (this.level.isClientSide()) {
			retval = (this.isTame() && this.isOwnedBy(sourceentity) || this.isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level.isClientSide()) : InteractionResult.PASS;
		} else {
			if (this.isTame()) {
				if (this.isOwnedBy(sourceentity)) {
					if (item.isEdible() && this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						this.heal((float) item.getFoodProperties().getNutrition());
						retval = InteractionResult.sidedSuccess(this.level.isClientSide());
					} else if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						this.heal(4);
						retval = InteractionResult.sidedSuccess(this.level.isClientSide());
					} else {
						retval = super.mobInteract(sourceentity, hand);
					}
				}
			} else if (this.isFood(itemstack)) {
				this.usePlayerItem(sourceentity, hand, itemstack);
				if (this.random.nextInt(3) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, sourceentity)) {
					this.tame(sourceentity);
					this.level.broadcastEntityEvent(this, (byte) 7);
				} else {
					this.level.broadcastEntityEvent(this, (byte) 6);
				}
				this.setPersistenceRequired();
				retval = InteractionResult.sidedSuccess(this.level.isClientSide());
			} else {
				retval = super.mobInteract(sourceentity, hand);
				if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME)
					this.setPersistenceRequired();
			}
		}
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;

		IsaacRightClickedOnEntityProcedure.execute(entity, sourceentity);
		return retval;
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		IsaacTearEntity.shoot(this, target);
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		IsaacEntity retval = TboiSuzuModEntities.ISAAC.get().create(serverWorld);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return List.of(TboiSuzuModItems.CRACKED_DICE.get()).contains(stack.getItem());
	}

	public static void init() {
		SpawnPlacements.register(TboiSuzuModEntities.ISAAC.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos.below()).getMaterial() == Material.GRASS && world.getRawBrightness(pos, 0) > 8));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 15);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 10);
		builder = builder.add(Attributes.FOLLOW_RANGE, 32);
		return builder;
	}
}
