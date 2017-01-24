package command;

public class Rover extends GridObject {
	protected Orientation direction = new Orientation();
	private Rover() {}

	public void setLocation(int x, int y) {
		location.setX(x);
		location.setY(y);
	}

    public Point getLocation() {
        return location;
    }
	
	public static Rover getInstance() {
		return new Rover();
	}

	public void setDirection(Direction direction) {
		this.direction.setDirection(direction);
	}

	public Direction getDirection() {
		return direction.getDirection();
	}

	public Orientation getOrientation() {
		return direction;
	}


}
