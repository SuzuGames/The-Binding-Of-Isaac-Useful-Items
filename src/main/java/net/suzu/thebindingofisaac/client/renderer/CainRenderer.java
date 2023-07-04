
package net.suzu.thebindingofisaac.client.renderer;

import net.suzu.thebindingofisaac.entity.CainEntity;
import net.suzu.thebindingofisaac.client.model.ModelCain;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class CainRenderer extends MobRenderer<CainEntity, ModelCain<CainEntity>> {
	public CainRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCain(context.bakeLayer(ModelCain.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CainEntity entity) {
		return new ResourceLocation("tboi_suzu:textures/entities/cain.png");
	}
}
