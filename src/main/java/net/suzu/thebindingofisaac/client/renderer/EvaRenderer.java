
package net.suzu.thebindingofisaac.client.renderer;

import net.suzu.thebindingofisaac.entity.EvaEntity;
import net.suzu.thebindingofisaac.client.model.ModelEve;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class EvaRenderer extends MobRenderer<EvaEntity, ModelEve<EvaEntity>> {
	public EvaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEve(context.bakeLayer(ModelEve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EvaEntity entity) {
		return new ResourceLocation("tboi_suzu:textures/entities/eva.png");
	}
}
