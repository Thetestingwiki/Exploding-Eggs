package me.GudfareN.ExplodingEggs;

import java.util.HashMap;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Toggle implements Listener, CommandExecutor {

    public static HashMap<Player, Boolean> ee = new HashMap<Player, Boolean>();
    
    public void togglePluginState(Player player){
     	 
        if(ee.containsKey(player)){
            if(ee.get(player)){
            	ee.put(player, false);
                player.sendMessage(ChatColor.AQUA + "Egg explosion disabled");
            } else {
            	ee.put(player, true);
                player.sendMessage(ChatColor.AQUA + "Egg explosion enabled");
                
            }
        } else {
        	ee.put(player, true); //If you want plugin enabled by default change this value to false.
            player.sendMessage(ChatColor.AQUA + "Egg explosion enabled");
        }
        
    }
    
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
    	if(cmd.getName().equalsIgnoreCase("ee")){
    		Player player = (Player) sender;
    		togglePluginState(player);
    		return true;
    	} 
		if(cmd.getName().equalsIgnoreCase("ee info")){
			Player player = (Player) sender;
			player.sendMessage(ChatColor.AQUA + "Author: GudfareN");
			player.sendMessage(ChatColor.AQUA + "Version: 1.1");
		}
    	return false; 
    }
	
}
