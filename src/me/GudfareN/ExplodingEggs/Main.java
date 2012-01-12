package me.GudfareN.ExplodingEggs;

import java.util.logging.Logger;

import me.GudfareN.ExplodingEggs.Explode;
import me.GudfareN.ExplodingEggs.ExplodeRate;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	private static final Logger log= Logger.getLogger("Minecraft");
	private final Explode eggListener = new Explode(this);
	private final ExplodeRate playerListener = new ExplodeRate(this);
    
	public void onEnable() {
        log.info("[Exploding Eggs] has been enabled!");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvent(Event.Type.CREATURE_SPAWN, eggListener, Event.Priority.Normal, this);
        pm.registerEvent(Event.Type.PLAYER_EGG_THROW, playerListener, Event.Priority.Normal, this);
        
    }
   
    public void onDisable() {
        log.info("[Exploding Eggs] has been disabled!");
    }
}
