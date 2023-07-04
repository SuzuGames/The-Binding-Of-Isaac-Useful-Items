
package net.suzu.thebindingofisaac.client.renderer;

import net.suzu.thebindingofisaac.entity.BeggarEntity;
import net.suzu.thebindingofisaac.client.model.Modelbeggar;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class BeggarRenderer extends MobRenderer<BeggarEntity, Modelbeggar<BeggarEntity>> {
	public BeggarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbeggar(context.bakeLayer(Modelbeggar.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BeggarEntity entity) {
		return new ResourceLocation("tboi_suzu:textures/entities/beggar.png");
	}
}
