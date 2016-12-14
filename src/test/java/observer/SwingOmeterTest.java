package observer;

import java.awt.Color;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwingOmeterTest {
	static Election election;
	static Party redParty;
	static Region region;
	static SwingOmeter meter;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 election = new Election();
		 meter = new SwingOmeter(election);
		 redParty = new Party ("Red", Color.RED);
		 region = new Region("New Region", 10, redParty);
		 election.addRegion(region);
	}
	
	@Test
	public void TestSwingOmeter() {
		assertTrue(meter.getElection().equals(election));
	}
}
