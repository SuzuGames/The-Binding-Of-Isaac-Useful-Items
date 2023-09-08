
package net.suzu.thebindingofisaac.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.suzu.thebindingofisaac.procedures.SoulN9Procedure;
import net.suzu.thebindingofisaac.procedures.SoulN8Procedure;
import net.suzu.thebindingofisaac.procedures.SoulN7Procedure;
import net.suzu.thebindingofisaac.procedures.SoulN6Procedure;
import net.suzu.thebindingofisaac.procedures.SoulN5Procedure;
import net.suzu.thebindingofisaac.procedures.SoulN4Procedure;
import net.suzu.thebindingofisaac.procedures.SoulN3Procedure;
import net.suzu.thebindingofisaac.procedures.SoulN2Procedure;
import net.suzu.thebindingofisaac.procedures.SoulN1Procedure;
import net.suzu.thebindingofisaac.procedures.SoulN10Procedure;
import net.suzu.thebindingofisaac.procedures.Soul9Procedure;
import net.suzu.thebindingofisaac.procedures.Soul8Procedure;
import net.suzu.thebindingofisaac.procedures.Soul7Procedure;
import net.suzu.thebindingofisaac.procedures.Soul6Procedure;
import net.suzu.thebindingofisaac.procedures.Soul5Procedure;
import net.suzu.thebindingofisaac.procedures.Soul4Procedure;
import net.suzu.thebindingofisaac.procedures.Soul3Procedure;
import net.suzu.thebindingofisaac.procedures.Soul2Procedure;
import net.suzu.thebindingofisaac.procedures.Soul1Procedure;
import net.suzu.thebindingofisaac.procedures.Soul10Procedure;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class SoulOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			if (Soul1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/soulheart_half.png"), posX + -22, posY + -116, 0, 0, 9, 9, 9, 9);
			}
			if (Soul3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/soulheart_half.png"), posX + -13, posY + -116, 0, 0, 9, 9, 9, 9);
			}
			if (Soul5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/soulheart_half.png"), posX + -4, posY + -116, 0, 0, 9, 9, 9, 9);
			}
			if (Soul7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/soulheart_half.png"), posX + 5, posY + -116, 0, 0, 9, 9, 9, 9);
			}
			if (Soul9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/soulheart_half.png"), posX + 14, posY + -116, 0, 0, 9, 9, 9, 9);
			}
			if (Soul10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/soulheart.png"), posX + 14, posY + -116, 0, 0, 9, 9, 9, 9);
			}
			if (Soul8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/soulheart.png"), posX + 5, posY + -116, 0, 0, 9, 9, 9, 9);
			}
			if (Soul6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/soulheart.png"), posX + -4, posY + -116, 0, 0, 9, 9, 9, 9);
			}
			if (Soul4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/soulheart.png"), posX + -13, posY + -116, 0, 0, 9, 9, 9, 9);
			}
			if (Soul2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/soulheart.png"), posX + -22, posY + -116, 0, 0, 9, 9, 9, 9);
			}
			if (SoulN1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/darkheart_half.png"), posX + -22, posY + -116, 0, 0, 9, 9, 9, 9);
			}
			if (SoulN3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/darkheart_half.png"), posX + -13, posY + -116, 0, 0, 9, 9, 9, 9);
			}
			if (SoulN5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/darkheart_half.png"), posX + -4, posY + -116, 0, 0, 9, 9, 9, 9);
			}
			if (SoulN7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/darkheart_half.png"), posX + 5, posY + -116, 0, 0, 9, 9, 9, 9);
			}
			if (SoulN9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/darkheart_half.png"), posX + 14, posY + -116, 0, 0, 9, 9, 9, 9);
			}
			if (SoulN2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/darkheart.png"), posX + -22, posY + -116, 0, 0, 9, 9, 9, 9);
			}
			if (SoulN4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/darkheart.png"), posX + -13, posY + -116, 0, 0, 9, 9, 9, 9);
			}
			if (SoulN6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/darkheart.png"), posX + -4, posY + -116, 0, 0, 9, 9, 9, 9);
			}
			if (SoulN8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/darkheart.png"), posX + 5, posY + -116, 0, 0, 9, 9, 9, 9);
			}
			if (SoulN10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("tboi_suzu:textures/screens/darkheart.png"), posX + 14, posY + -116, 0, 0, 9, 9, 9, 9);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
