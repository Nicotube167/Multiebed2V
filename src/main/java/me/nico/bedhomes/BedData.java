package me.nico.bedhomes;

import org.bukkit.Location;

public class BedData {

    private final String name;
    private final Location location;

    public BedData(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }
}
