package dev.leap.frog.Fuction

import dev.leap.frog.Listeners.Util
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.SubscribeEvent
import javax.annotation.Nonnull

class Mod : Util {
    @SubscribeEvent
    fun onMessage(@Nonnull e: MessageReceivedEvent) {
        if (Util.messageutil.isMessageBot(e)) return
        if (e.message.contentRaw.toLowerCase().startsWith("!mod")) {
            e.channel.sendMessage("Nope").queue()
        }
    }
}