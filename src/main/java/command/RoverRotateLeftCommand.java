package command;

class RoverRotateLeftCommand implements Command {
    private final Rover rover;

    RoverRotateLeftCommand(Rover rover) {
        this.rover = rover;
    }

    public void execute() {
        rover.rotateLeft();
    }

}
