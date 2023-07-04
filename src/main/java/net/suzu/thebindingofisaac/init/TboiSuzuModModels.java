
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.suzu.thebindingofisaac.init;

import net.suzu.thebindingofisaac.client.model.Modelbeggar;
import net.suzu.thebindingofisaac.client.model.ModelSamson;
import net.suzu.thebindingofisaac.client.model.ModelMagdalene;
import net.suzu.thebindingofisaac.client.model.ModelJudas;
import net.suzu.thebindingofisaac.client.model.ModelIsaac;
import net.suzu.thebindingofisaac.client.model.ModelFly;
import net.suzu.thebindingofisaac.client.model.ModelEveWhoreOfBabylon;
import net.suzu.thebindingofisaac.client.model.ModelEve;
import net.suzu.thebindingofisaac.client.model.ModelEvaWhoreOfBabylon;
import net.suzu.thebindingofisaac.client.model.ModelCain;
import net.suzu.thebindingofisaac.client.model.ModelBluebaby;
import net.suzu.thebindingofisaac.client.model.ModelAzazel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TboiSuzuModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelAzazel.LAYER_LOCATION, ModelAzazel::createBodyLayer);
		event.registerLayerDefinition(ModelEveWhoreOfBabylon.LAYER_LOCATION, ModelEveWhoreOfBabylon::createBodyLayer);
		event.registerLayerDefinition(ModelMagdalene.LAYER_LOCATION, ModelMagdalene::createBodyLayer);
		event.registerLayerDefinition(ModelEvaWhoreOfBabylon.LAYER_LOCATION, ModelEvaWhoreOfBabylon::createBodyLayer);
		event.registerLayerDefinition(ModelCain.LAYER_LOCATION, ModelCain::createBodyLayer);
		event.registerLayerDefinition(Modelbeggar.LAYER_LOCATION, Modelbeggar::createBodyLayer);
		event.registerLayerDefinition(ModelEve.LAYER_LOCATION, ModelEve::createBodyLayer);
		event.registerLayerDefinition(ModelSamson.LAYER_LOCATION, ModelSamson::createBodyLayer);
		event.registerLayerDefinition(ModelIsaac.LAYER_LOCATION, ModelIsaac::createBodyLayer);
		event.registerLayerDefinition(ModelBluebaby.LAYER_LOCATION, ModelBluebaby::createBodyLayer);
		event.registerLayerDefinition(ModelJudas.LAYER_LOCATION, ModelJudas::createBodyLayer);
		event.registerLayerDefinition(ModelFly.LAYER_LOCATION, ModelFly::createBodyLayer);
	}
}
