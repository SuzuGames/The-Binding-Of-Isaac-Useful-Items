
package net.suzu.thebindingofisaac.client.renderer;

import net.suzu.thebindingofisaac.entity.GaperEntity;
import net.suzu.thebindingofisaac.client.model.ModelIsaac;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class GaperRenderer extends MobRenderer<GaperEntity, ModelIsaac<GaperEntity>> {
	public GaperRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelIsaac(context.bakeLayer(ModelIsaac.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GaperEntity entity) {
		return new ResourceLocation("tboi_suzu:textures/entities/gapermodtexture.png");
	}
}
