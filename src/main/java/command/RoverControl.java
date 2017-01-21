package command;

import java.util.LinkedHashMap;
import java.util.Map;

public class RoverControl {
    Map<String, Command> commands;
    public RoverControl() {
        commands = new LinkedHashMap<>();
    }

    public void executeCommand(String s) {
        commands.get(s).execute();
    }

    public void setControls(RoverMover roverMover) {
        commands.put("l", new RoverRotateLeftCommand(roverMover));
        commands.put("r", new RoverRotateRightCommand(roverMover));
        commands.put("f", new RoverMoveForwardCommand(roverMover));
        commands.put("b", new RoverMoveBackwardCommand(roverMover));
    }
}
