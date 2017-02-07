package command;

class RoverMoveBackwardCommand implements Command {
    private final Rover rover;

    RoverMoveBackwardCommand(Rover rover) {
        this.rover = rover;
    }

    public void execute() {
        rover.moveBackward();
    }
}
