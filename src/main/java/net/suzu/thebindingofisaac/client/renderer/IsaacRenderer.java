
package net.suzu.thebindingofisaac.client.renderer;

import net.suzu.thebindingofisaac.entity.IsaacEntity;
import net.suzu.thebindingofisaac.client.model.ModelIsaac;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class IsaacRenderer extends MobRenderer<IsaacEntity, ModelIsaac<IsaacEntity>> {
	public IsaacRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelIsaac(context.bakeLayer(ModelIsaac.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IsaacEntity entity) {
		return new ResourceLocation("tboi_suzu:textures/entities/isaacmodtexture.png");
	}
}
