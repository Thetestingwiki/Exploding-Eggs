package me.GudfareN.ExplodingEggs;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;

import me.GudfareN.ExplodingEggs.Toggle;

public class Egg implements Listener {

	@EventHandler(priority = EventPriority.HIGH)
	public void egg(CreatureSpawnEvent event) {
		if (Toggle.ee.containsValue(true)) {
			if (event.getSpawnReason() == SpawnReason.EGG) {
				event.setCancelled(true);
			} else {
				if (event.getSpawnReason() == SpawnReason.EGG) {
					event.setCancelled(false);
				}

			}
		}
	}

}
test
