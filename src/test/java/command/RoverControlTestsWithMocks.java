package command;

import org.junit.*;
import org.mockito.*;
import org.mockito.junit.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class RoverControlTestsWithMocks {
    RoverMover roverMover = Mockito.mock(RoverMover.class);
    RoverControl control = new RoverControl(roverMover);

    @Test
    public void TestRotateRight() {
        control.executeCommand("r");
        verify(roverMover).rotateRight();
    }

    @Test
    public void TestRotateLeft() {
        control.executeCommand("l");
        verify(roverMover).rotateLeft();
    }

    @Test
    public void TestMoveForward() {
        control.executeCommand("f");
        verify(roverMover).moveForward();
    }

    @Test
    public void TestMoveBackward() {
        control.executeCommand("b");
        verify(roverMover).moveBackward();
    }

}
