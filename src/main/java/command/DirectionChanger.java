package command;

public class DirectionChanger {
	Orientation direction;
	public DirectionChanger(Orientation dir) {
		this.direction = dir;
	}
	
	public void setDirection(Direction dir) {
		direction.setDirection(dir);
	}
	
	public void rotateRight() {
		direction.setDirection(direction.getDirection().next());
	}

	public void rotateLeft() {
		direction.setDirection(direction.getDirection().previous());
	}

}
