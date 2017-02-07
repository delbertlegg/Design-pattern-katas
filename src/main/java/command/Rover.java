package command;

class Rover extends GridObject {
    private final Orientation direction = new Orientation();

    static Rover getInstance() {
        return new Rover();
    }

    Direction getDirection() {
        return direction.getDirection();
    }

    void setDirection(Direction direction) {
        this.direction.setDirection(direction);
    }

    void moveForward() {
        switch (getDirection()) {
            case NORTH:
                location.moveNorth();
                break;
            case SOUTH:
                location.moveSouth();
                break;
            case EAST:
                location.moveEast();
                break;
            case WEST:
                location.moveWest();
                break;
        }
    }

    void moveBackward() {
        switch (getDirection()) {
            case NORTH:
                location.moveSouth();
                break;
            case SOUTH:
                location.moveNorth();
                break;
            case EAST:
                location.moveWest();
                break;
            case WEST:
                location.moveEast();
                break;
        }
    }

    void rotateRight() {
        direction.rotateRight();
    }

    void rotateLeft() {
        direction.rotateLeft();
    }

    public String toString() {
        return "Rover is pointing " + getDirection() +
                "\nRover is at location " + getXPosition() + ", "
                + getYPosition();
    }


}
