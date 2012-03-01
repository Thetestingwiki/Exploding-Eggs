package me.GudfareN.ExplodingEggs;

import java.util.Random;

import org.bukkit.entity.Egg;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;

public class Explode implements Listener {
	public static Explode Explo;

	@EventHandler(priority = EventPriority.NORMAL)
	public void ex(PlayerEggThrowEvent event) {
		Player player = event.getPlayer();
		Egg egg = event.getEgg();
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
								event.setHatching(true);
								egg.getWorld().createExplosion(egg.getLocation(), exrad);
								player.damage(2, egg);
							}else{
								egg.remove();
								event.setHatching(true);
								egg.getWorld().createExplosion(egg.getLocation(), exrad);
							}
						}
					}
				}
		} else {
			if (Toggle.ee.containsKey(event.getPlayer())) {
				if (Toggle.ee.containsValue(true)) {
					int exrad = LoadSettings.exrad;
							event.getEgg().remove();
							event.setHatching(true);
							egg.getWorld().createExplosion(egg.getLocation(), exrad);
						}
			}
		}
	}
}