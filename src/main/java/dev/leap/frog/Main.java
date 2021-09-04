package dev.leap.frog;

import dev.leap.frog.Impl.ActivityUpdater;
import dev.leap.frog.Utils.LeapFrog;

public class Main {
    private static ActivityUpdater updater = new ActivityUpdater();
    public static void main(String[] args) {
        new LeapFrog();
        updater.update();
    }
}
