package command;

public class GridClient {
    private Grid grid;
    private RoverControl roverControl;
    private Rover rover;

    public GridClient(Grid grid, Rover rover) {
        this.grid = grid;
        this.rover = rover;
        this.roverControl = new RoverControl(rover);
    }

    public void moveRover(String s) throws RoverRanIntoObstacleException {
        Point p = rover.getLocation();
        Point oldLocation = new Point(p.getX(), p.getY());
        roverControl.executeCommand(s);
        if (grid.pointIsOccupied(rover.getLocation())) {
        	rover.setLocation(oldLocation.getX(), oldLocation.getY());
        	throw new RoverRanIntoObstacleException();
        }

        correctRoverPosition();
    }

    protected void correctRoverPosition() {
        Point point = rover.getLocation();
        if (outsideGridBounds(point)){
            wrapObjectPositionInGrid(point);
        }
    }

	private void wrapObjectPositionInGrid(Point point) {
		rover.setXPosition((grid.getDimension() + point.getX()) % grid.getDimension());
		rover.setYPosition((grid.getDimension() + point.getY()) % grid.getDimension());
	}

	private boolean outsideGridBounds(Point point) {
		return (point.getX() >= grid.getDimension() || point.getX() < 0) || (point.getY() >= grid.getDimension() || point.getY() < 0);
	}
}
