package command;

public class RoverMover {
	private static RoverMover roverMover;
	private Rover rover;
	private RoverMover(Rover rover) {
		this.rover = rover;
	}
	
	public static RoverMover getRoverMover(Rover rover) {
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
		PointMover pm = new PointMover(rover.getLocation());
		switch(rover.getDirection()) {
		case NORTH:
			pm.moveNorth();
			break;
		case SOUTH:
			pm.moveSouth();
			break;
		case EAST:
			pm.moveEast();
			break;
		case WEST:
			pm.moveWest();
			break;
		}
	}
	
	public void moveBackward() {
		PointMover pm = new PointMover(rover.getLocation());
		switch(rover.getDirection()) {
		case NORTH:
			pm.moveSouth();
			break;
		case SOUTH:
			pm.moveNorth();
			break;
		case EAST:
			pm.moveWest();
			break;
		case WEST:
			pm.moveEast();
			break;
		}
	}
	
	public void rotateRight() {
		DirectionChanger dc = DirectionChanger.getDirectionChanger(rover.getOrientation());
		dc.rotateRight();
	}
	
	public void rotateLeft() {
		DirectionChanger dc = DirectionChanger.getDirectionChanger(rover.getOrientation());
		dc.rotateLeft();
	}
}
