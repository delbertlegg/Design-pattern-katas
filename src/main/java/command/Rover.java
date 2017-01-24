package command;

import static command.Direction.*;
public class Rover extends GridObject {
	protected Orientation direction = new Orientation();
	private Rover() {}
	
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

    public void moveForward() {
        switch(getDirection()) {
            case NORTH:
                getLocation().moveNorth();
                break;
            case SOUTH:
                getLocation().moveSouth();
                break;
            case EAST:
                getLocation().moveEast();
                break;
            case WEST:
                getLocation().moveWest();
                break;
        }
    }

    public void moveBackward() {
        switch(getDirection()) {
            case NORTH:
                getLocation().moveSouth();
                break;
            case SOUTH:
                getLocation().moveNorth();
                break;
            case EAST:
                getLocation().moveWest();
                break;
            case WEST:
                getLocation().moveEast();
                break;
        }
    }

    public void rotateRight() {
        getOrientation().rotateRight();
    }

    public void rotateLeft() {
        getOrientation().rotateLeft();
    }


}
