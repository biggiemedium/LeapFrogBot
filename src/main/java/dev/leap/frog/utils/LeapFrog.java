package dev.leap.frog.Utils;

import dev.leap.frog.Fuction.Help;
import dev.leap.frog.Fuction.Mod;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.hooks.AnnotatedEventManager;

public class LeapFrog {

    protected JDA jda;
    protected JDABuilder builder;

    public LeapFrog() {

        this.builder = JDABuilder.createDefault("").setEventManager(new AnnotatedEventManager());
        this.builder.setStatus(OnlineStatus.IDLE);
        this.builder.addEventListeners(new Help(), new Mod());
        this.builder.setActivity(Activity.listening(" To prefix !"));

        try {
            jda = builder.build();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
