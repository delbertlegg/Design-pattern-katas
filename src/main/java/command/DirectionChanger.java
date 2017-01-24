package command;

public class DirectionChanger {
	private Orientation direction;
	private DirectionChanger(Orientation dir) {
		this.direction = dir;
	}

	public static DirectionChanger getDirectionChanger(Orientation dir) {
		return new DirectionChanger(dir);
	}
	
	public void rotateRight() {
		direction.setDirection(direction.getDirection().next());
	}

	public void rotateLeft() {
		direction.setDirection(direction.getDirection().previous());
	}

}
