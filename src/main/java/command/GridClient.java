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

    public void moveRover(String s) {
        roverControl.executeCommand(s);
        correctRoverPosition();
    }

    protected void correctRoverPosition() {
        Point point = rover.getLocation();
        if (point.getX() >= grid.getDimension() || point.getX() < 0){
            rover.getLocation().setX((grid.getDimension() + point.getX()) % grid.getDimension());
        }
        if (point.getY() >= grid.getDimension() || point.getY() < 0) {
            rover.getLocation().setY((grid.getDimension() + point.getY()) % grid.getDimension());
        }
    }
}
