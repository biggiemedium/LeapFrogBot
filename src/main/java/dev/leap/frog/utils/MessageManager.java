package dev.leap.frog.Utils;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class MessageManager {



    public boolean isMessageBot(MessageReceivedEvent e) {
        return e.getMessage().isWebhookMessage() || e.getAuthor().isBot();
    }

    public static MessageManager Get = new MessageManager();
}
