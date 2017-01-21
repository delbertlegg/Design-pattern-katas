package command;

import java.util.InputMismatchException;

public class Rover {
	private static Rover rover;
	private Orientation direction = new Orientation();
	private Point location = new Point(0, 0);
	private Rover() {}
	
	public static Rover getInstance() {
		if (rover == null) {
			rover = new Rover();
		}
		return rover;
	}

	public void setDirection(Direction direction) {
		this.direction.setDirection(direction);
	}
	
	public Direction getDirection() {
		return direction.getDirection();
	}

	public void setLocation(int x, int y) {
		location.setX(x);
		location.setY(y);
	}

	public  Orientation getOrientation() {
		return direction;
	}
	
	public  Point getPoint() {
		return location;
	}
}
