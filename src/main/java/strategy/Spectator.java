package strategy;

public class Spectator extends Attendee {

	public Spectator() {
		compete.add(new DoesNotCompete());
		display = new AttendeeDisplay("Spectator");
	}

}
