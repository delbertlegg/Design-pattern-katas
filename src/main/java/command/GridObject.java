package command;

public abstract class GridObject {
    protected Point location = new Point();

    public abstract void setLocation(int x, int y);
    public abstract Point getLocation();
    public String toString() {
        return "x: " + location.getX() + ", y: " + location.getY();
    }
}
