package dev.leap.frog.Fuction

import dev.leap.frog.Listeners.Util
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.SubscribeEvent

class Help : Util {
    @SubscribeEvent
    fun onMessage(e: MessageReceivedEvent) {
        if (e.message.contentRaw.startsWith("!help")) {
            val mentioned = e.message.mentionedMembers
        }
    }
}