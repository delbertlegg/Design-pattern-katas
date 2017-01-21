package command;

public enum Direction {
	NORTH("N"), EAST("E"), SOUTH("S"), WEST("W");
	private final String stringVal;

	Direction(String s) {
		stringVal = s;
	}

	private static Direction[] directions = values();
	
	public Direction next() {
		return directions[(this.ordinal() + 1) % directions.length];
	}
	
	public Direction previous() {
		return directions[(this.ordinal() + (directions.length - 1)) % directions.length];
	}

	public static Direction getDirectionByString (String s) {
		for (Direction d : directions) {
			if (s.equals(d.stringVal)) {
				return d;
			}
		}
		throw new IllegalArgumentException(s + " does not match any existing directions" +
				". Exiting...");
	}
}