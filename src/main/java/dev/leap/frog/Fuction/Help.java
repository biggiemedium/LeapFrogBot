package dev.leap.frog.Fuction;

import dev.leap.frog.Listeners.Util;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.SubscribeEvent;

public class Help implements Util {

    @SubscribeEvent
    public void onMessage(MessageReceivedEvent e) {
        if(e.getMessage().getContentRaw().startsWith("!help")) {

        }
    }
}

