package com.igor.test;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e){
        e.setCancelled(true);
        e.getPlayer().sendMessage(ChatColor.RED + "Stop moving! You are froozen.");
    }

    @EventHandler
    public void onPlayerEggThrow(PlayerEggThrowEvent e){
        e.getPlayer().sendMessage("Youjust throw an egg!");
    }
}