package command;

enum Direction {
    NORTH("N"), EAST("E"), SOUTH("S"), WEST("W");
    private static final Direction[] directions = values();
    private final String stringVal;

    Direction(String s) {
        stringVal = s;
    }

    public static Direction getDirectionByString(String s) {
        for (Direction d : directions) {
            if (s.equals(d.stringVal)) {
                return d;
            }
        }
        throw new IllegalArgumentException(s + " does not match any existing directions" +
                ". Exiting...");
    }

    public Direction next() {
        return directions[(this.ordinal() + 1) % directions.length];
    }

    public Direction previous() {
        return directions[(this.ordinal() + (directions.length - 1)) % directions.length];
    }
}