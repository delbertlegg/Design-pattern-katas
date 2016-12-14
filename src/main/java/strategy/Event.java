package strategy;

import java.util.ArrayList;
import java.util.List;

public class Event {
	List<Attendee> attendees = new ArrayList<Attendee>();
	
	public Event() {
		attendees.add(new Marshall());
	}
	
	public void beginCompetition() {
		for (Attendee attendee : attendees) {
			System.out.println(attendee.display() + " " + attendee.compete());
		}
	}

}
