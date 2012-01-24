package me.GudfareN.ExplodingEggs;

import java.util.Random;

import org.bukkit.entity.Egg;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;

public class Explode implements Listener {

	@EventHandler(priority = EventPriority.NORMAL)
	public void ex(PlayerEggThrowEvent event) {
		String ran = LoadSettings.ran;
		int chance = LoadSettings.chance;
		if (ran.contentEquals("true")) {
			if (true) {
				Random gen = new Random();
				int r = gen.nextInt(100);
				if (r < chance) {
					int exrad = LoadSettings.exrad;
					if (Toggle.ee.containsKey(event.getPlayer())) {
						if (Toggle.ee.containsValue(true)) {
							event.getEgg().remove();
							Egg egg = event.getEgg();
							event.setHatching(true);
							event.getEgg().getWorld().createExplosion(egg.getLocation(), exrad);
						}
					}
				}
			}
		} else {
			if (Toggle.ee.containsKey(event.getPlayer())) {
				if (Toggle.ee.containsValue(true)) {
					int exrad = LoadSettings.exrad;
					event.getEgg().remove();
					Egg egg = event.getEgg();
					event.setHatching(true);
					event.getEgg().getWorld().createExplosion(egg.getLocation(), exrad);
				}
			}
		}
	}
}
