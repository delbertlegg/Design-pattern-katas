package strategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SwimmerTest {
	Attendee swimmer = new Swimmer();

	@Test
	public void SwimmerIsNotNull() {
		assertNotNull(swimmer);
	}
	
	@Test
	public void SwimmerDisplaysCorrectly() {
		assertEquals("Swimmer", swimmer.display());
	}
	
	@Test
	public void SwimmerSwims() {
		assertEquals("is swimming\n", swimmer.compete());
	}

}
