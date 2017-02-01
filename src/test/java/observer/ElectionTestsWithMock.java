package observer;

import org.junit.*;
import org.junit.Assert.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.awt.Color;

public class ElectionTestsWithMock {
	ElectionResults result = Mockito.mock(ElectionResults.class);
	Election election = new Election();
	@Before
	public void setUpMethod() {
		election.setResult(result);
	}
	
	@Test
	public void testAddRegion() {
		Region region = Mockito.mock(Region.class);
		election.addRegion(region);
		verify(result).addRegion(region);
	}
	
	@Test
	public void testGetElectionMap() {
		election.getElectionMap();
		verify(result).getElectionMap();
	}
	
	@Test
	public void testGetTotalVotes() {
		election.getTotalVotes();
		verify(result).getTotalVotes();
	}
}
