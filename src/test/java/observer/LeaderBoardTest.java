package observer;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.BeforeClass;
import org.junit.Test;

public class LeaderBoardTest {
	static Election election;
	static Party redParty;
	static Region region;
	static LeaderBoard lb;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 election = new Election();
		 lb = new LeaderBoard(election);
		 redParty = new Party ("Red", Color.RED);
		 region = new Region("New Region", 10, redParty);
		 election.addRegion(region);
	}

	@Test
	public void TestLeaderBoard() {
		assertTrue(lb.getTally().containsKey(redParty));
	}

}
