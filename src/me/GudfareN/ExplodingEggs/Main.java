package me.GudfareN.ExplodingEggs;

import java.io.File;
import java.util.logging.Logger;

import me.GudfareN.ExplodingEggs.Egg;
import me.GudfareN.ExplodingEggs.Explode;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginDescriptionFile;

import org.bukkit.event.Listener;


public class Main extends JavaPlugin implements Listener {
	public static Main plugin;
	public final Logger log= Logger.getLogger("Minecraft");
	//public final Toggle playerListener2 = new Toggle();
	
	FileConfiguration localizationConfig = null;
	File localizationFile = null;
	File localizationDir = new File("plugins/ExplodingEggs");
	 
	private Toggle myExecutor;
	private Random myExecutor1;
	
    
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.log.info(pdfFile.getName() + " version "+ pdfFile.getVersion() +" is now enabled");
		this.log.info(pdfFile.getName() + " Author(s): +"+ pdfFile.getAuthors());
		getServer().getPluginManager().registerEvents(new Explode(), this);
		getServer().getPluginManager().registerEvents(new Egg(), this);
        
		String mainPath = "options.";
		this.getConfig().addDefault(mainPath + "Egg explosion radius:", 2);
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		
		this.getConfig().set("Egg explosion radius:", 2);
		
		myExecutor = new Toggle();
        getCommand("ee").setExecutor(myExecutor);
        
        myExecutor1 = new Random();
        getCommand("er").setExecutor(myExecutor1);
           
        
    }
   
    public void onDisable() {
    	PluginDescriptionFile pdfFile = this.getDescription();
    	this.log.info(pdfFile.getName() + " is now disabled");
    }
    }

