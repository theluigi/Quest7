package edu.unca.jruggier.Quest7;

/*
    This file is part of Quest7

    Foobar is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Foobar is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import com.google.common.base.Joiner;

public class Quest7CommandExecutor implements CommandExecutor {

    private final Quest7 plugin;

    public Quest7CommandExecutor(Quest7 plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if (args.length == 0) {
			return false;
		} else if (!(sender instanceof Player)) {
			return false;
		
		}  else if (args[0].equalsIgnoreCase("woodsword")) {
			Player p = (Player)sender;
			PlayerInventory inventory = p.getInventory();
			ItemStack woodsword = new ItemStack(Material.WOOD_SWORD,1);
			inventory.addItem(woodsword);
			plugin.getLogger().info("You received a wooden sword.");
			plugin.logger.info("Gave wooden sword to " + p);
			return true;
			
		} else if (args[0].equalsIgnoreCase("stonesword")) {
			Player p = (Player)sender;
			PlayerInventory inventory = p.getInventory();
			ItemStack stonesword = new ItemStack(Material.STONE_SWORD,1);
			inventory.addItem(stonesword);
			plugin.getLogger().info("You received a stone sword.");
			plugin.logger.info("Gave stone sword to " + p);
			return true;
			
		} else if (args[0].equalsIgnoreCase("ironsword")) {
			Player p = (Player)sender;
			PlayerInventory inventory = p.getInventory();
			ItemStack ironsword = new ItemStack(Material.IRON_SWORD,1);
			inventory.addItem(ironsword);
			plugin.getLogger().info("You received an iron sword.");
			plugin.logger.info("Gave iron sword to " + p);
			return true;
			
		} else if (args[0].equalsIgnoreCase("goldsword")) {
			Player p = (Player)sender;
			PlayerInventory inventory = p.getInventory();
			ItemStack goldsword = new ItemStack(Material.GOLD_SWORD,1);
			inventory.addItem(goldsword);
			plugin.getLogger().info("You received a gold sword.");
			plugin.logger.info("Gave gold sword to " + p);
			return true;
			
		} 
		else if (args[0].equalsIgnoreCase("diamondsword")) {
			Player p = (Player)sender;
			PlayerInventory inventory = p.getInventory();
			ItemStack diamondsword = new ItemStack(Material.DIAMOND_SWORD,1);
			inventory.addItem(diamondsword);
			plugin.getLogger().info("You received a diamond sword.");
			plugin.logger.info("Gave diamond sword to " + p);
			return true;
		}
			
			else {
			return false;
		}
		}
	}

    
