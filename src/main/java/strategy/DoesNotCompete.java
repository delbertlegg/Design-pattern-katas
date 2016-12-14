package strategy;

public class DoesNotCompete implements CompeteType {

	@Override
	public String compete() {
		return "not competing\n";
	}

}
