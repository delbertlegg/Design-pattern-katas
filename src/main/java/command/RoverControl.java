package command;

import java.util.HashMap;
import java.util.Map;

class RoverControl {
    private final Map<String, Command> commands;

    RoverControl(Rover rover) {
        commands = new HashMap<>();
        setControls(rover);
    }

    void executeCommand(String s) {
        if (commands.get(s) != null) {
            commands.get(s).execute();
        } else throw new IllegalArgumentException(s + " is not a valid command.");
    }

    private void setControls(Rover rover) {
        commands.put("l", new RoverRotateLeftCommand(rover));
        commands.put("r", new RoverRotateRightCommand(rover));
        commands.put("f", new RoverMoveForwardCommand(rover));
        commands.put("b", new RoverMoveBackwardCommand(rover));
    }
}
