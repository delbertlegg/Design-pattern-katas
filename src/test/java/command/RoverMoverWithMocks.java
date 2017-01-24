package command;

import org.junit.*;
import org.mockito.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class RoverMoverWithMocks {
    Rover rover = Mockito.mock(Rover.class);
    RoverMover roverMover;
    @Before
    public void setUp() {
        when(rover.getLocation()).thenReturn(new Point());
        when(rover.getOrientation()).thenReturn(new Orientation());
        roverMover = RoverMover.getRoverMover(rover);
    }

    @Test
    public void MoveForwardNorth() {
        when(rover.getDirection()).thenReturn(Direction.NORTH);
        roverMover.moveForward();
        assertEquals(1, rover.getLocation().getY());
    }

    @Test
    public void MoveForwardSouth() {
        when(rover.getDirection()).thenReturn(Direction.SOUTH);
        roverMover.moveForward();
        assertEquals(-1, rover.getLocation().getY());
    }

    @Test
    public void MoveForwardEast() {
        when(rover.getDirection()).thenReturn(Direction.EAST);
        roverMover.moveForward();
        assertEquals(1, rover.getLocation().getX());
    }

    @Test
    public void MoveForwardWest() {
        when(rover.getDirection()).thenReturn(Direction.WEST);
        roverMover.moveForward();
        assertEquals(-1, rover.getLocation().getX());
    }

    @Test
    public void MoveBackwardNorth() {
        when(rover.getDirection()).thenReturn(Direction.NORTH);
        roverMover.moveBackward();
        assertEquals(-1, rover.getLocation().getY());
    }

    @Test
    public void MoveBackwardSouth() {
        when(rover.getDirection()).thenReturn(Direction.SOUTH);
        roverMover.moveBackward();
        assertEquals(1, rover.getLocation().getY());
    }

    @Test
    public void MoveBackwardEast() {
        when(rover.getDirection()).thenReturn(Direction.EAST);
        roverMover.moveBackward();
        assertEquals(-1, rover.getLocation().getX());
    }

    @Test
    public void MoveBackwardWest() {
        when(rover.getDirection()).thenReturn(Direction.WEST);
        roverMover.moveBackward();
        assertEquals(1, rover.getLocation().getX());
    }

    @Test
    public void RotateRight() {
        doReturn(Direction.EAST).when(rover).getDirection();
        roverMover.rotateRight();
        verify(rover).getOrientation();
        assertEquals(Direction.EAST, rover.getDirection());
    }

    @Test
    public void RotateLeft() {
        doReturn(Direction.WEST).when(rover).getDirection();
        roverMover.rotateLeft();
        verify(rover).getOrientation();
        assertEquals(Direction.WEST, rover.getDirection());
    }

}
