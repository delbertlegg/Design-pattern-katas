package observer;

import java.util.*;

public class SwingOmeter implements Observer {
	private Observable observable;
	private Election election;

	public SwingOmeter(Observable o) {
		this.observable = o;
		o.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		election  = (Election) o;
		List<Region> tally = election.getResults().getElectionMap();
		System.out.println("********** SwingOmeter **********");
		for (Region region : tally) {
			float partyPercentage = (float) ((region.getVotes() * 1.0) / election.getResults().getTotalVotes()* 100);
			System.out.println(String.format(region.getWinningParty().getName() + ": %.1f%%", partyPercentage));
		}
	}
	
	public Election getElection() {
		return election;
	}

}
