package me.a8kj.pvp.api.event.player.impl;

import lombok.Getter;
import me.a8kj.pvp.api.event.player.PlayerEvent;
import me.a8kj.pvp.parent.entity.player.Player;

@Getter
public class PlayerKillStreakEvent extends PlayerEvent {

    private final int streaks;

    public PlayerKillStreakEvent(Player player, int streaks) {
        super(player);
        this.streaks = streaks;
    }

}
