
package net.suzu.thebindingofisaac.client.renderer;

import net.suzu.thebindingofisaac.entity.JudasEntity;
import net.suzu.thebindingofisaac.client.model.ModelJudas;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class JudasRenderer extends MobRenderer<JudasEntity, ModelJudas<JudasEntity>> {
	public JudasRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelJudas(context.bakeLayer(ModelJudas.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JudasEntity entity) {
		return new ResourceLocation("tboi_suzu:textures/entities/judas.png");
	}
}
