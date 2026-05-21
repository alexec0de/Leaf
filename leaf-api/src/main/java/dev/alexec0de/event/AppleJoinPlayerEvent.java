package dev.alexec0de.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AppleJoinPlayerEvent extends Event {
    private final Player player;

    private static final HandlerList handlerList = new HandlerList();

    public AppleJoinPlayerEvent(Player player) {
        this.player = player;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlerList;
    }

    public static @NotNull HandlerList getHandlerList() {
        return handlerList;
    }

    public Player getPlayer() {
        return player;
    }
}
