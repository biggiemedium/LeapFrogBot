package dev.leap.frog.Event;

import dev.leap.frog.LeapFrogBot;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.SubscribeEvent;

public class Processor {

    @SubscribeEvent
    public void onMessageRecived(MessageReceivedEvent event) {
        LeapFrogBot.EVENT_BUS.post(event);
    }

}
