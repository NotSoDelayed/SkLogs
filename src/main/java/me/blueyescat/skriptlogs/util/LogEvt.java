package me.blueyescat.skriptlogs.util;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.message.Message;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * @author Blueyescat, Equipable
 */
public class LogEvt extends Event {
  
  private static final HandlerList handlers = new HandlerList();
  private final LogEvent logEvent;
  
  public LogEvt(final LogEvent e, final Message msg) {
    logEvent = e;
  }
  
  public static HandlerList getHandlerList() {
    return handlers;
  }
  
  public LogEvent getLogEvent() {
    return logEvent;
  }
  
  @Override
  public @NotNull HandlerList getHandlers() {
    return handlers;
  }
  
  public long getTimeMillis() {
    return System.currentTimeMillis();
  }
}
