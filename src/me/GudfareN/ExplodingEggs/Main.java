package me.GudfareN.ExplodingEggs;

import java.util.logging.Logger;

import me.GudfareN.ExplodingEggs.Egg;
import me.GudfareN.ExplodingEggs.Explode;

import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	private static final Logger log= Logger.getLogger("Minecraft");
	public static boolean isHatching = true;
	private final Egg eggListener = new Egg(this);
	private final Explode playerListener = new Explode(this);
    
	public void onEnable() {
        log.info("[Exploding Eggs] has been enabled!");
        log.info("[Exploding Eggs] Author: GudfareN");
        log.info("[Exploding Eggs] Version: 1");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvent(Event.Type.CREATURE_SPAWN, eggListener, Event.Priority.Normal, this);
        pm.registerEvent(Event.Type.PLAYER_EGG_THROW, playerListener, Event.Priority.Normal, this);
        
    }
   
    public void onDisable() {
        log.info("[Exploding Eggs] has been disabled!");
    }
}
