package command;

public class RoverRotateRightCommand implements Command {
	private RoverMover rm;
	
	public RoverRotateRightCommand(RoverMover rm) {
		this.rm = rm;
	}
	
	public void execute() {
		rm.rotateRight();
	}
}
