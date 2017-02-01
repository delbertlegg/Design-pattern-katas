package command;
// change to class (orientation?) so direction can be changed as an object passed to directionchanger?

class Orientation {	
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

	public void rotateRight() {
		setDirection(direction.next());
	}

	public void rotateLeft() {
		setDirection(direction.previous());
	}

	public String toString() {
		return direction.toString();
	}
}
	

