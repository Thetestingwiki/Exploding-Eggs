package me.GudfareN.ExplodingEggs;

import java.util.HashMap;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerListener;

public class Random extends PlayerListener implements CommandExecutor{

    public static HashMap<Player, Boolean> er = new HashMap<Player, Boolean>();
    
    public void toggleRandom(Player player){
    	 
        if(er.containsKey(player)){
            if(er.get(player)){
            	er.put(player, false);
                player.sendMessage(ChatColor.AQUA + "Random explosion disabled");
            } else {
            	er.put(player, true);
                player.sendMessage(ChatColor.AQUA + "Random explosion enabled");
                
            }
        } else {
        	er.put(player, true); //If you want plugin enabled by default change this value to false.
            player.sendMessage(ChatColor.AQUA + "Random explosion enabled");
        }
        
    }
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
    	if(cmd.getName().equalsIgnoreCase("er")){
    		Player player = (Player) sender;
    		toggleRandom(player);
    		return true;
    	} 
    	return false; 
    }
	
}
