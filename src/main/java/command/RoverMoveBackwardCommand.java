package command;

class RoverMoveBackwardCommand implements Command {
    private Rover rover;
    public RoverMoveBackwardCommand(Rover rover) {
        this.rover = rover;
    }

    public void execute() {
        rover.moveBackward();
    }
}
