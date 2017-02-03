package observer;

import java.util.*;

public class Election extends Observable {
	private ElectionResults result  = new ElectionResults();
	
	public void setResult(ElectionResults result) {
		this.result = result;
	}

	public void addRegion(Region region) {
		result.addRegion(region);
		setChanged();
		notifyObservers();
	}
	
	public ElectionResults getResults() {
		return result;
	}
	
	public List<Region> getElectionMap() {
		return result.getElectionMap();
	}
	
	public int getTotalVotes() {
		return result.getTotalVotes();
	}

}
