package command;

import static command.Direction.*;
class Rover extends GridObject {
	private Orientation direction = new Orientation();
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
                location.moveNorth();
                break;
            case SOUTH:
                location.moveSouth();
                break;
            case EAST:
                location.moveEast();
                break;
            case WEST:
                location.moveWest();
                break;
        }
    }

    public void moveBackward() {
        switch(getDirection()) {
            case NORTH:
                location.moveSouth();
                break;
            case SOUTH:
                location.moveNorth();
                break;
            case EAST:
                location.moveWest();
                break;
            case WEST:
                location.moveEast();
                break;
        }
    }

    public void rotateRight() {
        direction.rotateRight();
    }

    public void rotateLeft() {
        direction.rotateLeft();
    }


}
