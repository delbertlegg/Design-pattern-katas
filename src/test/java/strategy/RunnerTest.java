package strategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RunnerTest {
	Attendee runner = new Runner();

	@Test
	public void RunnerIsNotNull() {
		assertNotNull(runner);
	}
	
	@Test
	public void RunnerDisplaysCorrectly() {
		assertEquals("Runner", runner.display());
	}
	
	@Test
	public void RunnerRuns() {
		assertEquals("is running\n", runner.compete());
	}

}
