
package net.suzu.thebindingofisaac.client.renderer;

import net.suzu.thebindingofisaac.entity.SamsonEntity;
import net.suzu.thebindingofisaac.client.model.ModelSamson;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class SamsonRenderer extends MobRenderer<SamsonEntity, ModelSamson<SamsonEntity>> {
	public SamsonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSamson(context.bakeLayer(ModelSamson.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SamsonEntity entity) {
		return new ResourceLocation("tboi_suzu:textures/entities/newsamson.png");
	}
}
