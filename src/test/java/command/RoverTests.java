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

public class RoverTests {
	Rover rover = Rover.getInstance();
	@Before
	public void beforeMethod() {
		rover.setDirection(Direction.NORTH);
		rover.setStartingPoint(0, 0);
	}
	
	@Test
	public void roverRotates360clockwise() {
		rover.rotateRight();
		assertEquals(Direction.EAST, rover.getDirection());
		rover.rotateRight();
		assertEquals(Direction.SOUTH, rover.getDirection());
		rover.rotateRight();
		assertEquals(Direction.WEST, rover.getDirection());
		rover.rotateRight();
		assertEquals(Direction.NORTH, rover.getDirection());
		
	}
	
	@Test
	public void roverRotates360counterClockwise() {
		rover.rotateLeft();
		assertEquals(Direction.WEST, rover.getDirection());
		rover.rotateLeft();
		assertEquals(Direction.SOUTH, rover.getDirection());
		rover.rotateLeft();
		assertEquals(Direction.EAST, rover.getDirection());
		rover.rotateLeft();
		assertEquals(Direction.NORTH, rover.getDirection());
	}
	
	@Test
	public void roverMovesOneSpaceNorth() {
		rover.goForward();
		assertEquals(0, rover.getLocation().getX());
		assertEquals(1, rover.getLocation().getY());
	}	

}
