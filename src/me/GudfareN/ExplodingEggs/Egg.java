package me.GudfareN.ExplodingEggs;

import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.event.entity.EntityListener;
import me.GudfareN.ExplodingEggs.Toggle;


public class Egg extends EntityListener {

    public static Main plugin;

    public Egg(Main instance) {
        plugin = instance;
    }
    
    
    
    public void onCreatureSpawn(CreatureSpawnEvent event)
    {
    	if (Toggle.ee.containsValue(true)){
            if (event.getSpawnReason() == SpawnReason.EGG) {
                event.setCancelled(true);
    	}else{
            if (event.getSpawnReason() == SpawnReason.EGG) {
                event.setCancelled(false);
    }     
    }
   }
  }
}
