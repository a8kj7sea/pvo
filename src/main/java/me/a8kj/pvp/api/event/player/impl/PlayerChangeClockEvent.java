package me.a8kj.pvp.api.event.player.impl;

import lombok.Getter;
import me.a8kj.pvp.api.event.player.PlayerEvent;
import me.a8kj.pvp.parent.entity.player.Player;
import me.a8kj.pvp.parent.entity.player.enums.PlayerClock;

@Getter
public class PlayerChangeClockEvent extends PlayerEvent {

    private final PlayerClock playerClock;

    public PlayerChangeClockEvent(Player player, PlayerClock playerClock) {
        super(player);
        this.playerClock = playerClock;
    }

}
