package command;

import org.junit.*;
import static org.junit.Assert.*;

public class DirectionChangerTests {
	Orientation dir;

	
	@Before
	public void setUp() {
		dir = new Orientation();
	}

	@Test
	public void roverRotates360clockwise() {
		dir.rotateRight();
		assertEquals(Direction.EAST, dir.getDirection());
		dir.rotateRight();
		assertEquals(Direction.SOUTH, dir.getDirection());
		dir.rotateRight();
		assertEquals(Direction.WEST, dir.getDirection());
		dir.rotateRight();
		assertEquals(Direction.NORTH, dir.getDirection());
		
	}
	
	@Test
	public void roverRotates360counterClockwise() {
		dir.rotateLeft();
		assertEquals(Direction.WEST,dir.getDirection());
		dir.rotateLeft();
		assertEquals(Direction.SOUTH, dir.getDirection());
		dir.rotateLeft();
		assertEquals(Direction.EAST, dir.getDirection());
		dir.rotateLeft();
		assertEquals(Direction.NORTH, dir.getDirection());
	}

}
