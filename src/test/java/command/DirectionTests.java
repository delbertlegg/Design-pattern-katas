package command;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
import static command.Direction.*;

public class DirectionTests {
    Direction direction;
    @Before
    public void setUp() {
        direction = NORTH;
    }

    @Test
    public void NextReturnsCorrectDirection() {
        direction = direction.next();
        assertEquals(EAST, direction);
        direction = direction.next();
        assertEquals(SOUTH, direction);
        direction = direction.next();
        assertEquals(WEST, direction);
        direction = direction.next();
        assertEquals(NORTH, direction);
    }

    @Test
    public void PreviousReturnsCorrectDirection() {
        direction = direction.previous();
        assertEquals(WEST, direction);
        direction = direction.previous();
        assertEquals(SOUTH, direction);
        direction = direction.previous();
        assertEquals(EAST, direction);
        direction = direction.previous();
        assertEquals(NORTH, direction);
    }

    @Test
    public void NReturnsNorth() throws Exception {
        direction = SOUTH;
        direction = Direction.getDirectionByString("N");
        assertEquals(NORTH, direction);
    }

    @Test
    public void EReturnsEast() throws Exception {
        direction = Direction.getDirectionByString("E");
        assertEquals(EAST, direction);
    }

    @Test
    public void SReturnsSouth() throws Exception {
        direction = Direction.getDirectionByString("S");
        assertEquals(SOUTH, direction);
    }

    @Test
    public void WReturnsWest() throws Exception {
        direction = Direction.getDirectionByString("W");
        assertEquals(WEST, direction);
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();
    @Test
    public void IllegalArgumentThrowsException() throws Exception {
        exception.expect(IllegalArgumentException.class);
        direction = Direction.getDirectionByString("G");
    }
}
