
package net.suzu.thebindingofisaac.client.renderer;

import net.suzu.thebindingofisaac.entity.EvaWhoreOfBabylonEntity;
import net.suzu.thebindingofisaac.client.model.ModelEvaWhoreOfBabylon;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class EvaWhoreOfBabylonRenderer extends MobRenderer<EvaWhoreOfBabylonEntity, ModelEvaWhoreOfBabylon<EvaWhoreOfBabylonEntity>> {
	public EvaWhoreOfBabylonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEvaWhoreOfBabylon(context.bakeLayer(ModelEvaWhoreOfBabylon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EvaWhoreOfBabylonEntity entity) {
		return new ResourceLocation("tboi_suzu:textures/entities/evawhoreofbabylon.png");
	}
}
