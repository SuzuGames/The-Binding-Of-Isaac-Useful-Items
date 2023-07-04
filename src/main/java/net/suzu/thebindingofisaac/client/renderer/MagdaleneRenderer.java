
package net.suzu.thebindingofisaac.client.renderer;

import net.suzu.thebindingofisaac.entity.MagdaleneEntity;
import net.suzu.thebindingofisaac.client.model.ModelMagdalene;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class MagdaleneRenderer extends MobRenderer<MagdaleneEntity, ModelMagdalene<MagdaleneEntity>> {
	public MagdaleneRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMagdalene(context.bakeLayer(ModelMagdalene.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MagdaleneEntity entity) {
		return new ResourceLocation("tboi_suzu:textures/entities/magdalene.png");
	}
}
