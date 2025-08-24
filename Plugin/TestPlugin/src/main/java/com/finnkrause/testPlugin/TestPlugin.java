package com.finnkrause.testPlugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("[TestPlugin] Plugin has been enabled!");

        getCommand("healup").setExecutor(new HealUpCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
