package strategy;

public class Cyclist extends Attendee {

	public Cyclist() {
		compete.add(new Biking());
		display = new AttendeeDisplay("Cyclist");
	}
}
