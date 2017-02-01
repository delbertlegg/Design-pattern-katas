package command;

class RoverMoveForwardCommand implements Command {
    private Rover rover;
    public RoverMoveForwardCommand(Rover rover) {
        this.rover = rover;
    }

    public void execute() {
        rover.moveForward();
    }
}
