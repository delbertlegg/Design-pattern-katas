package command;

public class RoverRotateLeftCommand implements Command {
	private DirectionChanger dirChanger;
	public RoverRotateLeftCommand(DirectionChanger dir) {
		dirChanger = dir;
	}
	
	@Override
	public void execute() {
		dirChanger.rotateLeft();
	}

}
