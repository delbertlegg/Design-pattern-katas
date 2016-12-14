package strategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CyclistTest {
	Attendee cyclist = new Cyclist();

	@Test
	public void CyclistIsNotNull() {
		assertNotNull(cyclist);
	}
	
	@Test
	public void CyclistDisplaysCorrectly() {
		assertEquals("Cyclist", cyclist.display());
	}
	
	@Test
	public void CyclistBikes() {
		assertEquals("is biking\n", cyclist.compete());
	}

}
