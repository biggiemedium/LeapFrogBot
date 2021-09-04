package dev.leap.frog.Impl

import dev.leap.frog.Utils.LeapFrog
import net.dv8tion.jda.api.OnlineStatus
import net.dv8tion.jda.api.entities.Activity
import net.dv8tion.jda.api.entities.Member

class ActivityUpdater : LeapFrog() {

    val pxID: Long = 621835107354935326L
    val boncordeID: Long = 418480805115854849L
    val members: ArrayList<Member> = ArrayList()

    fun update() {

        Thread(Runnable {
            while (!Thread.currentThread().isInterrupted) {

                for(m in members) {
                    if(m.idLong == pxID || m.idLong == boncordeID && m.getOnlineStatus() != OnlineStatus.OFFLINE) {
                        builder.setActivity(Activity.playing(" Ask a dev for help!"))
                    } else {
                        builder.setActivity(Activity.listening(" To prefix !"))
                    }
                }
                Thread.sleep(200)
            }
        }, "Presence_Updater")

    }
}