
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.suzu.thebindingofisaac.init;

import org.lwjgl.glfw.GLFW;

import net.suzu.thebindingofisaac.network.TearsShotMessage;
import net.suzu.thebindingofisaac.TboiSuzuMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TboiSuzuModKeyMappings {
	public static final KeyMapping TEARS_SHOT = new KeyMapping("key.tboi_suzu.tears_shot", GLFW.GLFW_KEY_G, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				TboiSuzuMod.PACKET_HANDLER.sendToServer(new TearsShotMessage(0, 0));
				TearsShotMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				TEARS_SHOT_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - TEARS_SHOT_LASTPRESS);
				TboiSuzuMod.PACKET_HANDLER.sendToServer(new TearsShotMessage(1, dt));
				TearsShotMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long TEARS_SHOT_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(TEARS_SHOT);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				TEARS_SHOT.consumeClick();
			}
		}
	}
}
