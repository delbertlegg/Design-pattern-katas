package command;

import static org.junit.Assert.*;

import org.junit.*;

public class DirectionChangerTests {
	DirectionChanger dc;
	
	@Before
	public void setUp() {
		dc = new DirectionChanger(Direction.NORTH);
	}

	@Test
	public void roverRotates360clockwise() {
		dc.rotateRight();
		assertEquals(Direction.EAST, dc.getDirection());
		dc.rotateRight();
		assertEquals(Direction.SOUTH, dc.getDirection());
		dc.rotateRight();
		assertEquals(Direction.WEST, dc.getDirection());
		dc.rotateRight();
		assertEquals(Direction.NORTH, dc.getDirection());
		
	}
	
	@Test
	public void roverRotates360counterClockwise() {
		dc.rotateLeft();
		assertEquals(Direction.WEST,dc.getDirection());
		dc.rotateLeft();
		assertEquals(Direction.SOUTH, dc.getDirection());
		dc.rotateLeft();
		assertEquals(Direction.EAST, dc.getDirection());
		dc.rotateLeft();
		assertEquals(Direction.NORTH, dc.getDirection());
	}

}
