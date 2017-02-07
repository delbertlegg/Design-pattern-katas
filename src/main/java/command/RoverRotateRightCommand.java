package command;

class RoverRotateRightCommand implements Command {
    private final Rover rover;

    RoverRotateRightCommand(Rover rm) {
        this.rover = rm;
    }

    public void execute() {
        rover.rotateRight();
    }
}
