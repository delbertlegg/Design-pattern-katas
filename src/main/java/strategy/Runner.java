package strategy;

public class Runner extends Attendee {
	public Runner() {
		compete.add(new Running());
		display = new AttendeeDisplay("Runner");
	}	
}
