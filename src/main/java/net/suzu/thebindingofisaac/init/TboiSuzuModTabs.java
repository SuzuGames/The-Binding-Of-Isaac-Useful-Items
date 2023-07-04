
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.suzu.thebindingofisaac.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TboiSuzuModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(TboiSuzuModBlocks.MARK_STONE.get().asItem());
			tabData.accept(TboiSuzuModBlocks.SLOT_MACHINE.get().asItem());
			tabData.accept(TboiSuzuModBlocks.BLOOD_MACHINE.get().asItem());
			tabData.accept(TboiSuzuModBlocks.DEVILS_COBBLESTONE.get().asItem());
			tabData.accept(TboiSuzuModBlocks.BASEMENT_WALL.get().asItem());
			tabData.accept(TboiSuzuModBlocks.BASEMENT_FLOOR.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(TboiSuzuModItems.TEAR_PROJECTILE.get());
		}

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(TboiSuzuModItems.ISAAC_SPAWN_EGG.get());
			tabData.accept(TboiSuzuModItems.GAPER_SPAWN_EGG.get());
			tabData.accept(TboiSuzuModItems.MAGDALENE_SPAWN_EGG.get());
			tabData.accept(TboiSuzuModItems.FLY_SPAWN_EGG.get());
			tabData.accept(TboiSuzuModItems.CAIN_SPAWN_EGG.get());
			tabData.accept(TboiSuzuModItems.JUDAS_SPAWN_EGG.get());
			tabData.accept(TboiSuzuModItems.BLUE_BABY_SPAWN_EGG.get());
			tabData.accept(TboiSuzuModItems.EVA_SPAWN_EGG.get());
			tabData.accept(TboiSuzuModItems.SAMSON_SPAWN_EGG.get());
			tabData.accept(TboiSuzuModItems.AZAZEL_SPAWN_EGG.get());
			tabData.accept(TboiSuzuModItems.BEGGAR_SPAWN_EGG.get());
			tabData.accept(TboiSuzuModItems.CRACKED_DICE.get());
			tabData.accept(TboiSuzuModItems.MAGGYS_FAITH.get());
			tabData.accept(TboiSuzuModItems.SILVER_DOLLAR.get());
			tabData.accept(TboiSuzuModItems.CURVED_HORN.get());
			tabData.accept(TboiSuzuModItems.MECONIUM.get());
			tabData.accept(TboiSuzuModItems.BLACK_FEATHER.get());
			tabData.accept(TboiSuzuModItems.BLOOD_PENNY.get());
			tabData.accept(TboiSuzuModItems.DAEMONS_TAIL.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("tboi_suzu", "tarot_cards"),
				builder -> builder.title(Component.translatable("item_group.tboi_suzu.tarot_cards")).icon(() -> new ItemStack(TboiSuzuModItems.TAROT_CARD.get())).displayItems((parameters, tabData) -> {
					tabData.accept(TboiSuzuModItems.THE_FOOL.get());
					tabData.accept(TboiSuzuModItems.THE_MAGICIAN.get());
					tabData.accept(TboiSuzuModItems.THE_HIGH_PRIESTESS.get());
					tabData.accept(TboiSuzuModItems.THE_EMPRESS.get());
					tabData.accept(TboiSuzuModItems.THE_EMPEROR.get());
					tabData.accept(TboiSuzuModItems.THE_HIEROPHANT.get());
					tabData.accept(TboiSuzuModItems.THE_LOVERS.get());
					tabData.accept(TboiSuzuModItems.THE_CHARIOT.get());
					tabData.accept(TboiSuzuModItems.JUSTICE.get());
					tabData.accept(TboiSuzuModItems.THE_HERMIT.get());
					tabData.accept(TboiSuzuModItems.WHEEL_OF_FORTUNE.get());
					tabData.accept(TboiSuzuModItems.STRENGTH.get());
					tabData.accept(TboiSuzuModItems.THE_HANGED_MAN.get());
					tabData.accept(TboiSuzuModItems.DEATH.get());
					tabData.accept(TboiSuzuModItems.TEMPERANCE.get());
					tabData.accept(TboiSuzuModItems.THE_DEVIL.get());
					tabData.accept(TboiSuzuModItems.THE_TOWER.get());
					tabData.accept(TboiSuzuModItems.THE_STARS.get());
					tabData.accept(TboiSuzuModItems.THE_MOON.get());
					tabData.accept(TboiSuzuModItems.THE_SUN.get());
					tabData.accept(TboiSuzuModItems.JUDGEMENT.get());
					tabData.accept(TboiSuzuModItems.THE_WORLD.get());
					tabData.accept(TboiSuzuModItems.CHARGED_THE_FOOL.get());
					tabData.accept(TboiSuzuModItems.CHARGED_THE_MAGICIAN.get());
					tabData.accept(TboiSuzuModItems.CHARGED_THE_HIGH_PRIESTESS.get());
					tabData.accept(TboiSuzuModItems.CHARGED_THE_EMPEROR.get());
					tabData.accept(TboiSuzuModItems.CHARGED_THE_HIEROPHANT.get());
					tabData.accept(TboiSuzuModItems.CHARGED_THE_LOVERS.get());
					tabData.accept(TboiSuzuModItems.CHARGED_THE_CHARIOT.get());
					tabData.accept(TboiSuzuModItems.CHARGED_JUSTICE.get());
					tabData.accept(TboiSuzuModItems.CHARGED_THE_HERMIT.get());
					tabData.accept(TboiSuzuModItems.CHARGED_WHEEL_OF_FORTUNE.get());
					tabData.accept(TboiSuzuModItems.CHARGED_STRENGH.get());
					tabData.accept(TboiSuzuModItems.CHARGED_THE_HANGED_MAN.get());
					tabData.accept(TboiSuzuModItems.CHARGED_DEATH.get());
					tabData.accept(TboiSuzuModItems.CHARGED_TEMPERANCE.get());
					tabData.accept(TboiSuzuModItems.CHARGED_THE_DEVIL.get());
					tabData.accept(TboiSuzuModItems.CHARGED_THE_TOWER.get());
					tabData.accept(TboiSuzuModItems.CHARGED_THE_STARS.get());
					tabData.accept(TboiSuzuModItems.CHARGED_THE_MOON.get());
					tabData.accept(TboiSuzuModItems.CHARGED_THE_SUN.get());
					tabData.accept(TboiSuzuModItems.CHARGED_JUDGEMENT.get());
					tabData.accept(TboiSuzuModItems.CHARGED_THE_WORLD.get());
					tabData.accept(TboiSuzuModItems.HOLY_CARD.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("tboi_suzu", "hearts"),
				builder -> builder.title(Component.translatable("item_group.tboi_suzu.hearts")).icon(() -> new ItemStack(TboiSuzuModItems.RED_HEART.get())).displayItems((parameters, tabData) -> {
					tabData.accept(TboiSuzuModItems.RED_HEART.get());
					tabData.accept(TboiSuzuModItems.SOUL_HEART.get());
					tabData.accept(TboiSuzuModItems.ETERNAL_HEART.get());
					tabData.accept(TboiSuzuModItems.BLACK_HEART.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("tboi_suzu", "pills"),
				builder -> builder.title(Component.translatable("item_group.tboi_suzu.pills")).icon(() -> new ItemStack(TboiSuzuModItems.PILL_1.get())).displayItems((parameters, tabData) -> {
					tabData.accept(TboiSuzuModItems.PILL_1.get());
					tabData.accept(TboiSuzuModItems.PILL_2.get());
					tabData.accept(TboiSuzuModItems.PILL_3.get());
					tabData.accept(TboiSuzuModItems.PILL_4.get());
					tabData.accept(TboiSuzuModItems.PILL_5.get());
					tabData.accept(TboiSuzuModItems.PILL_6.get());
					tabData.accept(TboiSuzuModItems.PILL_7.get());
					tabData.accept(TboiSuzuModItems.PILL_8.get());
					tabData.accept(TboiSuzuModItems.PILL_9.get());
					tabData.accept(TboiSuzuModItems.PILL_10.get());
					tabData.accept(TboiSuzuModItems.PILL_11.get());
					tabData.accept(TboiSuzuModItems.PILL_12.get());
					tabData.accept(TboiSuzuModItems.PILL_13.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("tboi_suzu", "pennies"),
				builder -> builder.title(Component.translatable("item_group.tboi_suzu.pennies")).icon(() -> new ItemStack(TboiSuzuModItems.PENNY.get())).displayItems((parameters, tabData) -> {
					tabData.accept(TboiSuzuModItems.PENNY.get());
					tabData.accept(TboiSuzuModItems.NICKEL.get());
					tabData.accept(TboiSuzuModItems.DIME.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("tboi_suzu", "bombs"),
				builder -> builder.title(Component.translatable("item_group.tboi_suzu.bombs")).icon(() -> new ItemStack(TboiSuzuModItems.BOMB.get())).displayItems((parameters, tabData) -> {
					tabData.accept(TboiSuzuModItems.BOMB.get());
					tabData.accept(TboiSuzuModItems.GOLDEN_BOMB.get());
					tabData.accept(TboiSuzuModItems.BIG_BOMB.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("tboi_suzu", "chests"),
				builder -> builder.title(Component.translatable("item_group.tboi_suzu.chests")).icon(() -> new ItemStack(TboiSuzuModBlocks.GOLDEN_CHEST.get())).displayItems((parameters, tabData) -> {
					tabData.accept(TboiSuzuModBlocks.NORMAL_CHEST.get().asItem());
					tabData.accept(TboiSuzuModBlocks.RED_CHEST.get().asItem());
					tabData.accept(TboiSuzuModBlocks.GOLDEN_CHEST.get().asItem());
					tabData.accept(TboiSuzuModBlocks.ANGEL_CHEST.get().asItem());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("tboi_suzu", "keys"),
				builder -> builder.title(Component.translatable("item_group.tboi_suzu.keys")).icon(() -> new ItemStack(TboiSuzuModItems.KEY.get())).displayItems((parameters, tabData) -> {
					tabData.accept(TboiSuzuModItems.KEY.get());
					tabData.accept(TboiSuzuModItems.GOLDEN_KEY.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("tboi_suzu", "items"),
				builder -> builder.title(Component.translatable("item_group.tboi_suzu.items")).icon(() -> new ItemStack(TboiSuzuModItems.GUPPYS_PAW.get())).displayItems((parameters, tabData) -> {
					tabData.accept(TboiSuzuModItems.RAZOR_BLADE.get());
					tabData.accept(TboiSuzuModItems.DADS_KEY.get());
					tabData.accept(TboiSuzuModItems.GUPPYS_PAW.get());
					tabData.accept(TboiSuzuModItems.HOW_TO_JUMP.get());
					tabData.accept(TboiSuzuModItems.THE_BOOK_OF_BELIAL.get());
					tabData.accept(TboiSuzuModItems.ANARCHIST_COOKBOOK.get());
					tabData.accept(TboiSuzuModItems.BOOK_OF_SHADOWS.get());
					tabData.accept(TboiSuzuModItems.CRACK_THE_SKY.get());
					tabData.accept(TboiSuzuModItems.MOMS_BOTTLE_OF_PILLS.get());
				}).withSearchBar());
	}
}
