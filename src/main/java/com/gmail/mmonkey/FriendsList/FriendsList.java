package com.gmail.mmonkey.FriendsList;

import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.event.Subscribe;
import org.spongepowered.api.event.state.PreInitializationEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.plugin.PluginContainer;

import com.google.common.base.Optional;

@Plugin(id = FriendsList.ID, name = FriendsList.NAME, version = FriendsList.VERSION)
public class FriendsList {
	
	public static final String ID = "FriendsList";
	public static final String NAME = "FriendsList";
	public static final String VERSION = "0.0.1";
	
	private Game game;
	private Optional<PluginContainer> pluginContainer;
	private static Logger logger;
	
	public Game getGame() {
		return this.game;
	}
	
	public Optional<PluginContainer> getPluginContainer() {
		return this.pluginContainer;
	}
	
	public static Logger getLogger() {
		return logger;
	}
	
	@Subscribe
	public void onPreInit(PreInitializationEvent event) {
		
		this.game = event.getGame();
		this.pluginContainer = game.getPluginManager().getPlugin(FriendsList.NAME);
		FriendsList.logger = game.getPluginManager().getLogger(pluginContainer.get());
		
		getLogger().info(String.format("Starting up %s v%s.", FriendsList.NAME, FriendsList.VERSION));
		
	}

}
