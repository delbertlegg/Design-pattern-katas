package strategy;

public class DoesNotCompete implements CompeteType {

	public String compete() {
		return "not competing\n";
	}

}
