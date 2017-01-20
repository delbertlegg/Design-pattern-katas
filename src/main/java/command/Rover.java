package command;

public class Rover {
	private static Rover rover;
	protected DirectionChanger dirChanger = new DirectionChanger(Direction.NORTH);
	private Point location = new Point(0, 0);
	protected PointMover pointMover = new PointMover(location);
	private Rover() {}
	
	public static Rover getInstance() {
		if (rover == null) {
			rover = new Rover();
		}
		return rover;
	}

	public void setDirection(Direction direction) {
		dirChanger.setDirection(direction);		
	}
	
	public Direction getDirection() {
		return dirChanger.getDirection();
	}

	public void setLocation(int x, int y) {
		location.setX(x);
		location.setY(y);		
	}
	
	public Point getLocation() {
		return location;
	}	
}
