
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.suzu.thebindingofisaac.init;

import net.suzu.thebindingofisaac.entity.TearProjectileEntity;
import net.suzu.thebindingofisaac.entity.SamsonTearEntity;
import net.suzu.thebindingofisaac.entity.SamsonEntity;
import net.suzu.thebindingofisaac.entity.MagdaleneTearEntity;
import net.suzu.thebindingofisaac.entity.MagdaleneEntity;
import net.suzu.thebindingofisaac.entity.JudasTearEntity;
import net.suzu.thebindingofisaac.entity.JudasEntity;
import net.suzu.thebindingofisaac.entity.IsaacTearEntity;
import net.suzu.thebindingofisaac.entity.IsaacEntity;
import net.suzu.thebindingofisaac.entity.GaperEntity;
import net.suzu.thebindingofisaac.entity.FlyEntity;
import net.suzu.thebindingofisaac.entity.EvaWhoreOfBabylonTearEntity;
import net.suzu.thebindingofisaac.entity.EvaWhoreOfBabylonEntity;
import net.suzu.thebindingofisaac.entity.EvaTearEntity;
import net.suzu.thebindingofisaac.entity.EvaEntity;
import net.suzu.thebindingofisaac.entity.CainTearEntity;
import net.suzu.thebindingofisaac.entity.CainEntity;
import net.suzu.thebindingofisaac.entity.BlueBabyTearEntity;
import net.suzu.thebindingofisaac.entity.BlueBabyEntity;
import net.suzu.thebindingofisaac.entity.BeggarEntity;
import net.suzu.thebindingofisaac.entity.AzazelTearEntity;
import net.suzu.thebindingofisaac.entity.AzazelEntity;
import net.suzu.thebindingofisaac.TboiSuzuMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TboiSuzuModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TboiSuzuMod.MODID);
	public static final RegistryObject<EntityType<IsaacEntity>> ISAAC = register("isaac",
			EntityType.Builder.<IsaacEntity>of(IsaacEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IsaacEntity::new)

					.sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<GaperEntity>> GAPER = register("gaper",
			EntityType.Builder.<GaperEntity>of(GaperEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GaperEntity::new)

					.sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<MagdaleneEntity>> MAGDALENE = register("magdalene",
			EntityType.Builder.<MagdaleneEntity>of(MagdaleneEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MagdaleneEntity::new)

					.sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<FlyEntity>> FLY = register("fly",
			EntityType.Builder.<FlyEntity>of(FlyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FlyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CainEntity>> CAIN = register("cain",
			EntityType.Builder.<CainEntity>of(CainEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CainEntity::new)

					.sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<JudasEntity>> JUDAS = register("judas",
			EntityType.Builder.<JudasEntity>of(JudasEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JudasEntity::new)

					.sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<BlueBabyEntity>> BLUE_BABY = register("blue_baby",
			EntityType.Builder.<BlueBabyEntity>of(BlueBabyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueBabyEntity::new)

					.sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<EvaEntity>> EVA = register("eva",
			EntityType.Builder.<EvaEntity>of(EvaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EvaEntity::new)

					.sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<SamsonEntity>> SAMSON = register("samson",
			EntityType.Builder.<SamsonEntity>of(SamsonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SamsonEntity::new)

					.sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<EvaWhoreOfBabylonEntity>> EVA_WHORE_OF_BABYLON = register("eva_whore_of_babylon",
			EntityType.Builder.<EvaWhoreOfBabylonEntity>of(EvaWhoreOfBabylonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EvaWhoreOfBabylonEntity::new)

					.sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<IsaacTearEntity>> ISAAC_TEAR = register("projectile_isaac_tear",
			EntityType.Builder.<IsaacTearEntity>of(IsaacTearEntity::new, MobCategory.MISC).setCustomClientFactory(IsaacTearEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MagdaleneTearEntity>> MAGDALENE_TEAR = register("projectile_magdalene_tear",
			EntityType.Builder.<MagdaleneTearEntity>of(MagdaleneTearEntity::new, MobCategory.MISC).setCustomClientFactory(MagdaleneTearEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CainTearEntity>> CAIN_TEAR = register("projectile_cain_tear",
			EntityType.Builder.<CainTearEntity>of(CainTearEntity::new, MobCategory.MISC).setCustomClientFactory(CainTearEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<JudasTearEntity>> JUDAS_TEAR = register("projectile_judas_tear",
			EntityType.Builder.<JudasTearEntity>of(JudasTearEntity::new, MobCategory.MISC).setCustomClientFactory(JudasTearEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlueBabyTearEntity>> BLUE_BABY_TEAR = register("projectile_blue_baby_tear",
			EntityType.Builder.<BlueBabyTearEntity>of(BlueBabyTearEntity::new, MobCategory.MISC).setCustomClientFactory(BlueBabyTearEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EvaTearEntity>> EVA_TEAR = register("projectile_eva_tear",
			EntityType.Builder.<EvaTearEntity>of(EvaTearEntity::new, MobCategory.MISC).setCustomClientFactory(EvaTearEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SamsonTearEntity>> SAMSON_TEAR = register("projectile_samson_tear",
			EntityType.Builder.<SamsonTearEntity>of(SamsonTearEntity::new, MobCategory.MISC).setCustomClientFactory(SamsonTearEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EvaWhoreOfBabylonTearEntity>> EVA_WHORE_OF_BABYLON_TEAR = register("projectile_eva_whore_of_babylon_tear",
			EntityType.Builder.<EvaWhoreOfBabylonTearEntity>of(EvaWhoreOfBabylonTearEntity::new, MobCategory.MISC).setCustomClientFactory(EvaWhoreOfBabylonTearEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AzazelEntity>> AZAZEL = register("azazel",
			EntityType.Builder.<AzazelEntity>of(AzazelEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AzazelEntity::new)

					.sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<AzazelTearEntity>> AZAZEL_TEAR = register("projectile_azazel_tear",
			EntityType.Builder.<AzazelTearEntity>of(AzazelTearEntity::new, MobCategory.MISC).setCustomClientFactory(AzazelTearEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TearProjectileEntity>> TEAR_PROJECTILE = register("projectile_tear_projectile",
			EntityType.Builder.<TearProjectileEntity>of(TearProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(TearProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BeggarEntity>> BEGGAR = register("beggar",
			EntityType.Builder.<BeggarEntity>of(BeggarEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BeggarEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			IsaacEntity.init();
			GaperEntity.init();
			MagdaleneEntity.init();
			FlyEntity.init();
			CainEntity.init();
			JudasEntity.init();
			BlueBabyEntity.init();
			EvaEntity.init();
			SamsonEntity.init();
			EvaWhoreOfBabylonEntity.init();
			AzazelEntity.init();
			BeggarEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ISAAC.get(), IsaacEntity.createAttributes().build());
		event.put(GAPER.get(), GaperEntity.createAttributes().build());
		event.put(MAGDALENE.get(), MagdaleneEntity.createAttributes().build());
		event.put(FLY.get(), FlyEntity.createAttributes().build());
		event.put(CAIN.get(), CainEntity.createAttributes().build());
		event.put(JUDAS.get(), JudasEntity.createAttributes().build());
		event.put(BLUE_BABY.get(), BlueBabyEntity.createAttributes().build());
		event.put(EVA.get(), EvaEntity.createAttributes().build());
		event.put(SAMSON.get(), SamsonEntity.createAttributes().build());
		event.put(EVA_WHORE_OF_BABYLON.get(), EvaWhoreOfBabylonEntity.createAttributes().build());
		event.put(AZAZEL.get(), AzazelEntity.createAttributes().build());
		event.put(BEGGAR.get(), BeggarEntity.createAttributes().build());
	}
}
