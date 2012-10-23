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

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import edu.unca.jruggier.Quest7.Quest7CommandExecutor;
import edu.unca.jruggier.Quest7.Quest7EventListener;
import edu.unca.jruggier.Quest7.Quest7Logger;

@SuppressWarnings("unused")
public class Quest7 extends JavaPlugin {

	/*
	 * This is called when your plug-in is enabled
	 */
	Quest7Logger logger;

	@Override
	public void onEnable() {
		// create a logger and use it
		logger = new Quest7Logger(this);
		logger.info("plugin enabled");

		// save the configuration file
		saveDefaultConfig();

		// Create the SampleListener
		new Quest7EventListener(this);

		// set the command executor for sample
		this.getCommand("item").setExecutor(new Quest7CommandExecutor(this));
	}

	/*
	 * This is called when your plug-in shuts down
	 */
	@Override
	public void onDisable() {
		logger.info("plugin disabled");

	}
}
