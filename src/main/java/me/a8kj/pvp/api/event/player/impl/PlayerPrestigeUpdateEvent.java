package me.a8kj.pvp.api.event.player.impl;

import lombok.Getter;
import me.a8kj.pvp.api.event.player.PlayerEvent;
import me.a8kj.pvp.parent.entity.player.Player;
import me.a8kj.pvp.parent.entity.prestige.Prestige;

@Getter
public class PlayerPrestigeUpdateEvent extends PlayerEvent {

    private final Prestige oldPrestige, newPrestige;

    public PlayerPrestigeUpdateEvent(Player player, Prestige oldPrestige, Prestige newPrestige) {
        super(player);
        this.newPrestige = newPrestige;
        this.oldPrestige = oldPrestige;
    }

}
