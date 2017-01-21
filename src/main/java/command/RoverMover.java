package command;

public class RoverMover {
	private static RoverMover roverMover;
	private Rover rover;
	private PointMover pm;
	private DirectionChanger dc;
	private RoverMover(Rover rover) {
		this.rover = rover;
	}
	
	public static RoverMover getRoverMover(Rover rover) {
		if (roverMover == null) {
			roverMover = new RoverMover(rover);
		}
		else roverMover.setRover(rover);
		roverMover.setPointMover(rover);
		roverMover.setDirectionChanger(rover);

		return roverMover;		
	}

	private void setPointMover(Rover rover) {
		roverMover.pm = new PointMover(rover.getPoint());
	}

	private void setDirectionChanger(Rover rover) {
		roverMover.dc = new DirectionChanger(rover.getOrientation());
	}

	private void setRover(Rover rover) {
		this.rover = rover;
	}
	
	public void moveForward() {
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
		dc.rotateRight();
	}
	
	public void rotateLeft() {
		dc.rotateLeft();
	}
}
