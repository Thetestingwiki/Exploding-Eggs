package me.GudfareN.ExplodingEggs;

import java.io.File;
import java.util.logging.Logger;

import me.GudfareN.ExplodingEggs.Egg;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginDescriptionFile;

public class Main extends JavaPlugin {
	public static Main plugin;
	static String maindir = "plugins/ExplodingEggs/";
	static File settings = new File(maindir + "settings");
	public final Logger log = Logger.getLogger("Minecraft");
	private Toggle myExecutor;
	public int exrad;

	public void onEnable() {
		new File(maindir).mkdir();
		LoadSettings.loadMain();

		PluginDescriptionFile pdfFile = this.getDescription();
		this.log.info(pdfFile.getName() + " Author(s): " + pdfFile.getAuthors());
		getServer().getPluginManager().registerEvents(new Explode(), this);
		getServer().getPluginManager().registerEvents(new Egg(), this);
		getServer().getPluginManager().registerEvents(new Damage(), this);

		myExecutor = new Toggle();
		getCommand("ee").setExecutor(myExecutor);
		getCommand("eeinfo").setExecutor(myExecutor);
		
	}

	public void onDisable() {
	}

}
