package command;

public class RoverMoveBackwardCommand implements Command {
    private RoverMover rm;
    public RoverMoveBackwardCommand(RoverMover rm) {
        this.rm = rm;
    }

    public void execute() {
        rm.moveBackward();
    }
}
