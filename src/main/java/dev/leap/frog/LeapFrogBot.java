package dev.leap.frog;

import dev.leap.frog.Command.CommandManager;
import dev.leap.frog.Event.Processor;
import dev.leap.frog.utils.Configutils;
import me.zero.alpine.fork.bus.EventBus;
import me.zero.alpine.fork.bus.EventManager;
import me.zero.alpine.fork.listener.EventHandler;
import me.zero.alpine.fork.listener.Listener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.hooks.AnnotatedEventManager;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


import javax.security.auth.login.LoginException;

/**
 * @author px
 * @since 2021 - 05 - 23
 */

public class LeapFrogBot {

    public static EventBus EVENT_BUS = new EventManager();

    private static Processor processor;
    private static CommandManager commandManager;
    private static JDA jda;
    private static JDABuilder jdaBuilder = JDABuilder.createDefault(Configutils.leapfrogToken).setAutoReconnect(true).setEventManager(new AnnotatedEventManager());

    public static void main(String[] args) {
        processor = new Processor();
        commandManager = new CommandManager();
        jdaBuilder.addEventListeners(CommandManager.commands);
    }

    public static void stop() {
        assert jda != null;
        jda.shutdown();
    }

    static {
        jdaBuilder.setStatus(OnlineStatus.IDLE);
        try {
            jda = jdaBuilder.build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }

}
