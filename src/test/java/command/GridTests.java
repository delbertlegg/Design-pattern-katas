package command;

import org.junit.*;

import java.util.Random;

import static org.junit.Assert.*;

public class GridTests {
    private static Grid grid;
    @BeforeClass
    public static void setUpClass() {
        grid = new Grid(10, 10);
    }

    @Test
    public void verifyObstaclesArePresent() {
        for (GridObject g: grid.getGridObjectList()) {
            System.out.println(g.toString());
        }
        assertEquals(10, grid.getGridObjectList().size());
    }

    @Test
    public void occupiedPointReturnsTrue() {
        Point p = new Point();
        int x = grid.getGridObjectList().get(0).getLocation().getX();
        int y = grid.getGridObjectList().get(0).getLocation().getY();
        p.setX(x);
        p.setY(y);
        assertTrue(grid.pointIsOccupied(p));
    }

    @Test
    public void unoccupiedPointReturnsFalse() {
        Point p = new Point();
        Random r = new Random();
        int x = r.nextInt(10);
        int y = r.nextInt(10);
        p.setX(x);
        p.setY(y);
        if (!grid.getGridObjectList().contains(p)) {
            assertFalse(grid.pointIsOccupied(p));
        }
    }
}
