package command;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class GridClient {
    private final Grid grid;
    private final RoverControl roverControl;
    private final Rover rover;

    GridClient(Grid grid, Rover rover) {
        this.grid = grid;
        this.rover = rover;
        this.roverControl = new RoverControl(rover);
    }

    void moveRover(String s) throws RoverRanIntoObstacleException {
        Point p = rover.getLocation();
        Point oldLocation = new Point(p.getX(), p.getY());
        roverControl.executeCommand(s);
        correctRoverPosition(oldLocation);
    }

    private void correctRoverPosition(Point oldLocation) throws
            RoverRanIntoObstacleException {
        Point p = rover.getLocation();
        if (outsideGridBounds(p)) {
            Point newPoint = wrapRoverPositionInGrid();
            rover.setLocation(newPoint.getX(), newPoint.getY());
            handlePointOccupancy(oldLocation);
        }
    }

    private void handlePointOccupancy(Point oldLocation) throws
            RoverRanIntoObstacleException {
        if (grid.pointIsOccupied(rover.getLocation())) {
            endRoverMovement(oldLocation);
        }
    }

    private void endRoverMovement(Point oldLocation) throws RoverRanIntoObstacleException {
        System.out.print(rover.getLocation().toString() + " is occupied\n");
        rover.setLocation(oldLocation.getX(), oldLocation.getY());
        throw new RoverRanIntoObstacleException(rover.toString());
    }


    private Point wrapRoverPositionInGrid() {
        Point point = rover.getLocation();
        int x = (grid.getDimension() + point.getX()) % grid.getDimension();
        int y = (grid.getDimension() + point.getY()) % grid.getDimension();
        return new Point(x, y);
    }

    private boolean outsideGridBounds(Point point) {
        Predicate<Integer> outsideBounds = p -> p >= grid.getDimension() && p < 0;
        List<Integer> points = Arrays.asList(point.getX(), point.getY());
        return points.stream()
                .noneMatch(outsideBounds);

    }
}
