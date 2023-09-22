package com.foxdev.stealmoney;

import com.foxdev.stealmoney.Listener.StealMoneyListener;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.plugin.java.JavaPlugin;

public final class StealMoney extends JavaPlugin {

    private Economy economy;
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new StealMoneyListener(economy), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
