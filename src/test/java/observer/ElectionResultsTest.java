package observer;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.BeforeClass;
import org.junit.Test;

public class ElectionResultsTest {
	static Election election;
	static Party redParty;
	static Party blueParty;
	static Region regionOne;
	static Region regionTwo;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		 election = new Election();
		 redParty = new Party ("Red", Color.RED);
		 blueParty = new Party("Blue", Color.BLUE);
		 regionOne = new Region("Region One", 10, redParty);
		 regionTwo = new Region("Region Two", 5, blueParty);
		 election.addRegion(regionOne);
		 election.addRegion(regionTwo);
	}
	
	@Test
	public void TestAddRegionOne() {		
		assertTrue(election.getResults().getElectionMap().contains(regionOne));
	}
	
	@Test
	public void TestAddRegionTwo() {		
		assertTrue(election.getResults().getElectionMap().contains(regionTwo));
	}
	
	@Test
	public void TestPartyVotes() {
		assertEquals(10, election.getResults().getPartyVotes(redParty));
	}
	
	@Test
	public void TestTotalVotes() {
		assertEquals(15, election.getResults().getTotalVotes());
	}
}
