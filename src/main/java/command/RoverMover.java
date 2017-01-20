package command;

public class RoverMover {
	private static RoverMover roverMover;
	private Rover rover;
	private RoverMover(Rover rover) {
		this.rover = rover;
	}
	
	public static RoverMover getRoverMoverForRover(Rover rover) {
		if (roverMover == null) {
			roverMover = new RoverMover(rover);
		}
		else roverMover.setRover(rover);
		return roverMover;		
	}

	private void setRover(Rover rover) {
		this.rover = rover;
	}
	
	public void moveForward() {
		switch(rover.getDirection()) {
		case NORTH:
			rover.pointMover.moveNorth();
			break;
		case SOUTH:
			rover.pointMover.moveSouth();
			break;
		case EAST:
			rover.pointMover.moveEast();
			break;
		case WEST:
			rover.pointMover.moveWest();
			break;
		}
	}
	
	public void moveBackward() {
		switch(rover.getDirection()) {
		case NORTH:
			rover.pointMover.moveSouth();
			break;
		case SOUTH:
			rover.pointMover.moveNorth();
			break;
		case EAST:
			rover.pointMover.moveWest();
			break;
		case WEST:
			rover.pointMover.moveEast();
			break;
		}
	}
	
	public void rotateRight() {
		rover.dirChanger.rotateRight();
	}
	
	public void rotateLeft() {
		rover.dirChanger.rotateLeft();
	}
	
	

}
