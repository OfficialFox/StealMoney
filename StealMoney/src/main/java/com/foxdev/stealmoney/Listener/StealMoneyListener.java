package com.foxdev.stealmoney.Listener;

// StealMoney.java

import net.milkbowl.vault.economy.Economy;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class StealMoneyListener implements Listener {

  private Economy economy;

  public StealMoneyListener(Economy economy) {
    this.economy = economy;
  }

  @EventHandler
  public void onSheepPunch(EntityDamageByEntityEvent event) {
    if(!(event.getDamager() instanceof Player)) return;

    if(!(event.getEntity() instanceof Sheep)) return;

    Player player = (Player) event.getDamager();
    Sheep sheep = (Sheep) event.getEntity();

    // Reduce player's money
    economy.withdrawPlayer(player, 10);
  }

}
