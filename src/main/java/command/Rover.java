package command;

public class Rover {
	private static Rover rover;
	private Direction currentDirection;
	private Point location;
	private Rover() {}
	
	public static Rover getInstance() {
		if (rover == null) {
			rover = new Rover();
		}
		return rover;
	}

	public void setDirection(Direction direction) {
		currentDirection = direction;
	}
	
	public Direction getDirection() {
		return currentDirection;
	}

	public void setStartingPoint(int x, int y) {
		if (location == null) {
			location = new Point(0, 0);
		}
		location.setX(x);
		location.setY(y);
	}
	
	public Point getLocation() {
		return location;
	}

	public void rotateRight() {
		currentDirection = currentDirection.next();
	}

	public void rotateLeft() {
		currentDirection = currentDirection.previous();
	}

	public void goForward() {
		switch(currentDirection) {
		case NORTH:
			location.moveNorth();
		}
	}
}
