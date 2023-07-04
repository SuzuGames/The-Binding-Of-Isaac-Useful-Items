
package net.suzu.thebindingofisaac.client.renderer;

import net.suzu.thebindingofisaac.entity.AzazelEntity;
import net.suzu.thebindingofisaac.client.model.ModelAzazel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class AzazelRenderer extends MobRenderer<AzazelEntity, ModelAzazel<AzazelEntity>> {
	public AzazelRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelAzazel(context.bakeLayer(ModelAzazel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AzazelEntity entity) {
		return new ResourceLocation("tboi_suzu:textures/entities/azazelnew.png");
	}
}
