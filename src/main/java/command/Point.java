package command;

class Point {
	private int x;
	private int y;
	
	public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
	    this.x = x;
	    this.y = y;
    }

    public String toString() {
	    return "x: " + x + ", y: " + y;
    }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean equals(Point point) {
	    return (this.x == point.x && this.y == point.y);
    }

    public void moveNorth() {
        setY(getY() + 1);
    }

    public void moveSouth() {
        setY(getY() - 1);
    }

    public void moveEast() {
        setX(getX() + 1);
    }

    public void moveWest() {
        setX(getX() - 1);
    }
}
