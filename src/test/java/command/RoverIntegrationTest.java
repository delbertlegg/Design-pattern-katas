package command;

import static org.junit.Assert.*;

import org.junit.*;

/*
Source: http://dallashackclub.com/rover
Develop an api that moves a rover around on a grid.
* You are given the initial starting point (x,y) of a rover and the direction (N,S,E,W) it is facing.
* - The rover receives a character array of commands.
* - Implement commands that move the rover forward/backward (f,b).
* - Implement commands that turn the rover left/right (l,r).
* - Implement wrapping from one edge of the grid to another. (planets are spheres after all)
* - Implement obstacle detection before each move to a new square.
*   If a given sequence of commands encounters an obstacle, the rover moves up to the 
*   last possible point and reports the obstacle.
*/

public class RoverIntegrationTest {
	Rover rover = Rover.getInstance();

	@Before
	public void setUp() {
		rover.setDirection(Direction.NORTH);
		rover.setLocation(0, 0);
	}
	
	@Test
	public void RoverRotatesRight360degrees() {
		RoverRotateRightCommand right = new RoverRotateRightCommand(rover);
		right.execute();
		assertEquals(Direction.EAST, rover.getDirection());
		right.execute();
		assertEquals(Direction.SOUTH, rover.getDirection());
		right.execute();
		assertEquals(Direction.WEST, rover.getDirection());
		right.execute();
		assertEquals(Direction.NORTH, rover.getDirection());		
	}
	
	@Test
	public void RoverRotatesLeft360degrees() {
		RoverRotateLeftCommand left = new RoverRotateLeftCommand(rover);
		left.execute();
		assertEquals(Direction.WEST, rover.getDirection());
		left.execute();
		assertEquals(Direction.SOUTH, rover.getDirection());
		left.execute();
		assertEquals(Direction.EAST, rover.getDirection());
		left.execute();
		assertEquals(Direction.NORTH, rover.getDirection());		
	}

	@Test
	public void RoverMovesForwardOneSpaceNorth() {
	    Point point = rover.getLocation();
		RoverMoveForwardCommand forward = new RoverMoveForwardCommand(rover);
		forward.execute();
		assertEquals(0, point.getX());
		assertEquals(1, point.getY());
	}

	@Test
	public void RoverMovesForwardOneSpaceEast() {
		Point point = rover.getLocation();
		RoverRotateRightCommand right = new RoverRotateRightCommand(rover);
		right.execute();
		RoverMoveForwardCommand forward = new RoverMoveForwardCommand(rover);
		forward.execute();
		assertEquals(1, point.getX());
		assertEquals(0, point.getY());
	}

	@Test
	public void RoverMovesForwardOneSpaceSouth() {
		Point point = rover.getLocation();
		RoverRotateRightCommand right = new RoverRotateRightCommand(rover);
		right.execute();
		right.execute();
		RoverMoveForwardCommand forward = new RoverMoveForwardCommand(rover);
		forward.execute();
		assertEquals(0, point.getX());
		assertEquals(-1, point.getY());
	}

	@Test
	public void RoverMovesForwardOneSpaceWest() {
		Point point = rover.getLocation();
		RoverRotateLeftCommand left = new RoverRotateLeftCommand(rover);
		left.execute();
		RoverMoveForwardCommand forward = new RoverMoveForwardCommand(rover);
		forward.execute();
		assertEquals(-1, point.getX());
		assertEquals(0, point.getY());
	}

	@Test
	public void RoverMovesBackwardOneSpaceNorth() {
		Point point = rover.getLocation();
		RoverMoveBackwardCommand backward = new RoverMoveBackwardCommand(rover);
		backward.execute();
		assertEquals(0, point.getX());
		assertEquals(-1, point.getY());
	}

	@Test
	public void RoverMovesBackwardOneSpaceEast() {
		Point point = rover.getLocation();
		RoverRotateRightCommand right = new RoverRotateRightCommand(rover);
		right.execute();
		RoverMoveBackwardCommand backward = new RoverMoveBackwardCommand(rover);
		backward.execute();
		assertEquals(-1, point.getX());
		assertEquals(0, point.getY());
	}

	@Test
	public void RoverMovesBackwardOneSpaceSouth() {
		Point point = rover.getLocation();
		RoverRotateRightCommand right = new RoverRotateRightCommand(rover);
		right.execute();
		right.execute();
		RoverMoveBackwardCommand backward = new RoverMoveBackwardCommand(rover);
		backward.execute();
		assertEquals(0, point.getX());
		assertEquals(1, point.getY());
	}

	@Test
	public void RoverMovesBackwardOneSpaceWest() {
		Point point = rover.getLocation();
		RoverRotateLeftCommand left = new RoverRotateLeftCommand(rover);
		left.execute();
		RoverMoveBackwardCommand backward = new RoverMoveBackwardCommand(rover);
		backward.execute();
		assertEquals(1, point.getX());
		assertEquals(0, point.getY());
	}
	
}
