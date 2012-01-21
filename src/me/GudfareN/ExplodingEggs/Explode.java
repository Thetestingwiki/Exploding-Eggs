package me.GudfareN.ExplodingEggs;

import org.bukkit.entity.Egg;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
//import me.GudfareN.ExplodingEggs.Main;

public class Explode implements Listener{
	
    @EventHandler(priority = EventPriority.NORMAL)
    public void ex(PlayerEggThrowEvent event) {
    	if (Toggle.ee.containsKey(event.getPlayer())){
    		if (Toggle.ee.containsValue(true)){
        		event.getEgg().remove();
        		Egg egg = event.getEgg();
        		event.setHatching(true);
        		event.getEgg().getWorld().createExplosion(egg.getLocation(), 2);
    	}else{

    		}
    	}
    }
}
    	



    
    	


   

    


