package dev.leap.frog.Command;

import dev.leap.frog.Command.impl.Test;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {

    public static List<Command> commands = new ArrayList<>();

    public CommandManager() {
        Add(new Test());
    }

    private void Add(Command command) {
        commands.add(command);
    }

    public Command getCommandByName(String name) {
        for(Command c : commands) {
            if(c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    public Command getCommandByClass(Class clazz) {
        for(Command c : commands) {
            if(c.getClass() == clazz) {
                return c;
            }
        }
        return null;
    }

}
