package me.GudfareN.ExplodingEggs;

import org.bukkit.entity.Egg;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;

public class Explode implements Listener{
	//public static int exrad = plugin.config.getInt("Egg_explosion_radius");
	
    @EventHandler(priority = EventPriority.NORMAL)
    public void ex(PlayerEggThrowEvent event) {
    	int exrad = LoadSettings.exrad;
    	if (Toggle.ee.containsKey(event.getPlayer())){
    		if (Toggle.ee.containsValue(true)){
        		event.getEgg().remove();
        		Egg egg = event.getEgg();
        		event.setHatching(true);
        		event.getEgg().getWorld().createExplosion(egg.getLocation(), exrad);
        		//event.getEgg().getLocation().getNearbyEntities.dealDamage(10);
    	}else{

    		}
    	}
    }
}
    	



    
    	


   

    


