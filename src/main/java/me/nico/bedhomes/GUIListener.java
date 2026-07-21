package me.nico.bedhomes;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.entity.Player;

public class GUIListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {

        if (!event.getView().getTitle().equals("Your Beds")) {
            return;
        }

        event.setCancelled(true);

        if (event.getCurrentItem() == null) {
            return;
        }

        Player player = (Player) event.getWhoClicked();

        String bedName = event.getCurrentItem()
                .getItemMeta()
                .getDisplayName()
                .replace("§a", "");

        for (BedData bed : BedManager.getBeds(player.getUniqueId())) {

            if (bed.getName().equals(bedName)) {

                player.teleport(bed.getLocation());
                player.closeInventory();

                player.sendMessage(
                        "§aTeleported to " + bedName
                );

                break;
            }
        }
    }
}
