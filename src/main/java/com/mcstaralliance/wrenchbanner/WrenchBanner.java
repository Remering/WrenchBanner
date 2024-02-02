package com.mcstaralliance.wrenchbanner;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WrenchBanner extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PlayerInteractListener(), this);
    }

}
