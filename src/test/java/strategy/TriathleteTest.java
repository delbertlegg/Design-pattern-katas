package strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriathleteTest {
	Attendee triathlete = new Triathlete();

	@Test
	public void TriathleteIsNotNull() {
		assertNotNull(triathlete);
	}
	
	@Test
	public void TriathleteDisplaysCorrectly() {
		assertEquals("Triathlete", triathlete.display());
	}
	
	@Test
	public void TriathleteDoesItAll() {
		assertEquals("is running\n" +
					 "is biking\n" + 
					 "is swimming\n", triathlete.compete());
	}

}
