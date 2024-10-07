package me.a8kj.pvp.api.event.player;

import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.a8kj.pvp.parent.entity.player.Player;

@RequiredArgsConstructor
@Getter
public class PlayerEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final Player player;

    public void callEvent() {
        Bukkit.getPluginManager().callEvent(this);
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
