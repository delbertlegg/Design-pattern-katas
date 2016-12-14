package strategy;

public class Triathlete extends Attendee {

	public Triathlete() {
		compete.add(new Running());
		compete.add(new Biking());
		compete.add(new Swimming());
		display = new AttendeeDisplay("Triathlete");
	}

}
