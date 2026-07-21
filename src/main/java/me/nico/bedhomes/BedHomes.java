package me.nico.bedhomes;

import org.bukkit.plugin.java.JavaPlugin;

public class BedHomes extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("BedHomes has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("BedHomes has been disabled!");
    }
}
