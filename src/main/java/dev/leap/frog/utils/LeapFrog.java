package dev.leap.frog.Utils;

import club.minnced.discord.webhook.WebhookClient;
import club.minnced.discord.webhook.WebhookClientBuilder;
import dev.leap.frog.Fuction.Help;
import dev.leap.frog.Fuction.Mod;
import dev.leap.frog.Impl.ModShutdown;
import dev.leap.frog.Impl.PrefixHelper;
import dev.leap.frog.Listeners.Util;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.AnnotatedEventManager;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.internal.requests.WebSocketClient;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.concurrent.ThreadFactory;

public class LeapFrog {

    protected JDA jda;
    protected JDABuilder builder;
    private WebhookClientBuilder client = new WebhookClientBuilder("https://discord.com/api/webhooks/884317265108008970/tk87hjvzhenvXlj_h1le-ckcIyu90NUvwvsKxxZeh8nY1zhynpaMgu04ty6QFwUWrc0C");

    public LeapFrog() {
        builder = JDABuilder.createDefault("ODQ2MTc1ODg1ODE1MDU0MzU3.YKrstA.klqJqaTP3FGaotOjzbLiNI2zgYY").setEventManager(new AnnotatedEventManager());
        builder.setStatus(OnlineStatus.IDLE);
        builder.addEventListeners(adapters);
        builder.setActivity(Activity.listening(" To prefix !"));

        try {
            jda = builder.build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(jda.isAutoReconnect()) {
            client.build().send("Leapfrog bot just went down!");
        }
    }

    public JDA getJda() {
        return jda;
    }

    public JDABuilder getBuilder() {
        return builder;
    }

    public void stop() {
        client.build().close();
        jda.shutdown();
        System.exit(0);
    }

    private Util[] adapters = {
            new Help(),
            new Mod(),
            new PrefixHelper(),
            new ModShutdown()};

    public static LeapFrog Get = new LeapFrog();
}
