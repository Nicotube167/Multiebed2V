package me.nico.bedhomes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BedGUI {

    public static void open(Player player) {

        Inventory inv = Bukkit.createInventory(
                null,
                27,
                "Your Beds"
        );

        for (BedData bed : BedManager.getBeds(player.getUniqueId())) {

            ItemStack item = new ItemStack(Material.RED_BED);

            ItemMeta meta = item.getItemMeta();

            meta.setDisplayName("§a" + bed.getName());

            item.setItemMeta(meta);

            inv.addItem(item);
        }

        player.openInventory(inv);
    }
}
