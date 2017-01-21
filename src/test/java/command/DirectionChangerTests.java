package command;

import static org.junit.Assert.*;

import org.junit.*;

public class DirectionChangerTests {
	Orientation dir;
	DirectionChanger dc;
	
	@Before
	public void setUp() {
		dir = new Orientation();
		dc = new DirectionChanger(dir);
	}

	@Test
	public void roverRotates360clockwise() {
		dc.rotateRight();
		assertEquals(Direction.EAST, dir.getDirection());
		dc.rotateRight();
		assertEquals(Direction.SOUTH, dir.getDirection());
		dc.rotateRight();
		assertEquals(Direction.WEST, dir.getDirection());
		dc.rotateRight();
		assertEquals(Direction.NORTH, dir.getDirection());
		
	}
	
	@Test
	public void roverRotates360counterClockwise() {
		dc.rotateLeft();
		assertEquals(Direction.WEST,dir.getDirection());
		dc.rotateLeft();
		assertEquals(Direction.SOUTH, dir.getDirection());
		dc.rotateLeft();
		assertEquals(Direction.EAST, dir.getDirection());
		dc.rotateLeft();
		assertEquals(Direction.NORTH, dir.getDirection());
	}

}
