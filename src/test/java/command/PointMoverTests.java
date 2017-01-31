package command;

import org.junit.*;
import static org.junit.Assert.*;
public class PointMoverTests {
	Point point;

	@Before
	public void setUp() {
		point = new Point();
	}
	
	@Test
	public void PointMoverMovesPointNorth() {
		point.moveNorth();
		assertEquals(1, point.getY());
		assertEquals(0, point.getX());
	}
	
	@Test
	public void PointMoverMovesPointSouth() {
		point.moveSouth();
		assertEquals(-1, point.getY());
		assertEquals(0, point.getX());
	}
	
	@Test
	public void PointMoverMovesPointEast() {
		point.moveEast();
		assertEquals(0, point.getY());
		assertEquals(1, point.getX());
	}
	
	@Test
	public void PointMoverMovesPointWest() {
		point.moveWest();
		assertEquals(0, point.getY());
		assertEquals(-1, point.getX());
	}

}
