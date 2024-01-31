package com.mcstaralliance.wrenchbanner;

import com.bekvon.bukkit.residence.api.ResidenceApi;
import com.bekvon.bukkit.residence.protection.ClaimedResidence;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerInteractEventListener implements Listener {
    @EventHandler
    public void onItemUse(PlayerInteractEvent interactEvent) {
        ItemStack item = interactEvent.getItem();
        if (item == null) return;
        Player player = interactEvent.getPlayer();
        ClaimedResidence residence = ResidenceApi.getResidenceManager().getByLoc(player.getLocation());
        if (residence != null) return;
        if (!"create_wrench".equals(item.getType().getKey().getKey())) return;
        interactEvent.setCancelled(true);
    }
}
