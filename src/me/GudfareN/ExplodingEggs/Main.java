package me.GudfareN.ExplodingEggs;

import java.io.File;
import java.util.logging.Logger;

import me.GudfareN.ExplodingEggs.Egg;
import me.GudfareN.ExplodingEggs.Explode;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	private static final Logger log= Logger.getLogger("Minecraft");
	public static boolean isHatching = true;
	private final Egg eggListener = new Egg(this);
	private final Explode playerListener = new Explode(this);
	
	FileConfiguration localizationConfig = null;
	File localizationFile = null;
	File localizationDir = new File("plugins/ExplodingEggs");
	 
	private Explode myExecutor;
    
	public void onEnable() {
		log.info("[Exploding Eggs] Version 1.1 has been enabled!");
       	log.info("[Exploding Eggs] Author: GudfareN");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvent(Event.Type.CREATURE_SPAWN, eggListener, Event.Priority.Normal, this);
        pm.registerEvent(Event.Type.PLAYER_EGG_THROW, playerListener, Event.Priority.Normal, this);
        
		String mainPath = "options.";
		this.getConfig().addDefault(mainPath + "Egg explosion radius:", 2);
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		
		this.getConfig().set("Egg explosion radius:", 2);
		
		myExecutor = new Explode(this);
        getCommand("ee").setExecutor(myExecutor);
           
        
    }
   
    public void onDisable() {
       log.info("[Exploding Eggs] Version 1.1 has been disabled!");
    }
    }

