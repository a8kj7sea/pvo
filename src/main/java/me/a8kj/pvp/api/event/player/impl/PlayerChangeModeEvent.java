package me.a8kj.pvp.api.event.player.impl;

import lombok.Getter;
import me.a8kj.pvp.api.event.player.PlayerEvent;
import me.a8kj.pvp.parent.entity.player.Player;
import me.a8kj.pvp.parent.entity.player.enums.PlayerMode;

@Getter
public class PlayerChangeModeEvent extends PlayerEvent {

    private final PlayerMode newPlayerMode;

    public PlayerChangeModeEvent(Player player, PlayerMode newPlayerMode) {
        super(player);
        this.newPlayerMode = newPlayerMode;
    }

}
