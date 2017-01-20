package command;

public class DirectionChanger {
	Direction direction;
	public DirectionChanger(Direction dir) {
		this.direction = dir;
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public void setDirection(Direction dir) {
		direction = dir;
	}
	
	public void rotateRight() {
		direction = direction.next();
	}

	public void rotateLeft() {
		direction = direction.previous();
	}

}
