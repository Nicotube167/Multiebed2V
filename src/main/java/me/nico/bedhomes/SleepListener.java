package me.nico.bedhomes;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

import java.util.HashMap;
import java.util.UUID;

public class SleepListener implements Listener {

    public static HashMap<UUID, Location> beds = new HashMap<>();

    @EventHandler
    public void onSleep(PlayerBedEnterEvent event) {

        Player player = event.getPlayer();

        Location bed = event.getBed().getLocation();

        beds.put(player.getUniqueId(), bed);

        player.sendMessage("§aYour bed has been saved!");
    }
}
