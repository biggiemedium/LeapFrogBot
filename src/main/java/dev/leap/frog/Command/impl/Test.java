package dev.leap.frog.Command.impl;

import dev.leap.frog.Command.Command;
import me.zero.alpine.fork.listener.EventHandler;
import me.zero.alpine.fork.listener.Listener;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Test extends Command {

    public Test() {
        super("Test");
    }

    @EventHandler
    private Listener<MessageReceivedEvent> receivedEventListener = new Listener<>(e -> {

        if(e.getMessage().getContentRaw().equalsIgnoreCase("!test")) {
            e.getChannel().sendMessage("ok").queue();
        }

    });

}
