package observer;

import java.util.*;

public class LeaderBoard implements Observer {
	private Observable observable;
	private Map<Party, Integer> tally;
	
	public LeaderBoard(Observable o) {
		this.observable = o;
		o.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		tally = ((Election)o).getResults().getTally();
		System.out.println("******* Leader Board *********");
		for (Map.Entry<Party, Integer> partyTotal : tally.entrySet()) {		
			System.out.println(partyTotal.getKey().getName() + ": " + partyTotal.getValue());
		}
	}

	public Observable getObservable() {
		return observable;
	}
	
	public Map<Party, Integer> getTally() {
		return tally;
	}

}
