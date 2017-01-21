package command;

public class RoverRotateLeftCommand implements Command {
	private RoverMover rm;
	public RoverRotateLeftCommand(RoverMover rm) {
		this.rm = rm;
	}
	
	public void execute() {
		rm.rotateLeft();
	}

}
