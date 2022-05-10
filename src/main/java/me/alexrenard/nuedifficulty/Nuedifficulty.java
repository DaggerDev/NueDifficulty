package me.alexrenard.nuedifficulty;

import org.bukkit.plugin.java.JavaPlugin;

public final class Nuedifficulty extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("NueDifficulty Loaded...");
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);

    }

    @Override
    public void onDisable() {
        System.out.println("NueDifficulty Shutting down...");
    }
}
