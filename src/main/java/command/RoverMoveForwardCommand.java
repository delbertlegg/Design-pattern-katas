package command;

class RoverMoveForwardCommand implements Command {
    private final Rover rover;

    RoverMoveForwardCommand(Rover rover) {
        this.rover = rover;
    }

    public void execute() {
        rover.moveForward();
    }
}
