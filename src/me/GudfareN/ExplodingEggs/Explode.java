package me.GudfareN.ExplodingEggs;

//import org.bukkit.Location;
import org.bukkit.entity.Egg;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerListener;

public class Explode extends PlayerListener {
    
	public static Main plugin;

    public Explode(Main instance) {
        plugin = instance;
    }
    
    public void onPlayerEggThrow(PlayerEggThrowEvent event){
    if (Main.isHatching = true){
    	event.getEgg().remove();
    	Egg egg = event.getEgg();
    	egg.getLocation();
    	event.getEgg().getLocation();
    	event.getPlayer();
    	event.setHatching(Main.isHatching);
    	event.getEgg().getWorld().createExplosion(egg.getLocation(), 2);
    }else{
    	event.getEgg().remove();
    	Egg egg = event.getEgg();
    	egg.getLocation();
    	event.getEgg().getLocation();
    	event.getPlayer();
    	event.getEgg().getWorld().createExplosion(egg.getLocation(), 2);
    }
    }
    
    //public void onPlayerEggThrow(PlayerEggThrowEvent event){
    	
    	//event.getEgg().remove();
    	//Egg egg = event.getEgg();
    	//egg.getLocation();
    	//event.getEgg().getLocation();
    	//event.getPlayer();
    	//event.setHatching(Main.isHatching);
    	//event.getEgg().getWorld().createExplosion(egg.getLocation(), 2);
    
    }
    	


   

    


