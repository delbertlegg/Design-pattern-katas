package command;
	
public enum Direction {
	NORTH, EAST, SOUTH, WEST;
	
	private static Direction[] directions = values();
	
	public Direction next() {
		return directions[(this.ordinal() + 1) % directions.length];
	}
	
	public Direction previous() {
		return directions[(this.ordinal() + 3) % directions.length];
	}
}
	

