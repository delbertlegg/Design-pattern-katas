package command;

public class RoverRotateRightCommand implements Command {
	private DirectionChanger dirChanger;
	
	public RoverRotateRightCommand(DirectionChanger dc) {
		dirChanger = dc;
	}
	
	@Override
	public void execute() {
		dirChanger.rotateRight();
	}
}
