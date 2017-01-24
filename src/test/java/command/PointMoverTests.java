package command;

import static org.junit.Assert.*;

import org.junit.*;
public class PointMoverTests {
	Point point;
	PointMover pm;
	
	@Before
	public void setUp() {
		point = new Point();
		pm = new PointMover(point);
	}
	
	@Test
	public void PointMoverMovesPointNorth() {
		pm.moveNorth();
		assertEquals(1, point.getY());
		assertEquals(0, point.getX());
	}
	
	@Test
	public void PointMoverMovesPointSouth() {
		pm.moveSouth();
		assertEquals(-1, point.getY());
		assertEquals(0, point.getX());
	}
	
	@Test
	public void PointMoverMovesPointEast() {
		pm.moveEast();
		assertEquals(0, point.getY());
		assertEquals(1, point.getX());
	}
	
	@Test
	public void PointMoverMovesPointWest() {
		pm.moveWest();
		assertEquals(0, point.getY());
		assertEquals(-1, point.getX());
	}

}
