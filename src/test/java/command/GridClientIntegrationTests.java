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
    public void correctRoverYPosition() {
        rover.setLocation(0, 22);
        gridClient.moveRover("f");
        assertEquals(3, rover.getLocation().getY());
    }

    @Test
    public void correctRoverXPosition() {
        rover.setLocation(-2, 0);
        rover.rotateRight();
        gridClient.moveRover("f");
        assertEquals(19, rover.getLocation().getX());
    }
}
