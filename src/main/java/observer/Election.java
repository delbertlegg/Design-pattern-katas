package observer;

import java.util.*;

public class Election extends Observable {
	private ElectionResults result  = new ElectionResults();
	
	public void addRegion(Region region) {
		result.addRegion(region);
		setChanged();
		notifyObservers();
	}
	
	public void addRegion(String name, int votes, Party party) {
		this.addRegion(new Region(name, votes, party));
	}
	
	public ElectionResults getResults() {
		return result;
	}

}
