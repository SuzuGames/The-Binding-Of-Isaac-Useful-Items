
package net.suzu.thebindingofisaac.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HolyMantleItem extends Item {
	public HolyMantleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
