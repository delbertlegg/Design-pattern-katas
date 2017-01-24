package command;

public abstract class GridObject {
    protected Point location = new Point();

    public void setLocation(int x, int y) {
        location.setX(x);
        location.setY(y);
    }

    public Point getLocation() {
        return location;
    }

    public String toString() {
        return "x: " + location.getX() + ", y: " + location.getY();
    }
}
