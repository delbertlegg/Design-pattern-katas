package command;

class Orientation {
    private Direction direction;

    Orientation() {
        setDirection(Direction.NORTH);
    }

    Direction getDirection() {
        return direction;
    }

    void setDirection(Direction direction) {
        this.direction = direction;
    }

    void rotateRight() {
        setDirection(direction.next());
    }

    void rotateLeft() {
        setDirection(direction.previous());
    }

    public String toString() {
        return direction.toString();
    }
}


