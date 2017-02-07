package command;

class Point {
    private int x;
    private int y;

    Point() {
        this.x = 0;
        this.y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x: " + x + ", y: " + y;
    }

    int getX() {
        return x;
    }

    void setX(int x) {
        this.x = x;
    }

    int getY() {
        return y;
    }

    void setY(int y) {
        this.y = y;
    }

    boolean equals(Point point) {
        return (this.x == point.x && this.y == point.y);
    }

    void moveNorth() {
        setY(getY() + 1);
    }

    void moveSouth() {
        setY(getY() - 1);
    }

    void moveEast() {
        setX(getX() + 1);
    }

    void moveWest() {
        setX(getX() - 1);
    }
}
