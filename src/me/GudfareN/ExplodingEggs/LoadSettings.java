package me.GudfareN.ExplodingEggs;

public class LoadSettings {
	static int exrad;
	static String ran;

	public static void loadMain() {
		String propFile = Main.maindir + "MainConfig.properties";
		PluginProperties properties = new PluginProperties(propFile);
		properties.load();

		exrad = properties.getInteger("Egg-explosion-radius", 2);
		ran = properties.getString("Random-Explosion", "false");
		properties.save("===ExplodingEggs Main Configuration===");
	}

}
