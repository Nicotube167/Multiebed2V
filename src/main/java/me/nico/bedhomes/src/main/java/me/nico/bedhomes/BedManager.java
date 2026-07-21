package me.nico.bedhomes;

import java.util.*;

public class BedManager {

    public static HashMap<UUID, ArrayList<BedData>> beds = new HashMap<>();

    public static void addBed(UUID uuid, BedData bed) {

        beds.putIfAbsent(uuid, new ArrayList<>());

        beds.get(uuid).add(bed);
    }

    public static ArrayList<BedData> getBeds(UUID uuid) {

        return beds.getOrDefault(uuid, new ArrayList<>());
    }
}
