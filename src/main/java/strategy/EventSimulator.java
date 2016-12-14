package strategy;

public class EventSimulator {

	public static void main (String[] args) {
		Event tenK = new Event();
		for (int i = 0; i < 5; i++) {
			tenK.attendees.add(new Runner());
		}
		for (int i = 0; i < 5; i++) {
			tenK.attendees.add(new Spectator());
		}
		
		tenK.beginCompetition();
		
		Event triathlon = new Event();
		for (int i = 0; i < 5; i++) {
			triathlon.attendees.add(new Triathlete());
		}
		triathlon.beginCompetition();
		
		Event oneWeirdGuyStanding = new Event();
		Attendee weirdGuy = new Spectator();
		weirdGuy.display.setDisplay("Douchebag");
		
		oneWeirdGuyStanding.attendees.add(weirdGuy);
		oneWeirdGuyStanding.beginCompetition();
	}
}
