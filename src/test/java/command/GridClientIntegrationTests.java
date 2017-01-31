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
    public void moveRoverInGridClient() {
        gridClient.moveRover("f");
        assertEquals(1, rover.getLocation().getY());
    }

    @Test
    public void correctRoverXPositionGreaterThanDimension() {
        rover.setLocation(22, 0);
        rover.rotateRight();
        gridClient.moveRover("f");
        assertEquals(3, rover.getLocation().getX());
    }

    @Test
    public void correctRoverYPositionGreaterThanDimension() {
        rover.setLocation(0, 22);
        gridClient.moveRover("f");
        assertEquals(3, rover.getLocation().getY());
    }

    @Test
    public void correctRoverXPositionLessThanDimension() {
        rover.setLocation(-2, 0);
        rover.rotateRight();
        gridClient.moveRover("f");
        assertEquals(19, rover.getLocation().getX());
    }

    @Test
    public void correctRoverYPositionLessThanDimension() {
        rover.setLocation(0, -2);
        gridClient.moveRover("f");
        assertEquals(19, rover.getLocation().getY());
    }

    @Test
    public void doNotCorrectRoverXPositionWithinDimension() {
        rover.setLocation(1, 0);
        rover.rotateRight();
        gridClient.moveRover("f");
        assertEquals(2, rover.getLocation().getX());
    }

    @Test
    public void doNotCorrectRoverYPositionWithinDimension() {
        rover.setLocation(0, 1);
        gridClient.moveRover("f");
        assertEquals(2, rover.getLocation().getY());
    }
}
