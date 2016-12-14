package strategy;

public class Swimmer extends Attendee {
	public Swimmer() {
		compete.add(new Swimming());
		display = new AttendeeDisplay("Swimmer");
	}
}
