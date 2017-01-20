package command;

public class Rover {
	private static Rover rover;
	private Orientation direction = new Orientation();
	protected DirectionChanger dirChanger = new DirectionChanger(direction); // move outside of class and pass this.direction as constructor parameter?
	private Point location = new Point(0, 0);
	protected PointMover pointMover = new PointMover(location); // move outside of class and pass this.location as constructor parameter?
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
		return direction.getDirection();
	}

	public void setLocation(int x, int y) {
		location.setX(x);
		location.setY(y);		
	}
	
	public Point getLocation() {
		return location;
	}	
}
