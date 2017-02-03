package command;

import org.junit.*;
import static org.junit.Assert.*;

public class GridClientIntegrationTests {
    Rover rover;
    Grid grid;
    GridClient gridClient;

    @Before
    public void setUp() {
        rover = Rover.getInstance();
        grid = new Grid(20, 10);
        gridClient = new GridClient(grid, rover);
    }

    @Test
    public void moveRoverInGridClient() throws RoverRanIntoObstacleException {
        gridClient.moveRover("f");
        assertEquals(1, rover.getLocation().getY());
    }

    @Test
    public void correctRoverXPositionGreaterThanDimension() throws RoverRanIntoObstacleException {
        rover.setLocation(22, 0);
        rover.rotateRight();
        gridClient.moveRover("f");
        assertEquals(3, rover.getLocation().getX());
    }

    @Test
    public void correctRoverYPositionGreaterThanDimension() throws RoverRanIntoObstacleException {
        rover.setLocation(0, 22);
        gridClient.moveRover("f");
        assertEquals(3, rover.getLocation().getY());
    }

    @Test
    public void correctRoverXPositionLessThanDimension() throws RoverRanIntoObstacleException {
        rover.setLocation(-2, 0);
        rover.rotateRight();
        gridClient.moveRover("f");
        assertEquals(19, rover.getLocation().getX());
    }

    @Test
    public void correctRoverYPositionLessThanDimension() throws RoverRanIntoObstacleException {
        rover.setLocation(0, -2);
        gridClient.moveRover("f");
        assertEquals(19, rover.getLocation().getY());
    }

    @Test
    public void doNotCorrectRoverXPositionWithinDimension() throws RoverRanIntoObstacleException {
        rover.setLocation(1, 0);
        rover.rotateRight();
        gridClient.moveRover("f");
        assertEquals(2, rover.getLocation().getX());
    }

    @Test
    public void doNotCorrectRoverYPositionWithinDimension() throws RoverRanIntoObstacleException {
        rover.setLocation(0, 1);
        gridClient.moveRover("f");
        assertEquals(2, rover.getLocation().getY());
    }
}
