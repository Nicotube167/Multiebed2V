package me.nico.bedhomes;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {

        Player player = event.getEntity();

        Bukkit.getScheduler().runTaskLater(
                BedHomes.getPlugin(BedHomes.class),
                () -> BedGUI.open(player),
                20L
        );
    }
}
