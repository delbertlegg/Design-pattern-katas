package command;

// TODO: Test with mocks?

import java.util.HashMap;
import java.util.Map;

public class RoverControl {
    private Map<String, Command> commands;
    public RoverControl(RoverMover rm) {
        commands = new HashMap<>();
        setControls(rm);
    }

    public void executeCommand(String s) {
        if (commands.get(s) != null){
            commands.get(s).execute();
        }
        else throw new IllegalArgumentException(s + " is not a valid command.");
    }

    public void setControls(RoverMover roverMover) {
        commands.put("l", new RoverRotateLeftCommand(roverMover));
        commands.put("r", new RoverRotateRightCommand(roverMover));
        commands.put("f", new RoverMoveForwardCommand(roverMover));
        commands.put("b", new RoverMoveBackwardCommand(roverMover));
    }
}
