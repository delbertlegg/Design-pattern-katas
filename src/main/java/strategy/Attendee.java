package strategy;

import java.util.ArrayList;
import java.util.List;

public abstract class Attendee {
	List<CompeteType> compete = new ArrayList<CompeteType>();
	AttendeeDisplay display;
	
	public String display() {
		return display.getDisplay();
	}

    public String compete() {
		StringBuilder competing = new StringBuilder();
		for (CompeteType type : compete) {
			competing.append(type.compete());
		}
		return competing.toString();
	}
}
