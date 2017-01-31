package command;

import org.junit.*;
import org.mockito.*;
import org.mockito.junit.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class RoverControlTestsWithMocks {
    Rover rover = Mockito.mock(Rover.class);
    RoverControl control = new RoverControl(rover);

    @Test
    public void TestRotateRight() {
        control.executeCommand("r");
        verify(rover).rotateRight();
    }

    @Test
    public void TestRotateLeft() {
        control.executeCommand("l");
        verify(rover).rotateLeft();
    }

    @Test
    public void TestMoveForward() {
        control.executeCommand("f");
        verify(rover).moveForward();
    }

    @Test
    public void TestMoveBackward() {
        control.executeCommand("b");
        verify(rover).moveBackward();
    }

    @Test
    public void TestExceptionThrown() {
        try {
            control.executeCommand("g");
            assertTrue(false);
        }
        catch (Exception e) {
            assertTrue(true);
        }
    }

}
