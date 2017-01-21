package command;

public enum Direction {
	NORTH("N"), EAST("E"), SOUTH("S"), WEST("W");
	private final String stringVal;

	private Direction(String s) {
		stringVal = s;
	}

	private static Direction[] directions = values();
	
	public Direction next() {
		return directions[(this.ordinal() + 1) % directions.length];
	}
	
	public Direction previous() {
		return directions[(this.ordinal() + 3) % directions.length];
	}

	public static Direction getDirectionByString (String s) throws Exception {
		for (Direction d : directions) {
			if (s.equals(d.stringVal)) {
				return d;
			}
		}
		throw new Exception(s + " does not match any existing directions");
	}
}