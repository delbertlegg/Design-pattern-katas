package observer;

import java.awt.Color;

public class ElectionSimulator {

	public static void main(String[] args) {
		ElectionSimulator.go();
	}

	private static void go() {
		Election election = new Election();
		LeaderBoard leaderBoard = new LeaderBoard(election);
		ElectionMap electionMap = new ElectionMap(election);
		SwingOmeter meter = new SwingOmeter(election);
		Party redParty = new Party("Red", Color.RED);
		Party greenParty = new Party("Green", Color.GREEN);
		Region regionOne = new Region("Region one", 10, redParty);
		Region regionTwo = new Region("Region Two", 5, greenParty);
		election.addRegion(regionOne);
		election.addRegion(regionTwo);
	}
}
