package command;
// change to class (orientation?) so direction can be changed as an object passed to directionchanger?

public class Orientation {	
	private Direction direction;
	public Orientation() {
		setDirection(Direction.NORTH);
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	
}
	

