package me.nico.bedhomes;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class DataManager {

    private static File file;
    private static YamlConfiguration data;

    public static void setup() {

        file = new File(BedHomes.getPlugin(BedHomes.class).getDataFolder(), "beds.yml");

        if (!file.exists()) {
            file.getParentFile().mkdirs();

            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        data = YamlConfiguration.loadConfiguration(file);
    }

    public static YamlConfiguration getData() {
        return data;
    }

    public static void save() {

        try {
            data.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
