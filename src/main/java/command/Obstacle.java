package command;

public class Obstacle extends GridObject {
    public void setLocation(int x, int y) {
        location.setX(x);
        location.setY(y);
    }

    public Point getLocation() {
        return location;
    }
}
