package strategy;

public class Marshall extends Attendee {
	public Marshall() {
		compete.add(new DoesNotCompete());
		display = new AttendeeDisplay("The Marshall");
	}
	
}
