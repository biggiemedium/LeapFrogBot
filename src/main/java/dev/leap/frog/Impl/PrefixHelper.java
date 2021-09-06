package dev.leap.frog.Impl;

import dev.leap.frog.Listeners.Util;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.SubscribeEvent;

import java.awt.*;

public class PrefixHelper implements Util {

    @SubscribeEvent
    public void onMessage(MessageReceivedEvent e) {
        if(messageutil.isMessageBot(e)) return;
        if(e.getMessage().getContentRaw().toLowerCase().contains("what") && e.getMessage().getContentRaw().toLowerCase().contains("prefix")) {
            e.getChannel().sendMessage(builder(e)).queue();
        }
        if(e.getMessage().getContentRaw().equalsIgnoreCase("help") && e.getAuthor().getIdLong() == 621835107354935326L) {
            e.getChannel().sendMessage("px sent this").queue();
        }
    }

    private MessageEmbed builder(MessageReceivedEvent e) {
        EmbedBuilder builder = new EmbedBuilder();

        builder.setColor(Color.GREEN);
        builder.setTitle("Prefix");
        builder.addField("Prefix: ", "The default prefix for Leapfrog is " + "'.'", true);

        return builder.build();
    }

}
