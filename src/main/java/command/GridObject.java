package command;

abstract class GridObject {
    final Point location = new Point();

    void setLocation(int x, int y) {
        location.setX(x);
        location.setY(y);
    }

    Point getLocation() {
        return location;
    }

    int getXPosition() {
        return location.getX();
    }

    int getYPosition() {
        return location.getY();
    }

    public String toString() {
        return "x: " + location.getX() + ", y: " + location.getY();
    }
}
