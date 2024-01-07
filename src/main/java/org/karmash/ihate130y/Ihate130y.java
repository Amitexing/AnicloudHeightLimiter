package org.karmash.ihate130y;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Ihate130y extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(this,this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    @EventHandler
    public void onMove(PlayerMoveEvent e){
        if (e.getTo().getY() >= 130 ){
            Player player = e.getPlayer();
            Location location = player.getLocation();
            location.setY(120);
            player.teleport(location);
            player.sendMessage(":error_red: &cВы слишком высоко!");
        }
    }
}
