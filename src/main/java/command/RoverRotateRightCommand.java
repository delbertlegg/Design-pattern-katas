package command;

class RoverRotateRightCommand implements Command {
	private Rover rover;
	
	public RoverRotateRightCommand(Rover rm) {
		this.rover = rm;
	}
	
	public void execute() {
		rover.rotateRight();
	}
}
