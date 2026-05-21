package dev.alexec0de.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerQuitEvent;
import org.jetbrains.annotations.NotNull;

public class AppleLeavePlayerEvent extends Event {
    private final Player player;
    private final PlayerQuitEvent.QuitReason reason;

    private static final HandlerList handlerList = new HandlerList();


    public AppleLeavePlayerEvent(Player player, PlayerQuitEvent.QuitReason reason) {
        this.player = player;
        this.reason = reason;
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

    public PlayerQuitEvent.QuitReason getReason() {
        return reason;
    }
}
