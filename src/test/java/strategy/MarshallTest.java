package strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarshallTest {
	Attendee marshall = new Marshall();


	@Test
	public void MarshallIsNotNull() {
		assertNotNull(marshall);
	}
	
	@Test
	public void MarshallDisplaysCorrectly() {
		assertEquals("The Marshall", marshall.display());
	}
	
	@Test
	public void MarshallDoesNotCompete() {
		assertEquals("not competing\n", marshall.compete());
	}

}
