
package net.suzu.thebindingofisaac.client.renderer;

import net.suzu.thebindingofisaac.entity.FlyEntity;
import net.suzu.thebindingofisaac.client.model.ModelFly;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class FlyRenderer extends MobRenderer<FlyEntity, ModelFly<FlyEntity>> {
	public FlyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFly(context.bakeLayer(ModelFly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FlyEntity entity) {
		return new ResourceLocation("tboi_suzu:textures/entities/fly.png");
	}
}
