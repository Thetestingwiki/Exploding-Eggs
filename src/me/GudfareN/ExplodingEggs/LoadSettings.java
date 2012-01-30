package me.GudfareN.ExplodingEggs;

public class LoadSettings {
	static int exrad;
	static int chance;
	static String ran;
	static String allways;

	public static void loadMain() {
		String propFile = Main.maindir + "MainConfig.properties";
		PluginProperties properties = new PluginProperties(propFile);
		properties.load();

		allways = properties.getString("Egg-explosion-allways-enabled", "Not-working-yet");
		exrad = properties.getInteger("Egg-explosion-radius", 2);
		ran = properties.getString("Random-Explosion", "false");
		chance = properties.getInteger("Chance-for-Explosion", 40);
		properties.save("===ExplodingEggs Main Configuration===");
	}

}
