package dev.leap.frog.utils;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;

import java.awt.*;

public class Configutils {

    public static final long devRole = 840921644616777758L;
    public static final long betaTesterRole = 840921814657138709L;
    public static final long regularMemberRole = 846173266129190932L;

    public static final long pxID = 621835107354935326L;
    public static final long boncordeID = 418480805115854849L;

    public static final long memberJoinServerChannel = 840921074669846588L;

    public static final String leapfrogToken = "";

    public static int getLeapfrogEmbedColor() {
        return new Color(74, 216, 63).getRGB();
    }

    public static final String messageMemberJoin = "Rules: \n" + "1. We are not a 'cheat client' of any kind, we are a utility mod \n" + "2. respect the TOS of discord";

    enum mode {
        ONLINE,
        IDLE
    }

    public MessageEmbed leapEmbed(String title, String desc) {
        EmbedBuilder embed = new EmbedBuilder();

        embed.setFooter("Leapfrog dev team");
        embed.addField(title, desc, true);
        embed.setColor(getLeapfrogEmbedColor());

        return embed.build();
    }

}
