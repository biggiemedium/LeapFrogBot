package dev.leap.frog.Fuction;

import dev.leap.frog.Listeners.Util;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.SubscribeEvent;

import javax.annotation.Nonnull;

public class Mod implements Util {
    @SubscribeEvent
    public void onMessage(@Nonnull MessageReceivedEvent e) {
        if (messageutil.isMessageBot(e)) return;
        if(e.getMessage().getContentRaw().toLowerCase().startsWith("!mod")) {
            e.getChannel().sendMessage("Nope").queue();
        }
    }
}
