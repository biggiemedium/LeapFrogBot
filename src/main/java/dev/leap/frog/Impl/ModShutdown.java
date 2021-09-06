package dev.leap.frog.Impl;

import dev.leap.frog.Listeners.Util;
import dev.leap.frog.Utils.LeapFrog;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.SubscribeEvent;

import javax.annotation.Nonnull;
import java.awt.*;

public class ModShutdown implements Util {
    @SubscribeEvent
    public void onMessage(@Nonnull MessageReceivedEvent e) {
        if(messageutil.isMessageBot(e)) return;

        if(e.getMessage().getContentRaw().toLowerCase().equalsIgnoreCase("!shutdown") && e.getAuthor().getIdLong() == 621835107354935326L) {
            e.getChannel().sendMessage(builder(e)).queue();
            LeapFrog.Get.stop();
        }
    }

    private MessageEmbed builder(MessageReceivedEvent e) {
        EmbedBuilder x = new EmbedBuilder();

        x.setColor(Color.GREEN);
        x.addField("", "Ok, shutting down", true);

        return x.build();
    }
}
