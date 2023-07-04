
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.suzu.thebindingofisaac.init;

import net.suzu.thebindingofisaac.client.renderer.SamsonRenderer;
import net.suzu.thebindingofisaac.client.renderer.MagdaleneRenderer;
import net.suzu.thebindingofisaac.client.renderer.JudasRenderer;
import net.suzu.thebindingofisaac.client.renderer.IsaacRenderer;
import net.suzu.thebindingofisaac.client.renderer.GaperRenderer;
import net.suzu.thebindingofisaac.client.renderer.FlyRenderer;
import net.suzu.thebindingofisaac.client.renderer.EvaWhoreOfBabylonRenderer;
import net.suzu.thebindingofisaac.client.renderer.EvaRenderer;
import net.suzu.thebindingofisaac.client.renderer.CainRenderer;
import net.suzu.thebindingofisaac.client.renderer.BlueBabyRenderer;
import net.suzu.thebindingofisaac.client.renderer.BeggarRenderer;
import net.suzu.thebindingofisaac.client.renderer.AzazelRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TboiSuzuModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TboiSuzuModEntities.ISAAC.get(), IsaacRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.GAPER.get(), GaperRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.MAGDALENE.get(), MagdaleneRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.FLY.get(), FlyRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.CAIN.get(), CainRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.JUDAS.get(), JudasRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.BLUE_BABY.get(), BlueBabyRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.EVA.get(), EvaRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.SAMSON.get(), SamsonRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.EVA_WHORE_OF_BABYLON.get(), EvaWhoreOfBabylonRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.ISAAC_TEAR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.MAGDALENE_TEAR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.CAIN_TEAR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.JUDAS_TEAR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.BLUE_BABY_TEAR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.EVA_TEAR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.SAMSON_TEAR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.EVA_WHORE_OF_BABYLON_TEAR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.AZAZEL.get(), AzazelRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.AZAZEL_TEAR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.TEAR_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TboiSuzuModEntities.BEGGAR.get(), BeggarRenderer::new);
	}
}
