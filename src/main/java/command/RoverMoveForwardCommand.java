package command;

public class RoverMoveForwardCommand implements Command {
    private RoverMover rm;
    public RoverMoveForwardCommand(RoverMover rm) {
        this.rm = rm;
    }

    public void execute() {
        rm.moveForward();
    }
}
