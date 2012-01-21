package me.GudfareN.ExplodingEggs;

import org.bukkit.entity.Egg;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerListener;
import me.GudfareN.ExplodingEggs.Main;

public class Explode extends PlayerListener{
	
	
	
	public static Main plugin;

    public Explode(Main instance) {
        plugin = instance;
    }
    
    public void onPlayerEggThrow(PlayerEggThrowEvent event) {
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


    
    	


   

    


