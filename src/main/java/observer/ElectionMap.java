package observer;

import java.util.*;

public class ElectionMap implements Observer {
	Observable observable;
	List<Region> map;
	
	public ElectionMap(Observable o) {
		this.observable = o;
		o.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		map = ((Election)o).getElectionMap();
		System.out.println("******* Election Map *********");
		for (Region region : map) {
			System.out.println(region.getName() + ": " + region.getWinningPartyName());
		}
	}

}
