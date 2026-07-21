package me.nico.bedhomes;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.HashMap;
import java.util.UUID;

public class NameListener implements Listener {

    private static HashMap<UUID, Location> waiting = new HashMap<>();

    public static void requestName(Player player, Location bed) {
        waiting.put(player.getUniqueId(), bed);
        player.sendMessage("§eType the name of your bed in chat:");
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {

        Player player = event.getPlayer();

        if (!waiting.containsKey(player.getUniqueId())) {
            return;
        }

        event.setCancelled(true);

        String name = event.getMessage();

        Location bed = waiting.remove(player.getUniqueId());

        BedManager.addBed(
                player.getUniqueId(),
                new BedData(name, bed)
        );

        player.sendMessage("§aBed saved as: §f" + name);
    }
}
