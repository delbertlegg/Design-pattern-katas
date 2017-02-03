package observer;

public class Region {
	private String name;
	private int votes;
	private Party winningParty;
	
	public Region(String name, int votes, Party winningParty) {
		this.setName(name);
		this.setVotes(votes);
		this.setWinningParty(winningParty);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Party getWinningParty() {
		return winningParty;
	}
	
	public String getWinningPartyName() {
		return winningParty.getName();
	}

	public void setWinningParty(Party winningParty) {
		this.winningParty = winningParty;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}
}
