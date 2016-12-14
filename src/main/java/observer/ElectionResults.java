package observer;


import java.util.*;

public class ElectionResults {
	private Map<Party, Integer> tally = new HashMap<Party, Integer>();


	private ArrayList<Region> electionMap = new ArrayList<Region>();


	public void addRegion(Region region) {
		electionMap.add(region);
		updateTally(region);
	}
	
	public void updateTally(Region region) {
		Party winningParty = region.getWinningParty();
		int votes = tally.containsKey(winningParty) ? tally.get(winningParty) : 0;
		tally.put(winningParty, votes + region.getVotes());
	}
	
	public Map<Party, Integer> getTally() {
		return tally;
	}
	
	public ArrayList<Region> getElectionMap() {
		return electionMap;
	}
	
	public int getTotalVotes(){
		int total = 0;
		for (Region region : electionMap) {
			total += region.getVotes();
		}
		return total;
	}
	
	public int getPartyVotes(Party party) {
		return tally.get(party);
	}
	
}
