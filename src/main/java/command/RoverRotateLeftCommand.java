package command;

public class RoverRotateLeftCommand implements Command {
	private Rover rover;
	public RoverRotateLeftCommand(Rover rover) {
		this.rover = rover;
	}
	
	public void execute() {
		rover.rotateLeft();
	}

}
