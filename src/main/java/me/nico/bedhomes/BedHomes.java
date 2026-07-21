package me.nico.bedhomes;

import org.bukkit.plugin.java.JavaPlugin;

public class BedHomes extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(
                new SleepListener(),
                this
        );

        getServer().getPluginManager().registerEvents(
                new NameListener(),
                this
        );

        getLogger().info("BedHomes enabled!");
    }
}
getServer().getPluginManager().registerEvents(
        new DeathListener(),
        this
);
getServer().getPluginManager().registerEvents(
        new GUIListener(),
        this
);
